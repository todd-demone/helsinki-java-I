//
//import java.util.Scanner;
//import java.nio.file.Paths;
//
//public class UserInterface {
//
//    private Scanner scannerKeyboard;
//
//    public UserInterface(Scanner scannerKeyboard) {
//        this.scannerKeyboard = scannerKeyboard;
//    }
//
//    public void start() {

//
//        try (Scanner scannerFile = new Scanner(Paths.get(file))) {
//
//            RecipeBook book = new RecipeBook(scannerFile);
//            while (true) {
//                System.out.print("Enter command: ");
//                String command = scannerKeyboard.nextLine();
//
//                if (command.equals("stop")) {
//                    break;
//                }
//
//                if (command.equals("list")) {
//                    book.printRecipes();
//                }
//
//                if (command.equals("find name")) {
//                    System.out.print("Searched word: ");
//                    String recipeName = scannerKeyboard.nextLine();
//                    book.findByName(recipeName);
//                }
//            }
//
//        } catch (Exception e) {
//            System.out.println("Error" + e.getMessage());
//        }
//
//    }
//}
