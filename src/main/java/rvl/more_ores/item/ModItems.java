package rvl.more_ores.item;


import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import rvl.more_ores.MoreOres;

public class ModItems {
    //Aluminium
    public static Item ALUMINIUM_INGOT;
    public static Item ALUMINIUM_RAW;
    public static Item ALUMINIUM_HELMET;
    public static Item ALUMINIUM_CHESTPLATE;
    public static Item ALUMINIUM_LEGGINGS;
    public static Item ALUMINIUM_BOOTS;
    public static Item ALUMINIUM_PICKAXE;
    public static Item ALUMINIUM_SHOVEL;
    public static Item ALUMINIUM_AXE;
    public static Item ALUMINIUM_HOE;
    public static Item ALUMINIUM_SWORD;

    //Tin Mineral
    public static Item TIN_INGOT;
    public static Item TIN_RAW;
    public static Item TIN_HELMET;
    public static Item TIN_CHESTPLATE;
    public static Item TIN_LEGGINGS;
    public static Item TIN_BOOTS;
    public static Item TIN_PICKAXE;
    public static Item TIN_SHOVEL;
    public static Item TIN_AXE;
    public static Item TIN_HOE;
    public static Item TIN_SWORD;

    //Bronze Mineral
    public static Item BRONZE_INGOT;
    public static Item BRONZE_ALLOY;
    public static Item BRONZE_HELMET;
    public static Item BRONZE_CHESTPLATE;
    public static Item BRONZE_LEGGINGS;
    public static Item BRONZE_BOOTS;
    public static Item BRONZE_PICKAXE;
    public static Item BRONZE_SHOVEL;
    public static Item BRONZE_AXE;
    public static Item BRONZE_HOE;
    public static Item BRONZE_SWORD;

    //STEEL Mineral
    public static Item STEEL_INGOT;
    public static Item STEEL_ALLOY;
    public static Item STEEL_HELMET;
    public static Item STEEL_CHESTPLATE;
    public static Item STEEL_LEGGINGS;
    public static Item STEEL_BOOTS;
    public static Item STEEL_PICKAXE;
    public static Item STEEL_SHOVEL;
    public static Item STEEL_AXE;
    public static Item STEEL_HOE;
    public static Item STEEL_SWORD;

    //CHROME Mineral
    public static Item CHROME_INGOT;
    public static Item CHROME_RAW;
    public static Item CHROME_HELMET;
    public static Item CHROME_CHESTPLATE;
    public static Item CHROME_LEGGINGS;
    public static Item CHROME_BOOTS;
    public static Item CHROME_PICKAXE;
    public static Item CHROME_SHOVEL;
    public static Item CHROME_AXE;
    public static Item CHROME_HOE;
    public static Item CHROME_SWORD;

    //NIKEL Mineral
    public static Item NICKEL_INGOT;
    public static Item NICKEL_RAW;
    public static Item NICKEL_HELMET;
    public static Item NICKEL_CHESTPLATE;
    public static Item NICKEL_LEGGINGS;
    public static Item NICKEL_BOOTS;
    public static Item NICKEL_PICKAXE;
    public static Item NICKEL_SHOVEL;
    public static Item NICKEL_AXE;
    public static Item NICKEL_HOE;
    public static Item NICKEL_SWORD;

    //PLOMB Mineral
    public static Item PLOMB_INGOT;
    public static Item PLOMB_RAW;
    public static Item PLOMB_HELMET;
    public static Item PLOMB_CHESTPLATE;
    public static Item PLOMB_LEGGINGS;
    public static Item PLOMB_BOOTS;
    public static Item PLOMB_PICKAXE;
    public static Item PLOMB_SHOVEL;
    public static Item PLOMB_AXE;
    public static Item PLOMB_HOE;
    public static Item PLOMB_SWORD;

    //SILICON Mineral
    public static Item SILICON_INGOT;
    public static Item SILICON_RAW;

    //SILVER Mineral
    public static Item SILVER_INGOT;
    public static Item SILVER_RAW;
    public static Item SILVER_HELMET;
    public static Item SILVER_CHESTPLATE;
    public static Item SILVER_LEGGINGS;
    public static Item SILVER_BOOTS;
    public static Item SILVER_PICKAXE;
    public static Item SILVER_SHOVEL;
    public static Item SILVER_AXE;
    public static Item SILVER_HOE;
    public static Item SILVER_SWORD;

    //TITANIUM Mineral
    public static Item TITANIUM_INGOT;
    public static Item TITANIUM_RAW;
    public static Item TITANIUM_HELMET;
    public static Item TITANIUM_CHESTPLATE;
    public static Item TITANIUM_LEGGINGS;
    public static Item TITANIUM_BOOTS;
    public static Item TITANIUM_PICKAXE;
    public static Item TITANIUM_SHOVEL;
    public static Item TITANIUM_AXE;
    public static Item TITANIUM_HOE;
    public static Item TITANIUM_SWORD;

    //ZINC Mineral
    public static Item ZINC_INGOT;
    public static Item ZINC_RAW;
    public static Item ZINC_HELMET;
    public static Item ZINC_CHESTPLATE;
    public static Item ZINC_LEGGINGS;
    public static Item ZINC_BOOTS;
    public static Item ZINC_PICKAXE;
    public static Item ZINC_SHOVEL;
    public static Item ZINC_AXE;
    public static Item ZINC_HOE;
    public static Item ZINC_SWORD;

    //Other minerals
    public static Item SALT;
    public static Item SODIUM_INGOT;
    public static Item LITHIUM_INGOT;
    public static Item LITHIUM_RAW;
    public static Item ARSENIC;

    //Volcanite
    public static Item VOLCANITE_INGOT;
    public static Item VOLCANITE_RAW;
    public static Item VOLCANITE_HELMET;
    public static Item VOLCANITE_CHESTPLATE;
    public static Item VOLCANITE_LEGGINGS;
    public static Item VOLCANITE_BOOTS;
    public static Item VOLCANITE_PICKAXE;
    public static Item VOLCANITE_SHOVEL;
    public static Item VOLCANITE_AXE;
    public static Item VOLCANITE_HOE;
    public static Item VOLCANITE_SWORD;

    //Soulrite
    public static Item SOULRITE_INGOT;
    public static Item SOULRITE_RAW;
    public static Item SOULRITE_HELMET;
    public static Item SOULRITE_CHESTPLATE;
    public static Item SOULRITE_LEGGINGS;
    public static Item SOULRITE_BOOTS;
    public static Item SOULRITE_PICKAXE;
    public static Item SOULRITE_SHOVEL;
    public static Item SOULRITE_AXE;
    public static Item SOULRITE_HOE;
    public static Item SOULRITE_SWORD;

    //RACKNITE
    public static Item RACKNITE_INGOT;
    public static Item RACKNITE_RAW;
    public static Item RACKNITE_HELMET;
    public static Item RACKNITE_CHESTPLATE;
    public static Item RACKNITE_LEGGINGS;
    public static Item RACKNITE_BOOTS;
    public static Item RACKNITE_PICKAXE;
    public static Item RACKNITE_SHOVEL;
    public static Item RACKNITE_AXE;
    public static Item RACKNITE_HOE;
    public static Item RACKNITE_SWORD;

    //Enderite
    public static Item ENDERITE_INGOT;
    public static Item ENDERITE_RAW;
    public static Item ENDERITE_HELMET;
    public static Item ENDERITE_CHESTPLATE;
    public static Item ENDERITE_LEGGINGS;
    public static Item ENDERITE_BOOTS;
    public static Item ENDERITE_PICKAXE;
    public static Item ENDERITE_SHOVEL;
    public static Item ENDERITE_AXE;
    public static Item ENDERITE_HOE;
    public static Item ENDERITE_SWORD;





     public static void registerModItems() {
        //Items register - Minerals
         ALUMINIUM_INGOT = registerItem("aluminium_ingot", new Item(new Item.Settings()));
         ALUMINIUM_RAW = registerItem("aluminium_raw", new Item(new Item.Settings()));

         TIN_INGOT = registerItem("tin_ingot", new Item(new Item.Settings()));
         TIN_RAW = registerItem("tin_raw", new Item(new Item.Settings()));

         BRONZE_INGOT = registerItem("bronze_ingot", new Item(new Item.Settings()));
         BRONZE_ALLOY = registerItem("bronze_alloy", new Item(new Item.Settings()));

         STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));
         STEEL_ALLOY = registerItem("steel_alloy", new Item(new Item.Settings()));

         CHROME_INGOT = registerItem("chrome_ingot", new Item(new Item.Settings()));
         CHROME_RAW = registerItem("chrome_raw", new Item(new Item.Settings()));

         NICKEL_INGOT = registerItem("nickel_ingot", new Item(new Item.Settings()));
         NICKEL_RAW = registerItem("nickel_raw", new Item(new Item.Settings()));

         PLOMB_INGOT = registerItem("plomb_ingot", new Item(new Item.Settings()));
         PLOMB_RAW = registerItem("plomb_raw", new Item(new Item.Settings()));

         SILICON_INGOT = registerItem("silicon_ingot", new Item(new Item.Settings()));
         SILICON_RAW = registerItem("silicon_raw", new Item(new Item.Settings()));

         SILVER_INGOT = registerItem("silver_ingot", new Item(new Item.Settings()));
         SILVER_RAW = registerItem("silver_raw", new Item(new Item.Settings()));

         TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new Item.Settings()));
         TITANIUM_RAW = registerItem("titanium_raw", new Item(new Item.Settings()));

         ZINC_INGOT = registerItem("zinc_ingot", new Item(new Item.Settings()));
         ZINC_RAW = registerItem("zinc_raw", new Item(new Item.Settings()));


        //ModArmorItems - Aluminium Armor
         ALUMINIUM_HELMET = registerItem("aluminium_helmet",
                new ArmorItem(ModArmorMaterials.ALUMINIUM, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(14))));

         ALUMINIUM_CHESTPLATE = registerItem("aluminium_chestplate",
                new ArmorItem(ModArmorMaterials.ALUMINIUM, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(14))));

         ALUMINIUM_LEGGINGS = registerItem("aluminium_leggings",
                new ArmorItem(ModArmorMaterials.ALUMINIUM, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(14))));

         ALUMINIUM_BOOTS = registerItem("aluminium_boots",
                new ArmorItem(ModArmorMaterials.ALUMINIUM, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(14))));

        //ModArmorItems - Tin Armor
         TIN_HELMET = registerItem("tin_helmet",
                new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(7))));

         TIN_CHESTPLATE = registerItem("tin_chestplate",
                new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(7))));

         TIN_LEGGINGS = registerItem("tin_leggings",
                new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(7))));

         TIN_BOOTS = registerItem("tin_boots",
                new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(7))));

        //ModArmorItems - Bronze Armor
         BRONZE_HELMET = registerItem("bronze_helmet",
                new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(11))));

         BRONZE_CHESTPLATE = registerItem("bronze_chestplate",
                new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(11))));

         BRONZE_LEGGINGS = registerItem("bronze_leggings",
                new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(11))));

         BRONZE_BOOTS = registerItem("bronze_boots",
                new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(11))));


        //ModArmorItems - Steel Armor
         STEEL_HELMET = registerItem("steel_helmet",
                new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(24))));

         STEEL_CHESTPLATE = registerItem("steel_chestplate",
                new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(24))));

         STEEL_LEGGINGS = registerItem("steel_leggings",
                new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(24))));

         STEEL_BOOTS = registerItem("steel_boots",
                new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(24))));

        //ModArmorItems - Chrome Armor
         CHROME_HELMET = registerItem("chrome_helmet",
                new ArmorItem(ModArmorMaterials.CHROME, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(10))));

         CHROME_CHESTPLATE = registerItem("chrome_chestplate",
                new ArmorItem(ModArmorMaterials.CHROME, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(10))));

         CHROME_LEGGINGS = registerItem("chrome_leggings",
                new ArmorItem(ModArmorMaterials.CHROME, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(10))));

         CHROME_BOOTS = registerItem("chrome_boots",
                new ArmorItem(ModArmorMaterials.CHROME, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(10))));

        //ModArmorItems - Nickel Armor
         NICKEL_HELMET = registerItem("nickel_helmet",
                new ArmorItem(ModArmorMaterials.NICKEL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));

         NICKEL_CHESTPLATE = registerItem("nickel_chestplate",
                new ArmorItem(ModArmorMaterials.NICKEL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));

         NICKEL_LEGGINGS = registerItem("nickel_leggings",
                new ArmorItem(ModArmorMaterials.NICKEL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));

         NICKEL_BOOTS = registerItem("nickel_boots",
                new ArmorItem(ModArmorMaterials.NICKEL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

        //ModArmorItems - Plomb Armor
         PLOMB_HELMET = registerItem("plomb_helmet",
                new ArmorItem(ModArmorMaterials.PLOMB, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(7))));

         PLOMB_CHESTPLATE = registerItem("plomb_chestplate",
                new ArmorItem(ModArmorMaterials.PLOMB, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(7))));

         PLOMB_LEGGINGS = registerItem("plomb_leggings",
                new ArmorItem(ModArmorMaterials.PLOMB, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(7))));

         PLOMB_BOOTS = registerItem("plomb_boots",
                new ArmorItem(ModArmorMaterials.PLOMB, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(7))));
        //ModArmorItems - Silver Armor
         SILVER_HELMET = registerItem("silver_helmet",
                new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(7))));

         SILVER_CHESTPLATE = registerItem("silver_chestplate",
                new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(7))));

         SILVER_LEGGINGS = registerItem("silver_leggings",
                new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(7))));

         SILVER_BOOTS = registerItem("silver_boots",
                new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(7))));

        //ModArmorItems - Titanium Armor
         TITANIUM_HELMET = registerItem("titanium_helmet",
                new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(14))));

         TITANIUM_CHESTPLATE = registerItem("titanium_chestplate",
                new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(14))));

         TITANIUM_LEGGINGS = registerItem("titanium_leggings",
                new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(14))));

         TITANIUM_BOOTS = registerItem("titanium_boots",
            new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(14))));

        //ModArmorItems - Zinc Armor
         ZINC_HELMET = registerItem("zinc_helmet",
                new ArmorItem(ModArmorMaterials.ZINC, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(8))));

         ZINC_CHESTPLATE = registerItem("zinc_chestplate",
                new ArmorItem(ModArmorMaterials.ZINC, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(8))));

         ZINC_LEGGINGS = registerItem("zinc_leggings",
                new ArmorItem(ModArmorMaterials.ZINC, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(8))));

         ZINC_BOOTS = registerItem("zinc_boots",
                new ArmorItem(ModArmorMaterials.ZINC, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(8))));



        //ModItemTools - Aluminium Tools
         ALUMINIUM_PICKAXE = registerItem("aluminium_pickaxe",
                new PickaxeItem(ModToolMaterials.ALUMINIUM, new Item.Settings().attributeModifiers(createAttributeModifiers(3.7f, 1.5f))));

         ALUMINIUM_SHOVEL = registerItem("aluminium_shovel",
                new ShovelItem(ModToolMaterials.ALUMINIUM, new Item.Settings().attributeModifiers(createAttributeModifiers(4f, 1.2f))));

         ALUMINIUM_AXE = registerItem("aluminium_axe",
                new AxeItem(ModToolMaterials.ALUMINIUM, new Item.Settings().attributeModifiers(createAttributeModifiers(8.5f, 1f))));

         ALUMINIUM_HOE = registerItem("aluminium_hoe",
                new HoeItem(ModToolMaterials.ALUMINIUM, new Item.Settings().attributeModifiers(createAttributeModifiers(1f, 3.5f))));

         ALUMINIUM_SWORD = registerItem("aluminium_sword",
                new SwordItem(ModToolMaterials.ALUMINIUM, new Item.Settings().attributeModifiers(createAttributeModifiers(5.6f, 1.8f))));

        //ModItemTools - Tin Tools
         TIN_PICKAXE = registerItem("tin_pickaxe",
                new PickaxeItem(ModToolMaterials.TIN, new Item.Settings().attributeModifiers(createAttributeModifiers(3.3f, 1.5f))));

         TIN_SHOVEL = registerItem("tin_shovel",
                new ShovelItem(ModToolMaterials.TIN, new Item.Settings().attributeModifiers(createAttributeModifiers(3.5f, 1.2f))));

         TIN_AXE = registerItem("tin_axe",
                new AxeItem(ModToolMaterials.TIN, new Item.Settings().attributeModifiers(createAttributeModifiers(8f, 1f))));

         TIN_HOE = registerItem("tin_hoe",
                new HoeItem(ModToolMaterials.TIN, new Item.Settings().attributeModifiers(createAttributeModifiers(1f, 2.6f))));

         TIN_SWORD = registerItem("tin_sword",
                new SwordItem(ModToolMaterials.TIN, new Item.Settings().attributeModifiers(createAttributeModifiers(5.2f, 1.6f))));

        //ModItemTools - Bronze Tools
         BRONZE_PICKAXE = registerItem("bronze_pickaxe",
                new PickaxeItem(ModToolMaterials.BRONZE, new Item.Settings().attributeModifiers(createAttributeModifiers(3.7f, 1.5f))));

         BRONZE_SHOVEL = registerItem("bronze_shovel",
                new ShovelItem(ModToolMaterials.BRONZE, new Item.Settings().attributeModifiers(createAttributeModifiers(4f, 1f))));

         BRONZE_AXE = registerItem("bronze_axe",
                new AxeItem(ModToolMaterials.BRONZE, new Item.Settings().attributeModifiers(createAttributeModifiers(8.5f, 1f))));

         BRONZE_HOE = registerItem("bronze_hoe",
                new HoeItem(ModToolMaterials.BRONZE, new Item.Settings().attributeModifiers(createAttributeModifiers(1f, 2.6f))));

         BRONZE_SWORD = registerItem("bronze_sword",
                new SwordItem(ModToolMaterials.BRONZE, new Item.Settings().attributeModifiers(createAttributeModifiers(5.6f, 1.6f))));

        //ModItemTools - Steel Tools
         STEEL_PICKAXE = registerItem("steel_pickaxe",
                new PickaxeItem(ModToolMaterials.STEEL, new Item.Settings().attributeModifiers(createAttributeModifiers(4.6f, 1.2f))));

         STEEL_SHOVEL = registerItem("steel_shovel",
                new ShovelItem(ModToolMaterials.STEEL, new Item.Settings().attributeModifiers(createAttributeModifiers(5f, 1f))));

         STEEL_AXE = registerItem("steel_axe",
                new AxeItem(ModToolMaterials.STEEL, new Item.Settings().attributeModifiers(createAttributeModifiers(9.5f, 0.9f))));

         STEEL_HOE = registerItem("steel_hoe",
                new HoeItem(ModToolMaterials.STEEL, new Item.Settings().attributeModifiers(createAttributeModifiers(1f, 2.6f))));

         STEEL_SWORD = registerItem("steel_sword",
                new SwordItem(ModToolMaterials.STEEL, new Item.Settings().attributeModifiers(createAttributeModifiers(6.5f, 1.6f))));

        //ModItemTools - Chrome Tools
         CHROME_PICKAXE = registerItem("chrome_pickaxe",
                new PickaxeItem(ModToolMaterials.CHROME, new Item.Settings().attributeModifiers(createAttributeModifiers(3.5f, 1.2f))));

         CHROME_SHOVEL = registerItem("chrome_shovel",
                new ShovelItem(ModToolMaterials.CHROME, new Item.Settings().attributeModifiers(createAttributeModifiers(3.5f, 1.2f))));

         CHROME_AXE = registerItem("chrome_axe",
                new AxeItem(ModToolMaterials.CHROME, new Item.Settings().attributeModifiers(createAttributeModifiers(8f, 1f))));

         CHROME_HOE = registerItem("chrome_hoe",
                new HoeItem(ModToolMaterials.CHROME, new Item.Settings().attributeModifiers(createAttributeModifiers(1f, 2.6f))));

         CHROME_SWORD = registerItem("chrome_sword",
                new SwordItem(ModToolMaterials.CHROME, new Item.Settings().attributeModifiers(createAttributeModifiers(5.2f, 1.6f))));

        //ModItemTools - Nickel Tools
         NICKEL_PICKAXE = registerItem("nickel_pickaxe",
                new PickaxeItem(ModToolMaterials.NICKEL, new Item.Settings().attributeModifiers(createAttributeModifiers(4f, 1.2f))));

         NICKEL_SHOVEL = registerItem("nickel_shovel",
                new ShovelItem(ModToolMaterials.NICKEL, new Item.Settings().attributeModifiers(createAttributeModifiers(4.5f, 1f))));

         NICKEL_AXE = registerItem("nickel_axe",
                new AxeItem(ModToolMaterials.NICKEL, new Item.Settings().attributeModifiers(createAttributeModifiers(9f, 0.9f))));

         NICKEL_HOE = registerItem("nickel_hoe",
                new HoeItem(ModToolMaterials.NICKEL, new Item.Settings().attributeModifiers(createAttributeModifiers(1f, 2.6f))));

         NICKEL_SWORD = registerItem("nickel_sword",
                new SwordItem(ModToolMaterials.NICKEL, new Item.Settings().attributeModifiers(createAttributeModifiers(6f, 1.6f))));

        //ModItemTools - Plomb Tools
         PLOMB_PICKAXE = registerItem("plomb_pickaxe",
                new PickaxeItem(ModToolMaterials.PLOMB, new Item.Settings().attributeModifiers(createAttributeModifiers(3.2f, 1.2f))));

         PLOMB_SHOVEL = registerItem("plomb_shovel",
                new ShovelItem(ModToolMaterials.PLOMB, new Item.Settings().attributeModifiers(createAttributeModifiers(4.5f, 0.8f))));

         PLOMB_AXE = registerItem("plomb_axe",
                new AxeItem(ModToolMaterials.PLOMB, new Item.Settings().attributeModifiers(createAttributeModifiers(9f, 0.7f))));

         PLOMB_HOE = registerItem("plomb_hoe",
                new HoeItem(ModToolMaterials.PLOMB, new Item.Settings().attributeModifiers(createAttributeModifiers(1f, 2.6f))));

         PLOMB_SWORD = registerItem("plomb_sword",
                new SwordItem(ModToolMaterials.PLOMB, new Item.Settings().attributeModifiers(createAttributeModifiers(6f, 1.2f))));

        //ModItemTools - Silver Tools
         SILVER_PICKAXE = registerItem("silver_pickaxe",
                new PickaxeItem(ModToolMaterials.SILVER, new Item.Settings().attributeModifiers(createAttributeModifiers(3.5f, 1.2f))));

         SILVER_SHOVEL = registerItem("silver_shovel",
                new ShovelItem(ModToolMaterials.SILVER, new Item.Settings().attributeModifiers(createAttributeModifiers(1.2f, 1f))));

         SILVER_AXE = registerItem("silver_axe",
                new AxeItem(ModToolMaterials.SILVER, new Item.Settings().attributeModifiers(createAttributeModifiers(3.5f, 1f))));

         SILVER_HOE = registerItem("silver_hoe",
                new HoeItem(ModToolMaterials.SILVER, new Item.Settings().attributeModifiers(createAttributeModifiers(1f, 2.6f))));

         SILVER_SWORD = registerItem("silver_sword",
                new SwordItem(ModToolMaterials.SILVER, new Item.Settings().attributeModifiers(createAttributeModifiers(5f, 1.6f))));

        //ModItemTools - Titanium Tools
         TITANIUM_PICKAXE = registerItem("titanium_pickaxe",
                new PickaxeItem(ModToolMaterials.TITANIUM, new Item.Settings().attributeModifiers(createAttributeModifiers(4f, 1.2f))));

         TITANIUM_SHOVEL = registerItem("titanium_shovel",
                new ShovelItem(ModToolMaterials.TITANIUM, new Item.Settings().attributeModifiers(createAttributeModifiers(4.2f, 1.1f))));

         TITANIUM_AXE = registerItem("titanium_axe",
                new AxeItem(ModToolMaterials.TITANIUM, new Item.Settings().attributeModifiers(createAttributeModifiers(9.2f, 0.9f))));

         TITANIUM_HOE = registerItem("titanium_hoe",
                new HoeItem(ModToolMaterials.TITANIUM, new Item.Settings().attributeModifiers(createAttributeModifiers(1f, 2.6f))));

         TITANIUM_SWORD = registerItem("titanium_sword",
                new SwordItem(ModToolMaterials.TITANIUM, new Item.Settings().attributeModifiers(createAttributeModifiers(6f, 1.6f))));

        //ModItemTools - Zinc Tools
         ZINC_PICKAXE = registerItem("zinc_pickaxe",
                new PickaxeItem(ModToolMaterials.ZINC, new Item.Settings().attributeModifiers(createAttributeModifiers(3.5f, 1.2f))));

         ZINC_SHOVEL = registerItem("zinc_shovel",
                new ShovelItem(ModToolMaterials.ZINC, new Item.Settings().attributeModifiers(createAttributeModifiers(3.5f, 1.1f))));

         ZINC_AXE = registerItem("zinc_axe",
                new AxeItem(ModToolMaterials.ZINC, new Item.Settings().attributeModifiers(createAttributeModifiers(7f, 1f))));

         ZINC_HOE = registerItem("zinc_hoe",
                new HoeItem(ModToolMaterials.ZINC, new Item.Settings().attributeModifiers(createAttributeModifiers(1f, 2.6f))));

         ZINC_SWORD = registerItem("zinc_sword",
                new SwordItem(ModToolMaterials.ZINC, new Item.Settings().attributeModifiers(createAttributeModifiers(5f, 1.6f))));

         //autre minerais
         LITHIUM_INGOT = registerItem("lithium_ingot",
                 new Item(new Item.Settings()));
         LITHIUM_RAW = registerItem("lithium_raw",
                 new Item(new Item.Settings()));

         ARSENIC = registerItem("arsenic",
                 new Item(new Item.Settings()));

         SODIUM_INGOT = registerItem("sodium_ingot",
                 new Item(new Item.Settings()));
         SALT = registerItem("salt",
                 new Item(new Item.Settings()));

         //Volcanite
         VOLCANITE_INGOT = registerItem("volcanite_ingot", new Item(new Item.Settings().fireproof()));
         VOLCANITE_RAW = registerItem("volcanite_raw", new Item(new Item.Settings().fireproof()));

         VOLCANITE_HELMET = registerItem("volcanite_helmet", new ArmorItem(ModArmorMaterials.VOLCANITE, ArmorItem.Type.HELMET, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(20))));
         VOLCANITE_CHESTPLATE = registerItem("volcanite_chestplate", new ArmorItem(ModArmorMaterials.VOLCANITE, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(20))));
         VOLCANITE_LEGGINGS = registerItem("volcanite_leggings", new ArmorItem(ModArmorMaterials.VOLCANITE, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(20))));
         VOLCANITE_BOOTS = registerItem("volcanite_boots", new ArmorItem(ModArmorMaterials.VOLCANITE, ArmorItem.Type.BOOTS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(20))));

         VOLCANITE_PICKAXE = registerItem("volcanite_pickaxe", new PickaxeItem(ModToolMaterials.VOLCANITE, new Item.Settings().fireproof().attributeModifiers(createAttributeModifiers(4.2f, 1.2f))));
         VOLCANITE_SHOVEL = registerItem("volcanite_shovel", new ShovelItem(ModToolMaterials.VOLCANITE, new Item.Settings().fireproof().attributeModifiers(createAttributeModifiers(4.7f, 1f))));
         VOLCANITE_AXE = registerItem("volcanite_axe", new AxeItem(ModToolMaterials.VOLCANITE, new Item.Settings().fireproof().attributeModifiers(createAttributeModifiers(10f, 0.9f))));
         VOLCANITE_HOE = registerItem("volcanite_hoe", new HoeItem(ModToolMaterials.VOLCANITE, new Item.Settings().fireproof().attributeModifiers(createAttributeModifiers(1f, 3.5f))));
         VOLCANITE_SWORD = registerItem("volcanite_sword", new SwordItem(ModToolMaterials.VOLCANITE, new Item.Settings().fireproof().attributeModifiers(createAttributeModifiers(6.5f, 1.6f))));

         //Soulrite
         SOULRITE_INGOT = registerItem("soulrite_ingot", new Item(new Item.Settings().fireproof()));
         SOULRITE_RAW = registerItem("soulrite_raw", new Item(new Item.Settings().fireproof()));

         SOULRITE_HELMET = registerItem("soulrite_helmet", new ArmorItem(ModArmorMaterials.SOULRITE, ArmorItem.Type.HELMET, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(25))));
         SOULRITE_CHESTPLATE = registerItem("soulrite_chestplate", new ArmorItem(ModArmorMaterials.SOULRITE, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(25))));
         SOULRITE_LEGGINGS = registerItem("soulrite_leggings", new ArmorItem(ModArmorMaterials.SOULRITE, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(25))));
         SOULRITE_BOOTS = registerItem("soulrite_boots", new ArmorItem(ModArmorMaterials.SOULRITE, ArmorItem.Type.BOOTS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(25))));

         SOULRITE_PICKAXE = registerItem("soulrite_pickaxe", new PickaxeItem(ModToolMaterials.SOULRITE, new Item.Settings().fireproof().attributeModifiers(createAttributeModifiers(4.4f, 1.2f))));
         SOULRITE_SHOVEL = registerItem("soulrite_shovel", new ShovelItem(ModToolMaterials.SOULRITE, new Item.Settings().fireproof().attributeModifiers(createAttributeModifiers(5.2f, 1f))));
         SOULRITE_AXE = registerItem("soulrite_axe", new AxeItem(ModToolMaterials.SOULRITE, new Item.Settings().fireproof().attributeModifiers(createAttributeModifiers(9f, 1f))));
         SOULRITE_HOE = registerItem("soulrite_hoe", new HoeItem(ModToolMaterials.SOULRITE, new Item.Settings().fireproof().attributeModifiers(createAttributeModifiers(1f, 4f))));
         SOULRITE_SWORD = registerItem("soulrite_sword", new SwordItem(ModToolMaterials.SOULRITE, new Item.Settings().fireproof().attributeModifiers(createAttributeModifiers(7f, 1.6f))));

         //Racknite
         RACKNITE_INGOT = registerItem("racknite_ingot", new Item(new Item.Settings().fireproof()));
         RACKNITE_RAW = registerItem("racknite_raw", new Item(new Item.Settings().fireproof()));

         RACKNITE_HELMET = registerItem("racknite_helmet", new ArmorItem(ModArmorMaterials.RACKNITE, ArmorItem.Type.HELMET, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(18))));
         RACKNITE_CHESTPLATE = registerItem("racknite_chestplate", new ArmorItem(ModArmorMaterials.RACKNITE, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(18))));
         RACKNITE_LEGGINGS = registerItem("racknite_leggings", new ArmorItem(ModArmorMaterials.RACKNITE, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(18))));
         RACKNITE_BOOTS = registerItem("racknite_boots", new ArmorItem(ModArmorMaterials.RACKNITE, ArmorItem.Type.BOOTS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(18))));

         RACKNITE_PICKAXE = registerItem("racknite_pickaxe", new PickaxeItem(ModToolMaterials.RACKNITE, new Item.Settings().fireproof().attributeModifiers(createAttributeModifiers(4f, 1.2f))));
         RACKNITE_SHOVEL = registerItem("racknite_shovel", new ShovelItem(ModToolMaterials.RACKNITE, new Item.Settings().fireproof().attributeModifiers(createAttributeModifiers(5f, 1f))));
         RACKNITE_AXE = registerItem("racknite_axe", new AxeItem(ModToolMaterials.RACKNITE, new Item.Settings().fireproof().attributeModifiers(createAttributeModifiers(9f, 0.9f))));
         RACKNITE_HOE = registerItem("racknite_hoe", new HoeItem(ModToolMaterials.RACKNITE, new Item.Settings().fireproof().attributeModifiers(createAttributeModifiers(1f, 3f))));
         RACKNITE_SWORD = registerItem("racknite_sword", new SwordItem(ModToolMaterials.RACKNITE, new Item.Settings().fireproof().attributeModifiers(createAttributeModifiers(6f, 1.6f))));

         //Enderite
         ENDERITE_INGOT = registerItem("enderite_ingot", new Item(new Item.Settings().fireproof()));
         ENDERITE_RAW = registerItem("enderite_raw", new Item(new Item.Settings().fireproof()));

         ENDERITE_HELMET = registerItem("enderite_helmet", new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.HELMET, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(30))));
         ENDERITE_CHESTPLATE = registerItem("enderite_chestplate", new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(30))));
         ENDERITE_LEGGINGS = registerItem("enderite_leggings", new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(30))));
         ENDERITE_BOOTS = registerItem("enderite_boots", new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.BOOTS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(30))));

         ENDERITE_PICKAXE = registerItem("enderite_pickaxe", new PickaxeItem(ModToolMaterials.ENDERITE, new Item.Settings().fireproof().attributeModifiers(createAttributeModifiers(5.5f, 1.2f))));
         ENDERITE_SHOVEL = registerItem("enderite_shovel", new ShovelItem(ModToolMaterials.ENDERITE, new Item.Settings().fireproof().attributeModifiers(createAttributeModifiers(6f, 1f))));
         ENDERITE_AXE = registerItem("enderite_axe", new AxeItem(ModToolMaterials.ENDERITE, new Item.Settings().fireproof().attributeModifiers(createAttributeModifiers(10f, 1f))));
         ENDERITE_HOE = registerItem("enderite_hoe", new HoeItem(ModToolMaterials.ENDERITE, new Item.Settings().fireproof().attributeModifiers(createAttributeModifiers(1f, 5f))));
         ENDERITE_SWORD = registerItem("enderite_sword", new SwordItem(ModToolMaterials.ENDERITE, new Item.Settings().fireproof().attributeModifiers(createAttributeModifiers(7.6f, 1.6f))));



    }
    private static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreOres.MODID, id), item);
    }

    public static AttributeModifiersComponent createAttributeModifiers(float baseAttackDamage, float attackSpeed) {
        return AttributeModifiersComponent.builder().add(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(Item.BASE_ATTACK_DAMAGE_MODIFIER_ID, (double)(baseAttackDamage -1), EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).add(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(Item.BASE_ATTACK_SPEED_MODIFIER_ID, (double)attackSpeed-4, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build();
    }
}
