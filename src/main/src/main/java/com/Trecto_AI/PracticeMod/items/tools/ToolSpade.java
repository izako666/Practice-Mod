package com.Trecto_AI.PracticeMod.items.tools;

import com.Trecto_AI.PracticeMod.Main;
import com.Trecto_AI.PracticeMod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ToolSpade extends ItemSpade  {

	public ToolSpade(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
		
	}
	
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
