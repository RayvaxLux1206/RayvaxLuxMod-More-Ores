package rvl.more_ores.mixin;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
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
        Item item = entity.getItem().getItem();
        if (item instanceof AlcalineBlockItem || item instanceof SimplifyItem simplifyItem && simplifyItem.alcaline)  {
            if (entity.isInWater()) {
                entity.setSharedFlagOnFire(true);
                entity.setNeverPickUp();
                if (alcalineConsumeTick != 0) {
                    --alcalineConsumeTick;
                } else {
                    entity.remove(Entity.RemovalReason.KILLED);
                }

            }
        }

    }
}
