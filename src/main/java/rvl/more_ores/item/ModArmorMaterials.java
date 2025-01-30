package rvl.more_ores.item;

import com.mojang.serialization.Codec;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum ModArmorMaterials implements StringIdentifiable,
        ArmorMaterial
{
    ALUMINIUM("aluminium", 14, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 4);
        map.put(ArmorItem.Type.CHESTPLATE, 5);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.ofItems(ModItems.ALUMINIUM_INGOT)),
    Tin("tin", 7, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 1);
        map.put(ArmorItem.Type.LEGGINGS, 3);
        map.put(ArmorItem.Type.CHESTPLATE, 5);
        map.put(ArmorItem.Type.HELMET, 2);
    }),6, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0f, 0f, () -> Ingredient.ofItems(ModItems.TIN_INGOT)),
    BRONZE("bronze", 11, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 4);
        map.put(ArmorItem.Type.CHESTPLATE, 5);
        map.put(ArmorItem.Type.HELMET, 2);
    }),11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.ofItems(ModItems.BRONZE_INGOT)),
    STEEL("steel", 24, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 7);
        map.put(ArmorItem.Type.HELMET, 3);
    }), 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.5f, 0f, () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),
    CHROME("chrome", 10, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 3);
        map.put(ArmorItem.Type.CHESTPLATE, 4);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0f, 0f, () -> Ingredient.ofItems(ModItems.CHROME_INGOT)),
    NICKEL("nickel", 15, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
    map.put(ArmorItem.Type.BOOTS, 2);
    map.put(ArmorItem.Type.LEGGINGS, 5);
    map.put(ArmorItem.Type.CHESTPLATE, 6);
    map.put(ArmorItem.Type.HELMET, 2);
}), 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.ofItems(ModItems.NICKEL_INGOT)),
    PLOMB("plomb", 7, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
    map.put(ArmorItem.Type.BOOTS, 1);
    map.put(ArmorItem.Type.LEGGINGS, 3);
    map.put(ArmorItem.Type.CHESTPLATE, 5);
    map.put(ArmorItem.Type.HELMET, 2);
}), 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0f, 0f, () -> Ingredient.ofItems(ModItems.PLOMB_INGOT)),
    SILVER("silver", 7, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 1);
        map.put(ArmorItem.Type.LEGGINGS, 3);
        map.put(ArmorItem.Type.CHESTPLATE, 5);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 12, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0f, 0f, () -> Ingredient.ofItems(ModItems.SILVER_INGOT)),
    TITANIUM("titanium", 14, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 5);
        map.put(ArmorItem.Type.CHESTPLATE, 6);
        map.put(ArmorItem.Type.HELMET, 3);
    }), 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.ofItems(ModItems.TITANIUM_INGOT)),
    ZINC("zinc", 8, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 3);
        map.put(ArmorItem.Type.CHESTPLATE, 5);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0f, 0f, () -> Ingredient.ofItems(ModItems.PLOMB_INGOT)),
    VOLCANITE("volcanite", 20, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.HELMET, 3);
        map.put(ArmorItem.Type.CHESTPLATE, 5);
        map.put(ArmorItem.Type.LEGGINGS, 7);
        map.put(ArmorItem.Type.BOOTS, 3);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0f, 0.1f, () -> Ingredient.ofItems(ModItems.VOLCANITE_INGOT)),
    SOULRITE("soulrite", 25, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.HELMET, 3);
        map.put(ArmorItem.Type.CHESTPLATE, 5);
        map.put(ArmorItem.Type.LEGGINGS, 7);
        map.put(ArmorItem.Type.BOOTS, 3);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0f, 0.1f, () -> Ingredient.ofItems(ModItems.SOULRITE_INGOT)),
    RACKNITE("racknite", 18, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.HELMET, 2);
        map.put(ArmorItem.Type.CHESTPLATE, 5);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.BOOTS, 2);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0f, 0.1f, () -> Ingredient.ofItems(ModItems.RACKNITE_INGOT)),
    ENDERITE("enderite", 30, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.HELMET, 3);
        map.put(ArmorItem.Type.CHESTPLATE, 6);
        map.put(ArmorItem.Type.LEGGINGS, 8);
        map.put(ArmorItem.Type.BOOTS, 3);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0f, 0.1f, () -> Ingredient.ofItems(ModItems.ENDERITE_INGOT));




    public static final Codec<ArmorMaterials> CODEC = StringIdentifiable.createCodec(ArmorMaterials::values);
    private static final EnumMap<ArmorItem.Type, Integer> BASE_DURABILITY = Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 13);
        map.put(ArmorItem.Type.LEGGINGS, 15);
        map.put(ArmorItem.Type.CHESTPLATE, 16);
        map.put(ArmorItem.Type.HELMET, 11);
    });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private ModArmorMaterials(String name, int durabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy<Ingredient>(repairIngredientSupplier);
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY.get((Object)type) * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return this.protectionAmounts.get((Object)type);
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    @Override
    public String asString() {
        return this.name;
    }

}