import java.util.Scanner;
import java.util.ArrayList;

public class RecipeBook {
    private Scanner scannerFile;
    private ArrayList<Recipe> book;
    
    public RecipeBook(Scanner scannerFile) {
        this.scannerFile = scannerFile;
        addRecipes();
    }
    
    public void addRecipes(Scanner scanner) {
        int recipeLine = 0;
        String name = "";
        int cookingTime = 0;
        ArrayList<String> ingredients = new ArrayList<>();
        while (scannerFile.hasNextLine()) {
            String row = scannerFile.nextLine();
            if (row.isEmpty()) {
                recipeLine = 0;
                Recipe latestRecipe = new Recipe(name, cookingTime, ingredients);
                book.add(latestRecipe);
                
            } else if (recipeLine == 0) {
                name = row;
                recipeLine += 1;
            } else if (recipeLine == 1) {
                cookingTime = Integer.valueOf(row);
                recipeLine += 1;
            } else {
                ingredients.add(row);
                recipeLine += 1;
            }
        }
        Recipe lastRecipe = new Recipe(name, cookingTime, ingredients);
        book.add(lastRecipe);
        
    }
    
    public void printRecipes() {
        System.out.println("Recipes:");
        for (Recipe recipe: book) {
            System.out.println(recipe);
        }
    }
    
    public void findByName(String recipeName) {
        System.out.println("Recipes: ");
        for (Recipe recipe: book) {
            if (recipe.getName().contains(recipeName)) {
                System.out.println(recipe);
            }
        }
    }

    
}
