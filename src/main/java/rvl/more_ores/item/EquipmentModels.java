package rvl.more_ores.item;

import net.minecraft.item.equipment.EquipmentModel;
import net.minecraft.util.Identifier;
import rvl.more_ores.MoreOres;
import java.util.function.BiConsumer;

public interface EquipmentModels {
    Identifier ALU = MoreOres.id("aluminium");
    Identifier TIN = MoreOres.id("tin");
    Identifier BRO = MoreOres.id("bronze");
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
        equipmentModelBiConsumer.accept(ALU, buildHumanoid("aluminium"));
        equipmentModelBiConsumer.accept(TIN, buildHumanoid("tin"));
        equipmentModelBiConsumer.accept(BRO, buildHumanoid("bronze"));
        equipmentModelBiConsumer.accept(STE, buildHumanoid("steel"));
        equipmentModelBiConsumer.accept(CHR, buildHumanoid("chrome"));
        equipmentModelBiConsumer.accept(NIC, buildHumanoid("nickel"));
        equipmentModelBiConsumer.accept(PLO, buildHumanoid("plomb"));
        equipmentModelBiConsumer.accept(SIL, buildHumanoid("silver"));
        equipmentModelBiConsumer.accept(TIT, buildHumanoid("titanium"));
        equipmentModelBiConsumer.accept(ZIN, buildHumanoid("zinc"));
        equipmentModelBiConsumer.accept(VOL, buildHumanoid("volcanite"));
        equipmentModelBiConsumer.accept(SOU, buildHumanoid("soulrite"));
        equipmentModelBiConsumer.accept(RAC, buildHumanoid("racknite"));
        equipmentModelBiConsumer.accept(END, buildHumanoid("enderite"));
    }

    private static EquipmentModel buildHumanoid(String path) {
        return EquipmentModel.builder().addHumanoidLayers(MoreOres.id(path)).build();
    }

    private static EquipmentModel buildHumanoidAndHorse(String path) {
        return EquipmentModel.builder().addHumanoidLayers(MoreOres.id(path)).addLayers(EquipmentModel.LayerType.HORSE_BODY, EquipmentModel.Layer.createDyeableLeather(MoreOres.id(path), false)).build();
    }
}
