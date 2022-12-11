public class Driver {
    public static void showFibonacci(int n)
    {
        for (int i = 0; i<n; i++)
        {
            System.out.print(fibonacci(i) + " ");
        }
        //Time Complexity = O(2^n)
    }
    public static int fibonacci(int n)
    {
        if (n == 0 || n ==1)
        {
            return n;
        }
        else 
        {
            return fibonacci(n-1) + fibonacci(n-2);
        }
        // Time Complexity = O(2^n)
    }
    public static void main(String[] args) {
        int i = 10;
        System.out.printf("%d fibonacci numbers are:\n", i);
        showFibonacci(i);
    }
}