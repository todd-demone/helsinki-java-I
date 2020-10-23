
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        // insert test code here
        
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println(Arrays.toString(array));
        Main.sort(array);
        System.out.println(Arrays.toString(array));
        
        String[] strArray = {"x", "h", "c", "t"};
        System.out.println(Arrays.toString(strArray));
        Main.sort(strArray);
        System.out.println(Arrays.toString(strArray));
        
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(6);
        intList.add(2);
        intList.add(3);
        System.out.println(intList);
        Main.sortIntegers(intList);
        System.out.println(intList);
        
        ArrayList<String> strList = new ArrayList<>();
        strList.add("x");
        strList.add("c");
        strList.add("h");
        System.out.println(strList);
        Main.sortStrings(strList);
        System.out.println(strList);
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> intList) {
        Collections.sort(intList);
    }
    
    public static void sortStrings(ArrayList<String> strList) {
        Collections.sort(strList);
    }

}
