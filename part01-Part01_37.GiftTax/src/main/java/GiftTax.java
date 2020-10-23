
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
        if (giftValue >= 1000000) {
            System.out.println("Tax: " + (142100 + (giftValue - 1000000) * .17));
        } else if (giftValue >= 200000) {
            System.out.println("Tax: " + (22100 + (giftValue - 200000) * .15));
        } else if (giftValue >= 55000) {
            System.out.println("Tax: " + (4700 + (giftValue - 55000) * .12));
        } else if (giftValue >= 25000) {
            System.out.println("Tax: " + (1700 + (giftValue - 25000) * .1));
        } else if (giftValue >= 5000) {
            System.out.println("Tax: " + (100 + (giftValue - 5000) * .08));
        } else {
            System.out.println("No tax!");
        }
    }
}
