package rvl.more_ores.item;


import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import rvl.more_ores.MoreOres;
import rvl.more_ores.item.tool_fixer.*;

public class ModItems {

//Items register - Minerals
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", new Item(normalSettings("aluminium_ingot")));
    public static final Item ALUMINIUM_RAW = registerItem("aluminium_raw", new Item(normalSettings("aluminium_raw")));

    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(normalSettings("tin_ingot")));
    public static final Item TIN_RAW = registerItem("tin_raw", new Item(normalSettings("tin_raw")));

    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(normalSettings("bronze_ingot")));
    public static final Item BRONZE_ALLOY = registerItem("bronze_alloy", new Item(normalSettings("bronze_alloy")));

    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(normalSettings("steel_ingot")));
    public static final Item STEEL_ALLOY = registerItem("steel_alloy", new Item(normalSettings("steel_alloy")));

    public static final Item CHROME_INGOT = registerItem("chrome_ingot", new Item(normalSettings("chrome_ingot")));
    public static final Item CHROME_RAW = registerItem("chrome_raw", new Item(normalSettings("chrome_raw")));

    public static final Item NICKEL_INGOT = registerItem("nickel_ingot", new Item(normalSettings("nickel_ingot")));
    public static final Item NICKEL_RAW = registerItem("nickel_raw", new Item(normalSettings("nickel_raw")));

    public static final Item PLOMB_INGOT = registerItem("plomb_ingot", new Item(normalSettings("plomb_ingot")));
    public static final Item PLOMB_RAW = registerItem("plomb_raw", new Item(normalSettings("plomb_raw")));

    public static final Item SILICON_INGOT = registerItem("silicon_ingot", new Item(normalSettings("silicon_ingot")));
    public static final Item SILICON_RAW = registerItem("silicon_raw", new Item(normalSettings("silicon_raw")));

    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(normalSettings("silver_ingot")));
    public static final Item SILVER_RAW = registerItem("silver_raw", new Item(normalSettings("silver_raw")));

    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(normalSettings("silver_raw")));
    public static final Item TITANIUM_RAW = registerItem("titanium_raw", new Item(normalSettings("titanium_raw")));

    public static final Item ZINC_INGOT = registerItem("zinc_ingot", new Item(normalSettings("zinc_ingot")));
    public static final Item ZINC_RAW = registerItem("zinc_raw", new Item(normalSettings("zinc_raw")));


    //ModArmorItems - Aluminium Armor
    public static final Item ALUMINIUM_HELMET = registerItem("aluminium_helmet",
            new ArmorItem(ModArmorMaterials.ALUMINIUM, EquipmentType.HELMET, normalSettings("aluminium_helmet")));

    public static final Item ALUMINIUM_CHESTPLATE = registerItem("aluminium_chestplate",
            new ArmorItem(ModArmorMaterials.ALUMINIUM, EquipmentType.CHESTPLATE, normalSettings("aluminium_chestplate")));

    public static final Item ALUMINIUM_LEGGINGS = registerItem("aluminium_leggings",
            new ArmorItem(ModArmorMaterials.ALUMINIUM, EquipmentType.LEGGINGS, normalSettings("aluminium_leggings")));

    public static final Item ALUMINIUM_BOOTS = registerItem("aluminium_boots",
            new ArmorItem(ModArmorMaterials.ALUMINIUM, EquipmentType.BOOTS, normalSettings("aluminium_boots")));

    //ModArmorItems - Tin Armor
    public static final Item TIN_HELMET = registerItem("tin_helmet",
            new ArmorItem(ModArmorMaterials.TIN, EquipmentType.HELMET, normalSettings("tin_helmet")));

    public static final Item TIN_CHESTPLATE = registerItem("tin_chestplate",
            new ArmorItem(ModArmorMaterials.TIN, EquipmentType.CHESTPLATE, normalSettings("tin_chestplate")));

    public static final Item TIN_LEGGINGS = registerItem("tin_leggings",
            new ArmorItem(ModArmorMaterials.TIN, EquipmentType.LEGGINGS, normalSettings("tin_leggings")));

    public static final Item TIN_BOOTS = registerItem("tin_boots",
            new ArmorItem(ModArmorMaterials.TIN, EquipmentType.BOOTS, normalSettings("tin_boots")));

    //ModArmorItems - Bronze Armor
    public static final Item BRONZE_HELMET = registerItem("bronze_helmet",
            new ArmorItem(ModArmorMaterials.BRONZE, EquipmentType.HELMET, normalSettings("bronze_helmet")));

    public static final Item BRONZE_CHESTPLATE = registerItem("bronze_chestplate",
            new ArmorItem(ModArmorMaterials.BRONZE, EquipmentType.CHESTPLATE, normalSettings("bronze_chestplate")));

    public static final Item BRONZE_LEGGINGS = registerItem("bronze_leggings",
            new ArmorItem(ModArmorMaterials.BRONZE, EquipmentType.LEGGINGS, normalSettings("bronze_leggings")));

    public static final Item BRONZE_BOOTS = registerItem("bronze_boots",
            new ArmorItem(ModArmorMaterials.BRONZE, EquipmentType.BOOTS, normalSettings("bronze_boots")));


    //ModArmorItems - Steel Armor
    public static final Item STEEL_HELMET = registerItem("steel_helmet",
            new ArmorItem(ModArmorMaterials.STEEL, EquipmentType.HELMET, normalSettings("steel_helmet")));

    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate",
            new ArmorItem(ModArmorMaterials.STEEL, EquipmentType.CHESTPLATE, normalSettings("steel_chestplate")));

    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings",
            new ArmorItem(ModArmorMaterials.STEEL, EquipmentType.LEGGINGS, normalSettings("steel_leggings")));

    public static final Item STEEL_BOOTS = registerItem("steel_boots",
            new ArmorItem(ModArmorMaterials.STEEL, EquipmentType.BOOTS, normalSettings("steel_boots")));

    //ModArmorItems - Chrome Armor
    public static final Item CHROME_HELMET = registerItem("chrome_helmet",
            new ArmorItem(ModArmorMaterials.CHROME, EquipmentType.HELMET, normalSettings("chrome_helmet")));

    public static final Item CHROME_CHESTPLATE = registerItem("chrome_chestplate",
            new ArmorItem(ModArmorMaterials.CHROME, EquipmentType.CHESTPLATE, normalSettings("chrome_chestplate")));

    public static final Item CHROME_LEGGINGS = registerItem("chrome_leggings",
            new ArmorItem(ModArmorMaterials.CHROME, EquipmentType.LEGGINGS, normalSettings("chrome_leggings")));

    public static final Item CHROME_BOOTS = registerItem("chrome_boots",
            new ArmorItem(ModArmorMaterials.CHROME, EquipmentType.BOOTS, normalSettings("chrome_boots")));

    //ModArmorItems - Nickel Armor
    public static final Item NICKEL_HELMET = registerItem("nickel_helmet",
            new ArmorItem(ModArmorMaterials.NICKEL, EquipmentType.HELMET, normalSettings("nickel_helmet")));

    public static final Item NICKEL_CHESTPLATE = registerItem("nickel_chestplate",
            new ArmorItem(ModArmorMaterials.NICKEL, EquipmentType.CHESTPLATE, normalSettings("nickel_chestplate")));

    public static final Item NICKEL_LEGGINGS = registerItem("nickel_leggings",
            new ArmorItem(ModArmorMaterials.NICKEL, EquipmentType.LEGGINGS, normalSettings("nickel_leggings")));

    public static final Item NICKEL_BOOTS = registerItem("nickel_boots",
            new ArmorItem(ModArmorMaterials.NICKEL, EquipmentType.BOOTS, normalSettings("nickel_boots")));

    //ModArmorItems - Plomb Armor
    public static final Item PLOMB_HELMET = registerItem("plomb_helmet",
            new ArmorItem(ModArmorMaterials.PLOMB, EquipmentType.HELMET, normalSettings("plomb_helmet")));

    public static final Item PLOMB_CHESTPLATE = registerItem("plomb_chestplate",
            new ArmorItem(ModArmorMaterials.PLOMB, EquipmentType.CHESTPLATE, normalSettings("plomb_chestplate")));

    public static final Item PLOMB_LEGGINGS = registerItem("plomb_leggings",
            new ArmorItem(ModArmorMaterials.PLOMB, EquipmentType.LEGGINGS, normalSettings("plomb_leggings")));

    public static final Item PLOMB_BOOTS = registerItem("plomb_boots",
            new ArmorItem(ModArmorMaterials.PLOMB, EquipmentType.BOOTS, normalSettings("plomb_boots")));
    //ModArmorItems - Silver Armor
    public static final Item SILVER_HELMET = registerItem("silver_helmet",
            new ArmorItem(ModArmorMaterials.SILVER, EquipmentType.HELMET, normalSettings("silver_helmet")));

    public static final Item SILVER_CHESTPLATE = registerItem("silver_chestplate",
            new ArmorItem(ModArmorMaterials.SILVER, EquipmentType.CHESTPLATE, normalSettings("silver_chestplate")));

    public static final Item SILVER_LEGGINGS = registerItem("silver_leggings",
            new ArmorItem(ModArmorMaterials.SILVER, EquipmentType.LEGGINGS, normalSettings("silver_leggings")));

    public static final Item SILVER_BOOTS = registerItem("silver_boots",
            new ArmorItem(ModArmorMaterials.SILVER, EquipmentType.BOOTS, normalSettings("silver_boots")));

    //ModArmorItems - Titanium Armor
    public static final Item TITANIUM_HELMET = registerItem("titanium_helmet",
            new ArmorItem(ModArmorMaterials.TITANIUM, EquipmentType.HELMET, normalSettings("titanium_helmet")));

    public static final Item TITANIUM_CHESTPLATE = registerItem("titanium_chestplate",
            new ArmorItem(ModArmorMaterials.TITANIUM, EquipmentType.CHESTPLATE, normalSettings("titanium_chestplate")));

    public static final Item TITANIUM_LEGGINGS = registerItem("titanium_leggings",
            new ArmorItem(ModArmorMaterials.TITANIUM, EquipmentType.LEGGINGS, normalSettings("titanium_leggings")));

    public static final Item TITANIUM_BOOTS = registerItem("titanium_boots",
            new ArmorItem(ModArmorMaterials.TITANIUM, EquipmentType.BOOTS, normalSettings("titanium_boots")));

    //ModArmorItems - Zinc Armor
    public static final Item ZINC_HELMET = registerItem("zinc_helmet",
            new ArmorItem(ModArmorMaterials.ZINC, EquipmentType.HELMET, normalSettings("zinc_helmet")));

    public static final Item ZINC_CHESTPLATE = registerItem("zinc_chestplate",
            new ArmorItem(ModArmorMaterials.ZINC, EquipmentType.CHESTPLATE, normalSettings("zinc_chestplate")));

    public static final Item ZINC_LEGGINGS = registerItem("zinc_leggings",
            new ArmorItem(ModArmorMaterials.ZINC, EquipmentType.LEGGINGS, normalSettings("zinc_leggings")));

    public static final Item ZINC_BOOTS = registerItem("zinc_boots",
            new ArmorItem(ModArmorMaterials.ZINC, EquipmentType.BOOTS, normalSettings("zinc_boots")));



    //ModItemTools - Aluminium Tools
    public static final Item ALUMINIUM_PICKAXE = registerItem("aluminium_pickaxe",
            new FixPickaxeItem(new FixerSettings(AddToolMaterial.ALUMINIUM), 3.7f, 1.5f, normalSettings("aluminium_pickaxe")));

    public static final Item ALUMINIUM_SHOVEL = registerItem("aluminium_shovel",
            new FixShovelItem(new FixerSettings(AddToolMaterial.ALUMINIUM), 4f, 1.2f, normalSettings("aluminium_shovel")));

    public static final Item ALUMINIUM_AXE = registerItem("aluminium_axe",
            new FixAxeItem(new FixerSettings(AddToolMaterial.ALUMINIUM), 8.5f, 1f, normalSettings("aluminium_axe")));

    public static final Item ALUMINIUM_HOE = registerItem("aluminium_hoe",
            new FixHoeItem(new FixerSettings(AddToolMaterial.ALUMINIUM), 1f, 3.5f, normalSettings("aluminium_hoe")));

    public static final Item ALUMINIUM_SWORD = registerItem("aluminium_sword",
            new FixSwordItem(new FixerSettings(AddToolMaterial.ALUMINIUM), 5.6f, 1.8f, normalSettings("aluminium_sword")));

    //ModItemTools - Tin Tools
    public static final Item TIN_PICKAXE = registerItem("tin_pickaxe",
            new FixPickaxeItem(new FixerSettings(AddToolMaterial.TIN), 3.3f, 1.5f, normalSettings("tin_pickaxe")));

    public static final Item TIN_SHOVEL = registerItem("tin_shovel",
            new FixShovelItem(new FixerSettings(AddToolMaterial.TIN), 3.5f, 1.2f, normalSettings("tin_shovel")));

    public static final Item TIN_AXE = registerItem("tin_axe",
            new FixAxeItem(new FixerSettings(AddToolMaterial.TIN), 8f, 1f, normalSettings("tin_axe")));

    public static final Item TIN_HOE = registerItem("tin_hoe",
            new FixHoeItem(new FixerSettings(AddToolMaterial.TIN), 1f, 2.6f, normalSettings("tin_hoe")));

    public static final Item TIN_SWORD = registerItem("tin_sword",
            new FixSwordItem(new FixerSettings(AddToolMaterial.TIN), 5.2f, 1.6f, normalSettings("tin_sword")));

    //ModItemTools - Bronze Tools
    public static final Item BRONZE_PICKAXE = registerItem("bronze_pickaxe",
            new FixPickaxeItem(new FixerSettings(AddToolMaterial.BRONZE), 3.7f, 1.5f, normalSettings("bronze_pickaxe")));

    public static final Item BRONZE_SHOVEL = registerItem("bronze_shovel",
            new FixShovelItem(new FixerSettings(AddToolMaterial.BRONZE), 4f, 1f, normalSettings("bronze_shovel")));

    public static final Item BRONZE_AXE = registerItem("bronze_axe",
            new FixAxeItem(new FixerSettings(AddToolMaterial.BRONZE), 8.5f, 1f, normalSettings("bronze_axe")));

    public static final Item BRONZE_HOE = registerItem("bronze_hoe",
            new FixHoeItem(new FixerSettings(AddToolMaterial.BRONZE), 1f, 2.6f, normalSettings("bronze_hoe")));

    public static final Item BRONZE_SWORD = registerItem("bronze_sword",
            new FixSwordItem(new FixerSettings(AddToolMaterial.BRONZE), 5.6f, 1.6f, normalSettings("bronze_sword")));

    //ModItemTools - Steel Tools
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new FixPickaxeItem(new FixerSettings(AddToolMaterial.STEEL), 4.6f, 1.2f, normalSettings("steel_pickaxe")));

    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new FixShovelItem(new FixerSettings(AddToolMaterial.STEEL), 5f, 1f, normalSettings("steel_shovel")));

    public static final Item STEEL_AXE = registerItem("steel_axe",
            new FixAxeItem(new FixerSettings(AddToolMaterial.STEEL), 9.5f, 0.9f, normalSettings("steel_axe")));

    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new FixHoeItem(new FixerSettings(AddToolMaterial.STEEL), 1f, 2.6f, normalSettings("steel_hoe")));

    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new FixSwordItem(new FixerSettings(AddToolMaterial.STEEL), 6.5f, 1.6f, normalSettings("steel_sword")));

    //ModItemTools - Chrome Tools
    public static final Item CHROME_PICKAXE = registerItem("chrome_pickaxe",
            new FixPickaxeItem(new FixerSettings(AddToolMaterial.CHROME), 3.5f, 1.2f, normalSettings("chrome_pickaxe")));

    public static final Item CHROME_SHOVEL = registerItem("chrome_shovel",
            new FixShovelItem(new FixerSettings(AddToolMaterial.CHROME), 3.5f, 1.2f, normalSettings("chrome_shovel")));

    public static final Item CHROME_AXE = registerItem("chrome_axe",
            new FixAxeItem(new FixerSettings(AddToolMaterial.CHROME), 8f, 1f, normalSettings("chrome_axe")));

    public static final Item CHROME_HOE = registerItem("chrome_hoe",
            new FixHoeItem(new FixerSettings(AddToolMaterial.CHROME), 1f, 2.6f, normalSettings("chrome_hoe")));

    public static final Item CHROME_SWORD = registerItem("chrome_sword",
            new FixSwordItem(new FixerSettings(AddToolMaterial.CHROME), 5.2f, 1.6f, normalSettings("chrome_sword")));

    //ModItemTools - Nickel Tools
    public static final Item NICKEL_PICKAXE = registerItem("nickel_pickaxe",
            new FixPickaxeItem(new FixerSettings(AddToolMaterial.NICKEL), 4f, 1.2f, normalSettings("nickel_pickaxe")));

    public static final Item NICKEL_SHOVEL = registerItem("nickel_shovel",
            new FixShovelItem(new FixerSettings(AddToolMaterial.NICKEL), 4.5f, 1f, normalSettings("nickel_shovel")));

    public static final Item NICKEL_AXE = registerItem("nickel_axe",
            new FixAxeItem(new FixerSettings(AddToolMaterial.NICKEL), 9f, 0.9f, normalSettings("nickel_axe")));

    public static final Item NICKEL_HOE = registerItem("nickel_hoe",
            new FixHoeItem(new FixerSettings(AddToolMaterial.NICKEL), 1f, 2.6f, normalSettings("nickel_hoe")));

    public static final Item NICKEL_SWORD = registerItem("nickel_sword",
            new FixSwordItem(new FixerSettings(AddToolMaterial.NICKEL), 6f, 1.6f, normalSettings("nickel_sword")));

    //ModItemTools - Plomb Tools
    public static final Item PLOMB_PICKAXE = registerItem("plomb_pickaxe",
            new FixPickaxeItem(new FixerSettings(AddToolMaterial.PLOMB), 3.2f, 1.2f, normalSettings("plomb_pickaxe")));

    public static final Item PLOMB_SHOVEL = registerItem("plomb_shovel",
            new FixShovelItem(new FixerSettings(AddToolMaterial.PLOMB), 4.5f, 0.8f, normalSettings("plomb_shovel")));

    public static final Item PLOMB_AXE = registerItem("plomb_axe",
            new FixAxeItem(new FixerSettings(AddToolMaterial.PLOMB), 9f, 0.7f, normalSettings("plomb_axe")));

    public static final Item PLOMB_HOE = registerItem("plomb_hoe",
            new FixHoeItem(new FixerSettings(AddToolMaterial.PLOMB), 1f, 2.6f, normalSettings("plomb_hoe")));

    public static final Item PLOMB_SWORD = registerItem("plomb_sword",
            new FixSwordItem(new FixerSettings(AddToolMaterial.PLOMB), 6f, 1.2f, normalSettings("plomb_sword")));

    //ModItemTools - Silver Tools
    public static final Item SILVER_PICKAXE = registerItem("silver_pickaxe",
            new FixPickaxeItem(new FixerSettings(AddToolMaterial.SILVER), 3.5f, 1.2f, normalSettings("silver_pickaxe")));

    public static final Item SILVER_SHOVEL = registerItem("silver_shovel",
            new FixShovelItem(new FixerSettings(AddToolMaterial.SILVER), 1.2f, 1f, normalSettings("silver_shovel")));

    public static final Item SILVER_AXE = registerItem("silver_axe",
            new FixAxeItem(new FixerSettings(AddToolMaterial.SILVER), 3.5f, 1f, normalSettings("silver_axe")));

    public static final Item SILVER_HOE = registerItem("silver_hoe",
            new FixHoeItem(new FixerSettings(AddToolMaterial.SILVER), 1f, 2.6f, normalSettings("silver_hoe")));

    public static final Item SILVER_SWORD = registerItem("silver_sword",
            new FixSwordItem(new FixerSettings(AddToolMaterial.SILVER), 5f, 1.6f, normalSettings("silver_sword")));

    //ModItemTools - Titanium Tools
    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe",
            new FixPickaxeItem(new FixerSettings(AddToolMaterial.TITANIUM), 4f, 1.2f, normalSettings("titanium_pickaxe")));

    public static final Item TITANIUM_SHOVEL = registerItem("titanium_shovel",
            new FixShovelItem(new FixerSettings(AddToolMaterial.TITANIUM), 4.2f, 1.1f, normalSettings("titanium_shovel")));

    public static final Item TITANIUM_AXE = registerItem("titanium_axe",
            new FixAxeItem(new FixerSettings(AddToolMaterial.TITANIUM), 9.2f, 0.9f, normalSettings("titanium_axe")));

    public static final Item TITANIUM_HOE = registerItem("titanium_hoe",
            new FixHoeItem(new FixerSettings(AddToolMaterial.TITANIUM), 1f, 2.6f, normalSettings("titanium_hoe")));

    public static final Item TITANIUM_SWORD = registerItem("titanium_sword",
            new FixSwordItem(new FixerSettings(AddToolMaterial.TITANIUM), 6f, 1.6f, normalSettings("titanium_sword")));

    //ModItemTools - Zinc Tools
    public static final Item ZINC_PICKAXE = registerItem("zinc_pickaxe",
            new FixPickaxeItem(new FixerSettings(AddToolMaterial.ZINC), 3.5f, 1.2f, normalSettings("zinc_pickaxe")));

    public static final Item ZINC_SHOVEL = registerItem("zinc_shovel",
            new FixShovelItem(new FixerSettings(AddToolMaterial.ZINC), 3.5f, 1.1f, normalSettings("zinc_shovel")));

    public static final Item ZINC_AXE = registerItem("zinc_axe",
            new FixAxeItem(new FixerSettings(AddToolMaterial.ZINC), 7f, 1f, normalSettings("zinc_axe")));

    public static final Item ZINC_HOE = registerItem("zinc_hoe",
            new FixHoeItem(new FixerSettings(AddToolMaterial.ZINC), 1f, 2.6f, normalSettings("zinc_hoe")));

    public static final Item ZINC_SWORD = registerItem("zinc_sword",
            new FixSwordItem(new FixerSettings(AddToolMaterial.ZINC), 5f, 1.6f, normalSettings("zinc_sword")));

    //autre minerais
    public static final Item LITHIUM_INGOT = registerItem("lithium_ingot", new Item(normalSettings("lithium_ingot")));
    public static final Item LITHIUM_RAW = registerItem("lithium_raw", new Item(normalSettings("lithium_raw")));

    public static final Item ARSENIC = registerItem("arsenic", new Item(normalSettings("arsenic")));

    public static final Item SODIUM_INGOT = registerItem("sodium_ingot", new Item(normalSettings("sodium_ingot")));
    public static final Item SALT = registerItem("salt", new Item(normalSettings("salt")));

    //Volcanite
    public static final Item VOLCANITE_INGOT = registerItem("volcanite_ingot", new Item(normalSettings("volcanite_ingot").fireproof()));
    public static final Item VOLCANITE_RAW = registerItem("volcanite_raw", new Item(normalSettings("volcanite_raw").fireproof()));

    public static final Item VOLCANITE_HELMET = registerItem("volcanite_helmet", new ArmorItem(ModArmorMaterials.VOLCANITE, EquipmentType.HELMET, normalSettings("volcanite_helmet").fireproof()));
    public static final Item VOLCANITE_CHESTPLATE = registerItem("volcanite_chestplate", new ArmorItem(ModArmorMaterials.VOLCANITE, EquipmentType.CHESTPLATE, normalSettings("volcanite_chestplate").fireproof()));
    public static final Item VOLCANITE_LEGGINGS = registerItem("volcanite_leggings", new ArmorItem(ModArmorMaterials.VOLCANITE, EquipmentType.LEGGINGS, normalSettings("volcanite_leggings").fireproof()));
    public static final Item VOLCANITE_BOOTS = registerItem("volcanite_boots", new ArmorItem(ModArmorMaterials.VOLCANITE, EquipmentType.BOOTS, normalSettings("volcanite_boots").fireproof()));

    public static final Item VOLCANITE_PICKAXE = registerItem("volcanite_pickaxe", new FixPickaxeItem(new FixerSettings(AddToolMaterial.VOLCANITE), 4.2f, 1.2f, normalSettings("volcanite_pickaxe").fireproof()));
    public static final Item VOLCANITE_SHOVEL = registerItem("volcanite_shovel", new FixShovelItem(new FixerSettings(AddToolMaterial.VOLCANITE), 4.7f, 1f, normalSettings("volcanite_shovel").fireproof()));
    public static final Item VOLCANITE_AXE = registerItem("volcanite_axe", new FixAxeItem(new FixerSettings(AddToolMaterial.VOLCANITE), 10f, 0.9f, normalSettings("volcanite_axe").fireproof()));
    public static final Item VOLCANITE_HOE = registerItem("volcanite_hoe", new FixHoeItem(new FixerSettings(AddToolMaterial.VOLCANITE), 1f, 3.5f, normalSettings("volcanite_hoe").fireproof()));
    public static final Item VOLCANITE_SWORD = registerItem("volcanite_sword", new FixSwordItem(new FixerSettings(AddToolMaterial.VOLCANITE), 6.5f, 1.6f, normalSettings("volcanite_sword").fireproof()));

    //Soulrite
    public static final Item SOULRITE_INGOT = registerItem("soulrite_ingot", new Item(normalSettings("soulrite_ingot").fireproof()));
    public static final Item SOULRITE_RAW = registerItem("soulrite_raw", new Item(normalSettings("soulrite_raw").fireproof()));

    public static final Item SOULRITE_HELMET = registerItem("soulrite_helmet", new ArmorItem(ModArmorMaterials.SOULRITE, EquipmentType.HELMET, normalSettings("soulrite_helmet").fireproof()));
    public static final Item SOULRITE_CHESTPLATE = registerItem("soulrite_chestplate", new ArmorItem(ModArmorMaterials.SOULRITE, EquipmentType.CHESTPLATE, normalSettings("soulrite_chestplate").fireproof()));
    public static final Item SOULRITE_LEGGINGS = registerItem("soulrite_leggings", new ArmorItem(ModArmorMaterials.SOULRITE, EquipmentType.LEGGINGS, normalSettings("soulrite_leggings").fireproof()));
    public static final Item SOULRITE_BOOTS = registerItem("soulrite_boots", new ArmorItem(ModArmorMaterials.SOULRITE, EquipmentType.BOOTS, normalSettings("soulrite_boots").fireproof()));

    public static final Item SOULRITE_PICKAXE = registerItem("soulrite_pickaxe", new FixPickaxeItem(new FixerSettings(AddToolMaterial.SOULRITE), 4.4f, 1.2f, normalSettings("soulrite_pickaxe").fireproof()));
    public static final Item SOULRITE_SHOVEL = registerItem("soulrite_shovel", new FixShovelItem(new FixerSettings(AddToolMaterial.SOULRITE), 5.2f, 1f, normalSettings("soulrite_shovel").fireproof()));
    public static final Item SOULRITE_AXE = registerItem("soulrite_axe", new FixAxeItem(new FixerSettings(AddToolMaterial.SOULRITE), 9f, 1f, normalSettings("soulrite_axe").fireproof()));
    public static final Item SOULRITE_HOE = registerItem("soulrite_hoe", new FixHoeItem(new FixerSettings(AddToolMaterial.SOULRITE), 1f, 0f, normalSettings("soulrite_hoe").fireproof()));
    public static final Item SOULRITE_SWORD = registerItem("soulrite_sword", new FixSwordItem(new FixerSettings(AddToolMaterial.SOULRITE), 7f, 1.6f, normalSettings("soulrite_sword").fireproof()));

    //Racknite
    public static final Item RACKNITE_INGOT = registerItem("racknite_ingot", new Item(normalSettings("racknite_ingot").fireproof()));
    public static final Item RACKNITE_RAW = registerItem("racknite_raw", new Item(normalSettings("racknite_raw").fireproof()));

    public static final Item RACKNITE_HELMET = registerItem("racknite_helmet", new ArmorItem(ModArmorMaterials.RACKNITE, EquipmentType.HELMET, normalSettings("racknite_helmet").fireproof()));
    public static final Item RACKNITE_CHESTPLATE = registerItem("racknite_chestplate", new ArmorItem(ModArmorMaterials.RACKNITE, EquipmentType.CHESTPLATE, normalSettings("racknite_chestplate").fireproof()));
    public static final Item RACKNITE_LEGGINGS = registerItem("racknite_leggings", new ArmorItem(ModArmorMaterials.RACKNITE, EquipmentType.LEGGINGS, normalSettings("racknite_leggings").fireproof()));
    public static final Item RACKNITE_BOOTS = registerItem("racknite_boots", new ArmorItem(ModArmorMaterials.RACKNITE, EquipmentType.BOOTS, normalSettings("racknite_boots").fireproof()));

    public static final Item RACKNITE_PICKAXE = registerItem("racknite_pickaxe", new FixPickaxeItem(new FixerSettings(AddToolMaterial.RACKNITE), 4f, 1.2f, normalSettings("racknite_pickaxe").fireproof()));
    public static final Item RACKNITE_SHOVEL = registerItem("racknite_shovel", new FixShovelItem(new FixerSettings(AddToolMaterial.RACKNITE), 5f, 1f, normalSettings("racknite_shovel").fireproof()));
    public static final Item RACKNITE_AXE = registerItem("racknite_axe", new FixAxeItem(new FixerSettings(AddToolMaterial.RACKNITE), 9f, 0.9f, normalSettings("racknite_axe").fireproof()));
    public static final Item RACKNITE_HOE = registerItem("racknite_hoe", new FixHoeItem(new FixerSettings(AddToolMaterial.RACKNITE), 1f, 3f, normalSettings("racknite_hoe").fireproof()));
    public static final Item RACKNITE_SWORD = registerItem("racknite_sword", new FixSwordItem(new FixerSettings(AddToolMaterial.RACKNITE), 6f, 1.6f, normalSettings("racknite_sword").fireproof()));

    //Enderite
    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot", new Item(normalSettings("enderite_ingot").fireproof()));
    public static final Item ENDERITE_RAW = registerItem("enderite_raw", new Item(normalSettings("enderite_raw").fireproof()));

    public static final Item ENDERITE_HELMET = registerItem("enderite_helmet", new ArmorItem(ModArmorMaterials.ENDERITE, EquipmentType.HELMET, normalSettings("enderite_helmet").fireproof()));
    public static final Item ENDERITE_CHESTPLATE = registerItem("enderite_chestplate", new ArmorItem(ModArmorMaterials.ENDERITE, EquipmentType.CHESTPLATE, normalSettings("enderite_chestplate").fireproof()));
    public static final Item ENDERITE_LEGGINGS = registerItem("enderite_leggings", new ArmorItem(ModArmorMaterials.ENDERITE, EquipmentType.LEGGINGS, normalSettings("enderite_leggings").fireproof()));
    public static final Item ENDERITE_BOOTS = registerItem("enderite_boots", new ArmorItem(ModArmorMaterials.ENDERITE, EquipmentType.BOOTS, normalSettings("enderite_boots").fireproof()));

    public static final Item ENDERITE_PICKAXE = registerItem("enderite_pickaxe", new FixPickaxeItem(new FixerSettings(AddToolMaterial.ENDERITE), 5.5f, 1.2f, normalSettings("enderite_pickaxe").fireproof()));
    public static final Item ENDERITE_SHOVEL = registerItem("enderite_shovel", new FixShovelItem(new FixerSettings(AddToolMaterial.ENDERITE), 6f, 1f, normalSettings("enderite_shovel").fireproof()));
    public static final Item ENDERITE_AXE = registerItem("enderite_axe", new FixAxeItem(new FixerSettings(AddToolMaterial.ENDERITE), 10f, 1f, normalSettings("enderite_axe").fireproof()));
    public static final Item ENDERITE_HOE = registerItem("enderite_hoe", new FixHoeItem(new FixerSettings(AddToolMaterial.ENDERITE), 1f, 5f, normalSettings("enderite_hoe").fireproof()));
    public static final Item ENDERITE_SWORD = registerItem("enderite_sword", new FixSwordItem(new FixerSettings(AddToolMaterial.ENDERITE), 7.6f, 1.6f , normalSettings("enderite_sword").fireproof()));


    
    
    public static Item.Settings normalSettings(String idKey) {
        return new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, MoreOres.id(idKey)));
    }


     public static void registerItems() {
         
    }
    
    private static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, MoreOres.id(id), item);
    }


}
