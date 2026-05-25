package rvl.more_ores.item.special_item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import org.jetbrains.annotations.Nullable;
import rvl.more_ores.item.tool_fixer.FixSpearItem;
import rvl.more_ores.item.tool_fixer.FixerSettings;

public class ToxicSpearItem extends FixSpearItem {

    private boolean hasHitEffect = false;
    private RegistryEntry<StatusEffect> hitEffect;
    private int hitEffectTime;
    private int hitAmplifier;

    public ToxicSpearItem(FixerSettings fix, float swingAnimationSeconds, float chargeDamageMultiplier, float chargeDelaySeconds, float maxDurationForDismountSeconds, float minSpeedForDismount, float maxDurationForChargeKnockbackInSeconds, float maxDurationForChargeDamageInSeconds, Settings settings) {
        super(fix, swingAnimationSeconds, chargeDamageMultiplier, chargeDelaySeconds, maxDurationForDismountSeconds, minSpeedForDismount, maxDurationForChargeKnockbackInSeconds, maxDurationForChargeDamageInSeconds, settings);

    }

    @Override
    public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postHit(stack, target, attacker);
        if (!target.getEntityWorld().isClient()) {
            if (hasHitEffect) {
                target.addStatusEffect(new StatusEffectInstance(this.hitEffect, this.hitEffectTime, this.hitAmplifier));
            }

        }

    }
    public Item targetEffect(boolean bl, @Nullable RegistryEntry<StatusEffect> effect, int d, int a) {
        this.hasHitEffect = bl;
        this.hitEffect = effect;
        this.hitEffectTime = d;
        this.hitAmplifier = a;
        if (hasHitEffect) {
            new StatusEffectInstance(this.hitEffect, this.hitEffectTime, this.hitAmplifier);
        }
        return this.asItem();
    }
}
