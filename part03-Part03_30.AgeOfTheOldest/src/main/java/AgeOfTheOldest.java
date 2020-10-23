
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        int oldest = -1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            if (Integer.valueOf(parts[1]) > oldest) {
                oldest = Integer.valueOf(parts[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldest);


    }
}
