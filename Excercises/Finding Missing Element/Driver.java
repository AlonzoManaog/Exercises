import java.util.Arrays;
public class Driver {
    public static int missingElement(int arr[])
    {
        int n=arr.length;
        int totalSum = n*(n+1)/2;
        
        int actualSum=0;
        for(int i=0;i<n;i++){
            actualSum+=arr[i];
        }
        return totalSum-actualSum;
    }
    public static void main(String[] args) {
        int arr[] = new int[] {0, 1, 3, 4, 5, 6, 7, 8};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Missing element: " + missingElement(arr));
    }
}