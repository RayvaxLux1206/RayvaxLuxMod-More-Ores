package rvl.more_ores.item.special_item;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.World;

public class ToxicBlockItem extends BlockItem {

    private final int damageRangeOnHealh;
    private final RegistryEntry<StatusEffect> targetEffect;
    public ToxicBlockItem(Block block, Settings settings, RegistryEntry<StatusEffect> targetEffect, int damageRangeOnHealh) {
        super(block, settings);
        this.damageRangeOnHealh = damageRangeOnHealh;
        this.targetEffect = targetEffect;
    }

    @Override
    public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
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
            target.addStatusEffect(new StatusEffectInstance(this.targetEffect, 100, 1));
        }
        return true;
    }
}
