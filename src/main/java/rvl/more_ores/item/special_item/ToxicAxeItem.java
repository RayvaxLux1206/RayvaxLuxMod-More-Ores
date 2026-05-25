/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package rvl.more_ores.item.special_item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import org.jspecify.annotations.Nullable;
import rvl.more_ores.MoreOres;
import rvl.more_ores.item.tool_fixer.FixAxeItem;
import rvl.more_ores.item.tool_fixer.FixerSettings;

public class ToxicAxeItem extends FixAxeItem {

    @Nullable
    private final RegistryEntry<StatusEffect> effect;

    public ToxicAxeItem(FixerSettings toolMaterial, float damage, float speed, Settings settings, RegistryEntry<StatusEffect> effect) {
        super(toolMaterial, damage, speed, settings);
        this.effect = effect;
    }

    @Override
    public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postHit(stack, target, attacker);
        if (!target.getEntityWorld().isClient()) {
            target.addStatusEffect(new StatusEffectInstance(this.effect, 100, 0));

        }

    }





}

