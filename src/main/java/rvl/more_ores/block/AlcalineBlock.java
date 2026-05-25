package rvl.more_ores.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.redstone.Orientation;
import org.jspecify.annotations.Nullable;

public class AlcalineBlock extends Block {

    private int BurnTickDelay = 2000;
    private int BurntickDelaySuface = 10;

    public AlcalineBlock(Properties properties) {
        super(properties);
    }


    @Override
    public void neighborChanged(final BlockState state, final Level world, final BlockPos pos, final Block block, final @Nullable Orientation orientation, final boolean movedByPiston) {
        super.neighborChanged(state, world, pos, block, orientation, movedByPiston);
        Block air = Blocks.AIR;
        Block fire = Blocks.FIRE;
        Block water = Blocks.WATER;
        BlockPos targetPos = pos.above();
        BlockPos targetPos2 = pos.north();
        BlockPos targetPos3 = pos.south();
        BlockPos targetPos4 = pos.east();
        BlockPos targetPos5 = pos.west();
        if (getTarget(world, targetPos) != air && getTarget(world, targetPos2) != air && getTarget(world, targetPos3) != air && getTarget(world, targetPos4) != air && getTarget(world, targetPos5) != air && getTarget(world, pos.below()) != air && getTarget(world, targetPos) != fire && getTarget(world, targetPos2) != fire && getTarget(world, targetPos3) != fire && getTarget(world, targetPos4) != fire && getTarget(world, targetPos5) != fire && getTarget(world, pos.below()) != fire) {
            if (getTarget(world, targetPos) == water || getTarget(world, targetPos2) == water || getTarget(world, targetPos3) == water || getTarget(world, targetPos4) == water || getTarget(world, targetPos5) == water) {
                if (world.getBlockState(targetPos).getBlock() == water) {
                    world.setBlock(targetPos, fire.defaultBlockState(), 3);
                }
                if (this.BurnTickDelay != 0) {
                    --this.BurnTickDelay;
                } else {
                    world.removeBlock(pos, true);
                    this.BurnTickDelay = 2000;
                }
            }

        } else if (getTarget(world, targetPos) == water || getTarget(world, targetPos2) == water || getTarget(world, targetPos3) == water || getTarget(world, targetPos4) == water || getTarget(world, targetPos5) == water) {
            if (world.getBlockState(targetPos).getBlock() == air || world.getBlockState(targetPos).getBlock() == water) {
                world.setBlock(targetPos, fire.defaultBlockState(), 3);
            }
            if (world.getBlockState(targetPos2).getBlock() == air) {
                world.setBlock(targetPos2, fire.defaultBlockState(),  3);
            }
            if (world.getBlockState(targetPos3).getBlock() == air) {
                world.setBlock(targetPos3, fire.defaultBlockState(), 3);
            }
            if (world.getBlockState(targetPos4).getBlock() == air) {
                world.setBlock(targetPos4, fire.defaultBlockState(), 3);
            }
            if (world.getBlockState(targetPos5).getBlock() == air) {
                world.setBlock(targetPos5, fire.defaultBlockState(), 3);
            }
            if (this.BurntickDelaySuface != 0) {
                --this.BurntickDelaySuface;
            } else {
                world.removeBlock(pos, true);
                this.BurntickDelaySuface = 10;
            }

        }
    }

    @Override
    public void onPlace(final BlockState state, final Level world, final BlockPos pos, final BlockState oldState, final boolean movedByPiston) {
        Block air = Blocks.AIR;
        Block fire = Blocks.FIRE;
        Block water = Blocks.WATER;
        BlockPos targetPos = pos.above();
        BlockPos targetPos2 = pos.north();
        BlockPos targetPos3 = pos.south();
        BlockPos targetPos4 = pos.east();
        BlockPos targetPos5 = pos.west();
        if (getTarget(world, targetPos) == water || getTarget(world, targetPos2) == water || getTarget(world, targetPos3) == water || getTarget(world, targetPos4) == water || getTarget(world, targetPos5) == water) {
            if (world.getBlockState(targetPos).getBlock() == air || world.getBlockState(targetPos).getBlock() == water) {
                world.setBlock(targetPos, fire.defaultBlockState(), 3);
            }
            if (world.getBlockState(targetPos2).getBlock() == air) {
                world.setBlock(targetPos2, fire.defaultBlockState(),  3);
            }
            if (world.getBlockState(targetPos3).getBlock() == air) {
                world.setBlock(targetPos3, fire.defaultBlockState(), 3);
            }
            if (world.getBlockState(targetPos4).getBlock() == air) {
                world.setBlock(targetPos4, fire.defaultBlockState(), 3);
            }
            if (world.getBlockState(targetPos5).getBlock() == air) {
                world.setBlock(targetPos5, fire.defaultBlockState(), 3);
            }


        }

    }

    private Block getTarget(Level world, BlockPos pos) {
        return world.getBlockState(pos).getBlock();
    }





}
