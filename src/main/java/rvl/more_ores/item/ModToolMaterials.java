package rvl.more_ores.item;

import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {


    ALUMINIUM(BlockTags.INCORRECT_FOR_IRON_TOOL, 300, 5.0f,  13, () -> Ingredient.ofItems(ModItems.ALUMINIUM_INGOT)),

    TIN(BlockTags.INCORRECT_FOR_STONE_TOOL, 140, 5.5f,  6, () -> Ingredient.ofItems(ModItems.TIN_INGOT)),

    BRONZE(BlockTags.INCORRECT_FOR_IRON_TOOL, 200, 5.5f,  12, () -> Ingredient.ofItems(ModItems.BRONZE_INGOT)),

    STEEL(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 750, 7f,  15, () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),

    CHROME(BlockTags.INCORRECT_FOR_STONE_TOOL, 145, 5f,  8, () -> Ingredient.ofItems(ModItems.CHROME_INGOT)),

    NICKEL(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 6f,  12, () -> Ingredient.ofItems(ModItems.NICKEL_INGOT)),

    PLOMB(BlockTags.INCORRECT_FOR_STONE_TOOL, 150, 4f,  15, () -> Ingredient.ofItems(ModItems.PLOMB_INGOT)),

    SILVER(BlockTags.INCORRECT_FOR_GOLD_TOOL, 60, 8f,  15, () -> Ingredient.ofItems(ModItems.SILVER_INGOT)),

    TITANIUM(BlockTags.INCORRECT_FOR_IRON_TOOL, 210, 6f,  13, () -> Ingredient.ofItems(ModItems.TITANIUM_INGOT)),

    ZINC(BlockTags.INCORRECT_FOR_GOLD_TOOL, 110, 4.5f,  15, () -> Ingredient.ofItems(ModItems.ZINC_INGOT)),

    VOLCANITE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1250, 7f,  10, () -> Ingredient.ofItems(ModItems.VOLCANITE_INGOT)),

    SOULRITE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1300, 4.5f,  17, () -> Ingredient.ofItems(ModItems.SOULRITE_INGOT)),

    RACKNITE(BlockTags.INCORRECT_FOR_IRON_TOOL, 1000, 4.5f,  12, () -> Ingredient.ofItems(ModItems.RACKNITE_INGOT)),

    ENDERITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1800, 10f,  17, () -> Ingredient.ofItems(ModItems.ENDERITE_INGOT));

    private final TagKey<Block> miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterials(TagKey<Block> miningLevel, int itemDurability, float miningSpeed, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}

