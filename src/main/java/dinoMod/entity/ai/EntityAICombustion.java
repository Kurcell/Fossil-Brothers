package dinoMod.entity.ai;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.world.World;

public class EntityAICombustion extends EntityAIBase{
	
	private final EntityCreature creature;
    private final World world;
	
	public EntityAICombustion(EntityCreature theCreatureIn)
    {
        this.creature = theCreatureIn;
        this.world = theCreatureIn.world;
        this.setMutexBits(1);
    }

	@Override
	public boolean shouldExecute() {
		if(this.creature.isBurning()) {
			this.creature.extinguish();
			this.creature.setFire(10000);
			if(this.creature.getHealth()<10F) {
				explode();
			}
			return true;
		}
		return false;
	}
	
	@Override
	public boolean shouldContinueExecuting()
    {
        return this.shouldExecute();
    }
	
	private void explode()
    {
        if (!this.world.isRemote)
        {
        	boolean flag = net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.world, this.creature);
            this.creature.isDead = true;
            this.world.createExplosion(this.creature, this.creature.posX, this.creature.posY, this.creature.posZ, 5F, flag);
            this.creature.setDead();
        }
    }
}
