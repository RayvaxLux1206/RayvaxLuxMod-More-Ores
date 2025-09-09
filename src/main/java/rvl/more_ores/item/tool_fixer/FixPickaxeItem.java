package rvl.more_ores.item.tool_fixer;

import net.minecraft.item.Item;
import net.minecraft.registry.tag.BlockTags;

public class FixPickaxeItem extends Item {
    public FixPickaxeItem(FixerSettings fix, float attackDamage, float attackSpeed, Settings settings) {
        super(fix.applyToolSettings(settings, BlockTags.PICKAXE_MINEABLE, attackDamage, attackSpeed, 0));
    }
}
