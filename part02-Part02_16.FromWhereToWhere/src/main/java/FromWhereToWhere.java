
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to?");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int firstNumber = Integer.valueOf(scanner.nextLine());

        while (firstNumber <= lastNumber) {
            System.out.println(firstNumber);
            firstNumber++;
        }
    }
}
