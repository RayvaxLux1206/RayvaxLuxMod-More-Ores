package rvl.more_ores.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements FixToolMaterial {


    ALUMINIUM(2, 300, 5.0f,  13, () -> Ingredient.ofItems(ModItems.ALUMINIUM_INGOT)),

    TIN(1, 140, 5.5f,  6, () -> Ingredient.ofItems(ModItems.TIN_INGOT)),

    BRONZE(2, 200, 5.5f,  12, () -> Ingredient.ofItems(ModItems.BRONZE_INGOT)),

    STEEL(3, 750, 7f,  15, () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),

    CHROME(1, 145, 5f,  8, () -> Ingredient.ofItems(ModItems.CHROME_INGOT)),

    NICKEL(2, 250, 6f,  12, () -> Ingredient.ofItems(ModItems.NICKEL_INGOT)),

    PLOMB(1, 150, 4f,  15, () -> Ingredient.ofItems(ModItems.PLOMB_INGOT)),

    SILVER(1, 60, 8f,  15, () -> Ingredient.ofItems(ModItems.SILVER_INGOT)),

    TITANIUM(2, 210, 6f,  13, () -> Ingredient.ofItems(ModItems.TITANIUM_INGOT)),

    ZINC(1, 110, 4.5f,  15, () -> Ingredient.ofItems(ModItems.ZINC_INGOT)),

    VOLCANITE(3, 1250, 7f,  10, () -> Ingredient.ofItems(ModItems.VOLCANITE_INGOT)),

    SOULRITE(3, 1300, 4.5f,  17, () -> Ingredient.ofItems(ModItems.SOULRITE_INGOT)),

    RACKNITE(2, 1000, 4.5f,  12, () -> Ingredient.ofItems(ModItems.RACKNITE_INGOT)),

    ENDERITE(3, 1800, 10f,  17, () -> Ingredient.ofItems(ModItems.ENDERITE_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, int enchantability, Supplier<Ingredient> repairIngredient) {
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
    public int getMiningLevel() {
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

