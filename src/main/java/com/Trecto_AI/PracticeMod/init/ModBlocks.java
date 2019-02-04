package com.Trecto_AI.PracticeMod.init;

import java.util.ArrayList;
import java.util.List;

import com.Trecto_AI.PracticeMod.blocks.BlockBase;
import com.Trecto_AI.PracticeMod.blocks.LasagnaBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	public static final Block LASAGNA_BLOCK = new LasagnaBlock("lasagna_block", Material.CAKE);
	
}
