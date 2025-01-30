package rvl.more_ores.mixin;

import net.minecraft.block.BambooShootBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import rvl.more_ores.item.tool_fixer.FixSwordItem;
import rvl.more_ores.item.tool_fixer.FixerSettings;

@Mixin(BambooShootBlock.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "calcBlockBreakingDelta", cancellable = true)
	protected float init(BlockState state, PlayerEntity player, BlockView world, BlockPos pos, CallbackInfoReturnable<Item> info) {
		Item item = player.getMainHandStack().getItem();
		if (item instanceof SwordItem || item instanceof FixSwordItem) {
			info.setReturnValue(item);
		}
		return 1.0f;
	}
}