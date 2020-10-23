import java.util.Collections;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private GradeBook book;
    
    public UserInterface(GradeBook book, Scanner scanner) {
        this.scanner = scanner;
        this.book = book;
    }
    
    public void start() {
        readScores();
        printAverages();
        printGradeDistribution();       
    }
    
    public void readScores() {
        System.out.println("Enter total points, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            if (input >= 0 && input <= 100) {
                book.addScore(input);
            }
        }
    }
    
    public void printAverages() {
        System.out.println("Point average (all): " + book.getAverage());
        if (book.getPassingAverage() == -1.0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + book.getPassingAverage());
        }
        System.out.println("Pass percentage: " + book.getPassingPercentage());
    }
    
    public void printGradeDistribution() {
        System.out.println("Grade distribution:");
        int grade = 5;
        while (grade >= 0) {
            System.out.print(grade + ":");
            printStars(book.numberOfGrades(grade));
            grade -= 1;
            System.out.println("");
        }
    }
    
    public void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars -= 1;
        }
    }
}
