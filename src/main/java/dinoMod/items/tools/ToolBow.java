package dinoMod.items.tools;

import dinoMod.Main;
import dinoMod.init.IHasModel;
import dinoMod.init.ModItems;
import net.minecraft.item.ItemBow;

public class ToolBow extends ItemBow implements IHasModel{

	public ToolBow(String name, ToolMaterial material) {
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.dinoTab);	
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {

		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}


}
