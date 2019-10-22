package dinoMod.init;

import java.util.ArrayList;
import java.util.List;

import dinoMod.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block FOSSIL_ORE = new BlockBase("fossil_ore", Material.ROCK);
	
}
