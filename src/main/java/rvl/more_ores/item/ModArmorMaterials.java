package rvl.more_ores.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Util;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import rvl.more_ores.tags.ItemTags;

import java.util.EnumMap;

public interface ModArmorMaterials {

    ArmorMaterial ALUMINIUM = new ArmorMaterial(14, Util.make(new EnumMap(ArmorType.class), (map) -> {
        map.put(ArmorType.BOOTS, 2);
        map.put(ArmorType.LEGGINGS, 4);
        map.put(ArmorType.CHESTPLATE, 5);
        map.put(ArmorType.HELMET, 2);
        map.put(ArmorType.BODY, 4);
    }), 15, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, ItemTags.R_ALUMINIUM, EquipmentModels.ALU);
    ArmorMaterial TIN = new ArmorMaterial(7, Util.make(new EnumMap(ArmorType.class), (map) -> {
        map.put(ArmorType.BOOTS, 1);
        map.put(ArmorType.LEGGINGS, 3);
        map.put(ArmorType.CHESTPLATE, 5);
        map.put(ArmorType.HELMET, 2);
        map.put(ArmorType.BODY, 3);
    }), 6, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, ItemTags.R_TIN, EquipmentModels.TIN);
    ArmorMaterial BRONZE = new ArmorMaterial(11, Util.make(new EnumMap(ArmorType.class), (map) -> {
        map.put(ArmorType.BOOTS, 2);
        map.put(ArmorType.LEGGINGS, 4);
        map.put(ArmorType.CHESTPLATE, 5);
        map.put(ArmorType.HELMET, 2);
        map.put(ArmorType.BODY, 4);
    }), 11, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, ItemTags.R_BRONZE, EquipmentModels.BRO);
    ArmorMaterial TOXIC_BRONZE = new ArmorMaterial(11, Util.make(new EnumMap(ArmorType.class), (map) -> {
        map.put(ArmorType.BOOTS, 2);
        map.put(ArmorType.LEGGINGS, 4);
        map.put(ArmorType.CHESTPLATE, 5);
        map.put(ArmorType.HELMET, 2);
        map.put(ArmorType.BODY, 4);
    }), 11, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, ItemTags.R_TOXIC_BRONZE, EquipmentModels.T_BRO);
    ArmorMaterial STEEL = new ArmorMaterial(24, Util.make(new EnumMap(ArmorType.class), (map) -> {
        map.put(ArmorType.BOOTS, 3);
        map.put(ArmorType.LEGGINGS, 6);
        map.put(ArmorType.CHESTPLATE, 7);
        map.put(ArmorType.HELMET, 3);
        map.put(ArmorType.BODY, 5);
    }), 12, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, ItemTags.R_STEEL, EquipmentModels.STE);
    ArmorMaterial CHROME = new ArmorMaterial(10, Util.make(new EnumMap(ArmorType.class), (map) -> {
        map.put(ArmorType.BOOTS, 2);
        map.put(ArmorType.LEGGINGS, 3);
        map.put(ArmorType.CHESTPLATE, 4);
        map.put(ArmorType.HELMET, 2);
        map.put(ArmorType.BODY, 3);
    }), 10, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, ItemTags.R_CHROME, EquipmentModels.CHR);
    ArmorMaterial NICKEL = new ArmorMaterial(15, Util.make(new EnumMap(ArmorType.class), (map) -> {
        map.put(ArmorType.BOOTS, 2);
        map.put(ArmorType.LEGGINGS, 5);
        map.put(ArmorType.CHESTPLATE, 6);
        map.put(ArmorType.HELMET, 2);
        map.put(ArmorType.BODY, 4);
    }), 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, ItemTags.R_NICKEL, EquipmentModels.NIC);
    ArmorMaterial PLOMB = new ArmorMaterial(7, Util.make(new EnumMap(ArmorType.class), (map) -> {
        map.put(ArmorType.BOOTS, 1);
        map.put(ArmorType.LEGGINGS, 3);
        map.put(ArmorType.CHESTPLATE, 5);
        map.put(ArmorType.HELMET, 2);
        map.put(ArmorType.BODY, 3);
    }), 10, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, ItemTags.R_PLOMB, EquipmentModels.PLO);
    ArmorMaterial SILVER = new ArmorMaterial(7, Util.make(new EnumMap(ArmorType.class), (map) -> {
        map.put(ArmorType.BOOTS, 1);
        map.put(ArmorType.LEGGINGS, 3);
        map.put(ArmorType.CHESTPLATE, 5);
        map.put(ArmorType.HELMET, 2);
        map.put(ArmorType.BODY, 3);
    }), 12, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, ItemTags.R_SILVER, EquipmentModels.SIL);
    ArmorMaterial TITANIUM = new ArmorMaterial(14, Util.make(new EnumMap(ArmorType.class), (map) -> {
        map.put(ArmorType.BOOTS, 2);
        map.put(ArmorType.LEGGINGS, 5);
        map.put(ArmorType.CHESTPLATE, 6);
        map.put(ArmorType.HELMET, 3);
        map.put(ArmorType.BODY, 4);
    }), 11, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, ItemTags.R_TITANIUM, EquipmentModels.TIT);
    ArmorMaterial ZINC = new ArmorMaterial(8, Util.make(new EnumMap(ArmorType.class), (map) -> {
        map.put(ArmorType.BOOTS, 2);
        map.put(ArmorType.LEGGINGS, 3);
        map.put(ArmorType.CHESTPLATE, 5);
        map.put(ArmorType.HELMET, 2);
        map.put(ArmorType.BODY, 3);
    }), 10, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, ItemTags.R_ZINC, EquipmentModels.ZIN);
    ArmorMaterial VOLCANITE = new ArmorMaterial(20, Util.make(new EnumMap(ArmorType.class), (map) -> {
        map.put(ArmorType.BOOTS, 3);
        map.put(ArmorType.LEGGINGS, 5);
        map.put(ArmorType.CHESTPLATE, 7);
        map.put(ArmorType.HELMET, 4);
        map.put(ArmorType.BODY, 5);
    }), 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, ItemTags.R_VOLCANITE, EquipmentModels.VOL);
    ArmorMaterial SOULRITE = new ArmorMaterial(25, Util.make(new EnumMap(ArmorType.class), (map) -> {
        map.put(ArmorType.BOOTS, 3);
        map.put(ArmorType.LEGGINGS, 5);
        map.put(ArmorType.CHESTPLATE, 7);
        map.put(ArmorType.HELMET, 4);
        map.put(ArmorType.BODY, 5);
    }), 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, ItemTags.R_SOULRITE, EquipmentModels.SOU);
    ArmorMaterial RACKNITE = new ArmorMaterial(18, Util.make(new EnumMap(ArmorType.class), (map) -> {
        map.put(ArmorType.BOOTS, 2);
        map.put(ArmorType.LEGGINGS, 5);
        map.put(ArmorType.CHESTPLATE, 6);
        map.put(ArmorType.HELMET, 2);
        map.put(ArmorType.BODY, 3);
    }), 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, ItemTags.R_RACKNITE, EquipmentModels.RAC);
    ArmorMaterial ENDERITE = new ArmorMaterial(30, Util.make(new EnumMap(ArmorType.class), (map) -> {
        map.put(ArmorType.BOOTS, 4);
        map.put(ArmorType.LEGGINGS, 6);
        map.put(ArmorType.CHESTPLATE, 8);
        map.put(ArmorType.HELMET, 4);
        map.put(ArmorType.BODY, 6);
    }), 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, ItemTags.R_ENDERITE, EquipmentModels.END);






}