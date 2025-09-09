package rvl.more_ores.item;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import rvl.more_ores.item.tool_fixer.ToolFixerInterface;
import rvl.more_ores.tags.ItemTags;

import java.util.List;

public enum AddToolMaterial implements ToolFixerInterface {
    ALUMINIUM(BlockTags.INCORRECT_FOR_IRON_TOOL, 300, 5, 13, ItemTags.R_ALUMINIUM),

    TIN(BlockTags.INCORRECT_FOR_GOLD_TOOL, 140, 3, 6, ItemTags.R_TIN),

    BRONZE(BlockTags.INCORRECT_FOR_IRON_TOOL, 200, 5, 12, ItemTags.R_BRONZE),

    STEEL(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 750, 10, 15, ItemTags.R_STEEL),

    CHROME(BlockTags.INCORRECT_FOR_GOLD_TOOL, 145, 4, 8, ItemTags.R_CHROME),

    NICKEL(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 6, 12, ItemTags.R_NICKEL),

    PLOMB(BlockTags.INCORRECT_FOR_GOLD_TOOL, 150, 6, 15, ItemTags.R_PLOMB),

    SILVER(BlockTags.INCORRECT_FOR_GOLD_TOOL, 60, 5, 15, ItemTags.R_SILVER),

    TITANIUM(BlockTags.INCORRECT_FOR_IRON_TOOL, 210, 7, 13, ItemTags.R_TITANIUM),

    ZINC(BlockTags.INCORRECT_FOR_GOLD_TOOL, 110, 4, 15, ItemTags.R_ZINC),

    VOLCANITE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1250, 8,  10, ItemTags.R_VOLCANITE),

    SOULRITE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1300, 10,  17, ItemTags.R_SOULRITE),

    RACKNITE(BlockTags.INCORRECT_FOR_IRON_TOOL, 1000, 6,  12, ItemTags.R_RACKNITE),

    ENDERITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1800, 12,  17, ItemTags.R_ENDERITE);

    private final TagKey<Block> incorrectBlocksForDrops;
    private final int durability;
    private final float miningSpeed;
    private final int enchantmentValue;
    private final TagKey<Item> repairItems;


    AddToolMaterial(TagKey<Block> incorrectBlocksForDrops, int durability, float miningSpeed,int enchantmentValue, TagKey<Item> repairItems) {
        this.incorrectBlocksForDrops = incorrectBlocksForDrops;
        this.durability = durability;
        this.miningSpeed = miningSpeed;
        this.enchantmentValue = enchantmentValue;
        this.repairItems = repairItems;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectBlocksForDrops;
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getAttackSpeed() {return -4;}

    @Override
    public float getMiningSpeed() {return this.miningSpeed;}

    @Override
    public float getAttackDamage() {return -1f;}

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public TagKey<Item> getRepairIngredients() {
        return this.repairItems;
    }

}

