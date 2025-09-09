package rvl.more_ores.item.tool_fixer;

import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.TagKey;

public class FixTool extends Item{

    public FixTool(FixerSettings fix, TagKey<Block> tag, float damage, float speed, Settings settings) {
        super(fix.applyToolSettings(tag, damage, speed, settings));

    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        return true;
    }

    public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damage(2, attacker, EquipmentSlot.MAINHAND);
    }
}
