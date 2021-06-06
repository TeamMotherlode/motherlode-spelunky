package motherlode.spelunky;

import net.minecraft.util.Identifier;
import net.fabricmc.api.ModInitializer;
import motherlode.base.api.Motherlode;
import motherlode.spelunky.world.gen.MotherlodeSpelunkyConfiguredFeatures;
import org.apache.logging.log4j.Level;

public class MotherlodeSpelunky implements ModInitializer {
    public static final String MODID = "motherlode-spelunky";

    @Override
    public void onInitialize() {
        MotherlodeSpelunkyBlocks.init();
        MotherlodeSpelunkyConfiguredFeatures.init();
    }

    public static void log(Level level, CharSequence message) {
        Motherlode.log(level, "Motherlode Spelunky", message);
    }

    public static void log(Level level, Object message) {
        Motherlode.log(level, "Motherlode Spelunky", String.valueOf(message));
    }

    public static Identifier id(String name) {
        return new Identifier(MODID, name);
    }
}
