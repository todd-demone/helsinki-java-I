
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        ArrayList<Recipe> book = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();

        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - list the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("");

        try (Scanner scannerFile = new Scanner(Paths.get(file))) {
//            RecipeBook book = new RecipeBook(scannerFile);
//            book.printRecipes();
            int recipeLine = 0;
            String name = "";
            int cookingTime = 0;
            ArrayList<String> ingredients = new ArrayList<>();
            while (scannerFile.hasNextLine()) {
                String row = scannerFile.nextLine();
                if (row.equals("")) {
                    System.out.println(row);
                    recipeLine = 0;
                    System.out.println(recipeLine);
                    book.add(new Recipe(name, cookingTime, ingredients));
                } else if (recipeLine == 0) {
                    System.out.println(row);
                    name = row;
                    recipeLine += 1;
                    System.out.println(recipeLine);
                } else if (recipeLine == 1) {
                    System.out.println(row);
                    cookingTime = Integer.valueOf(row);
                    recipeLine += 1;
                    System.out.println(recipeLine);
                } else {
                    System.out.println(row);
                    ingredients.add(row);
                    System.out.println(recipeLine);
                }
            }
            book.add(new Recipe(name, cookingTime, ingredients));
            for (Recipe rec : book) {
                System.out.println(rec);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
