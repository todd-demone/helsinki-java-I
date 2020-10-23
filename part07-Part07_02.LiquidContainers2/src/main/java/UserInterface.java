
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Container first;
    private Container second;

    public UserInterface(Scanner scanner) {
       this.scanner = scanner;
       this.first = new Container();
       this.second = new Container();
    }

    public void start() {
        while (true) {
            System.out.println("First: " + this.first.contains() + "/100");
            System.out.println("Second: " + this.second.contains() + "/100");
            System.out.print("> ");

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] partsOfInput = input.split(" ");
            input = partsOfInput[0];
            int amount = Integer.valueOf(partsOfInput[1]);
            if (input.equals("add")) {
                first.add(amount);
            }
            if (input.equals("move") ) {
                int before = first.contains();
                first.remove(amount);
                int after = first.contains();
                second.add(before - after);
            }
            
            if (input.equals("remove") ) {
                second.remove(amount);
            }
        }
    }

}
