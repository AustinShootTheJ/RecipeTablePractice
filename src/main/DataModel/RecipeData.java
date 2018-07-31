package main.DataModel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class RecipeData {

    private ObservableList<Recipe> recipes;

    public RecipeData(){
    recipes = FXCollections.observableArrayList();

    }

    public void addRecipe(Recipe recipe){
        recipes.add(recipe);
    }

    public void removeRecipe(Recipe recipe){
        recipes.remove(recipe);
    }

    public void editRecipe(Recipe recipe, String name, String ingredients, String notes){
        recipe.setName(name);
        recipe.setIngredients(ingredients);
        recipe.setNotes(notes);
    }

    public ObservableList<Recipe> getRecipes(){

        return recipes;
    }

    public void setRecipes(ObservableList<Recipe> recipes) {
        this.recipes = recipes;
    }
}
