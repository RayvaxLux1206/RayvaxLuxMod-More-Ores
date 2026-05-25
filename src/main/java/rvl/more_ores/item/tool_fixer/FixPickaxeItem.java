package rvl.more_ores.item.tool_fixer;


import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;

public class FixPickaxeItem extends Item {
    public FixPickaxeItem(FixerSettings fix, float attackDamage, float attackSpeed, Item.Properties settings) {
        super(fix.applyToolSettings(settings, BlockTags.MINEABLE_WITH_PICKAXE, attackDamage, attackSpeed, 0));
    }
}
