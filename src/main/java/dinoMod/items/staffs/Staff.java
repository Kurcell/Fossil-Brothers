package dinoMod.items.staffs;

import java.util.List;

import javax.annotation.Nullable;

import dinoMod.Main;

import dinoMod.entity.lighting_ball.EntityLightningBall;
import dinoMod.init.IHasModel;
import dinoMod.init.ModBlocks;
import dinoMod.init.ModItems;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class Staff extends Item implements IHasModel {

	public Staff(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.dinoTab);

		ModItems.ITEMS.add(this);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack item = playerIn.getHeldItem(handIn);
		Vec3d look = playerIn.getLookVec();
		BlockPos pos = new BlockPos(look.x,look.y,look.z);
		EntityLightningBall lightningBall = new EntityLightningBall(worldIn, 1D, 1D, 1D);

		if(item.getTagCompound() == null) {
			item.setTagCompound(new NBTTagCompound());
			item.getTagCompound().setInteger("Mana", 0);
		}

		if(worldIn.getBlockState(pos).getBlock().equals(ModBlocks.MANA_FLOWER)) {
		}else if(item.getTagCompound().getInteger("Mana")>0){
			lightningBall.setPosition(playerIn.posX + look.x * 1.5D, playerIn.posY + look.y * 1.5D, playerIn.posZ + look.z * 1.5D);
			lightningBall.motionX = look.x * 3.0D;
			lightningBall.motionY = look.y * 3.0D;
			lightningBall.motionZ = look.z * 3.0D;
			lightningBall.setGlowing(true);
			playerIn.getCooldownTracker().setCooldown(this, 1);
			worldIn.spawnEntity(lightningBall);
			item.getTagCompound().setInteger("Mana", item.getTagCompound().getInteger("Mana")-25);
			if(!worldIn.isRemote) playerIn.sendMessage(new TextComponentString("Staff Mana: " + item.getTagCompound().getInteger("Mana")));

		}else if (!worldIn.isRemote) {
			playerIn.sendMessage(new TextComponentString("You're out of mana."));
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
		if (stack.hasTagCompound() && stack.getTagCompound().hasKey("Mana"))
		{
			tooltip.add("Mana: " + stack.getTagCompound().getInteger("Mana"));
		}else {
			tooltip.add("Mana: 0");
		}
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");

	}

}
