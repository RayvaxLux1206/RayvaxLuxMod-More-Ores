package rvl.more_ores.item;

import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Util;
import rvl.more_ores.tags.ItemTags;

import java.util.EnumMap;

public interface ModArmorMaterials {

    ArmorMaterial ALUMINIUM = new ArmorMaterial(14, Util.make(new EnumMap(EquipmentType.class), (map) -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 4);
        map.put(EquipmentType.CHESTPLATE, 5);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 4);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, ItemTags.R_ALUMINIUM, EquipmentModels.ALU);
    ArmorMaterial TIN = new ArmorMaterial(7, Util.make(new EnumMap(EquipmentType.class), (map) -> {
        map.put(EquipmentType.BOOTS, 1);
        map.put(EquipmentType.LEGGINGS, 3);
        map.put(EquipmentType.CHESTPLATE, 5);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 3);
    }), 6, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, ItemTags.R_TIN, EquipmentModels.TIN);
    ArmorMaterial BRONZE = new ArmorMaterial(11, Util.make(new EnumMap(EquipmentType.class), (map) -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 4);
        map.put(EquipmentType.CHESTPLATE, 5);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 4);
    }), 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, ItemTags.R_BRONZE, EquipmentModels.BRO);
    ArmorMaterial STEEL = new ArmorMaterial(24, Util.make(new EnumMap(EquipmentType.class), (map) -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 7);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 5);
    }), 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, ItemTags.R_STEEL, EquipmentModels.STE);
    ArmorMaterial CHROME = new ArmorMaterial(10, Util.make(new EnumMap(EquipmentType.class), (map) -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 3);
        map.put(EquipmentType.CHESTPLATE, 4);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 3);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, ItemTags.R_CHROME, EquipmentModels.CHR);
    ArmorMaterial NICKEL = new ArmorMaterial(15, Util.make(new EnumMap(EquipmentType.class), (map) -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 5);
        map.put(EquipmentType.CHESTPLATE, 6);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 4);
    }), 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, ItemTags.R_NICKEL, EquipmentModels.NIC);
    ArmorMaterial PLOMB = new ArmorMaterial(7, Util.make(new EnumMap(EquipmentType.class), (map) -> {
        map.put(EquipmentType.BOOTS, 1);
        map.put(EquipmentType.LEGGINGS, 3);
        map.put(EquipmentType.CHESTPLATE, 5);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 3);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, ItemTags.R_PLOMB, EquipmentModels.PLO);
    ArmorMaterial SILVER = new ArmorMaterial(7, Util.make(new EnumMap(EquipmentType.class), (map) -> {
        map.put(EquipmentType.BOOTS, 1);
        map.put(EquipmentType.LEGGINGS, 3);
        map.put(EquipmentType.CHESTPLATE, 5);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 3);
    }), 12, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, ItemTags.R_SILVER, EquipmentModels.SIL);
    ArmorMaterial TITANIUM = new ArmorMaterial(14, Util.make(new EnumMap(EquipmentType.class), (map) -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 5);
        map.put(EquipmentType.CHESTPLATE, 6);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 4);
    }), 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, ItemTags.R_TITANIUM, EquipmentModels.TIT);
    ArmorMaterial ZINC = new ArmorMaterial(8, Util.make(new EnumMap(EquipmentType.class), (map) -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 3);
        map.put(EquipmentType.CHESTPLATE, 5);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 3);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, ItemTags.R_ZINC, EquipmentModels.ZIN);
    ArmorMaterial VOLCANITE = new ArmorMaterial(20, Util.make(new EnumMap(EquipmentType.class), (map) -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 5);
        map.put(EquipmentType.CHESTPLATE, 7);
        map.put(EquipmentType.HELMET, 4);
        map.put(EquipmentType.BODY, 5);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, ItemTags.R_VOLCANITE, EquipmentModels.VOL);
    ArmorMaterial SOULRITE = new ArmorMaterial(25, Util.make(new EnumMap(EquipmentType.class), (map) -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 5);
        map.put(EquipmentType.CHESTPLATE, 7);
        map.put(EquipmentType.HELMET, 4);
        map.put(EquipmentType.BODY, 5);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, ItemTags.R_SOULRITE, EquipmentModels.SOU);
    ArmorMaterial RACKNITE = new ArmorMaterial(18, Util.make(new EnumMap(EquipmentType.class), (map) -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 5);
        map.put(EquipmentType.CHESTPLATE, 6);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 3);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, ItemTags.R_RACKNITE, EquipmentModels.RAC);
    ArmorMaterial ENDERITE = new ArmorMaterial(30, Util.make(new EnumMap(EquipmentType.class), (map) -> {
        map.put(EquipmentType.BOOTS, 4);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 4);
        map.put(EquipmentType.BODY, 6);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, ItemTags.R_ENDERITE, EquipmentModels.END);






}