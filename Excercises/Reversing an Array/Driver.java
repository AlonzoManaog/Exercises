import java.util.Arrays;
public class Driver {
    public static int[] reverseArray(int arr[])
    {
        for(int i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        System.out.println("Array before reversing...");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array after reversing...");
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
}