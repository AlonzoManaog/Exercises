//Name: Gabe Manaog
//Date: 10-06-2022
//Lab 4: Create 2 duplicate functions where one has a better time complexity function
import java.util.Arrays;
public class Driver  
{ 
    public static boolean contains_duplicates_better(int arr[]){
        Arrays.sort(arr);//O(nlog(n))
        for(int i=0;i<arr.length-1;i++){//O(n)
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
        //O(nlog(n))
    }
    public static boolean contains_duplicates(int arr[]){
        for(int i=0;i<arr.length;i++){//O(n)
            for(int j=i+1;j<arr.length;j++){//O(n)
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;//O(n^2)
    }
    //Main Method
    public static void main(String[] args)  
    { 
        int arr[] = new int[]{1, 2, 7, 3, 4, 5, 6, 8,1};//Sample Array
        System.out.println(contains_duplicates(arr)); 
        System.out.println(contains_duplicates_better(arr)); 
    } 
} 
