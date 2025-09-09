package rvl.more_ores.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ToxicMineralBlock extends Block {

    private final RegistryEntry<StatusEffect> targetEffect;
    public ToxicMineralBlock(Settings settings, RegistryEntry<StatusEffect> targetEffect) {
        super(settings);
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
