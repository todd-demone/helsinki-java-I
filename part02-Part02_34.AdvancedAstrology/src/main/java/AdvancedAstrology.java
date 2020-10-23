
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int countPrinted = 0;
        while (countPrinted < number) {
            System.out.print("*");
            countPrinted += 1;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int countPrinted = 0;
        while (countPrinted < number) {
            System.out.print(" ");
            countPrinted += 1;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int numberOfStars = 1;
        int numberOfSpaces = size - 1;
        while (numberOfStars <= size) {
            printSpaces(numberOfSpaces);
            printStars(numberOfStars);
            numberOfSpaces -= 1;
            numberOfStars +=1;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int numberOfSpaces = height - 1;
        int numberOfStars = 1;
        while (numberOfSpaces >= 0){
            printSpaces(numberOfSpaces);
            printStars(numberOfStars);
            numberOfSpaces -= 1;
            numberOfStars += 2;
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        printTriangle(1);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
