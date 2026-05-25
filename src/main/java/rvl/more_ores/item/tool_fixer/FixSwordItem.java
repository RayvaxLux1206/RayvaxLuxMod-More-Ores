package rvl.more_ores.item.tool_fixer;

import net.minecraft.world.item.Item;

public class FixSwordItem extends Item {
    public FixSwordItem(FixerSettings fix, float damage, float speed, Item.Properties settings) {
        super(fix.sword(damage, speed, settings));
    }

}
