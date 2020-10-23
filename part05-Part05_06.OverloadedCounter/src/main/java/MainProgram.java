
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter c1 = new Counter(10);
        Counter c2 = new Counter();
        System.out.println("c1: " + c1.value()); // 10
        System.out.println("c2: " + c2.value()); // 0
        
        c1.increase();
        c1.increase(4);
        c2.increase();
        c2.increase();
        System.out.println("c1: " + c1.value()); // 15
        System.out.println("c2: " + c2.value()); // 2
    }
}
