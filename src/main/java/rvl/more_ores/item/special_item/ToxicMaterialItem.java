package rvl.more_ores.item.special_item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ToxicMaterialItem extends Item {
    private final int damageRangeOnHealh;
    private final RegistryEntry<StatusEffect> targetEffect;
    public ToxicMaterialItem(Settings settings, RegistryEntry<StatusEffect> targetEffect, int damageRangeOnHealh) {
        super(settings);
        this.damageRangeOnHealh = damageRangeOnHealh;
        this.targetEffect = targetEffect;
    }

    @Override
    public void inventoryTick(ItemStack stack, ServerWorld world, Entity entity, @Nullable EquipmentSlot slot) {
        super.inventoryTick(stack, world, entity, slot);
        if (entity instanceof PlayerEntity player) {
            if (player.getMainHandStack().isOf(this) || player.getOffHandStack().isOf(this) || slot == EquipmentSlot.HEAD || slot == EquipmentSlot.CHEST || slot == EquipmentSlot.LEGS || slot == EquipmentSlot.FEET) {
                if (player.getHealth() > player.getMaxHealth() / this.damageRangeOnHealh) {
                    player.setHealth(player.getMaxHealth() - (player.getMaxHealth() / this.damageRangeOnHealh));
                }
                player.addStatusEffect(new StatusEffectInstance(this.targetEffect, 10, 1, false, false));
            }
        }

    }
    @Override
    public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!target.getEntityWorld().isClient()) {
            target.addStatusEffect(new StatusEffectInstance(this.targetEffect, 100, 1));
        }
    }


}

