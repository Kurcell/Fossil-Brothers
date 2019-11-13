package dinoMod.items.tools;

import java.util.List;

import javax.annotation.Nullable;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import dinoMod.Main;
import dinoMod.init.IHasModel;
import dinoMod.init.ModItems;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ManaSword extends ItemSword implements IHasModel{

	public ManaSword(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.dinoTab);	

		ModItems.ITEMS.add(this);
	}
	
	 @Override
	    public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
		 if(stack.getTagCompound() == null) {
				stack.setTagCompound(new NBTTagCompound());
				stack.getTagCompound().setInteger("Mana", 0);
			}
	       
	    }

	 @Override 
	 public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
		 if(stack.getTagCompound().getInteger("Mana") > 0) {
				stack.getTagCompound().setInteger("Mana", stack.getTagCompound().getInteger("Mana") - 5);
			}
		return false;
		 
	 }

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");

	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
		if (stack.hasTagCompound() && stack.getTagCompound().hasKey("Mana"))
		{
			tooltip.add("Mana: " + stack.getTagCompound().getInteger("Mana"));
			tooltip.add("Attack Buff: " + (double)stack.getTagCompound().getInteger("Mana")/100);
		}else {
			tooltip.add("Mana: 0");
			tooltip.add("Attack Buff: 0");
		}
	}
	public double getAttackBuff(ItemStack stack) {
		if(stack.getTagCompound().hasKey("Mana")) {
			return (double)stack.getTagCompound().getInteger(("Mana"))/100;
		}else {
			return 0D;
		}
	}
	
	@Override
	public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot equipmentSlot, ItemStack stack)
    {
		Multimap<String, AttributeModifier> multimap = HashMultimap.<String, AttributeModifier>create();

        if (equipmentSlot == EntityEquipmentSlot.MAINHAND && stack.hasTagCompound())
        {
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)this.getAttackDamage() + getAttackBuff(stack), 0));
        }

        return multimap;
    }
}