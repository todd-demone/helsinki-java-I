
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int numberOfDays = Integer.valueOf(scanner.nextLine());
        int numberOfSeconds = 60 * 60 * 24 * numberOfDays;
        System.out.println(numberOfSeconds);
    }
}
