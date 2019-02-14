package com.Trecto_AI.PracticeMod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		
		GameRegistry.addSmelting(Blocks.DIAMOND_BLOCK, new ItemStack(ModItems.LASAGNA, 1), 5.0f);
	}
}
