/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package rvl.more_ores.item.special_item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.entry.RegistryEntry;

public class ToxicPickaxeItem extends PickaxeItem {

    private final RegistryEntry<StatusEffect> hitEffect;


    public ToxicPickaxeItem(ToolMaterial material, Settings settings, RegistryEntry<StatusEffect> hitEffect) {
        super(material, settings);
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

