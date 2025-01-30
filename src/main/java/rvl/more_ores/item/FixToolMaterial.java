package rvl.more_ores.item;

import net.minecraft.recipe.Ingredient;

public interface FixToolMaterial {
    public int getDurability();

    public float getMiningSpeedMultiplier();

    public int getMiningLevel();

    public int getEnchantability();

    public Ingredient getRepairIngredient();
}
