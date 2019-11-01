package dinoMod.items.tools;

import dinoMod.DinoMod;
import dinoMod.init.IHasModel;
import dinoMod.init.ModItems;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel{

	public ToolSword(String name, ToolMaterial material) {
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
