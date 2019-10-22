package dinoMod.items;

import dinoMod.DinoMod;
import dinoMod.init.IHasModel;
import dinoMod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);	
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {

		DinoMod.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
