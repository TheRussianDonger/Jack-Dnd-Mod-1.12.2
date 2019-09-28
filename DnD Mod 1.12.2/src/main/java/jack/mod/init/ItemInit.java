package jack.mod.init;

import java.util.ArrayList;
import java.util.List;

import jack.mod.items.DndIcon;
import jack.mod.items.ItemBase;
import jack.mod.items.LaurelWreath;
import jack.mod.items.weapons.ItemQuarterStaff;
import jack.mod.items.weapons.LongBow;
import jack.mod.items.weapons.LongSword;
import jack.mod.items.weapons.ShortBow;
import jack.mod.items.weapons.staffs.StaffLightning;
import jack.mod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSword;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;


public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();

	//Material
	public static final ToolMaterial MATERIAL_STEEL = EnumHelper.addToolMaterial("material_steel", 3, 250, 8.0f, 3.0f, 10);
	public static final ToolMaterial STAFF = EnumHelper.addToolMaterial("material_staff", 0, 7, 0, 1, 0);
	public static final ArmorMaterial WREATH = EnumHelper.addArmorMaterial("material_wreath", Reference.MODID + ":wreath", 100, new int[] {0, 0, 0, 1}, 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);
	
	//Items 
	public static final Item DND_ICON = new DndIcon("dnd_icon");
	public static final Item STEEL_INGOT = new ItemBase("ingot_steel");
	public static final Item STEEL_NUGGET = new ItemBase("steel_nugget");
	public static final Item STUDDED_LEATHER = new ItemBase("studded_leather");
	public static final Item REFORMED_STICK = new ItemBase("reformed_stick");
	public static final Item REINFORCED_STICK = new ItemBase("reinforced_stick");
	public static final Item Laurel = new ItemBase("laurel");
	public static final Item Laurel_Wreath = new LaurelWreath(WREATH, 0, EntityEquipmentSlot.HEAD, "laurel_wreath");
	
	//Weapons
	
	//Melee
	public static final ItemSword LONG_SWORD = new LongSword("long_sword", MATERIAL_STEEL);
	public static final ItemQuarterStaff QUARTERSTAFF = new ItemQuarterStaff("quarterstaff", MATERIAL_STEEL);
	//public static final ItemSword Mace = new Mace("mace");
	
	//Ranged
	public static final LongBow LONG_BOW = new LongBow("long_bow");
	public static final ShortBow SHORT_BOW = new ShortBow("short_bow");
	
	
	//Staffs
	public static final ItemSword STAFF_LIGHTNING = new StaffLightning("staff_lightning", STAFF);
}

