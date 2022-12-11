import java.util.Arrays;
public class Driver {
    public static void reverseArray(int array[], int start, int end)
    {
        int temp;
        if (start >=end)
        {
            return;
        }
        else
        {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            reverseArray(array, start+ 1, end-1);
        }
        // Time Complexity = O(n)
    }
    public static void main(String[] args) {
        int numbers[] = new int[]{1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(numbers));
        reverseArray(numbers, 0, numbers.length - 1);
        System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }
}
    