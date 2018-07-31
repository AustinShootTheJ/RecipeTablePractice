package main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import main.DataModel.Recipe;
import main.DataModel.RecipeData;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    // create a list of recipes
    private List<Recipe> recipes;
    // create an instance of our Recipe Data class
    private RecipeData data;

    // create an instance of our table view
    @FXML
    private TableView<Recipe> recipesTable;

    public void initialize(){
        //initialize our RD class
       data = new RecipeData();
       Recipe recipe1 = new Recipe("test","test","test");
        recipes = new ArrayList<Recipe>();
       recipes.add(recipe1);
        ObservableList<Recipe> oRecipes = FXCollections.observableArrayList(recipes);
        data.setRecipes(oRecipes);

        // load items into the table
        recipesTable.setItems(data.getRecipes());


    }

    @FXML
    public void handleAddRecipe(){

    }
    @FXML
    public void handleEditRecipe(){

    }
    @FXML
    public void handleDeleteRecipe(){

    }

}
