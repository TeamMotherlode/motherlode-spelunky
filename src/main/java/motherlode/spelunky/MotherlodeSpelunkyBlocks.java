package motherlode.spelunky;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import motherlode.base.api.Motherlode;
import motherlode.base.api.Registerable;
import motherlode.base.api.resource.CommonAssets;
import motherlode.base.api.resource.CommonData;

public final class MotherlodeSpelunkyBlocks {
    private static final Item.Settings BLOCK_ITEM_SETTINGS = new Item.Settings().group(ItemGroup.MATERIALS);

    public static final Block SLIGHTLY_ROCKY_DIRT = register("slightly_rocky_dirt", new Block(Block.Settings.copy(Blocks.DIRT)));
    public static final Block ROCKY_DIRT = register("rocky_dirt", new Block(Block.Settings.copy(Blocks.DIRT)));
    public static final Block VERY_ROCKY_DIRT = register("very_rocky_dirt", new Block(Block.Settings.copy(Blocks.DIRT)));

    private MotherlodeSpelunkyBlocks() {
    }

    private static <T extends Block> T register(String name, T block) {
        return Motherlode.register(
            Registerable.block(block, BLOCK_ITEM_SETTINGS),
            new Identifier(MotherlodeSpelunky.MODID, name),
            block,
            CommonAssets.DEFAULT_BLOCK,
            CommonData.DEFAULT_BLOCK_LOOT_TABLE
        );
    }

    public static void init() {
    }
}
