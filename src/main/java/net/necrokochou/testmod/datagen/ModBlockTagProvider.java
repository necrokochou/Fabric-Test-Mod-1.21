package net.necrokochou.testmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.necrokochou.testmod.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PINK_GARNET_BLOCK)
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK)
                .add(ModBlocks.PINK_GARNET_ORE)
                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE)
                .add(ModBlocks.MAGIC_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PINK_GARNET_ORE)
                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.PINK_GARNET_STAIRS);
        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.PINK_GARNET_SLAB);

        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.PINK_GARNET_BUTTON);
        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.PINK_GARNET_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.PINK_GARNET_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.PINK_GARNET_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.PINK_GARNET_WALL);

        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(ModBlocks.PINK_GARNET_DOOR);
        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(ModBlocks.PINK_GARNET_TRAPDOOR);
    }
}
