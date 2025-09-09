package rvl.more_ores.item.tool_fixer;

import net.minecraft.registry.tag.BlockTags;

public class FixPickaxeItem extends FixTool {
    public FixPickaxeItem(FixerSettings fix, float attackDamage, float attackSpeed, Settings settings) {
        super(fix, BlockTags.PICKAXE_MINEABLE, attackDamage, attackSpeed, settings);
    }
}
