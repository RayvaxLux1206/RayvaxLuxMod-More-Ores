package rvl.more_ores.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.World;

public class XpDropToxicBlock extends ExperienceDroppingBlock {

    private final RegistryEntry<StatusEffect> targetEffect;
    public XpDropToxicBlock(IntProvider experienceDropped, Settings settings, RegistryEntry<StatusEffect> targetEffect) {
        super(experienceDropped, settings);
        this.targetEffect = targetEffect;
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (entity == null) return;
        if (entity instanceof LivingEntity livEntity && !livEntity.getWorld().isClient()) {
            ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(this.targetEffect, 60, 1));
        }
    }
}
