package rvl.more_ores.item.trim;

import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.item.equipment.trim.TrimMaterials;
import rvl.more_ores.MoreOres;

public class AddTrimMaterials {
    public static final ResourceKey<TrimMaterial> TRIM_ALUMINIUM = registerTrim("aluminium");
    public static final ResourceKey<TrimMaterial> TRIM_TIN = registerTrim("tin");
    public static final ResourceKey<TrimMaterial> TRIM_BRONZE = registerTrim("bronze");
    public static final ResourceKey<TrimMaterial> TRIM_TOXIC_BRONZE = registerTrim("toxic_bronze");
    public static final ResourceKey<TrimMaterial> TRIM_STEEL = registerTrim("steel");
    public static final ResourceKey<TrimMaterial> TRIM_CHROME = registerTrim("chrome");
    public static final ResourceKey<TrimMaterial> TRIM_NICKEL = registerTrim("nickel");
    public static final ResourceKey<TrimMaterial> TRIM_PLOMB = registerTrim("plomb");
    public static final ResourceKey<TrimMaterial> TRIM_SILICON = registerTrim("silicon");
    public static final ResourceKey<TrimMaterial> TRIM_SILVER = registerTrim("silver");
    public static final ResourceKey<TrimMaterial> TRIM_TITANIUM = registerTrim("titanium");
    public static final ResourceKey<TrimMaterial> TRIM_ZINC = registerTrim("zinc");
    public static final ResourceKey<TrimMaterial> TRIM_LITHIUM = registerTrim("lithium");
    public static final ResourceKey<TrimMaterial> TRIM_SODIUM = registerTrim("sodium");
    public static final ResourceKey<TrimMaterial> TRIM_ARSENIC = registerTrim("arsenic");
    public static final ResourceKey<TrimMaterial> TRIM_VOLCANITE = registerTrim("volcanite");
    public static final ResourceKey<TrimMaterial> TRIM_SOULRITE = registerTrim("soulrite");
    public static final ResourceKey<TrimMaterial> TRIM_RACKNITE = registerTrim("racknite");
    public static final ResourceKey<TrimMaterial> TRIM_ENDERITE = registerTrim("enderite");


    private static ResourceKey<TrimMaterial> registerTrim(String id) {
        return ResourceKey.create(Registries.TRIM_MATERIAL, MoreOres.id(id));
    }
}
