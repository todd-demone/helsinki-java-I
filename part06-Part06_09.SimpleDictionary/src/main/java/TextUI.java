import java.util.Scanner;

public class TextUI {
    private SimpleDictionary dictionary;
    private Scanner scanner;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scanner;
    }
    
    public void start() {  
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
            } else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String word = scanner.nextLine();
                if (this.dictionary.translate(word) == null) {
                    System.out.println("Word " + word + " was not found");
                    continue;        
                }
                System.out.println("Translation: " + this.dictionary.translate(word));
            } else {
                System.out.println("Unknown command");
            }
        }
        System.out.println("Bye bye!");
    }

}
