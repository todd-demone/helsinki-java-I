
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation sickKids = new HealthStation();
        Person todd = new Person("Todd Demone", 47, 176, 80);
        System.out.println(todd.getName() + " weight: " + sickKids.weigh(todd) + " kilos");
        
        sickKids.feed(todd);
        
        System.out.println(todd.getName() + " weight: " + sickKids.weigh(todd) + " kilos");
        sickKids.weigh(todd);
        sickKids.weigh(todd);
        sickKids.weigh(todd);
        System.out.println("Number of weighings: " + sickKids.weighings());
    }
}
