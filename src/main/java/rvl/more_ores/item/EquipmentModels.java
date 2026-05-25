package rvl.more_ores.item;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import rvl.more_ores.MoreOres;

public interface EquipmentModels {
    ResourceKey<EquipmentAsset> ALU = register("aluminium");
    ResourceKey<EquipmentAsset> TIN = register("tin");
    ResourceKey<EquipmentAsset> BRO = register("bronze");
    ResourceKey<EquipmentAsset> T_BRO = register("toxic_bronze");
    ResourceKey<EquipmentAsset> STE = register("steel");
    ResourceKey<EquipmentAsset> CHR = register("chrome");
    ResourceKey<EquipmentAsset> NIC = register("nickel");
    ResourceKey<EquipmentAsset> PLO = register("plomb");
    ResourceKey<EquipmentAsset> SIL = register("silver");
    ResourceKey<EquipmentAsset> TIT = register("titanium");
    ResourceKey<EquipmentAsset> ZIN = register("zinc");
    ResourceKey<EquipmentAsset> VOL = register("volcanite");
    ResourceKey<EquipmentAsset> SOU = register("soulrite");
    ResourceKey<EquipmentAsset> RAC = register("racknite");
    ResourceKey<EquipmentAsset> END = register("enderite");


    static ResourceKey<EquipmentAsset> register(String name) {
        return ResourceKey.create(EquipmentAssets.ROOT_ID, MoreOres.id(name));
    }
}
