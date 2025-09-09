package rvl.more_ores.registry;

import net.minecraft.item.equipment.trim.ArmorTrimMaterial;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import rvl.more_ores.MoreOres;

public class AddTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> ALUMINIUM = of("trim_aluminium");


    private static RegistryKey<ArmorTrimMaterial> of(String id) {
        return RegistryKey.of(RegistryKeys.TRIM_MATERIAL, MoreOres.id(id));
    }

    public static void modRegisterKey() {
    }
}
