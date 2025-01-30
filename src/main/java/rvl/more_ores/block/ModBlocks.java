package rvl.more_ores.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import rvl.more_ores.MoreOres;

public class ModBlocks {
    
    public static Block ALUMINIUM_BLOCK;
    public static Block ALUMINIUM_ORE;
    public static Block ALUMINIUM_ORE_BLOCK;
    public static Block DEEPSLATE_ALUMINIUM_ORE;

    public static Block TIN_BLOCK;
    public static Block TIN_ORE;
    public static Block TIN_ORE_BLOCK;
    public static Block DEEPSLATE_TIN_ORE;

    public static Block BRONZE_BLOCK;
    public static Block ALLOY_BRONZE_BLOCK;
    public static Block STEEL_BLOCK;
    public static Block ALLOY_STEEL_BLOCK;

    public static Block CHROME_BLOCK;
    public static Block CHROME_ORE;
    public static Block CHROME_ORE_BLOCK;
    public static Block DEEPSLATE_CHROME_ORE;

    public static Block NICKEL_BLOCK;
    public static Block NICKEL_ORE;
    public static Block NICKEL_ORE_BLOCK;
    public static Block DEEPSLATE_NICKEL_ORE;

    public static Block PLOMB_BLOCK;
    public static Block PLOMB_ORE;
    public static Block PLOMB_ORE_BLOCK;
    public static Block DEEPSLATE_PLOMB_ORE;


    public static Block SILICON_BLOCK;
    public static Block SILICON_ORE;
    public static Block SILICON_ORE_BLOCK;
    public static Block DEEPSLATE_SILICON_ORE;

    public static Block SILVER_BLOCK;
    public static Block SILVER_ORE;
    public static Block SILVER_ORE_BLOCK;
    public static Block DEEPSLATE_SILVER_ORE;

    public static Block TITANIUM_BLOCK;
    public static Block TITANIUM_ORE;
    public static Block TITANIUM_ORE_BLOCK;
    public static Block DEEPSLATE_TITANIUM_ORE;

    public static Block ZINC_BLOCK;
    public static Block ZINC_ORE;
    public static Block ZINC_ORE_BLOCK;
    public static Block DEEPSLATE_ZINC_ORE;

    public static Block SODIUM_BLOCK;
    public static Block SALT_ORE;
    public static Block SALT_BLOCK;
    public static Block DEEPSLATE_SALT_ORE;

    public static Block LITHIUM_BLOCK;
    public static Block LITHIUM_ORE;
    public static Block LITHIUM_ORE_BLOCK;
    public static Block DEEPSLATE_LITHIUM_ORE;

    public static Block ARSENIC_BLOCK;
    public static Block ARSENIC_ORE;
    public static Block DEEPSLATE_ARSENIC_ORE;
    
    public static Block BASALT_VOLCANITE_ORE;
    public static Block BLACKSTONE_VOLCANITE_ORE;
    public static Block VOLCANITE_ORE_BLOCK;
    public static Block VOLCANITE_BLOCK;

    public static Block SOUL_SAND_SOULRITE_ORE;
    public static Block SOUL_SOIL_SOULRITE_ORE;
    public static Block SOULRITE_ORE_BLOCK;
    public static Block SOULRITE_BLOCK;
    
    public static Block RACKNITE_ORE;
    public static Block RACKNITE_ORE_BLOCK;
    public static Block RACKNITE_BLOCK;

    public static Block ENDERITE_ORE;
    public static Block ENDERITE_ORE_BLOCK;
    public static Block ENDERITE_BLOCK;




     public static void registerModBlocks() {
         DEEPSLATE_ALUMINIUM_ORE = registerBlocks("deepslate_aluminium_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         ALUMINIUM_ORE = registerBlocks("aluminium_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         ALUMINIUM_BLOCK = registerBlocks("aluminium_block",
                new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));
         ALUMINIUM_ORE_BLOCK = registerBlocks("aluminium_ore_block",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(4.0f).requiresTool()));

        //Tin Blocks
         DEEPSLATE_TIN_ORE = registerBlocks("deepslate_tin_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         TIN_ORE = registerBlocks("tin_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         TIN_BLOCK = registerBlocks("tin_block",
                new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));
         TIN_ORE_BLOCK = registerBlocks("tin_ore_block",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(4.0f).requiresTool()));

        //Alloy Blocks -Bronze -Copper
         BRONZE_BLOCK = registerBlocks("bronze_block",
                new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));
         ALLOY_BRONZE_BLOCK = registerBlocks("alloy_bronze_block",
                new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

         STEEL_BLOCK = registerBlocks("steel_block",
                new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));
         ALLOY_STEEL_BLOCK = registerBlocks("alloy_steel_block",
                new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

        //Chrome Blocks
         DEEPSLATE_CHROME_ORE = registerBlocks("deepslate_chrome_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         CHROME_ORE = registerBlocks("chrome_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         CHROME_BLOCK = registerBlocks("chrome_block",
                new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

         CHROME_ORE_BLOCK = registerBlocks("chrome_ore_block",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(4.0f).requiresTool()));

        //Nikel Blocks
         DEEPSLATE_NICKEL_ORE = registerBlocks("deepslate_nickel_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         NICKEL_ORE = registerBlocks("nickel_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         NICKEL_BLOCK = registerBlocks("nickel_block",
                new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));
         NICKEL_ORE_BLOCK = registerBlocks("nickel_ore_block",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(4.0f).requiresTool()));

        //Plomb Blocks
         DEEPSLATE_PLOMB_ORE = registerBlocks("deepslate_plomb_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         PLOMB_ORE = registerBlocks("plomb_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         PLOMB_BLOCK = registerBlocks("plomb_block",
                new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

         PLOMB_ORE_BLOCK = registerBlocks("plomb_ore_block",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(4.0f).requiresTool()));

        //Silicon Blocks
         DEEPSLATE_SILICON_ORE = registerBlocks("deepslate_silicon_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         SILICON_ORE = registerBlocks("silicon_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         SILICON_BLOCK = registerBlocks("silicon_block",
                new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

         SILICON_ORE_BLOCK = registerBlocks("silicon_ore_block",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(4.0f).requiresTool()));

        //Silver Blocks
         DEEPSLATE_SILVER_ORE = registerBlocks("deepslate_silver_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         SILVER_ORE = registerBlocks("silver_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         SILVER_BLOCK = registerBlocks("silver_block",
                new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

         SILVER_ORE_BLOCK = registerBlocks("silver_ore_block",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(4.0f).requiresTool()));

        //Titanium Blocks
         DEEPSLATE_TITANIUM_ORE = registerBlocks("deepslate_titanium_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         TITANIUM_ORE = registerBlocks("titanium_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         TITANIUM_BLOCK = registerBlocks("titanium_block",
                new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

         TITANIUM_ORE_BLOCK = registerBlocks("titanium_ore_block",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(4.0f).requiresTool()));

        //Zinc Blocks
         DEEPSLATE_ZINC_ORE = registerBlocks("deepslate_zinc_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         ZINC_ORE = registerBlocks("zinc_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         ZINC_BLOCK = registerBlocks("zinc_block",
                new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

         ZINC_ORE_BLOCK = registerBlocks("zinc_ore_block",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(4.0f).requiresTool()));

        //Other Ores
         DEEPSLATE_SALT_ORE = registerBlocks("deepslate_salt_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         SALT_ORE = registerBlocks("salt_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         SALT_BLOCK = registerBlocks("salt_block",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(4.0f).requiresTool()));
         SODIUM_BLOCK = registerBlocks("sodium_block",
                new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));


         DEEPSLATE_ARSENIC_ORE = registerBlocks("deepslate_arsenic_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         ARSENIC_ORE = registerBlocks("arsenic_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         ARSENIC_BLOCK = registerBlocks("arsenic_block",
                new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));


         DEEPSLATE_LITHIUM_ORE = registerBlocks("deepslate_lithium_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         LITHIUM_ORE = registerBlocks("lithium_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(2.0f).requiresTool()));
         LITHIUM_ORE_BLOCK = registerBlocks("lithium_ore_block",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(4.0f).requiresTool()));
         LITHIUM_BLOCK = registerBlocks("lithium_block",
                new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

         //Volcanite
         BLACKSTONE_VOLCANITE_ORE = registerBlocks("blackstone_volcanite_ore",
                 new ExperienceDroppingBlock(UniformIntProvider.create(2,4), AbstractBlock.Settings.copy(Blocks.BASALT).strength(2.0f).requiresTool()));
         BASALT_VOLCANITE_ORE = registerBlocks("basalt_volcanite_ore",
                 new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.BLACKSTONE).strength(2.0f).requiresTool()));
         VOLCANITE_ORE_BLOCK = registerBlocks("volcanite_ore_block",
                 new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(4.0f).requiresTool()));
         VOLCANITE_BLOCK = registerBlocks("volcanite_block",
                 new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

         //Soulrite
         SOUL_SAND_SOULRITE_ORE = registerBlocks("soul_sand_soulrite_ore",
                 new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.SOUL_SAND).strength(2.0f).requiresTool()));
         SOUL_SOIL_SOULRITE_ORE = registerBlocks("soul_soil_soulrite_ore",
                 new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.SOUL_SOIL).strength(2.0f).requiresTool()));
         SOULRITE_ORE_BLOCK = registerBlocks("soulrite_ore_block",
                 new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(4.0f).requiresTool()));
         SOULRITE_BLOCK = registerBlocks("soulrite_block",
                 new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

         //Racknite
         RACKNITE_ORE = registerBlocks("racknite_ore",
                 new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.NETHERRACK).strength(2.0f).requiresTool()));
         RACKNITE_ORE_BLOCK = registerBlocks("racknite_ore_block",
                 new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(4.0f).requiresTool()));
         RACKNITE_BLOCK = registerBlocks("racknite_block",
                 new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

         //Enderite
         ENDERITE_ORE = registerBlocks("enderite_ore",
                 new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.END_STONE).strength(2.0f).requiresTool()));
         ENDERITE_ORE_BLOCK = registerBlocks("enderite_ore_block",
                 new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(4.0f).requiresTool()));
         ENDERITE_BLOCK = registerBlocks("enderite_block",
                 new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));
    }
    private static Block registerBlocks(String name, Block block) {
        Registry.register(Registries.BLOCK, Identifier.of(MoreOres.MODID, name),block);
        return Registry.register(Registries.ITEM, Identifier.of(MoreOres.MODID, name),
                new BlockItem(block, new Item.Settings())).getBlock();
    }
}
