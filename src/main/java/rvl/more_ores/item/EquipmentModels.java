package rvl.more_ores.item;

import net.minecraft.item.equipment.EquipmentModel;
import net.minecraft.util.Identifier;
import rvl.more_ores.MoreOres;
import java.util.function.BiConsumer;

public interface EquipmentModels {
    Identifier ALU = MoreOres.id("aluminium");
    Identifier TIN = MoreOres.id("tin");
    Identifier BRO = MoreOres.id("bronze");
    Identifier T_BRO = MoreOres.id("toxic_bronze");
    Identifier STE = MoreOres.id("steel");
    Identifier CHR = MoreOres.id("chrome");
    Identifier NIC = MoreOres.id("nickel");
    Identifier PLO = MoreOres.id("plomb");
    Identifier SIL = MoreOres.id("silver");
    Identifier TIT = MoreOres.id("titanium");
    Identifier ZIN = MoreOres.id("zinc");
    Identifier VOL = MoreOres.id("volcanite");
    Identifier SOU = MoreOres.id("soulrite");
    Identifier RAC = MoreOres.id("racknite");
    Identifier END = MoreOres.id("enderite");

    static void accept(BiConsumer<Identifier, EquipmentModel> equipmentModelBiConsumer) {
        equipmentModelBiConsumer.accept(ALU, buildHumanoidAndHorse("aluminium"));
        equipmentModelBiConsumer.accept(TIN, buildHumanoidAndHorse("tin"));
        equipmentModelBiConsumer.accept(BRO, buildHumanoidAndHorse("bronze"));
        equipmentModelBiConsumer.accept(T_BRO, buildHumanoidAndHorse("toxic_bronze"));
        equipmentModelBiConsumer.accept(STE, buildHumanoidAndHorse("steel"));
        equipmentModelBiConsumer.accept(CHR, buildHumanoidAndHorse("chrome"));
        equipmentModelBiConsumer.accept(NIC, buildHumanoidAndHorse("nickel"));
        equipmentModelBiConsumer.accept(PLO, buildHumanoidAndHorse("plomb"));
        equipmentModelBiConsumer.accept(SIL, buildHumanoidAndHorse("silver"));
        equipmentModelBiConsumer.accept(TIT, buildHumanoidAndHorse("titanium"));
        equipmentModelBiConsumer.accept(ZIN, buildHumanoidAndHorse("zinc"));
        equipmentModelBiConsumer.accept(VOL, buildHumanoidAndHorse("volcanite"));
        equipmentModelBiConsumer.accept(SOU, buildHumanoidAndHorse("soulrite"));
        equipmentModelBiConsumer.accept(RAC, buildHumanoidAndHorse("racknite"));
        equipmentModelBiConsumer.accept(END, buildHumanoidAndHorse("enderite"));
    }

    private static EquipmentModel buildHumanoid(String path) {
        return EquipmentModel.builder().addHumanoidLayers(MoreOres.id(path)).build();
    }

    private static EquipmentModel buildHumanoidAndHorse(String path) {
        return EquipmentModel.builder().addHumanoidLayers(MoreOres.id(path)).addLayers(EquipmentModel.LayerType.HORSE_BODY, EquipmentModel.Layer.createDyeableLeather(MoreOres.id(path), false)).build();
    }
}
