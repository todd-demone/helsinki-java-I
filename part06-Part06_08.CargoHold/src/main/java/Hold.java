import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.totalWeight() <= this.maxWeight) {
            suitcases.add(suitcase);
        }
    }
    
    public int totalWeight() {
        int total = 0;
        for (Suitcase suitcase: suitcases) {
            total += suitcase.totalWeight();
        }
        return total;
    }
    
    public void printItems() {
        for (Suitcase suitcase: suitcases) {
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() +  " kg)";
    }
}
