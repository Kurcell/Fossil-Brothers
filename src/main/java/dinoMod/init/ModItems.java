package dinoMod.init;

import java.util.ArrayList;

import java.util.List;

import dinoMod.items.ItemBase;
import dinoMod.items.armor.ArmorBase;
import dinoMod.items.staffs.Staff;
import dinoMod.items.tools.ManaSword;
import dinoMod.items.tools.ToolAxe;
import dinoMod.items.tools.ToolHoe;
import dinoMod.items.tools.ToolPickaxe;
import dinoMod.items.tools.ToolSpade;
import dinoMod.items.tools.ToolSword;
import dinoMod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_FOSSIL = EnumHelper.addToolMaterial("material_fossil", 1, 800, 5.0F, 1.0F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_FOSSIL = EnumHelper.addArmorMaterial("armor_material_fossil", Reference.MOD_ID + ":fossil", 13, 
			new int[] {2,5,4,1}, 10, SoundEvents.ENTITY_SKELETON_STEP, 0.0F);
	
	//Items
	public static final Item FOSSIL = new ItemBase("fossil");
	
	//Tools
	public static final ItemSword FOSSIL_SWORD = new ToolSword("fossil_sword", MATERIAL_FOSSIL);	
	public static final ItemPickaxe FOSSIL_PICKAXE = new ToolPickaxe("fossil_pickaxe",MATERIAL_FOSSIL);
	public static final ItemAxe FOSSIL_AXE = new ToolAxe("fossil_axe",MATERIAL_FOSSIL);
	public static final ItemSpade FOSSIL_SHOVEL = new ToolSpade("fossil_shovel",MATERIAL_FOSSIL);
	public static final ItemHoe FOSSIL_HOE = new ToolHoe("fossil_hoe",MATERIAL_FOSSIL);
	
	public static final ItemSword MANA_SWORD = new ManaSword("mana_sword",MATERIAL_FOSSIL);
	
	//Staff
	public static final Item STAFF = new Staff("staff");
	
	
	
	//Armor
	public static final Item FOSSIL_HELMET = new ArmorBase("fossil_helmet", ARMOR_MATERIAL_FOSSIL, 1, EntityEquipmentSlot.HEAD);
	public static final Item FOSSIL_CHESTPLATE = new ArmorBase("fossil_chestplate", ARMOR_MATERIAL_FOSSIL, 1, EntityEquipmentSlot.CHEST);
	public static final Item FOSSIL_LEGGINGS = new ArmorBase("fossil_leggings", ARMOR_MATERIAL_FOSSIL, 1, EntityEquipmentSlot.LEGS);
	public static final Item FOSSIL_BOOTS = new ArmorBase("fossil_boots", ARMOR_MATERIAL_FOSSIL, 1, EntityEquipmentSlot.FEET);
}

