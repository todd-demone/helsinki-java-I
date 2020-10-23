
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        
        SimpleDate toddsBday = new SimpleDate(18, 3, 1973);
        Person todd = new Person("Todd Demone", toddsBday, 177, 73);
        
        Person toddsTwin = new Person("Rod Demone", toddsBday, 177, 73);
        
        System.out.println("Is Todd the same person as Rod?: " + todd.equals(toddsTwin));
        
        Person duplicateTodd = new Person("Todd Demone", toddsBday, 177, 73);
        
        System.out.println("Is Todd the same person as duplicateTodd?: " + todd.equals(duplicateTodd));

        
    }
}
