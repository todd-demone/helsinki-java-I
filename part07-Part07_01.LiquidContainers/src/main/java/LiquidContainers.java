
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (first + amount >= 100) {
                    first = 100;
                } else if (amount > 0) {
                    first = first + amount;
                }

            }

            if (command.equals("move")) {
               // move amount moves the amount of liquid specified by the parameter from the first container to the second container. The given amount must be specified as an integer. If the program is requested to move more liquid than than the first container currently holds, move all the remaining liquid. The second container can't hold more than one hundred liters of liquid and everything past that will go to waste.
               
               if (amount > first) {
                   amount = first;
                   
               }
               
               if (amount + second >= 100) {
                   second = 100;
                   first = first - amount;
                   
               } else if (amount > 0) {
                   second = second + amount;
                   first = first - amount;
               }
               
            }

            if (command.equals("remove")) {
                if (amount > second) {
                    second = 0;
                } else if (amount > 0) {
                    second = second - amount;
                }
            }

           

        }
    }

}
