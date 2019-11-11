package dinoMod;

import dinoMod.init.ModEntities;
import dinoMod.blocks.counter.TileEntityCounter;
import dinoMod.init.ModRecipes;
import dinoMod.proxy.CommonProxy;
import dinoMod.util.Reference;
import dinoMod.util.handlers.RenderHandler;
import dinoMod.world.ModWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tabs.DinoTab;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class Main {

	@Instance
	public static Main instance;
	
	public static final CreativeTabs dinoTab = new DinoTab("dinoTab");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		GameRegistry.registerTileEntity(TileEntityCounter.class, new ResourceLocation("dm:tile_entity_counter"));
		ModEntities.registerEntities();
		RenderHandler.registerEntityRenders();
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init(); 
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}
