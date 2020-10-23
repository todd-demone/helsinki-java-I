import java.util.ArrayList;

public class Stack {
    private ArrayList<String> values;
    
    public Stack() {
        this.values = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.values.size() == 0;
    }
    
    public void add(String value) {
        this.values.add(value);
    }
    
    public ArrayList<String> values() {
        
        return this.values;
    }
    
    public String take() {
        // String removed = this.values.get(this.values.size() -1);
        return this.values.remove(this.values.size() - 1);
        // return removed;
    }
}
