package dinoMod.items.tools;

import dinoMod.DinoMod;
import dinoMod.init.IHasModel;
import dinoMod.init.ModItems;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel {

	public ToolSpade(String name, ToolMaterial material) {
		super(material);
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
