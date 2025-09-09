package rvl.more_ores.item.special_item;

import com.google.common.collect.Iterables;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.AbstractHorseEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ToxicHorseArmorItem extends HorseArmorItem {

    private final int damageRangeOnHealh;

    private final StatusEffect targetEffect;

    public ToxicHorseArmorItem(int bonus, String name, Settings settings, StatusEffect targetEffect, int damageRangeOnHealh) {
        super(bonus, name, settings);
        this.damageRangeOnHealh = damageRangeOnHealh;
        this.targetEffect = targetEffect;
    }
    @Override
    public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        if (entity instanceof AbstractHorseEntity _livEnt && _livEnt.isHorseArmor(itemstack)) {
            if (_livEnt.getHealth() > _livEnt.getMaxHealth() - (_livEnt.getMaxHealth() / 4)) {
                LivingEntity _entity = (LivingEntity) entity;
                if (!_entity.getWorld().isClient)
                    _entity.addStatusEffect(new StatusEffectInstance(this.targetEffect, 10, 1, false, false));
                ((LivingEntity) entity).setHealth(_livEnt.getMaxHealth() - (_livEnt.getMaxHealth() / 4));
            } else {
                LivingEntity _entity = (LivingEntity) entity;
                if (!_entity.getWorld().isClient)
                    _entity.addStatusEffect(new StatusEffectInstance(this.targetEffect, 10, 1, false, false));
            }
        }
        if (entity instanceof PlayerEntity player) {
            if (player.getMainHandStack().isOf(this) || player.getOffHandStack().isOf(this)) {
                if (player.getHealth() > player.getMaxHealth() / this.damageRangeOnHealh) {
                    player.setHealth(player.getMaxHealth() - (player.getMaxHealth() / this.damageRangeOnHealh));
                }
                player.addStatusEffect(new StatusEffectInstance(this.targetEffect, 10, 1, false, false));
            }
        }

    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!target.getWorld().isClient()) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 1));
        }
        return true;
    }
}
