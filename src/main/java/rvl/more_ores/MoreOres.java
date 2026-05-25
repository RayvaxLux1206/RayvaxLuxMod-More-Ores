package rvl.more_ores;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rvl.more_ores.block.ModBlocks;
import rvl.more_ores.item.ModItemGroups;
import rvl.more_ores.item.ModItems;
import rvl.more_ores.worldGen.OreGen;

public class MoreOres implements ModInitializer {
	public static final String MOD_ID = "more-ores";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	public static Identifier id(String name) {
		return Identifier.of(MOD_ID, name);
	}

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModBlocks.registerModBlocks();
		ModItems.registerItems();

		OreGen.oreGeneration();


		LOGGER.info("Mod Log More Ores");
	}

	//registry


}