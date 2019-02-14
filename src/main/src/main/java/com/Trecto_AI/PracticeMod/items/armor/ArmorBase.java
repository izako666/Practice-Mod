package com.Trecto_AI.PracticeMod.items.armor;

import com.Trecto_AI.PracticeMod.Main;
import com.Trecto_AI.PracticeMod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor {

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}

	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
