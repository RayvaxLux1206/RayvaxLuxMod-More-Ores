package rvl.more_ores.item;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import rvl.more_ores.MoreOres;
import rvl.more_ores.block.ModBlocks;

public class ModItemGroups {

    public static CreativeModeTab OVERWORLD_ORES = FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALUMINIUM_INGOT)).title(Component.translatable("itemgroup.overworld_ores")).displayItems((parameters, entries) -> {
        //Aluminium
        entries.accept(ModItems.ALUMINIUM_INGOT);
        entries.accept(ModItems.ALUMINIUM_NUGGET);
        entries.accept(ModItems.ALUMINIUM_RAW);

        entries.accept(ModBlocks.ALUMINIUM_BLOCK);
        entries.accept(ModBlocks.ALUMINIUM_ORE);
        entries.accept(ModBlocks.ALUMINIUM_ORE_BLOCK);
        entries.accept(ModBlocks.DEEPSLATE_ALUMINIUM_ORE);

        //Tin
        entries.accept(ModItems.TIN_INGOT);
        entries.accept(ModItems.TIN_NUGGET);
        entries.accept(ModItems.TIN_RAW);

        entries.accept(ModBlocks.TIN_BLOCK);
        entries.accept(ModBlocks.TIN_ORE);
        entries.accept(ModBlocks.TIN_ORE_BLOCK);
        entries.accept(ModBlocks.DEEPSLATE_TIN_ORE);

        //BRONZE
        entries.accept(ModItems.BRONZE_INGOT);
        entries.accept(ModItems.BRONZE_NUGGET);
        entries.accept(ModItems.BRONZE_ALLOY);

        entries.accept(ModBlocks.BRONZE_BLOCK);
        entries.accept(ModBlocks.ALLOY_BRONZE_BLOCK);

        //STEEL
        entries.accept(ModItems.STEEL_INGOT);
        entries.accept(ModItems.STEEL_NUGGET);
        entries.accept(ModItems.STEEL_ALLOY);

        entries.accept(ModBlocks.STEEL_BLOCK);
        entries.accept(ModBlocks.ALLOY_STEEL_BLOCK);

        //Toxic BRONZE
        entries.accept(ModItems.TOXIC_BRONZE_INGOT);
        entries.accept(ModItems.TOXIC_BRONZE_NUGGET);
        entries.accept(ModItems.TOXIC_BRONZE_ALLOY);

        entries.accept(ModBlocks.TOXIC_BRONZE_BLOCK);
        entries.accept(ModBlocks.ALLOY_TOXIC_BRONZE_BLOCK);

        //CHROME
        entries.accept(ModItems.CHROME_INGOT);
        entries.accept(ModItems.CHROME_NUGGET);
        entries.accept(ModItems.CHROME_RAW);

        entries.accept(ModBlocks.CHROME_BLOCK);
        entries.accept(ModBlocks.CHROME_ORE);
        entries.accept(ModBlocks.CHROME_ORE_BLOCK);
        entries.accept(ModBlocks.DEEPSLATE_CHROME_ORE);

        //NIKEL
        entries.accept(ModItems.NICKEL_INGOT);
        entries.accept(ModItems.NICKEL_NUGGET);
        entries.accept(ModItems.NICKEL_RAW);

        entries.accept(ModBlocks.NICKEL_BLOCK);
        entries.accept(ModBlocks.NICKEL_ORE);
        entries.accept(ModBlocks.NICKEL_ORE_BLOCK);
        entries.accept(ModBlocks.DEEPSLATE_NICKEL_ORE);

        //PLOMB
        entries.accept(ModItems.PLOMB_INGOT);
        entries.accept(ModItems.PLOMB_NUGGET);
        entries.accept(ModItems.PLOMB_RAW);

        entries.accept(ModBlocks.PLOMB_BLOCK);
        entries.accept(ModBlocks.PLOMB_ORE);
        entries.accept(ModBlocks.PLOMB_ORE_BLOCK);
        entries.accept(ModBlocks.DEEPSLATE_PLOMB_ORE);

        //SILICON
        entries.accept(ModItems.SILICON_INGOT);
        entries.accept(ModItems.SILICON_NUGGET);
        entries.accept(ModItems.SILICON_RAW);

        entries.accept(ModBlocks.SILICON_BLOCK);
        entries.accept(ModBlocks.SILICON_ORE);
        entries.accept(ModBlocks.SILICON_ORE_BLOCK);
        entries.accept(ModBlocks.DEEPSLATE_SILICON_ORE);

        //SILVER
        entries.accept(ModItems.SILVER_INGOT);
        entries.accept(ModItems.SILVER_NUGGET);
        entries.accept(ModItems.SILVER_RAW);

        entries.accept(ModBlocks.SILVER_BLOCK);
        entries.accept(ModBlocks.SILVER_ORE);
        entries.accept(ModBlocks.SILVER_ORE_BLOCK);
        entries.accept(ModBlocks.DEEPSLATE_SILVER_ORE);

        //TITANIUM
        entries.accept(ModItems.TITANIUM_INGOT);
        entries.accept(ModItems.TITANIUM_NUGGET);
        entries.accept(ModItems.TITANIUM_RAW);

        entries.accept(ModBlocks.TITANIUM_BLOCK);
        entries.accept(ModBlocks.TITANIUM_ORE);
        entries.accept(ModBlocks.TITANIUM_ORE_BLOCK);
        entries.accept(ModBlocks.DEEPSLATE_TITANIUM_ORE);

        //ZINC
        entries.accept(ModItems.ZINC_INGOT);
        entries.accept(ModItems.ZINC_NUGGET);
        entries.accept(ModItems.ZINC_RAW);

        entries.accept(ModBlocks.ZINC_BLOCK);
        entries.accept(ModBlocks.ZINC_ORE);
        entries.accept(ModBlocks.ZINC_ORE_BLOCK);
        entries.accept(ModBlocks.DEEPSLATE_ZINC_ORE);

        //SALT
        entries.accept(ModItems.SODIUM_INGOT);
        entries.accept(ModItems.SODIUM_NUGGET);
        entries.accept(ModItems.SALT);

        entries.accept(ModBlocks.SODIUM_BLOCK);
        entries.accept(ModBlocks.SALT_ORE);
        entries.accept(ModBlocks.SALT_BLOCK);
        entries.accept(ModBlocks.DEEPSLATE_SALT_ORE);

        //LITHIUM
        entries.accept(ModItems.LITHIUM_INGOT);
        entries.accept(ModItems.LITHIUM_NUGGET);
        entries.accept(ModItems.LITHIUM_RAW);

        entries.accept(ModBlocks.LITHIUM_BLOCK);
        entries.accept(ModBlocks.LITHIUM_ORE);
        entries.accept(ModBlocks.LITHIUM_ORE_BLOCK);
        entries.accept(ModBlocks.DEEPSLATE_LITHIUM_ORE);

        //ARSENIC
        entries.accept(ModItems.ARSENIC);
        entries.accept(ModBlocks.ARSENIC_BLOCK);
        entries.accept(ModBlocks.ARSENIC_ORE);
        entries.accept(ModBlocks.DEEPSLATE_ARSENIC_ORE);
    }).build();

    public static CreativeModeTab MORE_ORES_EQUIPMENT = FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRONZE_SWORD)).title(Component.translatable("itemgroup.more-ores_equipement")).displayItems((parameters, entries) -> {
        //ALUMINIUM
        entries.accept(ModItems.ALUMINIUM_HELMET);
        entries.accept(ModItems.ALUMINIUM_CHESTPLATE);
        entries.accept(ModItems.ALUMINIUM_LEGGINGS);
        entries.accept(ModItems.ALUMINIUM_BOOTS);

        entries.accept(ModItems.ALUMINIUM_PICKAXE);
        entries.accept(ModItems.ALUMINIUM_SHOVEL);
        entries.accept(ModItems.ALUMINIUM_AXE);
        entries.accept(ModItems.ALUMINIUM_HOE);
        entries.accept(ModItems.ALUMINIUM_SWORD);

        //Tin
        entries.accept(ModItems.TIN_HELMET);
        entries.accept(ModItems.TIN_CHESTPLATE);
        entries.accept(ModItems.TIN_LEGGINGS);
        entries.accept(ModItems.TIN_BOOTS);

        entries.accept(ModItems.TIN_PICKAXE);
        entries.accept(ModItems.TIN_SHOVEL);
        entries.accept(ModItems.TIN_AXE);
        entries.accept(ModItems.TIN_HOE);
        entries.accept(ModItems.TIN_SWORD);


        //BRONZE
        entries.accept(ModItems.BRONZE_HELMET);
        entries.accept(ModItems.BRONZE_CHESTPLATE);
        entries.accept(ModItems.BRONZE_LEGGINGS);
        entries.accept(ModItems.BRONZE_BOOTS);

        entries.accept(ModItems.BRONZE_PICKAXE);
        entries.accept(ModItems.BRONZE_SHOVEL);
        entries.accept(ModItems.BRONZE_AXE);
        entries.accept(ModItems.BRONZE_HOE);
        entries.accept(ModItems.BRONZE_SWORD);


        //STEEL
        entries.accept(ModItems.STEEL_HELMET);
        entries.accept(ModItems.STEEL_CHESTPLATE);
        entries.accept(ModItems.STEEL_LEGGINGS);
        entries.accept(ModItems.STEEL_BOOTS);

        entries.accept(ModItems.STEEL_PICKAXE);
        entries.accept(ModItems.STEEL_SHOVEL);
        entries.accept(ModItems.STEEL_AXE);
        entries.accept(ModItems.STEEL_HOE);
        entries.accept(ModItems.STEEL_SWORD);


        //Toxic BRONZE
        entries.accept(ModItems.TOXIC_BRONZE_HELMET);
        entries.accept(ModItems.TOXIC_BRONZE_CHESTPLATE);
        entries.accept(ModItems.TOXIC_BRONZE_LEGGINGS);
        entries.accept(ModItems.TOXIC_BRONZE_BOOTS);

        entries.accept(ModItems.TOXIC_BRONZE_PICKAXE);
        entries.accept(ModItems.TOXIC_BRONZE_SHOVEL);
        entries.accept(ModItems.TOXIC_BRONZE_AXE);
        entries.accept(ModItems.TOXIC_BRONZE_HOE);
        entries.accept(ModItems.TOXIC_BRONZE_SWORD);


        //CHROME
        entries.accept(ModItems.CHROME_HELMET);
        entries.accept(ModItems.CHROME_CHESTPLATE);
        entries.accept(ModItems.CHROME_LEGGINGS);
        entries.accept(ModItems.CHROME_BOOTS);

        entries.accept(ModItems.CHROME_PICKAXE);
        entries.accept(ModItems.CHROME_SHOVEL);
        entries.accept(ModItems.CHROME_AXE);
        entries.accept(ModItems.CHROME_HOE);
        entries.accept(ModItems.CHROME_SWORD);


        //NIKEL
        entries.accept(ModItems.NICKEL_HELMET);
        entries.accept(ModItems.NICKEL_CHESTPLATE);
        entries.accept(ModItems.NICKEL_LEGGINGS);
        entries.accept(ModItems.NICKEL_BOOTS);

        entries.accept(ModItems.NICKEL_PICKAXE);
        entries.accept(ModItems.NICKEL_SHOVEL);
        entries.accept(ModItems.NICKEL_AXE);
        entries.accept(ModItems.NICKEL_HOE);
        entries.accept(ModItems.NICKEL_SWORD);


        //PLOMB
        entries.accept(ModItems.PLOMB_HELMET);
        entries.accept(ModItems.PLOMB_CHESTPLATE);
        entries.accept(ModItems.PLOMB_LEGGINGS);
        entries.accept(ModItems.PLOMB_BOOTS);

        entries.accept(ModItems.PLOMB_PICKAXE);
        entries.accept(ModItems.PLOMB_SHOVEL);
        entries.accept(ModItems.PLOMB_AXE);
        entries.accept(ModItems.PLOMB_HOE);
        entries.accept(ModItems.PLOMB_SWORD);


        //SILVER
        entries.accept(ModItems.SILVER_HELMET);
        entries.accept(ModItems.SILVER_CHESTPLATE);
        entries.accept(ModItems.SILVER_LEGGINGS);
        entries.accept(ModItems.SILVER_BOOTS);

        entries.accept(ModItems.SILVER_PICKAXE);
        entries.accept(ModItems.SILVER_SHOVEL);
        entries.accept(ModItems.SILVER_AXE);
        entries.accept(ModItems.SILVER_HOE);
        entries.accept(ModItems.SILVER_SWORD);


        //TITANIUM
        entries.accept(ModItems.TITANIUM_HELMET);
        entries.accept(ModItems.TITANIUM_CHESTPLATE);
        entries.accept(ModItems.TITANIUM_LEGGINGS);
        entries.accept(ModItems.TITANIUM_BOOTS);

        entries.accept(ModItems.TITANIUM_PICKAXE);
        entries.accept(ModItems.TITANIUM_SHOVEL);
        entries.accept(ModItems.TITANIUM_AXE);
        entries.accept(ModItems.TITANIUM_HOE);
        entries.accept(ModItems.TITANIUM_SWORD);


        //ZINC
        entries.accept(ModItems.ZINC_HELMET);
        entries.accept(ModItems.ZINC_CHESTPLATE);
        entries.accept(ModItems.ZINC_LEGGINGS);
        entries.accept(ModItems.ZINC_BOOTS);

        entries.accept(ModItems.ZINC_PICKAXE);
        entries.accept(ModItems.ZINC_SHOVEL);
        entries.accept(ModItems.ZINC_AXE);
        entries.accept(ModItems.ZINC_HOE);
        entries.accept(ModItems.ZINC_SWORD);

        //Volcanite
        entries.accept(ModItems.VOLCANITE_HELMET);
        entries.accept(ModItems.VOLCANITE_CHESTPLATE);
        entries.accept(ModItems.VOLCANITE_LEGGINGS);
        entries.accept(ModItems.VOLCANITE_BOOTS);

        entries.accept(ModItems.VOLCANITE_PICKAXE);
        entries.accept(ModItems.VOLCANITE_SHOVEL);
        entries.accept(ModItems.VOLCANITE_AXE);
        entries.accept(ModItems.VOLCANITE_HOE);
        entries.accept(ModItems.VOLCANITE_SWORD);

        //Soulrite
        entries.accept(ModItems.SOULRITE_HELMET);
        entries.accept(ModItems.SOULRITE_CHESTPLATE);
        entries.accept(ModItems.SOULRITE_LEGGINGS);
        entries.accept(ModItems.SOULRITE_BOOTS);

        entries.accept(ModItems.SOULRITE_PICKAXE);
        entries.accept(ModItems.SOULRITE_SHOVEL);
        entries.accept(ModItems.SOULRITE_AXE);
        entries.accept(ModItems.SOULRITE_HOE);
        entries.accept(ModItems.SOULRITE_SWORD);

        //Racknite
        entries.accept(ModItems.RACKNITE_HELMET);
        entries.accept(ModItems.RACKNITE_CHESTPLATE);
        entries.accept(ModItems.RACKNITE_LEGGINGS);
        entries.accept(ModItems.RACKNITE_BOOTS);

        entries.accept(ModItems.RACKNITE_PICKAXE);
        entries.accept(ModItems.RACKNITE_SHOVEL);
        entries.accept(ModItems.RACKNITE_AXE);
        entries.accept(ModItems.RACKNITE_HOE);
        entries.accept(ModItems.RACKNITE_SWORD);

        //Enderite
        entries.accept(ModItems.ENDERITE_HELMET);
        entries.accept(ModItems.ENDERITE_CHESTPLATE);
        entries.accept(ModItems.ENDERITE_LEGGINGS);
        entries.accept(ModItems.ENDERITE_BOOTS);

        entries.accept(ModItems.ENDERITE_PICKAXE);
        entries.accept(ModItems.ENDERITE_SHOVEL);
        entries.accept(ModItems.ENDERITE_AXE);
        entries.accept(ModItems.ENDERITE_HOE);
        entries.accept(ModItems.ENDERITE_SWORD);

        //Spears
        entries.accept(ModItems.ALUMINIUM_SPEAR);
        entries.accept(ModItems.TIN_SPEAR);
        entries.accept(ModItems.BRONZE_SPEAR);
        entries.accept(ModItems.TOXIC_BRONZE_SPEAR);
        entries.accept(ModItems.STEEL_SPEAR);
        entries.accept(ModItems.CHROME_SPEAR);
        entries.accept(ModItems.NICKEL_SPEAR);
        entries.accept(ModItems.PLOMB_SPEAR);
        entries.accept(ModItems.SILVER_SPEAR);
        entries.accept(ModItems.TITANIUM_SPEAR);
        entries.accept(ModItems.ZINC_SPEAR);
        entries.accept(ModItems.VOLCANITE_SPEAR);
        entries.accept(ModItems.SOULRITE_SPEAR);
        entries.accept(ModItems.RACKNITE_SPEAR);
        entries.accept(ModItems.ENDERITE_SPEAR);

        //horses Armors
        entries.accept(ModItems.ALUMINIUM_HORSE_ARMOR);
        entries.accept(ModItems.TIN_HORSE_ARMOR);
        entries.accept(ModItems.BRONZE_HORSE_ARMOR);
        entries.accept(ModItems.TOXIC_BRONZE_HORSE_ARMOR);
        entries.accept(ModItems.STEEL_HORSE_ARMOR);
        entries.accept(ModItems.CHROME_HORSE_ARMOR);
        entries.accept(ModItems.NICKEL_HORSE_ARMOR);
        entries.accept(ModItems.PLOMB_HORSE_ARMOR);
        entries.accept(ModItems.SILVER_HORSE_ARMOR);
        entries.accept(ModItems.TITANIUM_HORSE_ARMOR);
        entries.accept(ModItems.ZINC_HORSE_ARMOR);
        entries.accept(ModItems.VOLCANITE_HORSE_ARMOR);
        entries.accept(ModItems.SOULRITE_HORSE_ARMOR);
        entries.accept(ModItems.RACKNITE_HORSE_ARMOR);
        entries.accept(ModItems.ENDERITE_HORSE_ARMOR);

        //Nautilus Armors
        entries.accept(ModItems.ALUMINIUM_NAUTILUS_ARMOR);
        entries.accept(ModItems.TIN_NAUTILUS_ARMOR);
        entries.accept(ModItems.BRONZE_NAUTILUS_ARMOR);
        entries.accept(ModItems.TOXIC_BRONZE_NAUTILUS_ARMOR);
        entries.accept(ModItems.STEEL_NAUTILUS_ARMOR);
        entries.accept(ModItems.CHROME_NAUTILUS_ARMOR);
        entries.accept(ModItems.NICKEL_NAUTILUS_ARMOR);
        entries.accept(ModItems.PLOMB_NAUTILUS_ARMOR);
        entries.accept(ModItems.SILVER_NAUTILUS_ARMOR);
        entries.accept(ModItems.TITANIUM_NAUTILUS_ARMOR);
        entries.accept(ModItems.ZINC_NAUTILUS_ARMOR);
        entries.accept(ModItems.VOLCANITE_NAUTILUS_ARMOR);
        entries.accept(ModItems.SOULRITE_NAUTILUS_ARMOR);
        entries.accept(ModItems.RACKNITE_NAUTILUS_ARMOR);
        entries.accept(ModItems.ENDERITE_NAUTILUS_ARMOR);
    }).build();

    public static CreativeModeTab OTHERWORLD_ORES = FabricCreativeModeTab.builder().icon(() -> new ItemStack(Items.NETHERRACK)).title(Component.translatable("itemgroup.otherworld_ores")).displayItems((parameters, entries) -> {
        //Volcanite
        entries.accept(ModItems.VOLCANITE_INGOT);
        entries.accept(ModItems.VOLCANITE_NUGGET);
        entries.accept(ModItems.VOLCANITE_RAW);

        entries.accept(ModBlocks.BASALT_VOLCANITE_ORE);
        entries.accept(ModBlocks.BLACKSTONE_VOLCANITE_ORE);
        entries.accept(ModBlocks.VOLCANITE_BLOCK);
        entries.accept(ModBlocks.VOLCANITE_ORE_BLOCK);

        //Soulrite
        entries.accept(ModItems.SOULRITE_INGOT);
        entries.accept(ModItems.SOULRITE_NUGGET);
        entries.accept(ModItems.SOULRITE_RAW);

        entries.accept(ModBlocks.SOUL_SAND_SOULRITE_ORE);
        entries.accept(ModBlocks.SOUL_SOIL_SOULRITE_ORE);
        entries.accept(ModBlocks.SOULRITE_BLOCK);
        entries.accept(ModBlocks.SOULRITE_ORE_BLOCK);

        //Racknite
        entries.accept(ModItems.RACKNITE_INGOT);
        entries.accept(ModItems.RACKNITE_NUGGET);
        entries.accept(ModItems.RACKNITE_RAW);

        entries.accept(ModBlocks.RACKNITE_ORE);
        entries.accept(ModBlocks.RACKNITE_BLOCK);
        entries.accept(ModBlocks.RACKNITE_ORE_BLOCK);

        //Enderite
        entries.accept(ModItems.ENDERITE_INGOT);
        entries.accept(ModItems.ENDERITE_NUGGET);
        entries.accept(ModItems.ENDERITE_RAW);

        entries.accept(ModBlocks.ENDERITE_ORE);
        entries.accept(ModBlocks.ENDERITE_BLOCK);
        entries.accept(ModBlocks.ENDERITE_ORE_BLOCK);
    }).build();

    public static final ResourceKey<CreativeModeTab> OVERWORLD_ORES_KEY = createKey("overworld_ores");
    public static final ResourceKey<CreativeModeTab> OTHERWORLD_ORES_KEY = createKey("otherworld_ores");
    public static final ResourceKey<CreativeModeTab> MORE_ORES_EQUIPEMENT_KEY = createKey("more_ores_equipment");

    private static ResourceKey<CreativeModeTab> createKey(final String id) {
        return ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), MoreOres.id(id));
    }


    public static void registerItemGroups() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, OVERWORLD_ORES_KEY, OVERWORLD_ORES);
        
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, OTHERWORLD_ORES_KEY, OTHERWORLD_ORES);

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, MORE_ORES_EQUIPEMENT_KEY, MORE_ORES_EQUIPMENT);


    }
    
    
}
