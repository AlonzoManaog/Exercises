import java.util.Arrays;
import java.util.Collections;

public class Driver {
    public static void sortDescending(int[] numbers)
    {
        //Convert to Integer as reverse does not work with primitive data types
        Integer[] arr = new Integer[numbers.length];
        Arrays.setAll(arr, i->numbers[i]);
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Sorting in Descending Order: " + Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int numbers[] = new int[]{2, 4, 1, 9, 8, 6};
        
        System.out.println("Before Sorting: " + Arrays.toString(numbers));
        
        Arrays.sort(numbers);
        System.out.println("Sorting in Ascending Order: " + Arrays.toString(numbers));
        
        // Sorting in descending order
        sortDescending(numbers);
        
        
   }
}
