package rvl.more_ores.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class AlcalineBlock extends Block {

    private int BurnTickDelay = 2000;
    private int BurntickDelaySuface = 10;


    public AlcalineBlock(Settings settings) {
        super(settings);
    }



    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
        Block air = Blocks.AIR;
        Block fire = Blocks.FIRE;
        Block water = Blocks.WATER;
        BlockPos targetPos = pos.up();
        BlockPos targetPos2 = pos.north();
        BlockPos targetPos3 = pos.south();
        BlockPos targetPos4 = pos.east();
        BlockPos targetPos5 = pos.west();
        if (getTarget(world, targetPos) != air && getTarget(world, targetPos2) != air && getTarget(world, targetPos3) != air && getTarget(world, targetPos4) != air && getTarget(world, targetPos5) != air && getTarget(world, pos.down()) != air && getTarget(world, targetPos) != fire && getTarget(world, targetPos2) != fire && getTarget(world, targetPos3) != fire && getTarget(world, targetPos4) != fire && getTarget(world, targetPos5) != fire && getTarget(world, pos.down()) != fire) {
            if (getTarget(world, targetPos) == water || getTarget(world, targetPos2) == water || getTarget(world, targetPos3) == water || getTarget(world, targetPos4) == water || getTarget(world, targetPos5) == water) {
                if (world.getBlockState(targetPos).getBlock() == water) {
                    world.setBlockState(targetPos, fire.getDefaultState(), 3);
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
                world.setBlockState(targetPos, fire.getDefaultState(), 3);
            }
            if (world.getBlockState(targetPos2).getBlock() == air) {
                world.setBlockState(targetPos2, fire.getDefaultState(),  3);
            }
            if (world.getBlockState(targetPos3).getBlock() == air) {
                world.setBlockState(targetPos3, fire.getDefaultState(), 3);
            }
            if (world.getBlockState(targetPos4).getBlock() == air) {
                world.setBlockState(targetPos4, fire.getDefaultState(), 3);
            }
            if (world.getBlockState(targetPos5).getBlock() == air) {
                world.setBlockState(targetPos5, fire.getDefaultState(), 3);
            }
            if (this.BurntickDelaySuface != 0) {
                --this.BurntickDelaySuface;
            } else {
                world.removeBlock(pos, true);
                this.BurntickDelaySuface = 10;
            }

        }

        return state;
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        Block air = Blocks.AIR;
        Block fire = Blocks.FIRE;
        Block water = Blocks.WATER;
        BlockPos targetPos = pos.up();
        BlockPos targetPos2 = pos.north();
        BlockPos targetPos3 = pos.south();
        BlockPos targetPos4 = pos.east();
        BlockPos targetPos5 = pos.west();
        if (getTarget(world, targetPos) == water || getTarget(world, targetPos2) == water || getTarget(world, targetPos3) == water || getTarget(world, targetPos4) == water || getTarget(world, targetPos5) == water) {
            if (world.getBlockState(targetPos).getBlock() == air || world.getBlockState(targetPos).getBlock() == water) {
                world.setBlockState(targetPos, fire.getDefaultState(), 3);
            }
            if (world.getBlockState(targetPos2).getBlock() == air) {
                world.setBlockState(targetPos2, fire.getDefaultState(),  3);
            }
            if (world.getBlockState(targetPos3).getBlock() == air) {
                world.setBlockState(targetPos3, fire.getDefaultState(), 3);
            }
            if (world.getBlockState(targetPos4).getBlock() == air) {
                world.setBlockState(targetPos4, fire.getDefaultState(), 3);
            }
            if (world.getBlockState(targetPos5).getBlock() == air) {
                world.setBlockState(targetPos5, fire.getDefaultState(), 3);
            }


        }

    }

    private Block getTarget(WorldAccess world, BlockPos pos) {
        return world.getBlockState(pos).getBlock();
    }





}
