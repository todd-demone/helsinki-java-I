
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // create list of integers using user input
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            numbers.add(input);
        }
        
        // find smallest number in list
        int smallest = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number < smallest) {
                smallest = number;
            }
        }
        
        // print smallest number
        System.out.println("Smallest number: " + smallest);
        
        // Find smallest number in list
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (smallest == numbers.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }

        
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
