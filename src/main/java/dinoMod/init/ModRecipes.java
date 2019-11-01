package dinoMod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.FOSSIL_ORE, new ItemStack(ModItems.FOSSIL, 1), 1.5F);
	}

}

