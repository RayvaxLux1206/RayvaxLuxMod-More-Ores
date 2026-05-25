package rvl.more_ores.item.tool_fixer;


import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public interface ToolFixerInterface {

    TagKey<Block> getIncorrectBlocksForDrops();

    int getDurability();

    float getAttackSpeed();

    float getMiningSpeed();

    float getAttackDamage();

    int getEnchantmentValue();

    TagKey<Item> getRepairIngredients();
}
