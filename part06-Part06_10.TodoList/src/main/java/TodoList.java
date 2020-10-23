import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todolist;
    
    public TodoList() {
        this.todolist = new ArrayList<>();
    }
    
    public void add(String task) {
        this.todolist.add(task);
    }
    
    public void print() {
        int index = 0;
        while (index < todolist.size()) {
            System.out.println((index + 1) + ": " + todolist.get(index));
            index++;
        }
    }
    
    public void remove(int number) {
        this.todolist.remove(number - 1);
    }
}
