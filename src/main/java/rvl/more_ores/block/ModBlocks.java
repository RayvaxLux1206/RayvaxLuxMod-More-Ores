package rvl.more_ores.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import rvl.more_ores.MoreOres;
import rvl.more_ores.item.ModItems;

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
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.DEEPSLATE, 2f, "deepslate_aluminium_ore")));
         ALUMINIUM_ORE = registerBlocks("aluminium_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.STONE, 2f, "aluminium_ore")));
         ALUMINIUM_BLOCK = registerBlocks("aluminium_block",
                new Block(mineableSetting(Blocks.IRON_BLOCK, 4f, "aluminium_block")));
         ALUMINIUM_ORE_BLOCK = registerBlocks("aluminium_ore_block",
                new Block(mineableSetting(Blocks.STONE, 4f, "aluminium_ore_block")));

        //Tin Blocks
         DEEPSLATE_TIN_ORE = registerBlocks("deepslate_tin_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.DEEPSLATE, 2f, "deepslate_tin_ore")));
         TIN_ORE = registerBlocks("tin_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.STONE, 2f, "tin_ore")));
         TIN_BLOCK = registerBlocks("tin_block",
                new Block(mineableSetting(Blocks.IRON_BLOCK, 4f, "tin_block")));
         TIN_ORE_BLOCK = registerBlocks("tin_ore_block",
                new Block(mineableSetting(Blocks.STONE, 4f, "tin_ore_block")));

        //Alloy Blocks -Bronze -Copper
         BRONZE_BLOCK = registerBlocks("bronze_block",
                new Block(mineableSetting(Blocks.IRON_BLOCK, 4f, "bronze_block")));
         ALLOY_BRONZE_BLOCK = registerBlocks("alloy_bronze_block",
                new Block(mineableSetting(Blocks.IRON_BLOCK, 4f, "alloy_bronze_block")));

         STEEL_BLOCK = registerBlocks("steel_block",
                new Block(mineableSetting(Blocks.IRON_BLOCK, 4f, "steel_block")));
         ALLOY_STEEL_BLOCK = registerBlocks("alloy_steel_block",
                new Block(mineableSetting(Blocks.IRON_BLOCK, 4f, "alloy_steel_block")));

        //Chrome Blocks
         DEEPSLATE_CHROME_ORE = registerBlocks("deepslate_chrome_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.DEEPSLATE, 2f, "deepslate_chrome_ore")));
         CHROME_ORE = registerBlocks("chrome_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.STONE, 2f, "chrome_ore")));
         CHROME_BLOCK = registerBlocks("chrome_block",
                new Block(mineableSetting(Blocks.IRON_BLOCK, 4f, "chrome_block")));

         CHROME_ORE_BLOCK = registerBlocks("chrome_ore_block",
                new Block(mineableSetting(Blocks.STONE, 4f, "chrome_ore_block")));

        //Nikel Blocks
         DEEPSLATE_NICKEL_ORE = registerBlocks("deepslate_nickel_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.DEEPSLATE, 2f, "deepslate_nickel_ore")));
         NICKEL_ORE = registerBlocks("nickel_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.STONE, 2f, "nickel_ore")));
         NICKEL_BLOCK = registerBlocks("nickel_block",
                new Block(mineableSetting(Blocks.IRON_BLOCK, 4f, "nickel_block")));
         NICKEL_ORE_BLOCK = registerBlocks("nickel_ore_block",
                new Block(mineableSetting(Blocks.STONE, 4f, "nickel_ore_block")));

        //Plomb Blocks
         DEEPSLATE_PLOMB_ORE = registerBlocks("deepslate_plomb_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.DEEPSLATE, 2f, "deepslate_plomb_ore")));
         PLOMB_ORE = registerBlocks("plomb_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.STONE, 2f, "plomb_ore")));
         PLOMB_BLOCK = registerBlocks("plomb_block",
                new Block(mineableSetting(Blocks.IRON_BLOCK, 4f, "plomb_block")));

         PLOMB_ORE_BLOCK = registerBlocks("plomb_ore_block",
                new Block(mineableSetting(Blocks.STONE, 4f, "plomb_ore_block")));

        //Silicon Blocks
         DEEPSLATE_SILICON_ORE = registerBlocks("deepslate_silicon_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.DEEPSLATE, 2f, "deepslate_silicon_ore")));
         SILICON_ORE = registerBlocks("silicon_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.STONE, 2f, "silicon_ore")));
         SILICON_BLOCK = registerBlocks("silicon_block",
                new Block(mineableSetting(Blocks.IRON_BLOCK, 4f, "silicon_block")));

         SILICON_ORE_BLOCK = registerBlocks("silicon_ore_block",
                new Block(mineableSetting(Blocks.STONE, 4f, "silicon_ore_block")));

        //Silver Blocks
         DEEPSLATE_SILVER_ORE = registerBlocks("deepslate_silver_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.DEEPSLATE, 2f, "deepslate_silver_ore")));
         SILVER_ORE = registerBlocks("silver_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.STONE, 2f, "silver_ore")));
         SILVER_BLOCK = registerBlocks("silver_block",
                new Block(mineableSetting(Blocks.IRON_BLOCK, 4f, "silver_block")));

         SILVER_ORE_BLOCK = registerBlocks("silver_ore_block",
                new Block(mineableSetting(Blocks.STONE, 4f, "silver_ore_block")));

        //Titanium Blocks
         DEEPSLATE_TITANIUM_ORE = registerBlocks("deepslate_titanium_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.DEEPSLATE, 2f, "deepslate_titanium_ore")));
         TITANIUM_ORE = registerBlocks("titanium_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.STONE, 2f, "titanium_ore")));
         TITANIUM_BLOCK = registerBlocks("titanium_block",
                new Block(mineableSetting(Blocks.IRON_BLOCK, 4f, "titanium_block")));

         TITANIUM_ORE_BLOCK = registerBlocks("titanium_ore_block",
                new Block(mineableSetting(Blocks.STONE, 4f, "titanium_ore_block")));

        //Zinc Blocks
         DEEPSLATE_ZINC_ORE = registerBlocks("deepslate_zinc_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.DEEPSLATE, 2f, "deepslate_zinc_ore")));
         ZINC_ORE = registerBlocks("zinc_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.STONE, 2f, "zinc_ore")));
         ZINC_BLOCK = registerBlocks("zinc_block",
                new Block(mineableSetting(Blocks.IRON_BLOCK, 4f, "zinc_block")));

         ZINC_ORE_BLOCK = registerBlocks("zinc_ore_block",
                new Block(mineableSetting(Blocks.STONE, 4f, "zinc_ore_block")));

        //Other Ores
         DEEPSLATE_SALT_ORE = registerBlocks("deepslate_salt_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.DEEPSLATE, 2f, "deepslate_salt_ore")));
         SALT_ORE = registerBlocks("salt_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.STONE, 2f, "salt_ore")));
         SALT_BLOCK = registerBlocks("salt_block",
                new Block(mineableSetting(Blocks.STONE, 4f, "salt_block")));
         SODIUM_BLOCK = registerBlocks("sodium_block",
                new Block(mineableSetting(Blocks.IRON_BLOCK, 4f, "sodium_block")));


         DEEPSLATE_ARSENIC_ORE = registerBlocks("deepslate_arsenic_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.DEEPSLATE, 2f, "deepslate_arsenic_ore")));
         ARSENIC_ORE = registerBlocks("arsenic_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.STONE, 2f, "arsenic_ore")));
         ARSENIC_BLOCK = registerBlocks("arsenic_block",
                new Block(mineableSetting(Blocks.IRON_BLOCK, 4f, "arsenic_block")));


         DEEPSLATE_LITHIUM_ORE = registerBlocks("deepslate_lithium_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.DEEPSLATE, 2f, "deepslate_lithium_ore")));
         LITHIUM_ORE = registerBlocks("lithium_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.STONE, 2f, "lithium_ore")));
         LITHIUM_ORE_BLOCK = registerBlocks("lithium_ore_block",
                new Block(mineableSetting(Blocks.STONE, 4f, "lithium_ore_block")));
         LITHIUM_BLOCK = registerBlocks("lithium_block",
                new Block(mineableSetting(Blocks.IRON_BLOCK, 4f, "lithium_block")));

         //Volcanite
         BLACKSTONE_VOLCANITE_ORE = registerFireBlocks("blackstone_volcanite_ore",
                 new ExperienceDroppingBlock(UniformIntProvider.create(2,4), mineableSetting(Blocks.BASALT, 2f, "blackstone_volcanite_ore")));
         BASALT_VOLCANITE_ORE = registerFireBlocks("basalt_volcanite_ore",
                 new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.BLACKSTONE, 2f, "basalt_volcanite_ore")));
         VOLCANITE_ORE_BLOCK = registerFireBlocks("volcanite_ore_block",
                 new Block(mineableSetting(Blocks.STONE, 4f, "volcanite_ore_block")));
         VOLCANITE_BLOCK = registerFireBlocks("volcanite_block",
                 new Block(mineableSetting(Blocks.IRON_BLOCK, 4f, "volcanite_block")));

         //Soulrite
         SOUL_SAND_SOULRITE_ORE = registerFireBlocks("soul_sand_soulrite_ore",
                 new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.SOUL_SAND, 2f, "soul_sand_soulrite_ore")));
         SOUL_SOIL_SOULRITE_ORE = registerFireBlocks("soul_soil_soulrite_ore",
                 new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.SOUL_SOIL, 2f, "soul_soil_soulrite_ore")));
         SOULRITE_ORE_BLOCK = registerFireBlocks("soulrite_ore_block",
                 new Block(mineableSetting(Blocks.STONE, 4f, "soulrite_ore_block")));
         SOULRITE_BLOCK = registerFireBlocks("soulrite_block",
                 new Block(mineableSetting(Blocks.IRON_BLOCK, 4f, "soulrite_block")));

         //Racknite
         RACKNITE_ORE = registerFireBlocks("racknite_ore",
                 new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.NETHERRACK, 2f, "racknite_ore")));
         RACKNITE_ORE_BLOCK = registerFireBlocks("racknite_ore_block",
                 new Block(mineableSetting(Blocks.STONE, 4f, "racknite_ore_block")));
         RACKNITE_BLOCK = registerFireBlocks("racknite_block",
                 new Block(mineableSetting(Blocks.IRON_BLOCK, 4f, "racknite_block")));

         //Enderite
         ENDERITE_ORE = registerFireBlocks("enderite_ore",
                 new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), mineableSetting(Blocks.END_STONE, 2f, "enderite_ore")));
         ENDERITE_ORE_BLOCK = registerFireBlocks("enderite_ore_block",
                 new Block(mineableSetting(Blocks.STONE, 4f, "enderite_ore_block")));
         ENDERITE_BLOCK = registerFireBlocks("enderite_block",
                 new Block(mineableSetting(Blocks.IRON_BLOCK, 4f, "enderite_block")));
    }
    private static Block registerBlocks(String name, Block block) {
        Registry.register(Registries.BLOCK, Identifier.of(MoreOres.MODID, name),block);
        return Registry.register(Registries.ITEM, Identifier.of(MoreOres.MODID, name),
                new BlockItem(block, ModItems.normalSettings(name))).getBlock();
    }

    private static Block registerFireBlocks(String name, Block block) {
        Registry.register(Registries.BLOCK, Identifier.of(MoreOres.MODID, name),block);
        return Registry.register(Registries.ITEM, Identifier.of(MoreOres.MODID, name),
                new BlockItem(block, ModItems.normalSettings(name))).getBlock();
    }
    
    public static AbstractBlock.Settings mineableSetting(Block block, float strength, String idKey) {
         return AbstractBlock.Settings.copy(block).strength(strength).requiresTool().registryKey(RegistryKey.of(RegistryKeys.BLOCK, MoreOres.id(idKey)));
    }
}
