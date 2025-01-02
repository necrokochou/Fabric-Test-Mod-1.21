package net.necrokochou.testmod.datagen.custom;

import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;

import static net.minecraft.data.server.recipe.RecipeProvider.conditionsFromItem;
import static net.minecraft.data.server.recipe.RecipeProvider.hasItem;

public class CustomRecipeProvider {
    public static void createSwordRecipe(RecipeExporter recipeExporter, ItemConvertible output,
                                         ItemConvertible material, ItemConvertible handle) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("m")
                .pattern("m")
                .pattern("h")
                .input('m', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .input('h', handle)
                .criterion(hasItem(handle), conditionsFromItem(handle))
                .offerTo(recipeExporter);
    }

    public static void createPickaxeRecipe(RecipeExporter recipeExporter, ItemConvertible output,
                                           ItemConvertible material, ItemConvertible handle) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("mmm")
                .pattern(" h ")
                .pattern(" h ")
                .input('m', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .input('h', handle)
                .criterion(hasItem(handle), conditionsFromItem(handle))
                .offerTo(recipeExporter);
    }

    public static void createShovelRecipe(RecipeExporter recipeExporter, ItemConvertible output,
                                          ItemConvertible material, ItemConvertible handle) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("m")
                .pattern("h")
                .pattern("h")
                .input('m', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .input('h', handle)
                .criterion(hasItem(handle), conditionsFromItem(handle))
                .offerTo(recipeExporter);
    }

    public static void createAxeRecipe(RecipeExporter recipeExporter, ItemConvertible output,
                                       ItemConvertible material, ItemConvertible handle) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("mm")
                .pattern("mh")
                .pattern(" h")
                .input('m', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .input('h', handle)
                .criterion(hasItem(handle), conditionsFromItem(handle))
                .offerTo(recipeExporter);
    }

    public static void createHoeRecipe(RecipeExporter recipeExporter, ItemConvertible output,
                                       ItemConvertible material, ItemConvertible handle) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("mm")
                .pattern(" h")
                .pattern(" h")
                .input('m', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .input('h', handle)
                .criterion(hasItem(handle), conditionsFromItem(handle))
                .offerTo(recipeExporter);
    }

    public static void createHammerRecipe(RecipeExporter recipeExporter, ItemConvertible output,
                                          ItemConvertible material, ItemConvertible handle) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("mmm")
                .pattern("mmm")
                .pattern(" h ")
                .input('m', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .input('h', handle)
                .criterion(hasItem(handle), conditionsFromItem(handle))
                .offerTo(recipeExporter);
    }
}
