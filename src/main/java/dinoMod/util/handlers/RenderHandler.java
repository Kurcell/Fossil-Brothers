package dinoMod.util.handlers;

import dinoMod.entity.Entity1;
import dinoMod.entity.render.Render1;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	
	public static void registerEntityRenders() {
		
		RenderingRegistry.registerEntityRenderingHandler(Entity1.class, new IRenderFactory<Entity1>(){

			@Override
			public Render<? super Entity1> createRenderFor(RenderManager manager) {
				return new Render1(manager);
			}
		});
	}
}


