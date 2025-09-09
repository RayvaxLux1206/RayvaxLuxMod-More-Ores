package rvl.more_ores.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import rvl.more_ores.item.special_item.AlcalineBlockItem;
import rvl.more_ores.item.special_item.AlcalineItem;

@Mixin(ItemEntity.class)
public class EntityItemMixin {

    private int alcalineConsumeTick = 1000;

    private final ItemEntity entity = ItemEntity.class.cast(this);

    @Inject(method = "tick" , at = @At("INVOKE"))
    public void tick(CallbackInfo info) {
        if (entity.getStack().getItem() instanceof AlcalineItem || entity.getStack().getItem() instanceof AlcalineBlockItem) {
            if (entity.isTouchingWater()) {
                entity.setOnFire(true);
                entity.setPickupDelayInfinite();
                if (alcalineConsumeTick != 0) {
                    --alcalineConsumeTick;
                } else {
                    entity.remove(Entity.RemovalReason.KILLED);
                }

            }
        }

    }
}
