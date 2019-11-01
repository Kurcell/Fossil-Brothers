package tabs;

import dinoMod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class DinoTab extends CreativeTabs {
	public DinoTab(String label) {
		super("dinoTab");}
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.FOSSIL);
	}

}
