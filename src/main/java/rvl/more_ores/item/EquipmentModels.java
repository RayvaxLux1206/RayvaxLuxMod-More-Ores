package rvl.more_ores.item;

import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.registry.RegistryKey;
import rvl.more_ores.MoreOres;

public interface EquipmentModels {
    RegistryKey<EquipmentAsset> ALU = registerEquipement("aluminium");
    RegistryKey<EquipmentAsset> TIN = registerEquipement("tin");
    RegistryKey<EquipmentAsset> BRO = registerEquipement("bronze");
    RegistryKey<EquipmentAsset> STE = registerEquipement("steel");
    RegistryKey<EquipmentAsset> CHR = registerEquipement("chrome");
    RegistryKey<EquipmentAsset> NIC = registerEquipement("nickel");
    RegistryKey<EquipmentAsset> PLO = registerEquipement("plomb");
    RegistryKey<EquipmentAsset> SIL = registerEquipement("silver");
    RegistryKey<EquipmentAsset> TIT = registerEquipement("titanium");
    RegistryKey<EquipmentAsset> ZIN = registerEquipement("zinc");
    RegistryKey<EquipmentAsset> VOL = registerEquipement("volcanite");
    RegistryKey<EquipmentAsset> SOU = registerEquipement("soulrite");
    RegistryKey<EquipmentAsset> RAC = registerEquipement("racknite");
    RegistryKey<EquipmentAsset> END = registerEquipement("enderite");




    static RegistryKey<EquipmentAsset> registerEquipement(String path) {
        return RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, MoreOres.id(path));
    }
}
