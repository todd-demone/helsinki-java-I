
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);
      
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number: array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallestIndex = 0;
        int index = 0;
        while (index < array.length) {
            if (array[index] < array[smallestIndex]) {
                smallestIndex = index;
            }
            index++;
        }
        return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;
        while (startIndex < table.length) {
            if(table[startIndex] < table[smallestIndex]) {
                smallestIndex = startIndex;
            }
            startIndex++;
        }
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        int index = 0;
        while (index < array.length) {
            int smallestIndex = indexOfSmallestFrom(array, index);
            swap(array, index, smallestIndex);
            System.out.println(Arrays.toString(array));
            index++;
        }
        
    }

}
