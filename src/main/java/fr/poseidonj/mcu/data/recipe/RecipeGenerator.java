package fr.poseidonj.mcu.data.recipe;

import fr.poseidonj.mcu.init.ModBlocks;
import fr.poseidonj.mcu.init.ModItems;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import java.util.function.Consumer;

public class RecipeGenerator extends RecipeProvider {

    public RecipeGenerator(DataGenerator p_i48262_1_) {
        super(p_i48262_1_);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer){

        //Table de craft
        ShapedRecipeBuilder.shaped(ModBlocks.vibranium_block.get())
                .pattern("vvv")
                .pattern("vvv")
                .pattern("vvv")
                .define('v', ModItems.vibranium_ingot.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.vibranium_ingot.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.vibranium_stick.get())
                .pattern("x")
                .pattern("x")
                .define('x', ModItems.vibranium_ingot.get())
                .unlockedBy("unlock",InventoryChangeTrigger.Instance.hasItems(ModItems.vibranium_ingot.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.vibranium_axe.get())
                .pattern("ii")
                .pattern("is")
                .pattern(" s")
                .define('i', ModItems.vibranium_ingot.get())
                .define('s', Items.STICK)
                .unlockedBy("unlock",InventoryChangeTrigger.Instance.hasItems(ModItems.vibranium_ingot.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.vibranium_pickaxe.get())
                .pattern("iii")
                .pattern(" s ")
                .pattern(" s ")
                .define('i', ModItems.vibranium_ingot.get())
                .define('s', Items.STICK)
                .unlockedBy("unlock",InventoryChangeTrigger.Instance.hasItems(ModItems.vibranium_ingot.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.vibranium_hoe.get())
                .pattern("ii")
                .pattern(" i")
                .pattern(" s")
                .define('i', ModItems.vibranium_ingot.get())
                .define('s', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.vibranium_ingot.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.vibranium_shovel.get())
                .pattern("i")
                .pattern("s")
                .pattern("s")
                .define('i', ModItems.vibranium_ingot.get())
                .define('s', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.vibranium_ingot.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.vibranium_sword.get())
                .pattern("i")
                .pattern("i")
                .pattern("s")
                .define('i', ModItems.vibranium_ingot.get())
                .define('s', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.vibranium_ingot.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.vibranium_helmet.get())
                .pattern("iii")
                .pattern("i i")
                .define('i', ModItems.vibranium_ingot.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.vibranium_ingot.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.vibranium_chestplate.get())
                .pattern("i i")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.vibranium_ingot.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.vibranium_ingot.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.vibranium_leggings.get())
                .pattern("iii")
                .pattern("i i")
                .pattern("i i")
                .define('i', ModItems.vibranium_ingot.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.vibranium_ingot.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.vibranium_boots.get())
                .pattern("i i")
                .pattern("i i")
                .define('i', ModItems.vibranium_ingot.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.vibranium_ingot.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.heart_plant.get())
                .pattern(" m ")
                .pattern("mfm")
                .pattern(" m ")
                .define('m', ModItems.vibranium_stick.get())
                .define('f', Items.SWEET_BERRIES)
                .unlockedBy("unlock_stick",InventoryChangeTrigger.Instance.hasItems(ModItems.vibranium_stick.get()))
                .unlockedBy("unlock_berries", InventoryChangeTrigger.Instance.hasItems(Items.SWEET_BERRIES))
                .save(consumer);

        //Upgrade pickaxe
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_PICKAXE), Ingredient.of(Blocks.STONE), Items.STONE_PICKAXE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_PICKAXE)).save(consumer,"pickaxe_wood_to_stone_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_PICKAXE), Ingredient.of(Items.IRON_INGOT), Items.IRON_PICKAXE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_PICKAXE)).save(consumer,"pickaxe_wood_to_iron_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_PICKAXE), Ingredient.of(Items.DIAMOND), Items.DIAMOND_PICKAXE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_PICKAXE)).save(consumer,"pickaxe_wood_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_PICKAXE), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_PICKAXE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_PICKAXE)).save(consumer,"pickaxe_wood_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_PICKAXE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_pickaxe.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_PICKAXE)).save(consumer,"pickaxe_wood_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.STONE_PICKAXE), Ingredient.of(Items.IRON_INGOT), Items.IRON_PICKAXE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.STONE_PICKAXE)).save(consumer,"pickaxe_stone_to_iron_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.STONE_PICKAXE), Ingredient.of(Items.DIAMOND), Items.DIAMOND_PICKAXE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.STONE_PICKAXE)).save(consumer,"pickaxe_stone_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.STONE_PICKAXE), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_PICKAXE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.STONE_PICKAXE)).save(consumer,"pickaxe_stone_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.STONE_PICKAXE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_ingot.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.STONE_PICKAXE)).save(consumer,"pickaxe_stone_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_PICKAXE), Ingredient.of(Items.DIAMOND), Items.DIAMOND_PICKAXE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_PICKAXE)).save(consumer,"pickaxe_iron_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_PICKAXE), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_PICKAXE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_PICKAXE)).save(consumer,"pickaxe_iron_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_PICKAXE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_pickaxe.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_PICKAXE)).save(consumer,"pickaxe_iron_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_PICKAXE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_pickaxe.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_PICKAXE)).save(consumer,"pickaxe_diamond_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_PICKAXE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_pickaxe.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.NETHERITE_AXE)).save(consumer,"pickaxe_netherite_to_vibranium_smithing");


        //Upgrade axe
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_AXE), Ingredient.of(Blocks.STONE), Items.STONE_AXE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_AXE)).save(consumer,"axe_wood_to_stone_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_AXE), Ingredient.of(Items.IRON_INGOT), Items.IRON_AXE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_AXE)).save(consumer,"axe_wood_to_iron_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_AXE), Ingredient.of(Items.DIAMOND), Items.DIAMOND_AXE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_AXE)).save(consumer,"axe_wood_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_AXE), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_AXE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_AXE)).save(consumer,"axe_wood_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_AXE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_axe.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_AXE)).save(consumer,"axe_wood_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.STONE_AXE), Ingredient.of(Items.IRON_INGOT), Items.IRON_AXE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.STONE_AXE)).save(consumer,"axe_stone_to_iron_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.STONE_AXE), Ingredient.of(Items.DIAMOND), Items.DIAMOND_AXE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.STONE_AXE)).save(consumer,"axe_stone_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.STONE_AXE), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_AXE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.STONE_AXE)).save(consumer,"axe_stone_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.STONE_AXE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_ingot.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.STONE_AXE)).save(consumer,"axe_stone_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_AXE), Ingredient.of(Items.DIAMOND), Items.DIAMOND_AXE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_AXE)).save(consumer,"axe_iron_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_AXE), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_AXE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_AXE)).save(consumer,"axe_iron_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_AXE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_axe.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_AXE)).save(consumer,"axe_iron_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_AXE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_axe.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.DIAMOND_AXE)).save(consumer,"axe_diamond_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_AXE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_axe.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.NETHERITE_AXE)).save(consumer,"axe_netherite_to_vibranium_smithing");

        //Upgrade sword
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_SWORD), Ingredient.of(Blocks.STONE), Items.STONE_SWORD).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_SWORD)).save(consumer,"sword_wood_to_stone_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_SWORD), Ingredient.of(Items.IRON_INGOT), Items.IRON_SWORD).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_SWORD)).save(consumer,"sword_wood_to_iron_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_SWORD), Ingredient.of(Items.DIAMOND), Items.DIAMOND_SWORD).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_SWORD)).save(consumer,"sword_wood_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_SWORD), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_SWORD).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_SWORD)).save(consumer,"sword_wood_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_SWORD), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_sword.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_SWORD)).save(consumer,"sword_wood_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.STONE_SWORD), Ingredient.of(Items.IRON_INGOT), Items.IRON_SWORD).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.STONE_SWORD)).save(consumer,"sword_stone_to_iron_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.STONE_SWORD), Ingredient.of(Items.DIAMOND), Items.DIAMOND_SWORD).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.STONE_SWORD)).save(consumer,"sword_stone_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.STONE_SWORD), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_SWORD).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.STONE_SWORD)).save(consumer,"sword_stone_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.STONE_SWORD), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_ingot.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.STONE_SWORD)).save(consumer,"sword_stone_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_SWORD), Ingredient.of(Items.DIAMOND), Items.DIAMOND_SWORD).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_SWORD)).save(consumer,"sword_iron_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_SWORD), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_SWORD).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_SWORD)).save(consumer,"sword_iron_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_SWORD), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_sword.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_SWORD)).save(consumer,"sword_iron_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_SWORD), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_sword.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.DIAMOND_SWORD)).save(consumer,"sword_diamond_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_SWORD), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_sword.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.NETHERITE_SWORD)).save(consumer,"sword_netherite_to_vibranium_smithing");

        //Upgrade shovel
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_SHOVEL), Ingredient.of(Blocks.STONE), Items.STONE_SHOVEL).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_SHOVEL)).save(consumer,"shovel_wood_to_stone_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_SHOVEL), Ingredient.of(Items.IRON_INGOT), Items.IRON_SHOVEL).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_SHOVEL)).save(consumer,"shovel_wood_to_iron_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_SHOVEL), Ingredient.of(Items.DIAMOND), Items.DIAMOND_SHOVEL).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_SHOVEL)).save(consumer,"shovel_wood_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_SHOVEL), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_SHOVEL).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_SHOVEL)).save(consumer,"shovel_wood_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_SHOVEL), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_shovel.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_SHOVEL)).save(consumer,"shovel_wood_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.STONE_SHOVEL), Ingredient.of(Items.IRON_INGOT), Items.IRON_SHOVEL).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.STONE_SHOVEL)).save(consumer,"shovel_stone_to_iron_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.STONE_SHOVEL), Ingredient.of(Items.DIAMOND), Items.DIAMOND_SHOVEL).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.STONE_SHOVEL)).save(consumer,"shovel_stone_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.STONE_SHOVEL), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_SHOVEL).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.STONE_SHOVEL)).save(consumer,"shovel_stone_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.STONE_SHOVEL), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_ingot.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.STONE_SHOVEL)).save(consumer,"shovel_stone_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_SHOVEL), Ingredient.of(Items.DIAMOND), Items.DIAMOND_SHOVEL).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_SHOVEL)).save(consumer,"shovel_iron_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_SHOVEL), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_SHOVEL).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_SHOVEL)).save(consumer,"shovel_iron_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_SHOVEL), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_shovel.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_SHOVEL)).save(consumer,"shovel_iron_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_SHOVEL), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_shovel.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.DIAMOND_SHOVEL)).save(consumer,"shovel_diamond_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_SHOVEL), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_shovel.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.NETHERITE_SHOVEL)).save(consumer,"shovel_netherite_to_vibranium_smithing");

        //Upgrade hoe
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_HOE), Ingredient.of(Blocks.STONE), Items.STONE_HOE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_HOE)).save(consumer,"hoe_wood_to_stone_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_HOE), Ingredient.of(Items.IRON_INGOT), Items.IRON_HOE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_HOE)).save(consumer,"hoe_wood_to_iron_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_HOE), Ingredient.of(Items.DIAMOND), Items.DIAMOND_HOE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_HOE)).save(consumer,"hoe_wood_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_HOE), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_HOE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_HOE)).save(consumer,"hoe_wood_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.WOODEN_HOE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_hoe.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.WOODEN_HOE)).save(consumer,"hoe_wood_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.STONE_HOE), Ingredient.of(Items.IRON_INGOT), Items.IRON_HOE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.STONE_HOE)).save(consumer,"hoe_stone_to_iron_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.STONE_HOE), Ingredient.of(Items.DIAMOND), Items.DIAMOND_HOE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.STONE_HOE)).save(consumer,"hoe_stone_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.STONE_HOE), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_HOE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.STONE_HOE)).save(consumer,"hoe_stone_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.STONE_HOE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_ingot.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.STONE_HOE)).save(consumer,"hoe_stone_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_HOE), Ingredient.of(Items.DIAMOND), Items.DIAMOND_HOE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_HOE)).save(consumer,"hoe_iron_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_HOE), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_HOE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_HOE)).save(consumer,"hoe_iron_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_HOE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_hoe.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_HOE)).save(consumer,"hoe_iron_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_HOE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_hoe.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.DIAMOND_HOE)).save(consumer,"hoe_diamond_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_HOE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_hoe.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.NETHERITE_HOE)).save(consumer,"hoe_netherite_to_vibranium_smithing");

        //Upgrade helmet
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_HELMET), Ingredient.of(Items.CHAIN), Items.CHAINMAIL_HELMET).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_HELMET)).save(consumer,"helmet_leather_to_chainmail_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_HELMET), Ingredient.of(Items.IRON_INGOT), Items.IRON_HELMET).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_HELMET)).save(consumer,"helmet_leather_to_iron_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_HELMET), Ingredient.of(Items.GOLD_INGOT), Items.GOLDEN_HELMET).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_HELMET)).save(consumer,"helmet_leather_to_gold_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_HELMET), Ingredient.of(Items.DIAMOND), Items.DIAMOND_HELMET).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_HELMET)).save(consumer,"helmet_leather_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_HELMET), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_HELMET).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_HELMET)).save(consumer,"helmet_leather_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_HELMET), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_helmet.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_HELMET)).save(consumer,"helmet_leather_to_vibranium_smithing");


        SmithingRecipeBuilder.smithing(Ingredient.of(Items.CHAINMAIL_HELMET), Ingredient.of(Items.IRON_INGOT), Items.IRON_HELMET).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.CHAINMAIL_HELMET)).save(consumer,"helmet_chainmail_to_iron_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.CHAINMAIL_HELMET), Ingredient.of(Items.DIAMOND), Items.DIAMOND_HELMET).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.CHAINMAIL_HELMET)).save(consumer,"helmet_chainmail_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.CHAINMAIL_HELMET), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_HELMET).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.CHAINMAIL_HELMET)).save(consumer,"helmet_chainmail_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.CHAINMAIL_HELMET), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_helmet.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.CHAINMAIL_HELMET)).save(consumer,"helmet_chainmail_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_HELMET), Ingredient.of(Items.DIAMOND), Items.DIAMOND_HELMET).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_HELMET)).save(consumer,"helmet_iron_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_HELMET), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_HELMET).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_HELMET)).save(consumer,"helmet_iron_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_HELMET), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_helmet.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_HELMET)).save(consumer,"helmet_iron_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.GOLDEN_HELMET), Ingredient.of(Items.DIAMOND), Items.DIAMOND_HELMET).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.GOLDEN_HELMET)).save(consumer,"helmet_gold_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.GOLDEN_HELMET), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_HELMET).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.GOLDEN_HELMET)).save(consumer,"helmet_gold_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.GOLDEN_HELMET), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_helmet.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.GOLDEN_HELMET)).save(consumer,"helmet_gold_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_HELMET), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_helmet.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.DIAMOND_HELMET)).save(consumer,"helmet_diamond_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_HELMET), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_helmet.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.NETHERITE_HELMET)).save(consumer,"helmet_netherite_to_vibranium_smithing");

        //Upgrade chestplate
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_CHESTPLATE), Ingredient.of(Items.CHAIN), Items.CHAINMAIL_CHESTPLATE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_CHESTPLATE)).save(consumer,"chestplate_leather_to_chainmail_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_CHESTPLATE), Ingredient.of(Items.IRON_INGOT), Items.IRON_CHESTPLATE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_CHESTPLATE)).save(consumer,"chestplate_leather_to_iron_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_CHESTPLATE), Ingredient.of(Items.GOLD_INGOT), Items.GOLDEN_CHESTPLATE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_CHESTPLATE)).save(consumer,"chestplate_leather_to_gold_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_CHESTPLATE), Ingredient.of(Items.DIAMOND), Items.DIAMOND_CHESTPLATE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_CHESTPLATE)).save(consumer,"chestplate_leather_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_CHESTPLATE), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_CHESTPLATE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_CHESTPLATE)).save(consumer,"chestplate_leather_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_CHESTPLATE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_chestplate.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_CHESTPLATE)).save(consumer,"chestplate_leather_to_vibranium_smithing");


        SmithingRecipeBuilder.smithing(Ingredient.of(Items.CHAINMAIL_CHESTPLATE), Ingredient.of(Items.IRON_INGOT), Items.IRON_CHESTPLATE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.CHAINMAIL_CHESTPLATE)).save(consumer,"chestplate_chainmail_to_iron_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.CHAINMAIL_CHESTPLATE), Ingredient.of(Items.DIAMOND), Items.DIAMOND_CHESTPLATE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.CHAINMAIL_CHESTPLATE)).save(consumer,"chestplate_chainmail_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.CHAINMAIL_CHESTPLATE), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_CHESTPLATE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.CHAINMAIL_CHESTPLATE)).save(consumer,"chestplate_chainmail_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.CHAINMAIL_CHESTPLATE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_chestplate.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.CHAINMAIL_CHESTPLATE)).save(consumer,"chestplate_chainmail_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_CHESTPLATE), Ingredient.of(Items.DIAMOND), Items.DIAMOND_CHESTPLATE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_CHESTPLATE)).save(consumer,"chestplate_iron_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_CHESTPLATE), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_CHESTPLATE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_CHESTPLATE)).save(consumer,"chestplate_iron_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_CHESTPLATE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_chestplate.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_CHESTPLATE)).save(consumer,"chestplate_iron_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.GOLDEN_CHESTPLATE), Ingredient.of(Items.DIAMOND), Items.DIAMOND_CHESTPLATE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.GOLDEN_CHESTPLATE)).save(consumer,"chestplate_gold_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.GOLDEN_CHESTPLATE), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_CHESTPLATE).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.GOLDEN_CHESTPLATE)).save(consumer,"chestplate_gold_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.GOLDEN_CHESTPLATE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_chestplate.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.GOLDEN_CHESTPLATE)).save(consumer,"chestplate_gold_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_CHESTPLATE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_chestplate.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.DIAMOND_CHESTPLATE)).save(consumer,"chestplate_diamond_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_CHESTPLATE), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_chestplate.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.NETHERITE_CHESTPLATE)).save(consumer,"chestplate_netherite_to_vibranium_smithing");

        //Upgrade leggings
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_LEGGINGS), Ingredient.of(Items.CHAIN), Items.CHAINMAIL_LEGGINGS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_LEGGINGS)).save(consumer,"leggings_leather_to_chainmail_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_LEGGINGS), Ingredient.of(Items.IRON_INGOT), Items.IRON_LEGGINGS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_LEGGINGS)).save(consumer,"leggings_leather_to_iron_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_LEGGINGS), Ingredient.of(Items.GOLD_INGOT), Items.GOLDEN_LEGGINGS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_LEGGINGS)).save(consumer,"leggings_leather_to_gold_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_LEGGINGS), Ingredient.of(Items.DIAMOND), Items.DIAMOND_LEGGINGS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_LEGGINGS)).save(consumer,"leggings_leather_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_LEGGINGS), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_LEGGINGS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_LEGGINGS)).save(consumer,"leggings_leather_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_LEGGINGS), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_leggings.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_LEGGINGS)).save(consumer,"leggings_leather_to_vibranium_smithing");


        SmithingRecipeBuilder.smithing(Ingredient.of(Items.CHAINMAIL_LEGGINGS), Ingredient.of(Items.IRON_INGOT), Items.IRON_LEGGINGS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.CHAINMAIL_LEGGINGS)).save(consumer,"leggings_chainmail_to_iron_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.CHAINMAIL_LEGGINGS), Ingredient.of(Items.DIAMOND), Items.DIAMOND_LEGGINGS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.CHAINMAIL_LEGGINGS)).save(consumer,"leggings_chainmail_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.CHAINMAIL_LEGGINGS), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_LEGGINGS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.CHAINMAIL_LEGGINGS)).save(consumer,"leggings_chainmail_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.CHAINMAIL_LEGGINGS), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_leggings.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.CHAINMAIL_LEGGINGS)).save(consumer,"leggings_chainmail_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_LEGGINGS), Ingredient.of(Items.DIAMOND), Items.DIAMOND_LEGGINGS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_LEGGINGS)).save(consumer,"leggings_iron_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_LEGGINGS), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_LEGGINGS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_LEGGINGS)).save(consumer,"leggings_iron_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_LEGGINGS), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_leggings.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_LEGGINGS)).save(consumer,"leggings_iron_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.GOLDEN_LEGGINGS), Ingredient.of(Items.DIAMOND), Items.DIAMOND_LEGGINGS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.GOLDEN_LEGGINGS)).save(consumer,"leggings_gold_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.GOLDEN_LEGGINGS), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_LEGGINGS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.GOLDEN_LEGGINGS)).save(consumer,"leggings_gold_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.GOLDEN_LEGGINGS), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_leggings.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.GOLDEN_LEGGINGS)).save(consumer,"leggings_gold_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_LEGGINGS), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_leggings.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.DIAMOND_LEGGINGS)).save(consumer,"leggings_diamond_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_LEGGINGS), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_leggings.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.NETHERITE_LEGGINGS)).save(consumer,"leggings_netherite_to_vibranium_smithing");

        //Upgrade boots
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_BOOTS), Ingredient.of(Items.CHAIN), Items.CHAINMAIL_BOOTS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_BOOTS)).save(consumer,"boots_leather_to_chainmail_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_BOOTS), Ingredient.of(Items.IRON_INGOT), Items.IRON_BOOTS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_BOOTS)).save(consumer,"boots_leather_to_iron_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_BOOTS), Ingredient.of(Items.GOLD_INGOT), Items.GOLDEN_BOOTS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_BOOTS)).save(consumer,"boots_leather_to_gold_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_BOOTS), Ingredient.of(Items.DIAMOND), Items.DIAMOND_BOOTS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_BOOTS)).save(consumer,"boots_leather_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_BOOTS), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_BOOTS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_BOOTS)).save(consumer,"boots_leather_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.LEATHER_BOOTS), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_boots.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.LEATHER_BOOTS)).save(consumer,"boots_leather_to_vibranium_smithing");


        SmithingRecipeBuilder.smithing(Ingredient.of(Items.CHAINMAIL_BOOTS), Ingredient.of(Items.IRON_INGOT), Items.IRON_BOOTS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.CHAINMAIL_BOOTS)).save(consumer,"boots_chainmail_to_iron_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.CHAINMAIL_BOOTS), Ingredient.of(Items.DIAMOND), Items.DIAMOND_BOOTS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.CHAINMAIL_BOOTS)).save(consumer,"boots_chainmail_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.CHAINMAIL_BOOTS), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_BOOTS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.CHAINMAIL_BOOTS)).save(consumer,"boots_chainmail_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.CHAINMAIL_BOOTS), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_boots.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.CHAINMAIL_BOOTS)).save(consumer,"boots_chainmail_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_BOOTS), Ingredient.of(Items.DIAMOND), Items.DIAMOND_BOOTS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_BOOTS)).save(consumer,"boots_iron_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_BOOTS), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_BOOTS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_BOOTS)).save(consumer,"boots_iron_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_BOOTS), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_boots.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.IRON_BOOTS)).save(consumer,"boots_iron_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.GOLDEN_BOOTS), Ingredient.of(Items.DIAMOND), Items.DIAMOND_BOOTS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.GOLDEN_BOOTS)).save(consumer,"boots_gold_to_diamond_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.GOLDEN_BOOTS), Ingredient.of(Items.NETHERITE_INGOT), Items.NETHERITE_BOOTS).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.GOLDEN_BOOTS)).save(consumer,"boots_gold_to_netherite_smithing");
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.GOLDEN_BOOTS), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_boots.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.GOLDEN_BOOTS)).save(consumer,"boots_gold_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_BOOTS), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_boots.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.DIAMOND_BOOTS)).save(consumer,"boots_diamond_to_vibranium_smithing");

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_BOOTS), Ingredient.of(ModItems.vibranium_ingot.get()), ModItems.vibranium_boots.get()).unlocks("unlock", InventoryChangeTrigger.Instance.hasItems(Items.NETHERITE_BOOTS)).save(consumer,"boots_netherite_to_vibranium_smithing");

        //furnace
        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.vibraniun_ore.get()),ModItems.vibranium_ingot.get(),0.2f,200).unlockedBy("unlock",InventoryChangeTrigger.Instance.hasItems(ModBlocks.vibraniun_ore.get())).save(consumer,"vibranium_ingot_smelting");

        //blasting (better furnace for ore)
        CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.vibraniun_ore.get()),ModItems.vibranium_ingot.get(),0.2f,200).unlockedBy("unlock",InventoryChangeTrigger.Instance.hasItems(ModBlocks.vibraniun_ore.get())).save(consumer,"vibranium_ingot_blasting");
    }
}
