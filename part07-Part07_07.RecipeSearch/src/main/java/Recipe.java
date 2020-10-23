import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getCookingTime() {
        return this.cookingTime;
    }
    
    public String getIngredients() {
        String strOutput = "";
        for (String ing: ingredients) {
            strOutput += ing + "\n";
        }
        return strOutput;
    }
    
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
