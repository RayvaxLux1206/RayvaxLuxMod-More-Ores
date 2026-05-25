package rvl.more_ores.item.tool_fixer;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.ActionResult;
import org.jetbrains.annotations.Nullable;


public class SimplifyItem extends Item {

    public boolean alcaline = false;

    private boolean hasEffectOnTarget = false;
    private boolean HasEffectOnAttacker = false ;

    private RegistryEntry<StatusEffect> effectOnTarget;
    private RegistryEntry<StatusEffect> effectOnAttacker;

    private int effectTimeOnTarget;
    private int effectTimeOnAttacker;

    private int targetEffectAmp;
    private int attackerEffeectAmp;

    public SimplifyItem(Settings settings) {
        super(settings);
    }

    @Override
    public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postHit(stack, target, attacker);
        if (!target.getEntityWorld().isClient()) {
            target.addStatusEffect(new StatusEffectInstance(this.effectOnTarget, 100, 1));

        }

    }











    //effect methods

    public Item targetEffect(boolean bl, @Nullable RegistryEntry<StatusEffect> effect, int d, int a) {
        this.hasEffectOnTarget = bl;
        this.effectOnTarget = effect;
        this.effectTimeOnTarget = d;
        this.targetEffectAmp = a;

        return this;
    }

    public Item attackerEffect(boolean bl, @Nullable RegistryEntry<StatusEffect> effect, int d, int a) {
        this.HasEffectOnAttacker = bl;
        this.effectOnAttacker = effect;
        this.effectTimeOnAttacker = d;
        this.attackerEffeectAmp = a;

        return this;
    }

    public Item bothEffect(boolean bl, @Nullable RegistryEntry<StatusEffect> effect, int d, int a, boolean bl2, @Nullable RegistryEntry<StatusEffect> effect2, int d2, int a2) {
        targetEffect(bl, effect, d, a);
        attackerEffect(bl2, effect2, d2, a2);
        return this;
    }


    public Item isAlcaline() {
        this.alcaline = true;
        return this;
    }
}
