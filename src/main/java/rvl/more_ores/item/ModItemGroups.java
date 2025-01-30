package rvl.more_ores.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import rvl.more_ores.MoreOres;
import rvl.more_ores.block.ModBlocks;

public class ModItemGroups {

    public static ItemGroup OVERWORLD_ORES;
    public static ItemGroup OTHERWORLD_ORES;
    public static ItemGroup MORE_ORES_EQUIPEMENT;


    public static void registerItemGroups() {
        OVERWORLD_ORES = Registry.register(Registries.ITEM_GROUP,new Identifier(MoreOres.MODID,"overworld_ores"), FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.overworld_ores")).icon(() -> new ItemStack(ModItems.ALUMINIUM_INGOT)).entries((displayContext, entries) -> {
                    //Aluminium
                    entries.add(ModItems.ALUMINIUM_INGOT);
                    entries.add(ModItems.ALUMINIUM_RAW);
                    
                    entries.add(ModBlocks.ALUMINIUM_BLOCK);
                    entries.add(ModBlocks.ALUMINIUM_ORE);
                    entries.add(ModBlocks.ALUMINIUM_ORE_BLOCK);
                    entries.add(ModBlocks.DEEPSLATE_ALUMINIUM_ORE);

                    //Tin
                    entries.add(ModItems.TIN_INGOT);
                    entries.add(ModItems.TIN_RAW);

                    entries.add(ModBlocks.TIN_BLOCK);
                    entries.add(ModBlocks.TIN_ORE);
                    entries.add(ModBlocks.TIN_ORE_BLOCK);
                    entries.add(ModBlocks.DEEPSLATE_TIN_ORE);

                    //BRONZE
                    entries.add(ModItems.BRONZE_INGOT);
                    entries.add(ModItems.BRONZE_ALLOY);

                    entries.add(ModBlocks.BRONZE_BLOCK);
                    entries.add(ModBlocks.ALLOY_BRONZE_BLOCK);

                    //STEEL
                    entries.add(ModItems.STEEL_INGOT);
                    entries.add(ModItems.STEEL_ALLOY);

                    entries.add(ModBlocks.STEEL_BLOCK);
                    entries.add(ModBlocks.ALLOY_STEEL_BLOCK);

                    //CHROME
                    entries.add(ModItems.CHROME_INGOT);
                    entries.add(ModItems.CHROME_RAW);

                    entries.add(ModBlocks.CHROME_BLOCK);
                    entries.add(ModBlocks.CHROME_ORE);
                    entries.add(ModBlocks.CHROME_ORE_BLOCK);
                    entries.add(ModBlocks.DEEPSLATE_CHROME_ORE);

                    //NIKEL
                    entries.add(ModItems.NICKEL_INGOT);
                    entries.add(ModItems.NICKEL_RAW);

                    entries.add(ModBlocks.NICKEL_BLOCK);
                    entries.add(ModBlocks.NICKEL_ORE);
                    entries.add(ModBlocks.NICKEL_ORE_BLOCK);
                    entries.add(ModBlocks.DEEPSLATE_NICKEL_ORE);

                    //PLOMB
                    entries.add(ModItems.PLOMB_INGOT);
                    entries.add(ModItems.PLOMB_RAW);

                    entries.add(ModBlocks.PLOMB_BLOCK);
                    entries.add(ModBlocks.PLOMB_ORE);
                    entries.add(ModBlocks.PLOMB_ORE_BLOCK);
                    entries.add(ModBlocks.DEEPSLATE_PLOMB_ORE);

                    //SILICON
                    entries.add(ModItems.SILICON_INGOT);
                    entries.add(ModItems.SILICON_RAW);

                    entries.add(ModBlocks.SILICON_BLOCK);
                    entries.add(ModBlocks.SILICON_ORE);
                    entries.add(ModBlocks.SILICON_ORE_BLOCK);
                    entries.add(ModBlocks.DEEPSLATE_SILICON_ORE);

                    //SILVER
                    entries.add(ModItems.SILVER_INGOT);
                    entries.add(ModItems.SILVER_RAW);

                    entries.add(ModBlocks.SILVER_BLOCK);
                    entries.add(ModBlocks.SILVER_ORE);
                    entries.add(ModBlocks.SILVER_ORE_BLOCK);
                    entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);

                    //TITANIUM
                    entries.add(ModItems.TITANIUM_INGOT);
                    entries.add(ModItems.TITANIUM_RAW);

                    entries.add(ModBlocks.TITANIUM_BLOCK);
                    entries.add(ModBlocks.TITANIUM_ORE);
                    entries.add(ModBlocks.TITANIUM_ORE_BLOCK);
                    entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);

                    //ZINC
                    entries.add(ModItems.ZINC_INGOT);
                    entries.add(ModItems.ZINC_RAW);

                    entries.add(ModBlocks.ZINC_BLOCK);
                    entries.add(ModBlocks.ZINC_ORE);
                    entries.add(ModBlocks.ZINC_ORE_BLOCK);
                    entries.add(ModBlocks.DEEPSLATE_ZINC_ORE);

                    //SALT
                    entries.add(ModItems.SODIUM_INGOT);
                    entries.add(ModItems.SALT);

                    entries.add(ModBlocks.SODIUM_BLOCK);
                    entries.add(ModBlocks.SALT_ORE);
                    entries.add(ModBlocks.SALT_BLOCK);
                    entries.add(ModBlocks.DEEPSLATE_SALT_ORE);

                    //LITHIUM
                    entries.add(ModItems.LITHIUM_INGOT);
                    entries.add(ModItems.LITHIUM_RAW);

                    entries.add(ModBlocks.LITHIUM_BLOCK);
                    entries.add(ModBlocks.LITHIUM_ORE);
                    entries.add(ModBlocks.LITHIUM_ORE_BLOCK);
                    entries.add(ModBlocks.DEEPSLATE_LITHIUM_ORE);

                    //ARSENIC
                    entries.add(ModItems.ARSENIC);
                    entries.add(ModBlocks.ARSENIC_BLOCK);
                    entries.add(ModBlocks.ARSENIC_ORE);
                    entries.add(ModBlocks.DEEPSLATE_ARSENIC_ORE);
                }).build());
        
        MORE_ORES_EQUIPEMENT = Registry.register(Registries.ITEM_GROUP, new Identifier(MoreOres.MODID,"more-ores_equipement"), FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.more-ores_equipement")).icon(() -> new ItemStack(ModItems.BRONZE_SWORD)).entries((displayContext, entries) -> {
                    //ALUMINIUM
                    entries.add(ModItems.ALUMINIUM_HELMET);
                    entries.add(ModItems.ALUMINIUM_CHESTPLATE);
                    entries.add(ModItems.ALUMINIUM_LEGGINGS);
                    entries.add(ModItems.ALUMINIUM_BOOTS);

                    entries.add(ModItems.ALUMINIUM_PICKAXE);
                    entries.add(ModItems.ALUMINIUM_SHOVEL);
                    entries.add(ModItems.ALUMINIUM_AXE);
                    entries.add(ModItems.ALUMINIUM_HOE);
                    entries.add(ModItems.ALUMINIUM_SWORD);

                    //Tin
                    entries.add(ModItems.TIN_HELMET);
                    entries.add(ModItems.TIN_CHESTPLATE);
                    entries.add(ModItems.TIN_LEGGINGS);
                    entries.add(ModItems.TIN_BOOTS);

                    entries.add(ModItems.TIN_PICKAXE);
                    entries.add(ModItems.TIN_SHOVEL);
                    entries.add(ModItems.TIN_AXE);
                    entries.add(ModItems.TIN_HOE);
                    entries.add(ModItems.TIN_SWORD);


                    //BRONZE
                    entries.add(ModItems.BRONZE_HELMET);
                    entries.add(ModItems.BRONZE_CHESTPLATE);
                    entries.add(ModItems.BRONZE_LEGGINGS);
                    entries.add(ModItems.BRONZE_BOOTS);

                    entries.add(ModItems.BRONZE_PICKAXE);
                    entries.add(ModItems.BRONZE_SHOVEL);
                    entries.add(ModItems.BRONZE_AXE);
                    entries.add(ModItems.BRONZE_HOE);
                    entries.add(ModItems.BRONZE_SWORD);


                    //STEEL
                    entries.add(ModItems.STEEL_HELMET);
                    entries.add(ModItems.STEEL_CHESTPLATE);
                    entries.add(ModItems.STEEL_LEGGINGS);
                    entries.add(ModItems.STEEL_BOOTS);

                    entries.add(ModItems.STEEL_PICKAXE);
                    entries.add(ModItems.STEEL_SHOVEL);
                    entries.add(ModItems.STEEL_AXE);
                    entries.add(ModItems.STEEL_HOE);
                    entries.add(ModItems.STEEL_SWORD);


                    //CHROME
                    entries.add(ModItems.CHROME_HELMET);
                    entries.add(ModItems.CHROME_CHESTPLATE);
                    entries.add(ModItems.CHROME_LEGGINGS);
                    entries.add(ModItems.CHROME_BOOTS);

                    entries.add(ModItems.CHROME_PICKAXE);
                    entries.add(ModItems.CHROME_SHOVEL);
                    entries.add(ModItems.CHROME_AXE);
                    entries.add(ModItems.CHROME_HOE);
                    entries.add(ModItems.CHROME_SWORD);


                    //NIKEL
                    entries.add(ModItems.NICKEL_HELMET);
                    entries.add(ModItems.NICKEL_CHESTPLATE);
                    entries.add(ModItems.NICKEL_LEGGINGS);
                    entries.add(ModItems.NICKEL_BOOTS);

                    entries.add(ModItems.NICKEL_PICKAXE);
                    entries.add(ModItems.NICKEL_SHOVEL);
                    entries.add(ModItems.NICKEL_AXE);
                    entries.add(ModItems.NICKEL_HOE);
                    entries.add(ModItems.NICKEL_SWORD);


                    //PLOMB
                    entries.add(ModItems.PLOMB_HELMET);
                    entries.add(ModItems.PLOMB_CHESTPLATE);
                    entries.add(ModItems.PLOMB_LEGGINGS);
                    entries.add(ModItems.PLOMB_BOOTS);

                    entries.add(ModItems.PLOMB_PICKAXE);
                    entries.add(ModItems.PLOMB_SHOVEL);
                    entries.add(ModItems.PLOMB_AXE);
                    entries.add(ModItems.PLOMB_HOE);
                    entries.add(ModItems.PLOMB_SWORD);


                    //SILVER
                    entries.add(ModItems.SILVER_HELMET);
                    entries.add(ModItems.SILVER_CHESTPLATE);
                    entries.add(ModItems.SILVER_LEGGINGS);
                    entries.add(ModItems.SILVER_BOOTS);

                    entries.add(ModItems.SILVER_PICKAXE);
                    entries.add(ModItems.SILVER_SHOVEL);
                    entries.add(ModItems.SILVER_AXE);
                    entries.add(ModItems.SILVER_HOE);
                    entries.add(ModItems.SILVER_SWORD);


                    //TITANIUM
                    entries.add(ModItems.TITANIUM_HELMET);
                    entries.add(ModItems.TITANIUM_CHESTPLATE);
                    entries.add(ModItems.TITANIUM_LEGGINGS);
                    entries.add(ModItems.TITANIUM_BOOTS);

                    entries.add(ModItems.TITANIUM_PICKAXE);
                    entries.add(ModItems.TITANIUM_SHOVEL);
                    entries.add(ModItems.TITANIUM_AXE);
                    entries.add(ModItems.TITANIUM_HOE);
                    entries.add(ModItems.TITANIUM_SWORD);


                    //ZINC
                    entries.add(ModItems.ZINC_HELMET);
                    entries.add(ModItems.ZINC_CHESTPLATE);
                    entries.add(ModItems.ZINC_LEGGINGS);
                    entries.add(ModItems.ZINC_BOOTS);

                    entries.add(ModItems.ZINC_PICKAXE);
                    entries.add(ModItems.ZINC_SHOVEL);
                    entries.add(ModItems.ZINC_AXE);
                    entries.add(ModItems.ZINC_HOE);
                    entries.add(ModItems.ZINC_SWORD);

                    //Volcanite
                    entries.add(ModItems.VOLCANITE_HELMET);
                    entries.add(ModItems.VOLCANITE_CHESTPLATE);
                    entries.add(ModItems.VOLCANITE_LEGGINGS);
                    entries.add(ModItems.VOLCANITE_BOOTS);

                    entries.add(ModItems.VOLCANITE_PICKAXE);
                    entries.add(ModItems.VOLCANITE_SHOVEL);
                    entries.add(ModItems.VOLCANITE_AXE);
                    entries.add(ModItems.VOLCANITE_HOE);
                    entries.add(ModItems.VOLCANITE_SWORD);

                    //Soulrite
                    entries.add(ModItems.SOULRITE_HELMET);
                    entries.add(ModItems.SOULRITE_CHESTPLATE);
                    entries.add(ModItems.SOULRITE_LEGGINGS);
                    entries.add(ModItems.SOULRITE_BOOTS);

                    entries.add(ModItems.SOULRITE_PICKAXE);
                    entries.add(ModItems.SOULRITE_SHOVEL);
                    entries.add(ModItems.SOULRITE_AXE);
                    entries.add(ModItems.SOULRITE_HOE);
                    entries.add(ModItems.SOULRITE_SWORD);

                    //Racknite
                    entries.add(ModItems.RACKNITE_HELMET);
                    entries.add(ModItems.RACKNITE_CHESTPLATE);
                    entries.add(ModItems.RACKNITE_LEGGINGS);
                    entries.add(ModItems.RACKNITE_BOOTS);

                    entries.add(ModItems.RACKNITE_PICKAXE);
                    entries.add(ModItems.RACKNITE_SHOVEL);
                    entries.add(ModItems.RACKNITE_AXE);
                    entries.add(ModItems.RACKNITE_HOE);
                    entries.add(ModItems.RACKNITE_SWORD);

                    //Enderite
                    entries.add(ModItems.ENDERITE_HELMET);
                    entries.add(ModItems.ENDERITE_CHESTPLATE);
                    entries.add(ModItems.ENDERITE_LEGGINGS);
                    entries.add(ModItems.ENDERITE_BOOTS);

                    entries.add(ModItems.ENDERITE_PICKAXE);
                    entries.add(ModItems.ENDERITE_SHOVEL);
                    entries.add(ModItems.ENDERITE_AXE);
                    entries.add(ModItems.ENDERITE_HOE);
                    entries.add(ModItems.ENDERITE_SWORD);
                }).build());
        OTHERWORLD_ORES = Registry.register(Registries.ITEM_GROUP, new Identifier(MoreOres.MODID,"otherworld_ores"), FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.otherworld_ores")).icon(() -> new ItemStack(Blocks.NETHERRACK)).entries((displayContext, entries) -> {
                    //Volcanite
                    entries.add(ModItems.VOLCANITE_INGOT);
                    entries.add(ModItems.VOLCANITE_RAW);

                    entries.add(ModBlocks.BASALT_VOLCANITE_ORE);
                    entries.add(ModBlocks.BLACKSTONE_VOLCANITE_ORE);
                    entries.add(ModBlocks.VOLCANITE_BLOCK);
                    entries.add(ModBlocks.VOLCANITE_ORE_BLOCK);

                    //Soulrite
                    entries.add(ModItems.SOULRITE_INGOT);
                    entries.add(ModItems.SOULRITE_RAW);

                    entries.add(ModBlocks.SOUL_SAND_SOULRITE_ORE);
                    entries.add(ModBlocks.SOUL_SOIL_SOULRITE_ORE);
                    entries.add(ModBlocks.SOULRITE_BLOCK);
                    entries.add(ModBlocks.SOULRITE_ORE_BLOCK);

                    //Racknite
                    entries.add(ModItems.RACKNITE_INGOT);
                    entries.add(ModItems.RACKNITE_RAW);

                    entries.add(ModBlocks.RACKNITE_ORE);
                    entries.add(ModBlocks.RACKNITE_BLOCK);
                    entries.add(ModBlocks.RACKNITE_ORE_BLOCK);

                    //Enderite
                    entries.add(ModItems.ENDERITE_INGOT);
                    entries.add(ModItems.ENDERITE_RAW);

                    entries.add(ModBlocks.ENDERITE_ORE);
                    entries.add(ModBlocks.ENDERITE_BLOCK);
                    entries.add(ModBlocks.ENDERITE_ORE_BLOCK);
                }).build());

    }
    
    
}
