/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package rvl.more_ores.item.special_item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.entry.RegistryEntry;

public class ToxicHoeItem extends HoeItem {

    private final RegistryEntry<StatusEffect> hitEffect;

    public ToxicHoeItem(ToolMaterial toolMaterial, Settings settings, RegistryEntry<StatusEffect> hitEffect) {
        super(toolMaterial, settings);
        this.hitEffect = hitEffect;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postHit(stack, target, attacker);
        if (!target.getWorld().isClient()) {
            target.addStatusEffect(new StatusEffectInstance(this.hitEffect, 100, 1));

        }

        return true;
    }
}


