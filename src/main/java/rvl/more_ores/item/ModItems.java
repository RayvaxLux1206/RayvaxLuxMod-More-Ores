package rvl.more_ores.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import rvl.more_ores.MoreOres;
import rvl.more_ores.item.special_item.*;
import rvl.more_ores.item.tool_fixer.*;
import rvl.more_ores.item.trim.AddTrimMaterials;

public class ModItems {

//Items register - Minerals
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", new Item(normalSettings("aluminium_ingot").trimMaterial(AddTrimMaterials.TRIM_ALUMINIUM)));
    public static final Item ALUMINIUM_NUGGET = registerItem("aluminium_nugget", new Item(normalSettings("aluminium_nugget")));
    public static final Item ALUMINIUM_RAW = registerItem("aluminium_raw", new Item(normalSettings("aluminium_raw")));

    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(normalSettings("tin_ingot").trimMaterial(AddTrimMaterials.TRIM_TIN)));
    public static final Item TIN_NUGGET = registerItem("tin_nugget", new Item(normalSettings("tin_nugget")));
    public static final Item TIN_RAW = registerItem("tin_raw", new Item(normalSettings("tin_raw")));

    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(normalSettings("bronze_ingot").trimMaterial(AddTrimMaterials.TRIM_BRONZE)));
    public static final Item BRONZE_NUGGET = registerItem("bronze_nugget", new Item(normalSettings("bronze_nugget")));
    public static final Item BRONZE_ALLOY = registerItem("bronze_alloy", new Item(normalSettings("bronze_alloy")));

    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(normalSettings("steel_ingot").trimMaterial(AddTrimMaterials.TRIM_STEEL)));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(normalSettings("steel_nugget")));
    public static final Item STEEL_ALLOY = registerItem("steel_alloy", new Item(normalSettings("steel_alloy")));

    public static final Item CHROME_INGOT = registerItem("chrome_ingot", new Item(normalSettings("chrome_ingot").trimMaterial(AddTrimMaterials.TRIM_CHROME)));
    public static final Item CHROME_NUGGET = registerItem("chrome_nugget", new Item(normalSettings("chrome_nugget")));
    public static final Item CHROME_RAW = registerItem("chrome_raw", new Item(normalSettings("chrome_raw")));

    public static final Item NICKEL_INGOT = registerItem("nickel_ingot", new Item(normalSettings("nickel_ingot").trimMaterial(AddTrimMaterials.TRIM_NICKEL)));
    public static final Item NICKEL_NUGGET = registerItem("nickel_nugget", new Item(normalSettings("nickel_nugget")));
    public static final Item NICKEL_RAW = registerItem("nickel_raw", new Item(normalSettings("nickel_raw")));

    public static final Item PLOMB_INGOT = registerItem("plomb_ingot", new ToxicItem(normalSettings("plomb_ingot").trimMaterial(AddTrimMaterials.TRIM_PLOMB), MobEffects.WITHER, 10));
    public static final Item PLOMB_NUGGET = registerItem("plomb_nugget", new ToxicItem(normalSettings("plomb_nugget"), MobEffects.WITHER, 10));
    public static final Item PLOMB_RAW = registerItem("plomb_raw", new ToxicItem(normalSettings("plomb_raw"), MobEffects.WITHER, 10));

    public static final Item SILICON_INGOT = registerItem("silicon_ingot", new Item(normalSettings("silicon_ingot").trimMaterial(AddTrimMaterials.TRIM_SILICON)));
    public static final Item SILICON_NUGGET = registerItem("silicon_nugget", new Item(normalSettings("silicon_nugget")));
    public static final Item SILICON_RAW = registerItem("silicon_raw", new Item(normalSettings("silicon_raw")));

    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(normalSettings("silver_ingot").trimMaterial(AddTrimMaterials.TRIM_SILVER)));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget", new Item(normalSettings("silver_nugget")));
    public static final Item SILVER_RAW = registerItem("silver_raw", new Item(normalSettings("silver_raw")));

    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(normalSettings("titanium_ingot").trimMaterial(AddTrimMaterials.TRIM_TITANIUM)));
    public static final Item TITANIUM_NUGGET = registerItem("titanium_nugget", new Item(normalSettings("titanium_nugget")));
    public static final Item TITANIUM_RAW = registerItem("titanium_raw", new Item(normalSettings("titanium_raw")));

    public static final Item ZINC_INGOT = registerItem("zinc_ingot", new Item(normalSettings("zinc_ingot").trimMaterial(AddTrimMaterials.TRIM_ZINC)));
    public static final Item ZINC_NUGGET = registerItem("zinc_nugget", new Item(normalSettings("zinc_nugget")));
    public static final Item ZINC_RAW = registerItem("zinc_raw", new Item(normalSettings("zinc_raw")));


    //ModItems - Aluminium Armor
    public static final Item ALUMINIUM_HELMET = registerItem("aluminium_helmet",
            new Item(humainArmorSettings(ModArmorMaterials.ALUMINIUM, ArmorType.HELMET, "aluminium_helmet")));

    public static final Item ALUMINIUM_CHESTPLATE = registerItem("aluminium_chestplate",
            new Item(humainArmorSettings(ModArmorMaterials.ALUMINIUM, ArmorType.CHESTPLATE, "aluminium_chestplate")));

    public static final Item ALUMINIUM_LEGGINGS = registerItem("aluminium_leggings",
            new Item(humainArmorSettings(ModArmorMaterials.ALUMINIUM, ArmorType.LEGGINGS, "aluminium_leggings")));

    public static final Item ALUMINIUM_BOOTS = registerItem("aluminium_boots",
            new Item(humainArmorSettings(ModArmorMaterials.ALUMINIUM, ArmorType.BOOTS, "aluminium_boots")));

    //ModItems - Tin Armor
    public static final Item TIN_HELMET = registerItem("tin_helmet",
            new Item(humainArmorSettings(ModArmorMaterials.TIN, ArmorType.HELMET, "tin_helmet")));

    public static final Item TIN_CHESTPLATE = registerItem("tin_chestplate",
            new Item(humainArmorSettings(ModArmorMaterials.TIN, ArmorType.CHESTPLATE, "tin_chestplate")));

    public static final Item TIN_LEGGINGS = registerItem("tin_leggings",
            new Item(humainArmorSettings(ModArmorMaterials.TIN, ArmorType.LEGGINGS, "tin_leggings")));

    public static final Item TIN_BOOTS = registerItem("tin_boots",
            new Item(humainArmorSettings(ModArmorMaterials.TIN, ArmorType.BOOTS, "tin_boots")));

    //ModItems - Bronze Armor
    public static final Item BRONZE_HELMET = registerItem("bronze_helmet",
            new Item(humainArmorSettings(ModArmorMaterials.BRONZE, ArmorType.HELMET, "bronze_helmet")));

    public static final Item BRONZE_CHESTPLATE = registerItem("bronze_chestplate",
            new Item(humainArmorSettings(ModArmorMaterials.BRONZE, ArmorType.CHESTPLATE, "bronze_chestplate")));

    public static final Item BRONZE_LEGGINGS = registerItem("bronze_leggings",
            new Item(humainArmorSettings(ModArmorMaterials.BRONZE, ArmorType.LEGGINGS, "bronze_leggings")));

    public static final Item BRONZE_BOOTS = registerItem("bronze_boots",
            new Item(humainArmorSettings(ModArmorMaterials.BRONZE, ArmorType.BOOTS, "bronze_boots")));


    //ModItems - Steel Armor
    public static final Item STEEL_HELMET = registerItem("steel_helmet",
            new Item(humainArmorSettings(ModArmorMaterials.STEEL, ArmorType.HELMET, "steel_helmet")));

    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate",
            new Item(humainArmorSettings(ModArmorMaterials.STEEL, ArmorType.CHESTPLATE, "steel_chestplate")));

    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings",
            new Item(humainArmorSettings(ModArmorMaterials.STEEL, ArmorType.LEGGINGS, "steel_leggings")));

    public static final Item STEEL_BOOTS = registerItem("steel_boots",
            new Item(humainArmorSettings(ModArmorMaterials.STEEL, ArmorType.BOOTS, "steel_boots")));

    //ModItems - Chrome Armor
    public static final Item CHROME_HELMET = registerItem("chrome_helmet",
            new Item(humainArmorSettings(ModArmorMaterials.CHROME, ArmorType.HELMET, "chrome_helmet")));

    public static final Item CHROME_CHESTPLATE = registerItem("chrome_chestplate",
            new Item(humainArmorSettings(ModArmorMaterials.CHROME, ArmorType.CHESTPLATE, "chrome_chestplate")));

    public static final Item CHROME_LEGGINGS = registerItem("chrome_leggings",
            new Item(humainArmorSettings(ModArmorMaterials.CHROME, ArmorType.LEGGINGS, "chrome_leggings")));

    public static final Item CHROME_BOOTS = registerItem("chrome_boots",
            new Item(humainArmorSettings(ModArmorMaterials.CHROME, ArmorType.BOOTS, "chrome_boots")));

    //ModItems - Nickel Armor
    public static final Item NICKEL_HELMET = registerItem("nickel_helmet",
            new Item(humainArmorSettings(ModArmorMaterials.NICKEL, ArmorType.HELMET, "nickel_helmet")));

    public static final Item NICKEL_CHESTPLATE = registerItem("nickel_chestplate",
            new Item(humainArmorSettings(ModArmorMaterials.NICKEL, ArmorType.CHESTPLATE, "nickel_chestplate")));

    public static final Item NICKEL_LEGGINGS = registerItem("nickel_leggings",
            new Item(humainArmorSettings(ModArmorMaterials.NICKEL, ArmorType.LEGGINGS, "nickel_leggings")));

    public static final Item NICKEL_BOOTS = registerItem("nickel_boots",
            new Item(humainArmorSettings(ModArmorMaterials.NICKEL, ArmorType.BOOTS, "nickel_boots")));

    //ModItems - Plomb Armor
    public static final Item PLOMB_HELMET = registerItem("plomb_helmet",
            new ToxicItem(humainArmorSettings(ModArmorMaterials.PLOMB, ArmorType.HELMET, "plomb_helmet"), MobEffects.WITHER, 10));

    public static final Item PLOMB_CHESTPLATE = registerItem("plomb_chestplate",
            new ToxicItem(humainArmorSettings(ModArmorMaterials.PLOMB, ArmorType.CHESTPLATE, "plomb_chestplate"), MobEffects.WITHER, 10));

    public static final Item PLOMB_LEGGINGS = registerItem("plomb_leggings",
            new ToxicItem(humainArmorSettings(ModArmorMaterials.PLOMB, ArmorType.LEGGINGS, "plomb_leggings"), MobEffects.WITHER, 10));

    public static final Item PLOMB_BOOTS = registerItem("plomb_boots",
            new ToxicItem(humainArmorSettings(ModArmorMaterials.PLOMB, ArmorType.BOOTS, "plomb_boots"), MobEffects.WITHER, 10));

    //ModItems - Silver Armor
    public static final Item SILVER_HELMET = registerItem("silver_helmet",
            new Item(humainArmorSettings(ModArmorMaterials.SILVER, ArmorType.HELMET, "silver_helmet")));

    public static final Item SILVER_CHESTPLATE = registerItem("silver_chestplate",
            new Item(humainArmorSettings(ModArmorMaterials.SILVER, ArmorType.CHESTPLATE, "silver_chestplate")));

    public static final Item SILVER_LEGGINGS = registerItem("silver_leggings",
            new Item(humainArmorSettings(ModArmorMaterials.SILVER, ArmorType.LEGGINGS, "silver_leggings")));

    public static final Item SILVER_BOOTS = registerItem("silver_boots",
            new Item(humainArmorSettings(ModArmorMaterials.SILVER, ArmorType.BOOTS, "silver_boots")));

    //ModItems - Titanium Armor
    public static final Item TITANIUM_HELMET = registerItem("titanium_helmet",
            new Item(humainArmorSettings(ModArmorMaterials.TITANIUM, ArmorType.HELMET, "titanium_helmet")));

    public static final Item TITANIUM_CHESTPLATE = registerItem("titanium_chestplate",
            new Item(humainArmorSettings(ModArmorMaterials.TITANIUM, ArmorType.CHESTPLATE, "titanium_chestplate")));

    public static final Item TITANIUM_LEGGINGS = registerItem("titanium_leggings",
            new Item(humainArmorSettings(ModArmorMaterials.TITANIUM, ArmorType.LEGGINGS, "titanium_leggings")));

    public static final Item TITANIUM_BOOTS = registerItem("titanium_boots",
            new Item(humainArmorSettings(ModArmorMaterials.TITANIUM, ArmorType.BOOTS, "titanium_boots")));

    //ModItems - Zinc Armor
    public static final Item ZINC_HELMET = registerItem("zinc_helmet",
            new Item(humainArmorSettings(ModArmorMaterials.ZINC, ArmorType.HELMET, "zinc_helmet")));

    public static final Item ZINC_CHESTPLATE = registerItem("zinc_chestplate",
            new Item(humainArmorSettings(ModArmorMaterials.ZINC, ArmorType.CHESTPLATE, "zinc_chestplate")));

    public static final Item ZINC_LEGGINGS = registerItem("zinc_leggings",
            new Item(humainArmorSettings(ModArmorMaterials.ZINC, ArmorType.LEGGINGS, "zinc_leggings")));

    public static final Item ZINC_BOOTS = registerItem("zinc_boots",
            new Item(humainArmorSettings(ModArmorMaterials.ZINC, ArmorType.BOOTS, "zinc_boots")));



    //ModItemTools - Aluminium Tools
    public static final Item ALUMINIUM_PICKAXE = registerItem("aluminium_pickaxe",
            new SimplifyItem(new FixerSettings(AddToolMaterial.ALUMINIUM).pickaxe(3.7f, 1.5f, normalSettings("aluminium_pickaxe"))));

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
            new ToxicPickaxeItem(new FixerSettings(AddToolMaterial.PLOMB), 3.2f, 1.2f, normalSettings("plomb_pickaxe"), MobEffects.WITHER));

    public static final Item PLOMB_SHOVEL = registerItem("plomb_shovel",
            new ToxicShovelItem(new FixerSettings(AddToolMaterial.PLOMB), 4.5f, 0.8f, normalSettings("plomb_shovel"), MobEffects.WITHER));

    public static final Item PLOMB_AXE = registerItem("plomb_axe",
            new ToxicAxeItem(new FixerSettings(AddToolMaterial.PLOMB), 9f, 0.7f, normalSettings("plomb_axe"), MobEffects.WITHER));

    public static final Item PLOMB_HOE = registerItem("plomb_hoe",
            new ToxicHoeItem(new FixerSettings(AddToolMaterial.PLOMB), 1f, 2.6f, normalSettings("plomb_hoe"), MobEffects.WITHER));

    public static final Item PLOMB_SWORD = registerItem("plomb_sword",
            new ToxicSwordItem(new FixerSettings(AddToolMaterial.PLOMB), 6f, 1.2f, normalSettings("plomb_sword"), MobEffects.WITHER));

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
    public static final Item LITHIUM_INGOT = registerItem("lithium_ingot", new SimplifyItem(normalSettings("lithium_ingot").trimMaterial(AddTrimMaterials.TRIM_LITHIUM)).isAlcaline());
    public static final Item LITHIUM_NUGGET = registerItem("lithium_nugget", new SimplifyItem(normalSettings("lithium_nugget")).isAlcaline());
    public static final Item LITHIUM_RAW = registerItem("lithium_raw", new Item(normalSettings("lithium_raw")));

    public static final Item ARSENIC = registerItem("arsenic", new ToxicItem(normalSettings("arsenic").trimMaterial(AddTrimMaterials.TRIM_ARSENIC), MobEffects.POISON, 10));

    public static final Item SODIUM_INGOT = registerItem("sodium_ingot", new SimplifyItem(normalSettings("sodium_ingot").trimMaterial(AddTrimMaterials.TRIM_SODIUM)).isAlcaline());
    public static final Item SODIUM_NUGGET = registerItem("sodium_nugget", new SimplifyItem(normalSettings("sodium_nugget")).isAlcaline());
    public static final Item SALT = registerItem("salt", new Item(normalSettings("salt")));

    //Volcanite
    public static final Item VOLCANITE_INGOT = registerItem("volcanite_ingot", new Item(normalSettings("volcanite_ingot").fireResistant().trimMaterial(AddTrimMaterials.TRIM_VOLCANITE)));
    public static final Item VOLCANITE_NUGGET = registerItem("volcanite_nugget", new Item(normalSettings("volcanite_nugget").fireResistant()));
    public static final Item VOLCANITE_RAW = registerItem("volcanite_raw", new Item(normalSettings("volcanite_raw").fireResistant()));

    public static final Item VOLCANITE_HELMET = registerItem("volcanite_helmet", new Item(humainArmorSettings(ModArmorMaterials.VOLCANITE, ArmorType.HELMET, "volcanite_helmet").fireResistant()));
    public static final Item VOLCANITE_CHESTPLATE = registerItem("volcanite_chestplate", new Item(humainArmorSettings(ModArmorMaterials.VOLCANITE, ArmorType.CHESTPLATE, "volcanite_chestplate").fireResistant()));
    public static final Item VOLCANITE_LEGGINGS = registerItem("volcanite_leggings", new Item(humainArmorSettings(ModArmorMaterials.VOLCANITE, ArmorType.LEGGINGS, "volcanite_leggings").fireResistant()));
    public static final Item VOLCANITE_BOOTS = registerItem("volcanite_boots", new Item(humainArmorSettings(ModArmorMaterials.VOLCANITE, ArmorType.BOOTS, "volcanite_boots").fireResistant()));

    public static final Item VOLCANITE_PICKAXE = registerItem("volcanite_pickaxe", new FixPickaxeItem(new FixerSettings(AddToolMaterial.VOLCANITE), 4.2f, 1.2f, normalSettings("volcanite_pickaxe").fireResistant()));
    public static final Item VOLCANITE_SHOVEL = registerItem("volcanite_shovel", new FixShovelItem(new FixerSettings(AddToolMaterial.VOLCANITE), 4.7f, 1f, normalSettings("volcanite_shovel").fireResistant()));
    public static final Item VOLCANITE_AXE = registerItem("volcanite_axe", new FixAxeItem(new FixerSettings(AddToolMaterial.VOLCANITE), 10f, 0.9f, normalSettings("volcanite_axe").fireResistant()));
    public static final Item VOLCANITE_HOE = registerItem("volcanite_hoe", new FixHoeItem(new FixerSettings(AddToolMaterial.VOLCANITE), 1f, 3.5f, normalSettings("volcanite_hoe").fireResistant()));
    public static final Item VOLCANITE_SWORD = registerItem("volcanite_sword", new FixSwordItem(new FixerSettings(AddToolMaterial.VOLCANITE), 6.5f, 1.6f, normalSettings("volcanite_sword").fireResistant()));

    //Soulrite
    public static final Item SOULRITE_INGOT = registerItem("soulrite_ingot", new Item(normalSettings("soulrite_ingot").fireResistant().trimMaterial(AddTrimMaterials.TRIM_SOULRITE)));
    public static final Item SOULRITE_NUGGET = registerItem("soulrite_nugget", new Item(normalSettings("soulrite_nugget").fireResistant()));
    public static final Item SOULRITE_RAW = registerItem("soulrite_raw", new Item(normalSettings("soulrite_raw").fireResistant()));

    public static final Item SOULRITE_HELMET = registerItem("soulrite_helmet", new Item(humainArmorSettings(ModArmorMaterials.SOULRITE, ArmorType.HELMET, "soulrite_helmet").fireResistant()));
    public static final Item SOULRITE_CHESTPLATE = registerItem("soulrite_chestplate", new Item(humainArmorSettings(ModArmorMaterials.SOULRITE, ArmorType.CHESTPLATE, "soulrite_chestplate").fireResistant()));
    public static final Item SOULRITE_LEGGINGS = registerItem("soulrite_leggings", new Item(humainArmorSettings(ModArmorMaterials.SOULRITE, ArmorType.LEGGINGS, "soulrite_leggings").fireResistant()));
    public static final Item SOULRITE_BOOTS = registerItem("soulrite_boots", new Item(humainArmorSettings(ModArmorMaterials.SOULRITE, ArmorType.BOOTS, "soulrite_boots").fireResistant()));

    public static final Item SOULRITE_PICKAXE = registerItem("soulrite_pickaxe", new FixPickaxeItem(new FixerSettings(AddToolMaterial.SOULRITE), 4.4f, 1.2f, normalSettings("soulrite_pickaxe").fireResistant()));
    public static final Item SOULRITE_SHOVEL = registerItem("soulrite_shovel", new FixShovelItem(new FixerSettings(AddToolMaterial.SOULRITE), 5.2f, 1f, normalSettings("soulrite_shovel").fireResistant()));
    public static final Item SOULRITE_AXE = registerItem("soulrite_axe", new FixAxeItem(new FixerSettings(AddToolMaterial.SOULRITE), 9f, 1f, normalSettings("soulrite_axe").fireResistant()));
    public static final Item SOULRITE_HOE = registerItem("soulrite_hoe", new FixHoeItem(new FixerSettings(AddToolMaterial.SOULRITE), 1f, 0f, normalSettings("soulrite_hoe").fireResistant()));
    public static final Item SOULRITE_SWORD = registerItem("soulrite_sword", new FixSwordItem(new FixerSettings(AddToolMaterial.SOULRITE), 7f, 1.6f, normalSettings("soulrite_sword").fireResistant()));

    //Racknite
    public static final Item RACKNITE_INGOT = registerItem("racknite_ingot", new Item(normalSettings("racknite_ingot").fireResistant().trimMaterial(AddTrimMaterials.TRIM_RACKNITE)));
    public static final Item RACKNITE_NUGGET = registerItem("racknite_nugget", new Item(normalSettings("racknite_nugget").fireResistant()));
    public static final Item RACKNITE_RAW = registerItem("racknite_raw", new Item(normalSettings("racknite_raw").fireResistant()));

    public static final Item RACKNITE_HELMET = registerItem("racknite_helmet", new Item(humainArmorSettings(ModArmorMaterials.RACKNITE, ArmorType.HELMET, "racknite_helmet").fireResistant()));
    public static final Item RACKNITE_CHESTPLATE = registerItem("racknite_chestplate", new Item(humainArmorSettings(ModArmorMaterials.RACKNITE, ArmorType.CHESTPLATE, "racknite_chestplate").fireResistant()));
    public static final Item RACKNITE_LEGGINGS = registerItem("racknite_leggings", new Item(humainArmorSettings(ModArmorMaterials.RACKNITE, ArmorType.LEGGINGS, "racknite_leggings").fireResistant()));
    public static final Item RACKNITE_BOOTS = registerItem("racknite_boots", new Item(humainArmorSettings(ModArmorMaterials.RACKNITE, ArmorType.BOOTS, "racknite_boots").fireResistant()));

    public static final Item RACKNITE_PICKAXE = registerItem("racknite_pickaxe", new FixPickaxeItem(new FixerSettings(AddToolMaterial.RACKNITE), 4f, 1.2f, normalSettings("racknite_pickaxe").fireResistant()));
    public static final Item RACKNITE_SHOVEL = registerItem("racknite_shovel", new FixShovelItem(new FixerSettings(AddToolMaterial.RACKNITE), 5f, 1f, normalSettings("racknite_shovel").fireResistant()));
    public static final Item RACKNITE_AXE = registerItem("racknite_axe", new FixAxeItem(new FixerSettings(AddToolMaterial.RACKNITE), 9f, 0.9f, normalSettings("racknite_axe").fireResistant()));
    public static final Item RACKNITE_HOE = registerItem("racknite_hoe", new FixHoeItem(new FixerSettings(AddToolMaterial.RACKNITE), 1f, 3f, normalSettings("racknite_hoe").fireResistant()));
    public static final Item RACKNITE_SWORD = registerItem("racknite_sword", new FixSwordItem(new FixerSettings(AddToolMaterial.RACKNITE), 6f, 1.6f, normalSettings("racknite_sword").fireResistant()));

    //Enderite
    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot", new Item(normalSettings("enderite_ingot").fireResistant().trimMaterial(AddTrimMaterials.TRIM_ENDERITE)));
    public static final Item ENDERITE_NUGGET = registerItem("enderite_nugget", new Item(normalSettings("enderite_nugget").fireResistant()));
    public static final Item ENDERITE_RAW = registerItem("enderite_raw", new Item(normalSettings("enderite_raw").fireResistant()));

    public static final Item ENDERITE_HELMET = registerItem("enderite_helmet", new Item(humainArmorSettings(ModArmorMaterials.ENDERITE, ArmorType.HELMET, "enderite_helmet").fireResistant()));
    public static final Item ENDERITE_CHESTPLATE = registerItem("enderite_chestplate", new Item(humainArmorSettings(ModArmorMaterials.ENDERITE, ArmorType.CHESTPLATE, "enderite_chestplate").fireResistant()));
    public static final Item ENDERITE_LEGGINGS = registerItem("enderite_leggings", new Item(humainArmorSettings(ModArmorMaterials.ENDERITE, ArmorType.LEGGINGS, "enderite_leggings").fireResistant()));
    public static final Item ENDERITE_BOOTS = registerItem("enderite_boots", new Item(humainArmorSettings(ModArmorMaterials.ENDERITE, ArmorType.BOOTS, "enderite_boots").fireResistant()));

    public static final Item ENDERITE_PICKAXE = registerItem("enderite_pickaxe", new FixPickaxeItem(new FixerSettings(AddToolMaterial.ENDERITE), 5.5f, 1.2f, normalSettings("enderite_pickaxe").fireResistant()));
    public static final Item ENDERITE_SHOVEL = registerItem("enderite_shovel", new FixShovelItem(new FixerSettings(AddToolMaterial.ENDERITE), 6f, 1f, normalSettings("enderite_shovel").fireResistant()));
    public static final Item ENDERITE_AXE = registerItem("enderite_axe", new FixAxeItem(new FixerSettings(AddToolMaterial.ENDERITE), 10f, 1f, normalSettings("enderite_axe").fireResistant()));
    public static final Item ENDERITE_HOE = registerItem("enderite_hoe", new FixHoeItem(new FixerSettings(AddToolMaterial.ENDERITE), 1f, 5f, normalSettings("enderite_hoe").fireResistant()));
    public static final Item ENDERITE_SWORD = registerItem("enderite_sword", new FixSwordItem(new FixerSettings(AddToolMaterial.ENDERITE), 7.6f, 1.6f , normalSettings("enderite_sword").fireResistant()));

    //Toxic_Bronze
    public static final Item TOXIC_BRONZE_INGOT = registerItem("toxic_bronze_ingot", new ToxicItem(normalSettings("toxic_bronze_ingot").trimMaterial(AddTrimMaterials.TRIM_TOXIC_BRONZE), MobEffects.POISON, 10));
    public static final Item TOXIC_BRONZE_NUGGET = registerItem("toxic_bronze_nugget", new ToxicItem(normalSettings("toxic_bronze_nugget"), MobEffects.POISON, 10));
    public static final Item TOXIC_BRONZE_ALLOY = registerItem("toxic_bronze_alloy", new ToxicItem(normalSettings("toxic_bronze_alloy"), MobEffects.POISON, 10));

    public static final Item TOXIC_BRONZE_HELMET = registerItem("toxic_bronze_helmet", new ToxicItem(humainArmorSettings(ModArmorMaterials.TOXIC_BRONZE, ArmorType.HELMET, "toxic_bronze_helmet"), MobEffects.POISON, 10));
    public static final Item TOXIC_BRONZE_CHESTPLATE = registerItem("toxic_bronze_chestplate", new ToxicItem(humainArmorSettings(ModArmorMaterials.TOXIC_BRONZE, ArmorType.CHESTPLATE, "toxic_bronze_chestplate"), MobEffects.POISON, 10));
    public static final Item TOXIC_BRONZE_LEGGINGS = registerItem("toxic_bronze_leggings", new ToxicItem(humainArmorSettings(ModArmorMaterials.TOXIC_BRONZE, ArmorType.LEGGINGS, "toxic_bronze_leggings"), MobEffects.POISON, 10));
    public static final Item TOXIC_BRONZE_BOOTS = registerItem("toxic_bronze_boots", new ToxicItem(humainArmorSettings(ModArmorMaterials.TOXIC_BRONZE, ArmorType.BOOTS, "toxic_bronze_boots"), MobEffects.POISON, 10));

    public static final Item TOXIC_BRONZE_PICKAXE = registerItem("toxic_bronze_pickaxe", new ToxicPickaxeItem(new FixerSettings(AddToolMaterial.BRONZE), 3.7f, 1.5f, normalSettings("toxic_bronze_pickaxe"), MobEffects.POISON));
    public static final Item TOXIC_BRONZE_SHOVEL = registerItem("toxic_bronze_shovel", new ToxicShovelItem(new FixerSettings(AddToolMaterial.BRONZE), 4f, 1f, normalSettings("toxic_bronze_shovel"), MobEffects.POISON));
    public static final Item TOXIC_BRONZE_AXE = registerItem("toxic_bronze_axe", new ToxicAxeItem(new FixerSettings(AddToolMaterial.BRONZE), 8.5f, 1f, normalSettings("toxic_bronze_axe"), MobEffects.POISON));
    public static final Item TOXIC_BRONZE_HOE = registerItem("toxic_bronze_hoe", new ToxicHoeItem(new FixerSettings(AddToolMaterial.BRONZE), 1f, 2.6f, normalSettings("toxic_bronze_hoe"), MobEffects.POISON));
    public static final Item TOXIC_BRONZE_SWORD = registerItem("toxic_bronze_sword", new ToxicSwordItem(new FixerSettings(AddToolMaterial.BRONZE), 5.6f, 1.6f , normalSettings("toxic_bronze_sword"), MobEffects.POISON));

    //Horse Armors
    public static final Item ALUMINIUM_HORSE_ARMOR = registerItem("aluminium_horse_armor", new Item(horseArmorSettings("aluminium_horse_armor", ModArmorMaterials.ALUMINIUM)));
    public static final Item TIN_HORSE_ARMOR = registerItem("tin_horse_armor", new Item(horseArmorSettings("tin_horse_armor", ModArmorMaterials.TIN)));
    public static final Item BRONZE_HORSE_ARMOR = registerItem("bronze_horse_armor", new Item(horseArmorSettings("bronze_horse_armor", ModArmorMaterials.BRONZE)));
    public static final Item TOXIC_BRONZE_HORSE_ARMOR = registerItem("toxic_bronze_horse_armor", new ToxicItem(horseArmorSettings("toxic_bronze_horse_armor", ModArmorMaterials.TOXIC_BRONZE), MobEffects.POISON, 10));
    public static final Item STEEL_HORSE_ARMOR = registerItem("steel_horse_armor", new Item(horseArmorSettings("steel_horse_armor", ModArmorMaterials.STEEL)));
    public static final Item CHROME_HORSE_ARMOR = registerItem("chrome_horse_armor", new Item(horseArmorSettings("chrome_horse_armor", ModArmorMaterials.CHROME)));
    public static final Item NICKEL_HORSE_ARMOR = registerItem("nickel_horse_armor", new Item(horseArmorSettings("nickel_horse_armor", ModArmorMaterials.NICKEL)));
    public static final Item PLOMB_HORSE_ARMOR = registerItem("plomb_horse_armor", new ToxicItem(horseArmorSettings("plomb_horse_armor", ModArmorMaterials.PLOMB), MobEffects.WITHER, 10));
    public static final Item SILVER_HORSE_ARMOR = registerItem("silver_horse_armor", new Item(horseArmorSettings("silver_horse_armor", ModArmorMaterials.SILVER)));
    public static final Item TITANIUM_HORSE_ARMOR = registerItem("titanium_horse_armor", new Item(horseArmorSettings("titanium_horse_armor", ModArmorMaterials.TITANIUM)));
    public static final Item ZINC_HORSE_ARMOR = registerItem("zinc_horse_armor", new Item(horseArmorSettings("zinc_horse_armor", ModArmorMaterials.ZINC)));
    public static final Item VOLCANITE_HORSE_ARMOR = registerItem("volcanite_horse_armor", new Item(horseArmorSettings("volcanite_horse_armor", ModArmorMaterials.VOLCANITE).fireResistant()));
    public static final Item SOULRITE_HORSE_ARMOR = registerItem("soulrite_horse_armor", new Item(horseArmorSettings("soulrite_horse_armor", ModArmorMaterials.SOULRITE).fireResistant()));
    public static final Item RACKNITE_HORSE_ARMOR = registerItem("racknite_horse_armor", new Item(horseArmorSettings("racknite_horse_armor", ModArmorMaterials.RACKNITE).fireResistant()));
    public static final Item ENDERITE_HORSE_ARMOR = registerItem("enderite_horse_armor", new Item(horseArmorSettings("enderite_horse_armor", ModArmorMaterials.ENDERITE).fireResistant()));

    //Nautilus Armors
    public static final Item ALUMINIUM_NAUTILUS_ARMOR = registerItem("aluminium_nautilus_armor", new Item(nautilusArmorSettings("aluminium_nautilus_armor", ModArmorMaterials.ALUMINIUM)));
    public static final Item TIN_NAUTILUS_ARMOR = registerItem("tin_nautilus_armor", new Item(nautilusArmorSettings("tin_nautilus_armor", ModArmorMaterials.TIN)));
    public static final Item BRONZE_NAUTILUS_ARMOR = registerItem("bronze_nautilus_armor", new Item(nautilusArmorSettings("bronze_nautilus_armor", ModArmorMaterials.BRONZE)));
    public static final Item TOXIC_BRONZE_NAUTILUS_ARMOR = registerItem("toxic_bronze_nautilus_armor", new ToxicItem(nautilusArmorSettings("toxic_bronze_nautilus_armor", ModArmorMaterials.TOXIC_BRONZE), MobEffects.POISON, 10));
    public static final Item STEEL_NAUTILUS_ARMOR = registerItem("steel_nautilus_armor", new Item(nautilusArmorSettings("steel_nautilus_armor", ModArmorMaterials.STEEL)));
    public static final Item CHROME_NAUTILUS_ARMOR = registerItem("chrome_nautilus_armor", new Item(nautilusArmorSettings("chrome_nautilus_armor", ModArmorMaterials.CHROME)));
    public static final Item NICKEL_NAUTILUS_ARMOR = registerItem("nickel_nautilus_armor", new Item(nautilusArmorSettings("nickel_nautilus_armor", ModArmorMaterials.NICKEL)));
    public static final Item PLOMB_NAUTILUS_ARMOR = registerItem("plomb_nautilus_armor", new ToxicItem(nautilusArmorSettings("plomb_nautilus_armor", ModArmorMaterials.PLOMB), MobEffects.WITHER, 10));
    public static final Item SILVER_NAUTILUS_ARMOR = registerItem("silver_nautilus_armor", new Item(nautilusArmorSettings("silver_nautilus_armor", ModArmorMaterials.SILVER)));
    public static final Item TITANIUM_NAUTILUS_ARMOR = registerItem("titanium_nautilus_armor", new Item(nautilusArmorSettings("titanium_nautilus_armor", ModArmorMaterials.TITANIUM)));
    public static final Item ZINC_NAUTILUS_ARMOR = registerItem("zinc_nautilus_armor", new Item(nautilusArmorSettings("zinc_nautilus_armor", ModArmorMaterials.ZINC)));
    public static final Item VOLCANITE_NAUTILUS_ARMOR = registerItem("volcanite_nautilus_armor", new Item(nautilusArmorSettings("volcanite_nautilus_armor", ModArmorMaterials.VOLCANITE).fireResistant()));
    public static final Item SOULRITE_NAUTILUS_ARMOR = registerItem("soulrite_nautilus_armor", new Item(nautilusArmorSettings("soulrite_nautilus_armor", ModArmorMaterials.SOULRITE).fireResistant()));
    public static final Item RACKNITE_NAUTILUS_ARMOR = registerItem("racknite_nautilus_armor", new Item(nautilusArmorSettings("racknite_nautilus_armor", ModArmorMaterials.RACKNITE).fireResistant()));
    public static final Item ENDERITE_NAUTILUS_ARMOR = registerItem("enderite_nautilus_armor", new Item(nautilusArmorSettings("enderite_nautilus_armor", ModArmorMaterials.ENDERITE).fireResistant()));

    //Spears
    public static final Item ALUMINIUM_SPEAR = registerItem("aluminium_spear", new FixSpearItem(new FixerSettings(AddToolMaterial.ALUMINIUM), 2.5f, 0.95f, 0.9f, 0.6f, 2.5f, 10f, 9f, 13f, normalSettings("aluminium_spear")));
    public static final Item TIN_SPEAR = registerItem("tin_spear", new FixSpearItem(new FixerSettings(AddToolMaterial.TIN), 1.5f, 0.8f, 0.82f, 0.65f, 4.5f, 9f, 8.5f, 9f, normalSettings("tin_spear")));

    public static final Item BRONZE_SPEAR = registerItem("bronze_spear", new FixSpearItem(new FixerSettings(AddToolMaterial.BRONZE), 2.3f, 0.9f, 0.85f, 0.62f, 3.5f, 8.5f, 7.5f, 12f, normalSettings("bronze_spear")));
    public static final Item TOXIC_BRONZE_SPEAR = registerItem("toxic_bronze_spear", new ToxicSpearItem(new FixerSettings(AddToolMaterial.BRONZE), 2.3f, 0.9f, 0.85f, 0.62f, 3.5f, 8.5f, 7.5f, 12f, normalSettings("toxic_bronze_spear"), MobEffects.POISON));
    public static final Item STEEL_SPEAR = registerItem("steel_spear", new FixSpearItem(new FixerSettings(AddToolMaterial.STEEL), 3.5f, 1f, 1f, 0.55f, 2.7f, 9f, 6.5f, 10.5f, normalSettings("steel_spear")));

    public static final Item CHROME_SPEAR = registerItem("chrome_spear", new FixSpearItem(new FixerSettings(AddToolMaterial.CHROME), 1.2f, 0.8f, 0.82f, 0.65f, 4.5f, 9f, 8.5f, 9f, normalSettings("chrome_spear")));
    public static final Item NICKEL_SPEAR = registerItem("nickel_spear", new FixSpearItem(new FixerSettings(AddToolMaterial.NICKEL), 3f, 0.95f, 0.95f, 0.6f, 2.5f, 8f, 6.75f, 11.25f, normalSettings("nickel_spear")));
    public static final Item PLOMB_SPEAR = registerItem("plomb_spear", new ToxicSpearItem(new FixerSettings(AddToolMaterial.PLOMB), 2.7f, 0.95f, 0.7f, 0.7f, 3.5f, 10f, 8.5f, 13f, normalSettings("plomb_spear"), MobEffects.WITHER));
    public static final Item SILVER_SPEAR = registerItem("silver_spear", new FixSpearItem(new FixerSettings(AddToolMaterial.SILVER), 1f, 0.95f, 0.7f, 0.65f, 4f, 9f, 8.5f, 12f, normalSettings("silver_spear")));
    public static final Item TITANIUM_SPEAR = registerItem("titanium_spear", new FixSpearItem(new FixerSettings(AddToolMaterial.TITANIUM), 2.8f, 0.95f, 0.95f, 0.6f, 3f, 8f, 6.5f, 11.3f, normalSettings("titanium_spear")));
    public static final Item ZINC_SPEAR = registerItem("zinc_spear", new FixSpearItem(new FixerSettings(AddToolMaterial.ZINC), 1.2f, 0.8f, 0.82f, 0.65f, 4.5f, 10f, 9f, 9f, normalSettings("zinc_spear")));

    public static final Item VOLCANITE_SPEAR = registerItem("volcanite_spear", new FixSpearItem(new FixerSettings(AddToolMaterial.VOLCANITE), 3.2f, 0.95f, 0.97f, 0.58f, 2.5f, 7.7f, 6.5f, 10.5f, normalSettings("volcanite_spear").fireResistant()));
    public static final Item SOULRITE_SPEAR = registerItem("soulrite_spear", new FixSpearItem(new FixerSettings(AddToolMaterial.SOULRITE), 3.8f, 1f, 1.05f, 0.55f, 3f, 7.5f, 6.5f, 9.8f, normalSettings("soulrite_spear").fireResistant()));
    public static final Item RACKNITE_SPEAR = registerItem("racknite_spear", new FixSpearItem(new FixerSettings(AddToolMaterial.RACKNITE), 2.5f, 0.95f, 0.95f, 0.6f, 3.5f, 8f, 6.25f, 11.25f, normalSettings("racknite_spear").fireResistant()));
    public static final Item ENDERITE_SPEAR = registerItem("enderite_spear", new FixSpearItem(new FixerSettings(AddToolMaterial.ENDERITE), 4.5f, 1.1f, 1.15f, 0.45f, 2.7f, 7.2f, 6f, 9f, normalSettings("enderite_spear").fireResistant()));



    public static Item.Properties normalSettings(String idKey) {
        return new Item.Properties().setId(itemKey(idKey));
    }

    public static Item.Properties horseArmorSettings(String idKey, ArmorMaterial material) {
        return new Item.Properties().durability(1).horseArmor(material).setId(itemKey(idKey));
    }
    public static Item.Properties nautilusArmorSettings(String idKey, ArmorMaterial material) {
        return new Item.Properties().durability(1).nautilusArmor(material).setId(itemKey(idKey));
    }

    public static Item.Properties humainArmorSettings(ArmorMaterial material, ArmorType type, String idKey) {
        return new Item.Properties().durability(1).humanoidArmor(material, type).setId(itemKey(idKey));
    }


     public static void registerItems() {
         
    }
    
    private static Item registerItem(String id, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, itemKey(id), item);
    }

    private static ResourceKey<Item> itemKey(String key) {
        return ResourceKey.create(Registries.ITEM, MoreOres.id(key));
    }

}
