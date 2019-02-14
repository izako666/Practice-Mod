package com.Trecto_AI.PracticeMod.items;

import com.Trecto_AI.PracticeMod.Main;
import com.Trecto_AI.PracticeMod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.ITEMS.add(this);
		
	}
	
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
