/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package rvl.more_ores.item.special_item;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jspecify.annotations.NonNull;
import rvl.more_ores.item.tool_fixer.FixHoeItem;
import rvl.more_ores.item.tool_fixer.FixerSettings;

public class ToxicHoeItem extends FixHoeItem {

    private final Holder<MobEffect> hitEffect;

    public ToxicHoeItem(FixerSettings toolMaterial, float damage, float speed, Item.Properties settings, Holder<MobEffect> hitEffect) {
        super(toolMaterial, damage, speed, settings);
        this.hitEffect = hitEffect;
    }

    @Override
    public void postHurtEnemy(@NonNull ItemStack stack, @NonNull LivingEntity target, @NonNull LivingEntity attacker) {
        super.postHurtEnemy(stack, target, attacker);
        if (!target.isClientAuthoritative()) {
            target.addEffect(new MobEffectInstance(this.hitEffect, 100, 0));
        }

    }
}


