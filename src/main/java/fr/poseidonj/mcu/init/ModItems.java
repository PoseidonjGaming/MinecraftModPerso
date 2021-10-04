package fr.poseidonj.mcu.init;

import fr.poseidonj.mcu.Main;
import fr.poseidonj.mcu.utils.CustomArmorTiers;
import fr.poseidonj.mcu.utils.CustomItemTiers;
import fr.poseidonj.mcu.utils.ModItemGroups;
import net.minecraft.client.renderer.model.RenderMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModItems {


    public static final DeferredRegister<Item> items= DeferredRegister.create(ForgeRegistries.ITEMS, Main.modID); //Items

    public static final RegistryObject<Item> vibranium_ingot = items.register("vibranium_ingot",()-> new Item(new Item.Properties().tab(ModItemGroups.itemGroupPerso)));
    public static final RegistryObject<Item> vibranium_stick = items.register("vibranium_stick",()-> new Item(new Item.Properties().tab(ModItemGroups.itemGroupPerso)));

    public static final RegistryObject<Item> vibranium_pickaxe= items.register("vibranium_pickaxe",()->new PickaxeItem(CustomItemTiers.VIBRANIUM,1,-2.8f,new Item.Properties().stacksTo(1).tab(ModItemGroups.itemGroupPerso)));
    public static final RegistryObject<Item> vibranium_axe= items.register("vibranium_axe", ()-> new AxeItem(CustomItemTiers.VIBRANIUM,6,-2.6f,new Item.Properties().stacksTo(1).tab(ModItemGroups.itemGroupPerso)));
    public static final RegistryObject<Item> vibranium_shovel= items.register("vibranium_shovel",()-> new ShovelItem(CustomItemTiers.VIBRANIUM,1.5f,-3.f, new Item.Properties().stacksTo(1).tab(ModItemGroups.itemGroupPerso)));
    public static final RegistryObject<Item> vibranium_hoe= items.register("vibranium_hoe",()->new HoeItem(CustomItemTiers.VIBRANIUM,-4,0.0f,new Item.Properties().stacksTo(1).tab(ModItemGroups.itemGroupPerso)));
    public static final RegistryObject<Item> vibranium_sword= items.register("vibranium_sword",()->new SwordItem(CustomItemTiers.VIBRANIUM,3,-2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.itemGroupPerso)));
    //public static final RegistryObject<Item> vibranium_shield= items.register("vibranium_shield",()->new ShieldItem(new Item.Properties().durability(900).tab(ModItemGroups.itemGroupPerso)));

    public static final RegistryObject<Item> vibranium_helmet= items.register("vibranium_helmet",()->new ArmorItem(CustomArmorTiers.VIBRANIUM, EquipmentSlotType.HEAD,new Item.Properties().tab(ModItemGroups.itemGroupPerso)));
    public static final RegistryObject<Item> vibranium_chestplate=items.register("vibranium_chestplate", ()-> new ArmorItem(CustomArmorTiers.VIBRANIUM,EquipmentSlotType.CHEST,new Item.Properties().tab(ModItemGroups.itemGroupPerso)));
    public static final RegistryObject<Item> vibranium_leggings=items.register("vibranium_leggings",()-> new ArmorItem(CustomArmorTiers.VIBRANIUM, EquipmentSlotType.LEGS, new Item.Properties().tab(ModItemGroups.itemGroupPerso)));
    public static final RegistryObject<Item> vibranium_boots= items.register("vibranium_boots",()->new ArmorItem(CustomArmorTiers.VIBRANIUM,EquipmentSlotType.FEET, new Item.Properties().tab(ModItemGroups.itemGroupPerso)));

    public static final RegistryObject<Item> heart_plant=items.register("heart_plant",()->new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(new Food.Builder().nutrition(4).saturationMod(1.4f).effect(new EffectInstance(Effects.DAMAGE_RESISTANCE,20*20,1),1.0f).build()).tab(ModItemGroups.itemGroupPerso)));



}
