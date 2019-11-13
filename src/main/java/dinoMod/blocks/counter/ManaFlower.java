package dinoMod.blocks.counter;

import javax.annotation.Nullable;


import dinoMod.Main;
import dinoMod.blocks.FlowerTileEntity;
import dinoMod.init.ModItems;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ManaFlower extends FlowerTileEntity<TileEntityCounter> {

	public ManaFlower(String name, Material material) {
		super(Material.ROCK, "mana_flower");
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			TileEntityCounter tile = getTileEntity(world, pos);
			if(tile.getCount()>0) {
				if(player.getHeldItem(hand).getItem().equals(ModItems.STAFF)) {
					tile.decrementCount(25);
					player.getHeldItem(hand).getTagCompound().setInteger("Mana", player.getHeldItem(hand).getTagCompound().getInteger("Mana") + 50);
					player.sendMessage(new TextComponentString("Staff Mana: " + player.getHeldItem(hand).getTagCompound().getInteger("Mana")));
				}
				if(player.getHeldItem(hand).getItem().equals(ModItems.MANA_SWORD)) {
					tile.decrementCount(25);
					player.getHeldItem(hand).getTagCompound().setInteger("Mana", player.getHeldItem(hand).getTagCompound().getInteger("Mana") + 15);
					player.sendMessage(new TextComponentString("Sword Mana: " + player.getHeldItem(hand).getTagCompound().getInteger("Mana")));
				}
			}
			if(player.getHeldItem(hand).isEmpty() && tile.getCount()<1225) {
				for(int i=-3;i<4;i++) {
					for(int j=-3;j<4;j++) {
						if(world.getBlockState(pos.add(i,0,j)).getBlock().equals(Blocks.COAL_BLOCK) && tile.getCount()<1225) {
							world.destroyBlock(pos.add(i,0,j), false);
							world.setBlockState(pos.add(i,0,j), Blocks.FIRE.getDefaultState(), 11);
							tile.incrementCount(25);

						}
					}
				}
			}
			player.sendMessage(new TextComponentString("Mana: " + tile.getCount()));
		}
		return true;
	}


	@Override
	public Class<TileEntityCounter> getTileEntityClass() {
		return TileEntityCounter.class;
	}

	@Nullable
	@Override
	public TileEntityCounter createTileEntity(World world, IBlockState state) {
		return new TileEntityCounter();
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");

	}

}