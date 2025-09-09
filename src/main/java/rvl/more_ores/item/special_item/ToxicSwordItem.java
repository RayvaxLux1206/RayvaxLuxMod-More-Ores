package rvl.more_ores.item.special_item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import rvl.more_ores.item.Fixer.FixPickaxeItem;
import rvl.more_ores.item.Fixer.FixSwordItem;
import rvl.more_ores.item.Fixer.FixToolMaterial;

public class ToxicSwordItem extends FixSwordItem {
    private final StatusEffect hitEffect;
    public ToxicSwordItem(FixToolMaterial material, float attackDamage, float attackSpeed, Settings settings, StatusEffect hitEffect) {
        super(material, attackDamage, attackSpeed, settings);
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
