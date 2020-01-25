package com.bagel.rosewood.core.registry;

import com.bagel.rosewood.common.world.gen.feature.MonkeyBrushFeature;
import com.bagel.rosewood.common.world.gen.feature.PodzolFeature;
import com.bagel.rosewood.common.world.gen.feature.RosewoodTreeFeature;
import com.bagel.rosewood.core.Rosewood;

import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Rosewood.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@SuppressWarnings("rawtypes")
public class RosewoodFeatures {
	
	public static final Feature MONKEY_BRUSH = new MonkeyBrushFeature(NoFeatureConfig::deserialize).setRegistryName("monkey_brush");
	public static final Feature PODZOL = new PodzolFeature(ProbabilityConfig::deserialize).setRegistryName("podzol");
	public static final Feature ROSEWOOD_TREE = new RosewoodTreeFeature(NoFeatureConfig::deserialize, false).setRegistryName("rosewood_tree");

	
    @SubscribeEvent
    public static void registerFeatures(RegistryEvent.Register<Feature<?>> event) {
        event.getRegistry().registerAll(MONKEY_BRUSH, PODZOL, ROSEWOOD_TREE);
    }

}