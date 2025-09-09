package rvl.more_ores.item.special_item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import rvl.more_ores.item.tool_fixer.FixSwordItem;
import rvl.more_ores.item.tool_fixer.FixerSettings;

public class ToxicSwordItem extends FixSwordItem {

    private final RegistryEntry<StatusEffect> hitEffect;

    public ToxicSwordItem(FixerSettings toolMaterial, float damage, float speed, Settings settings, RegistryEntry<StatusEffect> hitEffect) {
        super(toolMaterial, damage, speed, settings);
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
