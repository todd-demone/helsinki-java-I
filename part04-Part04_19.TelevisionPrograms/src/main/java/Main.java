    import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class
        
        // create a new ArrayList
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        // create a new Scanner
        Scanner scanner = new Scanner(System.in);
        
        // get user input - ie name and duration
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            // add new TelevisionProgram object to programs ArrayList
            programs.add(new TelevisionProgram(name, duration));
        }
        System.out.print("Program's max duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram program: programs) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program);
            }
        }

    }
}
