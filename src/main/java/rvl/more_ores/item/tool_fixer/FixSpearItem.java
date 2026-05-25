package rvl.more_ores.item.tool_fixer;

import net.minecraft.world.item.Item;

public class FixSpearItem extends Item {

    public FixSpearItem(FixerSettings fix, float attackDamage, float swingAnimationSeconds, float chargeDamageMultiplier, float chargeDelaySeconds, float maxDurationForDismountSeconds, float minSpeedForDismount, float maxDurationForChargeKnockbackInSeconds, float maxDurationForChargeDamageInSeconds, Item.Properties settings) {
        super(fix.spear(attackDamage, swingAnimationSeconds, chargeDamageMultiplier, chargeDelaySeconds, maxDurationForDismountSeconds, minSpeedForDismount, maxDurationForChargeKnockbackInSeconds, 5.1f, maxDurationForChargeDamageInSeconds, 4.6f, settings));
    }
}
