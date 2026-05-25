package rvl.more_ores.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import rvl.more_ores.item.special_item.AlcalineBlockItem;
import rvl.more_ores.item.tool_fixer.SimplifyItem;

@Mixin(ItemEntity.class)
public class EntityItemMixin {

    private int alcalineConsumeTick = 50;

    private final ItemEntity entity = ItemEntity.class.cast(this);

    @Inject(at = @At("HEAD"), method = "tick")
    public void tick(CallbackInfo info) {
        Item item = entity.getStack().getItem();
        if (item instanceof AlcalineBlockItem || item instanceof SimplifyItem simplifyItem && simplifyItem.alcaline)  {
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
