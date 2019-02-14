package com.Trecto_AI.PracticeMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class LasagnaBlock extends BlockBase{

	public LasagnaBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.SNOW);
		setHardness(0.5f);
		setResistance(2.5f);
		setHarvestLevel("shovel", 0);
	}

}
