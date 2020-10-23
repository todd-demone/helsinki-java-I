
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        GradeBook book = new GradeBook();
        UserInterface userInterface = new UserInterface(book, scanner);
        userInterface.start();
    }
}
