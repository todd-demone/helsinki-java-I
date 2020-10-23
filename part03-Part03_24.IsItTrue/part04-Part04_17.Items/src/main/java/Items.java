
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String nameOfItem = scanner.nextLine();
            if (nameOfItem.equals("")) {
                break;
            }
            items.add(new Item(nameOfItem));
        }
        
        for (Item item: items) {
            System.out.println(item);
        }
    }
}
