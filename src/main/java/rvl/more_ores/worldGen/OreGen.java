package rvl.more_ores.worldGen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import rvl.more_ores.MoreOres;

public class OreGen {

    public static final ResourceKey<PlacedFeature> ALUMINIUM_ORE_PLACED_KEY = createKey("ore_aluminium");
    public static final ResourceKey<PlacedFeature> TIN_ORE_PLACED_KEY = createKey("ore_tin");
    public static final ResourceKey<PlacedFeature> CHROME_ORE_PLACED_KEY = createKey("ore_chrome");
    public static final ResourceKey<PlacedFeature> NICKEL_ORE_PLACED_KEY = createKey("ore_nickel");
    public static final ResourceKey<PlacedFeature> PLOMB_ORE_PLACED_KEY = createKey("ore_plomb");
    public static final ResourceKey<PlacedFeature> SILICON_ORE_PLACED_KEY = createKey("ore_silicon");
    public static final ResourceKey<PlacedFeature> SILVER_ORE_PLACED_KEY = createKey("ore_silver");
    public static final ResourceKey<PlacedFeature> TITANIUM_ORE_PLACED_KEY = createKey("ore_titanium");
    public static final ResourceKey<PlacedFeature> ZINC_ORE_PLACED_KEY = createKey("ore_zinc");
    public static final ResourceKey<PlacedFeature> SALT_ORE_PLACED_KEY = createKey("ore_salt");
    public static final ResourceKey<PlacedFeature> ARSENIC_ORE_PLACED_KEY = createKey("ore_arsenic");
    public static final ResourceKey<PlacedFeature> LITHIUM_ORE_PLACED_KEY = createKey("ore_lithium");
    public static final ResourceKey<PlacedFeature> VOLCANIITE_ORE_PLACED_KEY = createKey("ore_volcanite");
    public static final ResourceKey<PlacedFeature> SOULRITE_ORE_PLACED_KEY = createKey("ore_soulrite");
    public static final ResourceKey<PlacedFeature> RACKNITE_ORE_PLACED_KEY = createKey("ore_racknite");
    public static final ResourceKey<PlacedFeature> ENDERITE_ORE_PLACED_KEY = createKey("ore_enderite");



    public static void oreGeneration() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, ALUMINIUM_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, TIN_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, CHROME_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, NICKEL_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, PLOMB_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, SILICON_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, SILVER_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, TITANIUM_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, ZINC_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, SALT_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, ARSENIC_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, LITHIUM_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, VOLCANIITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, SOULRITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, RACKNITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Decoration.UNDERGROUND_ORES, ENDERITE_ORE_PLACED_KEY);

    }

    private static ResourceKey<PlacedFeature> createKey(String id) {
        return ResourceKey.create(Registries.PLACED_FEATURE, MoreOres.id(id));
    }
}
