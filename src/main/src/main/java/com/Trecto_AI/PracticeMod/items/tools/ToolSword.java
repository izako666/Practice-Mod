package com.Trecto_AI.PracticeMod.items.tools;

import com.Trecto_AI.PracticeMod.Main;
import com.Trecto_AI.PracticeMod.init.ModItems;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword  {
	
	public ToolSword(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
		
	}
	
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
