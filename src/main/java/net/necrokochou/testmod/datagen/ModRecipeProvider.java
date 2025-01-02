package net.necrokochou.testmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.necrokochou.testmod.TestMod;
import net.necrokochou.testmod.block.ModBlocks;
import net.necrokochou.testmod.datagen.custom.CustomRecipeProvider;
import net.necrokochou.testmod.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<ItemConvertible> PINK_GARNET_SMELTABLES = List.of(ModItems.RAW_PINK_GARNET,
                ModBlocks.PINK_GARNET_ORE,
                ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

        offerSmelting(recipeExporter, PINK_GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GARNET,
                0.25f, 200, "pink_garnet");
        offerBlasting(recipeExporter, PINK_GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GARNET,
                0.25f, 100, "pink_garnet");

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PINK_GARNET,
                RecipeCategory.DECORATIONS, ModBlocks.PINK_GARNET_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_PINK_GARNET_BLOCK)
                .pattern("111")
                .pattern("111")
                .pattern("111")
                .input('1', ModItems.RAW_PINK_GARNET)
                .criterion(hasItem(ModItems.RAW_PINK_GARNET), conditionsFromItem(ModItems.RAW_PINK_GARNET))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET, 9)
                .input(ModBlocks.RAW_PINK_GARNET_BLOCK)
                .criterion(hasItem(ModBlocks.RAW_PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.RAW_PINK_GARNET_BLOCK))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET, 32)
                .input(ModBlocks.MAGIC_BLOCK)
                .criterion(hasItem(ModBlocks.MAGIC_BLOCK), conditionsFromItem(ModBlocks.MAGIC_BLOCK))
                .offerTo(recipeExporter, Identifier.of(TestMod.MOD_ID, "raw_pink_garnet_from_magic_block"));

        createStairsRecipe(ModBlocks.PINK_GARNET_STAIRS, Ingredient.ofItems(ModBlocks.PINK_GARNET_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GARNET_SLAB, Ingredient.ofItems(ModBlocks.PINK_GARNET_BLOCK));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PINK_GARNET_BUTTON, 1)
                .input(ModBlocks.PINK_GARNET_BLOCK)
                .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
                .offerTo(recipeExporter);
        offerPressurePlateRecipe(recipeExporter, ModBlocks.PINK_GARNET_PRESSURE_PLATE, ModBlocks.PINK_GARNET_BLOCK);

        createFenceRecipe(ModBlocks.PINK_GARNET_FENCE, Ingredient.ofItems(ModBlocks.PINK_GARNET_BLOCK));
        createFenceGateRecipe(ModBlocks.PINK_GARNET_FENCE_GATE, Ingredient.ofItems(ModBlocks.PINK_GARNET_BLOCK));
        offerWallRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GARNET_WALL, ModBlocks.PINK_GARNET_BLOCK);

        createDoorRecipe(ModBlocks.PINK_GARNET_DOOR, Ingredient.ofItems(ModBlocks.PINK_GARNET_BLOCK));
        createTrapdoorRecipe(ModBlocks.PINK_GARNET_TRAPDOOR, Ingredient.ofItems(ModBlocks.PINK_GARNET_BLOCK));

        CustomRecipeProvider.createSwordRecipe(recipeExporter, ModItems.PINK_GARNET_SWORD, ModItems.PINK_GARNET, Items.STICK);
        CustomRecipeProvider.createPickaxeRecipe(recipeExporter, ModItems.PINK_GARNET_PICKAXE, ModItems.PINK_GARNET, Items.STICK);
        CustomRecipeProvider.createShovelRecipe(recipeExporter, ModItems.PINK_GARNET_SHOVEL, ModItems.PINK_GARNET, Items.STICK);
        CustomRecipeProvider.createAxeRecipe(recipeExporter, ModItems.PINK_GARNET_AXE, ModItems.PINK_GARNET, Items.STICK);
        CustomRecipeProvider.createHoeRecipe(recipeExporter, ModItems.PINK_GARNET_HOE, ModItems.PINK_GARNET, Items.STICK);
        CustomRecipeProvider.createHammerRecipe(recipeExporter, ModItems.PINK_GARNET_HAMMER, ModItems.PINK_GARNET, Items.STICK);
    }
}
