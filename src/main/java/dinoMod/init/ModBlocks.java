package dinoMod.init;

import java.util.ArrayList;

import java.util.List;

import dinoMod.blocks.BlockBase;
import dinoMod.blocks.FossilBlock;
import dinoMod.blocks.FossilOre;
import dinoMod.blocks.ManaFlower;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block FOSSIL_BLOCK = new FossilBlock("fossil_block", Material.IRON);
	
	public static final Block FOSSIL_ORE = new FossilOre("fossil_ore", Material.ROCK);
	
	public static final BlockBush MANA_FLOWER = new ManaFlower("mana_flower", Material.PLANTS);
	
}
