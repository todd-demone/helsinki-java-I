
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        int longestNameLength = 0;
        String longestName = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");

            // add birth year to sum
            sum += Integer.valueOf(parts[1]);
            count += 1;
            
            // check if length of name is longest so far
            int nameLength = Integer.valueOf(parts[0].length());
            if (nameLength > longestNameLength) {
                longestNameLength = nameLength;
                longestName = parts[0];
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));
        //loop
        // get input
        // check if oldest
        // add to sum
        

    }
}
