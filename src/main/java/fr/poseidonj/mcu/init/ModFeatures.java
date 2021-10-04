package fr.poseidonj.mcu.init;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public class ModFeatures {

    public ConfiguredFeature<?,?> oreFeature;

    public void init(){
        oreFeature=register("vibranium_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,ModBlocks.vibraniun_ore.get().defaultBlockState(),20)).squared().range(30).count(20));
    }

    public <FC extends IFeatureConfig> ConfiguredFeature<FC,?> register(String name, ConfiguredFeature<FC, ?> feature){
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE,name, feature);
    }

    @SubscribeEvent
    public void biomeLoading(BiomeLoadingEvent event){
        BiomeGenerationSettingsBuilder generation= event.getGeneration();
        if(event.getCategory()!= Biome.Category.NETHER || event.getCategory()!= Biome.Category.THEEND){
            generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, oreFeature);
        }
    }
 }
