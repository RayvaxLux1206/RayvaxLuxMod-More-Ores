package rvl.more_ores.item;

import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.registry.RegistryKey;
import rvl.more_ores.MoreOres;

public interface EquipmentModels {
    RegistryKey<EquipmentAsset> ALU = register("aluminium");
    RegistryKey<EquipmentAsset> TIN = register("tin");
    RegistryKey<EquipmentAsset> BRO = register("bronze");
    RegistryKey<EquipmentAsset> T_BRO = register("toxic_bronze");
    RegistryKey<EquipmentAsset> STE = register("steel");
    RegistryKey<EquipmentAsset> CHR = register("chrome");
    RegistryKey<EquipmentAsset> NIC = register("nickel");
    RegistryKey<EquipmentAsset> PLO = register("plomb");
    RegistryKey<EquipmentAsset> SIL = register("silver");
    RegistryKey<EquipmentAsset> TIT = register("titanium");
    RegistryKey<EquipmentAsset> ZIN = register("zinc");
    RegistryKey<EquipmentAsset> VOL = register("volcanite");
    RegistryKey<EquipmentAsset> SOU = register("soulrite");
    RegistryKey<EquipmentAsset> RAC = register("racknite");
    RegistryKey<EquipmentAsset> END = register("enderite");


    static RegistryKey<EquipmentAsset> register(String name) {
        return RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, MoreOres.id(name));
    }
}
