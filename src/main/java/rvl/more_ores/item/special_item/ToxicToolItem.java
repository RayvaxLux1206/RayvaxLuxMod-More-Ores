/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package rvl.more_ores.item.special_item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import rvl.more_ores.item.tool_fixer.FixPickaxeItem;
import rvl.more_ores.item.tool_fixer.FixerSettings;

public class ToxicToolItem extends FixPickaxeItem {

    private final RegistryEntry<StatusEffect> hitEffect;


    public ToxicToolItem(FixerSettings material, float damage, float speed, Settings settings, RegistryEntry<StatusEffect> hitEffect) {
        super(material, damage, speed, settings);
        this.hitEffect = hitEffect;
    }
    @Override
    public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postHit(stack, target, attacker);
        if (!target.getWorld().isClient()) {
            target.addStatusEffect(new StatusEffectInstance(this.hitEffect, 100, 1));

        }

    }
}

