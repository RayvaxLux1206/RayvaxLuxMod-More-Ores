package rvl.more_ores.block;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class XpDropToxicBlock extends DropExperienceBlock {

    private final Holder<MobEffect> targetEffect;
    public XpDropToxicBlock(IntProvider experienceDropped, BlockBehaviour.Properties settings, Holder<MobEffect> targetEffect) {
        super(experienceDropped, settings);
        this.targetEffect = targetEffect;
    }

    @Override
    public void stepOn(Level world, BlockPos pos, BlockState state, Entity entity) {
        if (entity == null) return;
        if (entity instanceof LivingEntity livEntity && !livEntity.isClientAuthoritative()) {
            livEntity.addEffect(new MobEffectInstance(this.targetEffect, 60, 1));
        }
    }
}
