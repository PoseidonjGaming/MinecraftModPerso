package fr.poseidonj.mcu;

import fr.poseidonj.mcu.init.ModBlocks;
import fr.poseidonj.mcu.init.ModFeatures;
import fr.poseidonj.mcu.init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.modID)
public class Main {

    public static final String modID="mcu";

    public Main(){

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);

        IEventBus bus=FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.items.register(bus);
        ModBlocks.blocks.register(bus);

    }


    private void setup(FMLCommonSetupEvent event) {

        ModFeatures features= new ModFeatures();
        features.init();
        MinecraftForge.EVENT_BUS.register(features);

    }

    private void client(FMLClientSetupEvent event){

    }
}
