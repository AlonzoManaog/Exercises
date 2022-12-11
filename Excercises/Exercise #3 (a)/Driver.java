import java.util.Arrays;
public class Driver {
    public static int getSecondLargest(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
    public static void main(String[] args){
        int arr[]=new int[]{1,2,3,4,5};
        System.out.println("Original Array: " +  Arrays.toString(arr));
        System.out.println("Second Largest Element: " + getSecondLargest(arr));
    }
}
