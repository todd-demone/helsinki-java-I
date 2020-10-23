
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number:");
        int upperLimit = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
        for (int factor = 1; factor <= upperLimit; factor++) {
            factorial = factorial * factor; 
        }
        System.out.println("Factorial:" + factorial);
    }
}
