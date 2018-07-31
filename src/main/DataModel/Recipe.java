package main.DataModel;

import javafx.beans.property.SimpleStringProperty;

public class Recipe {

    SimpleStringProperty name = new SimpleStringProperty("");
    SimpleStringProperty ingredients = new SimpleStringProperty("");
    SimpleStringProperty notes =new SimpleStringProperty("");


    public Recipe(String name, String ingredients, String notes) {
        this.name.set(name);
        this.ingredients.set(ingredients);
        this.notes.set(notes);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getIngredients() {
        return ingredients.get();
    }

    public SimpleStringProperty ingredientsProperty() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients.set(ingredients);
    }

    public String getNotes() {
        return notes.get();
    }

    public SimpleStringProperty notesProperty() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes.set(notes);
    }
}
