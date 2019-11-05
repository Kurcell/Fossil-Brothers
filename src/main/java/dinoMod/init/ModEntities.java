package dinoMod.init;

import dinoMod.Main;

import dinoMod.entity.Entity1;
import dinoMod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
	

	public static void registerEntities() {
		
		registerEntity("dino", Entity1.class, Reference.ENTITY_1, 50, 657930, 1315860);
	}
	
	
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ";" + name), entity, name, id, Main.instance, range, 3, true, color1, color2);
	}
//	private static void registerNonMobEntity() {
//		
//	}
}
