package rvl.more_ores.tags;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import rvl.more_ores.MoreOres;

public class ItemTags {
    public static final TagKey<Item> R_ALUMINIUM = of("repair_aluminium");
    public static final TagKey<Item> R_TIN = of("repair_tin");
    public static final TagKey<Item> R_BRONZE = of("repair_bronze");
    public static final TagKey<Item> R_STEEL = of("repair_steel");
    public static final TagKey<Item> R_CHROME = of("repair_chrome");
    public static final TagKey<Item> R_NICKEL = of("repair_nickel");
    public static final TagKey<Item> R_PLOMB = of("repair_plomb");
    public static final TagKey<Item> R_SILVER = of("repair_silver");
    public static final TagKey<Item> R_TITANIUM = of("repair_titanium");
    public static final TagKey<Item> R_ZINC = of("repair_zinc");
    public static final TagKey<Item> R_VOLCANITE = of("repair_volcanite");
    public static final TagKey<Item> R_SOULRITE = of("repair_soulrite");
    public static final TagKey<Item> R_RACKNITE = of("repair_racknite");
    public static final TagKey<Item> R_ENDERITE = of("repair_enderite");




    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, MoreOres.id(id));
    }
}
