
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        
        String printOutput = "The collection " + this.name;
        
        if (this.elements.isEmpty()) {
            return printOutput += " is empty.";
        }
//        } else if (this.elements.size() == 1) {
//            printOutput += " has 1 element:";  
//        } else {
//            printOutput += " has " + this.elements.size() + " elements:";
//        }
        
        String elementsInList = "";
        
        for (String element: elements) {
            if (elements.size() == 1) {
                elementsInList = elementsInList + element;
            } else {
                elementsInList = elementsInList + element + "\n";

            }
        }
        
        if (this.elements.size() == 1) {
            printOutput += " has 1 element:";
        } else {
            printOutput += " has " + this.elements.size() + " elements:";
        }
        return printOutput + "\n" + elementsInList;
    }
    
}
