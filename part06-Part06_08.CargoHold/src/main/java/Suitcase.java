import java.util.ArrayList;

public class Suitcase {
    private final int maxWeight;
    private ArrayList<Item> items;
        
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if(item.getWeight() + this.totalWeight() <= maxWeight) {
            items.add(item);
        }
    }
    
    public void printItems() {
        for (Item item: items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int total = 0;
        for (Item item: items) {
            total += item.getWeight();
        }
        return total;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviestItem = items.get(0);
        for (Item item: items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
    
    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        } else {
            return this.items.size() + " items (" + this.totalWeight() + " kg)";
        }
        
    }
}
