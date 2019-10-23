package dinoMod.blocks;

import dinoMod.DinoMod;
import dinoMod.init.IHasModel;
import dinoMod.init.ModBlocks;
import dinoMod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel 
{
	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(DinoMod.dinoTab);	
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		DinoMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}

	
}
