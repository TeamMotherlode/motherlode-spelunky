package motherlode.spelunky.world.gen;

import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import motherlode.base.api.Motherlode;
import motherlode.base.api.worldgen.FeatureTarget;
import motherlode.base.api.worldgen.FeatureTargets;
import motherlode.spelunky.MotherlodeSpelunky;
import motherlode.spelunky.MotherlodeSpelunkyBlocks;

public final class MotherlodeSpelunkyConfiguredFeatures {
    private MotherlodeSpelunkyConfiguredFeatures() {
    }

    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKY_DIRT = Motherlode.getFeaturesManager().addOre(MotherlodeSpelunky.id("rocky_dirt"), FeatureTargets.OVERWORLD, MotherlodeSpelunkyBlocks.ROCKY_DIRT.getDefaultState(), 17, f -> f
        .triangleRange(YOffset.aboveBottom(4), YOffset.fixed(80)).spreadHorizontally().repeat(15));

    public static <FC extends FeatureConfig, F extends Feature<FC>> RegistryKey<ConfiguredFeature<?, ?>> register(String name, FeatureTarget target, ConfiguredFeature<FC, F> feature) {
        return Motherlode.getFeaturesManager().addFeature(MotherlodeSpelunky.id(name), target, feature);
    }

    public static void init() {
    }
}
