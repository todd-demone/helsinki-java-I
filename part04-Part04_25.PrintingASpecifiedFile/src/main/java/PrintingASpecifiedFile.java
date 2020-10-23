
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed? ");
        String fileName = scanner.nextLine();
        try (Scanner fileRead = new Scanner(Paths.get(fileName))) {
            while(fileRead.hasNextLine()) {
                System.out.println(fileRead.nextLine());
            }
        } catch(Exception e) {
            System.out.println("Error: there is no file named " + e.getMessage());
        }

    }
}
