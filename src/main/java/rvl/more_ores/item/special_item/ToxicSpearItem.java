package rvl.more_ores.item.special_item;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jspecify.annotations.NonNull;
import rvl.more_ores.item.tool_fixer.FixSpearItem;
import rvl.more_ores.item.tool_fixer.FixerSettings;

public class ToxicSpearItem extends FixSpearItem {

    private final Holder<MobEffect> hitEffect;
    public ToxicSpearItem(FixerSettings fix, float attackDamage, float swingAnimationSeconds, float chargeDamageMultiplier, float chargeDelaySeconds, float maxDurationForDismountSeconds, float minSpeedForDismount, float maxDurationForChargeKnockbackInSeconds, float maxDurationForChargeDamageInSeconds, Item.Properties settings, Holder<MobEffect> hitEffect) {
        super(fix, attackDamage, swingAnimationSeconds, chargeDamageMultiplier, chargeDelaySeconds, maxDurationForDismountSeconds, minSpeedForDismount, maxDurationForChargeKnockbackInSeconds, maxDurationForChargeDamageInSeconds, settings);
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
