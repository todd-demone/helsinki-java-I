
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Item book = new Item("Harry Potter", 2);
        Item brick = new Item("brick", 4);
        Item phone = new Item("Nokia 3220", 1);
        
        System.out.println(book);
        System.out.println(brick);
        System.out.println(phone);
        
        Suitcase mySuitcase = new Suitcase(10);
        
        mySuitcase.addItem(book);
        System.out.println(mySuitcase);
        mySuitcase.addItem(phone);
        System.out.println(mySuitcase);
        mySuitcase.addItem(brick);
        System.out.println(mySuitcase);
        System.out.println("");
        System.out.println("Here is a list of items:");
        mySuitcase.printItems();
        Item heaviest = mySuitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);
        
        System.out.println("");
        
        Suitcase barbsCase = new Suitcase(50);
        barbsCase.addItem(brick);
        
        Hold myHold = new Hold(100);
        myHold.addSuitcase(mySuitcase);
        myHold.addSuitcase(barbsCase);
        System.out.println(myHold);
        
        System.out.println("The suitcases contain the following items: ");
        myHold.printItems();
    }

}
