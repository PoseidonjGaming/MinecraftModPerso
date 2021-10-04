package fr.poseidonj.mcu.init;

import fr.poseidonj.mcu.Main;
import fr.poseidonj.mcu.utils.ModItemGroups;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> blocks=DeferredRegister.create(ForgeRegistries.BLOCKS, Main.modID);

    public static final RegistryObject<Block> vibranium_block=createBlock("vibranium_block",()-> new Block(AbstractBlock.Properties.of(Material.METAL).strength(5.00f, 6.0f).harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> vibraniun_ore =createBlock("vibranium_ore",()->new Block(AbstractBlock.Properties.of(Material.STONE).strength(3.0f,3.0f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    private static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> suplier){
        RegistryObject<Block> block= blocks.register(name, suplier);
        ModItems.items.register(name, ()->new BlockItem(block.get(), new Item.Properties().tab(ModItemGroups.itemGroupPerso)));
        return block;

    }

}
