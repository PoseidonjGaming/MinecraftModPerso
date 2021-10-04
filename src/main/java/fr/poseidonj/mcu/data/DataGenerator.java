package fr.poseidonj.mcu.data;

import fr.poseidonj.mcu.Main;
import fr.poseidonj.mcu.data.recipe.RecipeGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Main.modID, bus=Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerator {
    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event){
        net.minecraft.data.DataGenerator generator = event.getGenerator();

        if(event.includeServer()){
            generator.addProvider(new RecipeGenerator(generator));
        }

    }
}
