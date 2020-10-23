
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(28, 12, 2000);
        System.out.println(date);
        date.advance();
        System.out.println(date);
        date.advance();
        System.out.println(date);
        date.advance();
        System.out.println(date);
        System.out.println("");
        
        SimpleDate date2 = new SimpleDate(24,12, 2000);
        System.out.println(date2);
        date2.advance();
        System.out.println(date2);
        date2.advance();
        System.out.println(date2);
        date2.advance();
        System.out.println(date2);
        date2.advance(5);
        System.out.println(date2);
        
        SimpleDate date3 = date2.afterNumberOfDays(13);
        System.out.println(date3);
    }
}
