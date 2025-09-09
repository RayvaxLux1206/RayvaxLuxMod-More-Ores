package rvl.more_ores;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rvl.more_ores.block.ModBlocks;
import rvl.more_ores.item.ModItemGroups;
import rvl.more_ores.item.ModItems;
import rvl.more_ores.worldGen.OreGen;

public class MoreOres implements ModInitializer {
	public static final String MODID = "more-ores";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	public static Identifier id(String name) {
		return Identifier.of(MODID, name);
	}

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerItems();
		ModBlocks.registerModBlocks();

		OreGen.oreGeneration();
	}
}