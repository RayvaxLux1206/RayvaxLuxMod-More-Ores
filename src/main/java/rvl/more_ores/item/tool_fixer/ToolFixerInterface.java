package rvl.more_ores.item.tool_fixer;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;

public interface ToolFixerInterface {

    TagKey<Block> getIncorrectBlocksForDrops();

    int getDurability();

    float getAttackSpeed();

    float getMiningSpeed();

    float getAttackDamage();

    int getEnchantmentValue();

    TagKey<Item> getRepairIngredients();
}
