package dinoMod.entity.render;

import dinoMod.entity.Entity1;

import dinoMod.entity.model.Model1;
import dinoMod.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class Render1 extends RenderLiving<Entity1>{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/dino.png");
	
	public Render1(RenderManager manager) {
		super(manager, new Model1(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity1 entity) {
		return TEXTURES;
	}
	
	@Override 
	protected void applyRotations(Entity1 entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
