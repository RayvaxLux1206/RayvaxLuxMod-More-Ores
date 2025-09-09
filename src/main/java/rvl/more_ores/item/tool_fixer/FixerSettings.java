package rvl.more_ores.item.tool_fixer;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.List;

public class FixerSettings {
    private final ToolFixerInterface material;

    public FixerSettings(ToolFixerInterface material) {
        this.material = material;
    }

    private Item.Settings applyBaseSettings(Item.Settings settings) {
        return settings.maxDamage(this.material.getDurability()).repairable(this.material.getRepairIngredients()).enchantable(this.material.getEnchantmentValue());
    }

    public Item.Settings applyToolSettings(TagKey<Block> effectiveBlocks, float attackDamage, float attackSpeed, Item.Settings settings) {
        RegistryEntryLookup<Block> registryEntryLookup = Registries.createEntryLookup(Registries.BLOCK);
        return this.applyBaseSettings(settings).component(DataComponentTypes.TOOL, new ToolComponent(List.of(ToolComponent.Rule.ofNeverDropping(registryEntryLookup.getOrThrow(this.material.getIncorrectBlocksForDrops())), ToolComponent.Rule.ofAlwaysDropping(registryEntryLookup.getOrThrow(effectiveBlocks), material.getMiningSpeed())), 1.0F, 1)).attributeModifiers(this.createToolAttributeModifiers(attackDamage, attackSpeed));
    }

    private AttributeModifiersComponent createToolAttributeModifiers(float attackDamage, float attackSpeed) {
        return AttributeModifiersComponent.builder().add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Item.BASE_ATTACK_DAMAGE_MODIFIER_ID, (double)(attackDamage + this.material.getAttackDamage()), EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Item.BASE_ATTACK_SPEED_MODIFIER_ID, (double)attackSpeed + this.material.getAttackSpeed(), EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build();
    }

    public Item.Settings applySwordSettings(Item.Settings settings, float attackDamage, float attackSpeed) {
        RegistryEntryLookup<Block> registryEntryLookup = Registries.createEntryLookup(Registries.BLOCK);
        return this.applyBaseSettings(settings).component(DataComponentTypes.TOOL, new ToolComponent(List.of(setComponent(Blocks.COBWEB, 15f), ToolComponent.Rule.of(registryEntryLookup.getOrThrow(BlockTags.SWORD_EFFICIENT), 1.5F), setComponent(Blocks.BAMBOO, 100f), ToolComponent.Rule.of(registryEntryLookup.getOrThrow(BlockTags.SWORD_EFFICIENT), 1.5F)), 1.0F, 2)).attributeModifiers(this.createSwordAttributeModifiers(attackDamage, attackSpeed));
    }

    private AttributeModifiersComponent createSwordAttributeModifiers(float attackDamage, float attackSpeed) {
        return AttributeModifiersComponent.builder().add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Item.BASE_ATTACK_DAMAGE_MODIFIER_ID, (double)(attackDamage + this.material.getAttackDamage()), EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Item.BASE_ATTACK_SPEED_MODIFIER_ID, (double)attackSpeed + this.material.getAttackSpeed(), EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build();
    }


    private static ToolComponent.Rule setComponent(Block block, float speed) {
        return ToolComponent.Rule.ofAlwaysDropping(RegistryEntryList.of(block.getRegistryEntry()), speed);
    }
}
