package rvl.more_ores.item.tool_fixer;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FixSwordItem extends Item {
    public FixSwordItem(FixerSettings fix, float damage, float speed, Settings settings) {
        super(fix.applySwordSettings(settings, damage, speed));
    }

    public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
    }

    public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damage(1, attacker, EquipmentSlot.MAINHAND);
    }
    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {
        return !miner.isCreative();
    }
}
