
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.valueOf(scanner.nextLine());
        
        while (firstNumber <= 100) {
            System.out.println(firstNumber);
            firstNumber++;
        }
    }
}
