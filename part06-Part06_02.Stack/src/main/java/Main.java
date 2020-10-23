
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack p = new Stack();
        System.out.println(p.isEmpty());  // true
        
        p.add("First");
        System.out.println(p.isEmpty());  // false
        System.out.println(p.values()); // [First]
        
        p.add("Second");
        p.add("Third");
        System.out.println(p.values());
        
        System.out.println(p.take());
        
        System.out.println(p.values());

    }
}
