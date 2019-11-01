package dinoMod.items.armor;

import dinoMod.DinoMod;
import dinoMod.init.IHasModel;
import dinoMod.init.ModItems;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel {

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(DinoMod.dinoTab);	
		
		ModItems.ITEMS.add(this);
		
	}
	@Override
	public void registerModels() {

		DinoMod.proxy.registerItemRenderer(this, 0, "inventory");
	}

}