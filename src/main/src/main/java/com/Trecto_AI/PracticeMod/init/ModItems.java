package com.Trecto_AI.PracticeMod.init;

import java.util.ArrayList;
import java.util.List;

import com.Trecto_AI.PracticeMod.items.ItemBase;
import com.Trecto_AI.PracticeMod.items.armor.ArmorBase;
import com.Trecto_AI.PracticeMod.items.tools.ToolSpade;
import com.Trecto_AI.PracticeMod.items.tools.ToolSword;
import com.Trecto_AI.PracticeMod.util.reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//materials
	public static final ToolMaterial MATERIAL_LASAGNA = EnumHelper.addToolMaterial("lasagna", 3, 28, 15.0f, 6.0f, 15);
	public static final ArmorMaterial ARMOR_MATERIAL_LASAGNA = EnumHelper.addArmorMaterial("armor_material_lasagna", 
			reference.MOD_ID + ":lasagna", 7, new int[] {7, 10, 12, 7}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	
	//items
	public static final Item MANGO = new ItemBase("MANGO");
	public static final Item LEGENDARY_SWORD = new ItemBase("legendary_sword").setUnlocalizedName("LEGENDARY_SWORD").setCreativeTab(CreativeTabs.TOOLS);
	public static final Item BANANA = new ItemBase("banana").setUnlocalizedName("BANANA").setCreativeTab(CreativeTabs.FOOD);
	public static final Item LASAGNA = new ItemBase("lasagna").setUnlocalizedName("lasagna").setCreativeTab(CreativeTabs.FOOD);
	
	//tools
	
	public static final ItemSword LASAGNA_SWORD = new ToolSword("lasagna_sword", MATERIAL_LASAGNA);
	public static final ItemSpade LASAGNA_SHOVEL = new ToolSpade("lasagna_shovel", MATERIAL_LASAGNA);
	
	//armor
	public static final Item LASAGNA_HELMET = new ArmorBase("lasagna_helmet", ARMOR_MATERIAL_LASAGNA, 1, EntityEquipmentSlot.HEAD);
	public static final Item LASAGNA_CHESTPLATE = new ArmorBase("lasagna_chestplate", ARMOR_MATERIAL_LASAGNA, 1, EntityEquipmentSlot.CHEST);
	public static final Item LASAGNA_LEGGINGS = new ArmorBase("lasagna_leggings", ARMOR_MATERIAL_LASAGNA, 2, EntityEquipmentSlot.LEGS);
	public static final Item LASAGNA_BOOTS = new ArmorBase("lasagna_boots", ARMOR_MATERIAL_LASAGNA, 1, EntityEquipmentSlot.FEET);
}
