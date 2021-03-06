
package dinoMod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.util.math.MathHelper;

/**
 * ModelHorse - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class Model1 extends ModelBase {
    public ModelRenderer head;
    public ModelRenderer frontLeftHoof;
    public ModelRenderer backLeftShin;
    public ModelRenderer backLeftHoof;
    public ModelRenderer frontLeftLeg;
    public ModelRenderer frontRightLeg;
    public ModelRenderer frontLeftShin;
    public ModelRenderer frontRightShin;
    public ModelRenderer body;
    public ModelRenderer backLeftLeg;
    public ModelRenderer neck;
    public ModelRenderer tail;
    public ModelRenderer backRightLeg;
    public ModelRenderer backRightShin;
    public ModelRenderer backRightHoof;
    public ModelRenderer frontRightHoof;
    public ModelRenderer upperMouth;
    public ModelRenderer lowerMouth;

    public Model1() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.backLeftShin = new ModelRenderer(this, 78, 43);
        this.backLeftShin.setRotationPoint(4.0F, 16.0F, 11.0F);
        this.backLeftShin.addBox(-2.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.frontRightLeg = new ModelRenderer(this, 60, 29);
        this.frontRightLeg.setRotationPoint(-4.0F, 9.0F, -8.0F);
        this.frontRightLeg.addBox(-1.1F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.backRightShin = new ModelRenderer(this, 96, 43);
        this.backRightShin.setRotationPoint(-4.0F, 16.0F, 11.0F);
        this.backRightShin.addBox(-1.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.lowerMouth = new ModelRenderer(this, 24, 27);
        this.lowerMouth.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lowerMouth.addBox(-2.0F, -7.0F, -6.5F, 4, 2, 5, 0.0F);
        this.frontLeftHoof = new ModelRenderer(this, 44, 51);
        this.frontLeftHoof.setRotationPoint(4.0F, 16.0F, -8.0F);
        this.frontLeftHoof.addBox(-2.4F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
        this.frontLeftLeg = new ModelRenderer(this, 44, 29);
        this.frontLeftLeg.setRotationPoint(4.0F, 9.0F, -8.0F);
        this.frontLeftLeg.addBox(-1.9F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.neck = new ModelRenderer(this, 0, 12);
        this.neck.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.neck.addBox(-2.05F, -9.8F, -2.0F, 4, 14, 8, 0.0F);
        this.setRotateAngle(neck, 0.5235987755982988F, 0.0F, 0.0F);
        this.frontRightShin = new ModelRenderer(this, 60, 41);
        this.frontRightShin.setRotationPoint(-4.0F, 16.0F, -8.0F);
        this.frontRightShin.addBox(-1.1F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.head.addBox(-2.5F, -10.0F, -1.5F, 5, 5, 7, 0.0F);
        this.setRotateAngle(head, 0.5235987755982988F, 0.0F, 0.0F);
        this.tail = new ModelRenderer(this, 44, 0);
        this.tail.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.tail.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(tail, -1.3088224060705476F, 0.0F, 0.0F);
        this.frontRightHoof = new ModelRenderer(this, 60, 51);
        this.frontRightHoof.setRotationPoint(-4.0F, 16.0F, -8.0F);
        this.frontRightHoof.addBox(-1.6F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
        this.upperMouth = new ModelRenderer(this, 24, 18);
        this.upperMouth.setRotationPoint(0.0F, 0.02F, 0.02F);
        this.upperMouth.addBox(-2.0F, -10.0F, -7.0F, 4, 3, 6, 0.0F);
        this.backRightLeg = new ModelRenderer(this, 96, 29);
        this.backRightLeg.setRotationPoint(-4.0F, 9.0F, 11.0F);
        this.backRightLeg.addBox(-1.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.frontLeftShin = new ModelRenderer(this, 44, 41);
        this.frontLeftShin.setRotationPoint(4.0F, 16.0F, -8.0F);
        this.frontLeftShin.addBox(-1.9F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
        this.backRightHoof = new ModelRenderer(this, 96, 51);
        this.backRightHoof.setRotationPoint(-4.0F, 16.0F, 11.0F);
        this.backRightHoof.addBox(-1.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
        this.backLeftHoof = new ModelRenderer(this, 78, 51);
        this.backLeftHoof.setRotationPoint(4.0F, 16.0F, 11.0F);
        this.backLeftHoof.addBox(-2.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
        this.backLeftLeg = new ModelRenderer(this, 78, 29);
        this.backLeftLeg.setRotationPoint(4.0F, 9.0F, 11.0F);
        this.backLeftLeg.addBox(-2.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.body = new ModelRenderer(this, 0, 34);
        this.body.setRotationPoint(0.0F, 11.0F, 9.0F);
        this.body.addBox(-5.0F, -8.0F, -19.0F, 10, 10, 24, 0.0F);
        this.head.addChild(this.lowerMouth);
        this.head.addChild(this.upperMouth);
        
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.backLeftShin.render(f5);
        this.frontRightLeg.render(f5);
        this.backRightShin.render(f5);
        this.frontLeftHoof.render(f5);
        this.frontLeftLeg.render(f5);
        this.neck.render(f5);
        this.frontRightShin.render(f5);
        this.head.render(f5);
        this.tail.render(f5);
        this.frontRightHoof.render(f5);
        this.backRightLeg.render(f5);
        this.frontLeftShin.render(f5);
        this.backRightHoof.render(f5);
        this.backLeftHoof.render(f5);
        this.backLeftLeg.render(f5);
        this.body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    private float updateRotation(float p_110683_1_, float p_110683_2_, float p_110683_3_)
    {
        float f;

        for (f = p_110683_2_ - p_110683_1_; f < -180.0F; f += 360.0F)
        {
            ;
        }

        while (f >= 180.0F)
        {
            f -= 360.0F;
        }

        return p_110683_1_ + p_110683_3_ * f;
    }
    
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime)
    {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        float f = this.updateRotation(entitylivingbaseIn.prevRenderYawOffset, entitylivingbaseIn.renderYawOffset, partialTickTime);
        float f1 = this.updateRotation(entitylivingbaseIn.prevRotationYawHead, entitylivingbaseIn.rotationYawHead, partialTickTime);
        float f2 = entitylivingbaseIn.prevRotationPitch + (entitylivingbaseIn.rotationPitch - entitylivingbaseIn.prevRotationPitch) * partialTickTime;
        float f3 = f1 - f;
        float f4 = f2 * 0.017453292F;

        if (f3 > 20.0F)
        {
            f3 = 20.0F;
        }

        if (f3 < -20.0F)
        {
            f3 = -20.0F;
        }

        if (limbSwingAmount > 0.2F)
        {
            f4 += MathHelper.cos(limbSwing * 0.4F) * 0.15F * limbSwingAmount;
        }

        AbstractHorse abstracthorse = (AbstractHorse)entitylivingbaseIn;
        float f5 = abstracthorse.getGrassEatingAmount(partialTickTime);
        float f6 = abstracthorse.getRearingAmount(partialTickTime);
        float f7 = 1.0F - f6;
        float f8 = abstracthorse.getMouthOpennessAngle(partialTickTime);
        boolean flag = abstracthorse.tailCounter != 0;
        boolean flag1 = abstracthorse.isHorseSaddled();
        boolean flag2 = abstracthorse.isBeingRidden();
        float f9 = (float)entitylivingbaseIn.ticksExisted + partialTickTime;
        float f10 = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI);
        float f11 = f10 * 0.8F * limbSwingAmount;
        this.head.rotationPointY = 4.0F;
        this.head.rotationPointZ = -10.0F;
        this.tail.rotationPointY = 3.0F;
        this.body.rotateAngleX = 0.0F;
        this.head.rotateAngleX = 0.5235988F + f4;
        this.head.rotateAngleY = f3 * 0.017453292F;
        this.head.rotateAngleX = f6 * (0.2617994F + f4) + f5 * 2.1816616F + (1.0F - Math.max(f6, f5)) * this.head.rotateAngleX;
        this.head.rotateAngleY = f6 * f3 * 0.017453292F + (1.0F - Math.max(f6, f5)) * this.head.rotateAngleY;
        this.head.rotationPointY = f6 * -6.0F + f5 * 11.0F + (1.0F - Math.max(f6, f5)) * this.head.rotationPointY;
        this.head.rotationPointZ = f6 * -1.0F + f5 * -10.0F + (1.0F - Math.max(f6, f5)) * this.head.rotationPointZ;
        this.tail.rotationPointY = f6 * 9.0F + f7 * this.tail.rotationPointY;
        this.body.rotateAngleX = f6 * -((float)Math.PI / 4F) + f7 * this.body.rotateAngleX;
        this.neck.rotationPointY = this.head.rotationPointY;
        this.upperMouth.rotationPointY = 0.02F;
        this.lowerMouth.rotationPointY = 0.0F;
        this.neck.rotationPointZ = this.head.rotationPointZ;
        this.upperMouth.rotationPointZ = 0.02F - f8;
        this.lowerMouth.rotationPointZ = f8;
        this.neck.rotateAngleX = this.head.rotateAngleX;
        this.upperMouth.rotateAngleX = -0.09424778F * f8;
        this.lowerMouth.rotateAngleX = 0.15707964F * f8;
        this.neck.rotateAngleY = this.head.rotateAngleY;
        this.upperMouth.rotateAngleY = 0.0F;
        this.lowerMouth.rotateAngleY = 0.0F;
        float f12 = 0.2617994F * f6;
        float f13 = MathHelper.cos(f9 * 0.6F + (float)Math.PI);
        this.frontLeftLeg.rotationPointY = -2.0F * f6 + 9.0F * f7;
        this.frontLeftLeg.rotationPointZ = -2.0F * f6 + -8.0F * f7;
        this.frontRightLeg.rotationPointY = this.frontLeftLeg.rotationPointY;
        this.frontRightLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ;
        this.backLeftShin.rotationPointY = this.backLeftLeg.rotationPointY + MathHelper.sin(((float)Math.PI / 2F) + f12 + f7 * -f10 * 0.5F * limbSwingAmount) * 7.0F;
        this.backLeftShin.rotationPointZ = this.backLeftLeg.rotationPointZ + MathHelper.cos(-((float)Math.PI / 2F) + f12 + f7 * -f10 * 0.5F * limbSwingAmount) * 7.0F;
        this.backRightShin.rotationPointY = this.backRightLeg.rotationPointY + MathHelper.sin(((float)Math.PI / 2F) + f12 + f7 * f10 * 0.5F * limbSwingAmount) * 7.0F;
        this.backRightShin.rotationPointZ = this.backRightLeg.rotationPointZ + MathHelper.cos(-((float)Math.PI / 2F) + f12 + f7 * f10 * 0.5F * limbSwingAmount) * 7.0F;
        float f14 = (-1.0471976F + f13) * f6 + f11 * f7;
        float f15 = (-1.0471976F - f13) * f6 + -f11 * f7;
        this.frontLeftShin.rotationPointY = this.frontLeftLeg.rotationPointY + MathHelper.sin(((float)Math.PI / 2F) + f14) * 7.0F;
        this.frontLeftShin.rotationPointZ = this.frontLeftLeg.rotationPointZ + MathHelper.cos(-((float)Math.PI / 2F) + f14) * 7.0F;
        this.frontRightShin.rotationPointY = this.frontRightLeg.rotationPointY + MathHelper.sin(((float)Math.PI / 2F) + f15) * 7.0F;
        this.frontRightShin.rotationPointZ = this.frontRightLeg.rotationPointZ + MathHelper.cos(-((float)Math.PI / 2F) + f15) * 7.0F;
        this.backLeftLeg.rotateAngleX = f12 + -f10 * 0.5F * limbSwingAmount * f7;
        this.backLeftShin.rotateAngleX = -0.08726646F * f6 + (-f10 * 0.5F * limbSwingAmount - Math.max(0.0F, f10 * 0.5F * limbSwingAmount)) * f7;
        this.backLeftHoof.rotateAngleX = this.backLeftShin.rotateAngleX;
        this.backRightLeg.rotateAngleX = f12 + f10 * 0.5F * limbSwingAmount * f7;
        this.backRightShin.rotateAngleX = -0.08726646F * f6 + (f10 * 0.5F * limbSwingAmount - Math.max(0.0F, -f10 * 0.5F * limbSwingAmount)) * f7;
        this.backRightHoof.rotateAngleX = this.backRightShin.rotateAngleX;
        this.frontLeftLeg.rotateAngleX = f14;
        this.frontLeftShin.rotateAngleX = (this.frontLeftLeg.rotateAngleX + (float)Math.PI * Math.max(0.0F, 0.2F + f13 * 0.2F)) * f6 + (f11 + Math.max(0.0F, f10 * 0.5F * limbSwingAmount)) * f7;
        this.frontLeftHoof.rotateAngleX = this.frontLeftShin.rotateAngleX;
        this.frontRightLeg.rotateAngleX = f15;
        this.frontRightShin.rotateAngleX = (this.frontRightLeg.rotateAngleX + (float)Math.PI * Math.max(0.0F, 0.2F - f13 * 0.2F)) * f6 + (-f11 + Math.max(0.0F, -f10 * 0.5F * limbSwingAmount)) * f7;
        this.frontRightHoof.rotateAngleX = this.frontRightShin.rotateAngleX;
        this.backLeftHoof.rotationPointY = this.backLeftShin.rotationPointY;
        this.backLeftHoof.rotationPointZ = this.backLeftShin.rotationPointZ;
        this.backRightHoof.rotationPointY = this.backRightShin.rotationPointY;
        this.backRightHoof.rotationPointZ = this.backRightShin.rotationPointZ;
        this.frontLeftHoof.rotationPointY = this.frontLeftShin.rotationPointY;
        this.frontLeftHoof.rotationPointZ = this.frontLeftShin.rotationPointZ;
        this.frontRightHoof.rotationPointY = this.frontRightShin.rotationPointY;
        this.frontRightHoof.rotationPointZ = this.frontRightShin.rotationPointZ;

        f12 = -1.3089969F + limbSwingAmount * 1.5F;

        if (f12 > 0.0F)
        {
            f12 = 0.0F;
        }

        if (flag)
        {
            this.tail.rotateAngleY = MathHelper.cos(f9 * 0.7F);
            f12 = 0.0F;
        }
        else
        {
            this.tail.rotateAngleY = 0.0F;
        }

        
        this.tail.rotateAngleX = f12;

    }
}

