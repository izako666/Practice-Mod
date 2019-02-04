package com.Trecto_AI.PracticeMod.init;

import java.util.ArrayList;
import java.util.List;

import com.Trecto_AI.PracticeMod.items.ItemBase;
import com.Trecto_AI.PracticeMod.items.tools.ToolSpade;
import com.Trecto_AI.PracticeMod.items.tools.ToolSword;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//materials
	
	public static final ToolMaterial MATERIAL_LASAGNA = EnumHelper.addToolMaterial("lasagna", 3, 28, 15.0f, 6.0f, 15);
	//items
	public static final Item MANGO = new ItemBase("MANGO");
	public static final Item LEGENDARY_SWORD = new ItemBase("legendary_sword").setUnlocalizedName("LEGENDARY_SWORD").setCreativeTab(CreativeTabs.TOOLS);
	public static final Item BANANA = new ItemBase("banana").setUnlocalizedName("BANANA").setCreativeTab(CreativeTabs.FOOD);
	public static final Item LASAGNA = new ItemBase("lasagna").setUnlocalizedName("lasagna").setCreativeTab(CreativeTabs.FOOD);
	
	//tools
	
	public static final ItemSword LASAGNA_SWORD = new ToolSword("lasagna_sword", MATERIAL_LASAGNA);
	public static final ItemSpade LASAGNA_SHOVEL = new ToolSpade("lasagna_shovel", MATERIAL_LASAGNA);
}
