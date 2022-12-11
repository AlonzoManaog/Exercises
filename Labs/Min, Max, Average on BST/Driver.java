import java.util.Stack; 
 
class Node//Initalizes Node Class 
{ 
    //Variable Initalization
    Student student; 
    Node left; 
    Node right; 
 
    Node(Student student) //Parameterized Constructor for Node
    { 
        this.student = student; 
    } 
} 
 
public class Driver { 
 
    static int sum; 
    static int count; 
 
    public static void getAverageAge(Node node)//Totals all the age and counts how many times the method is ran
    { 
        if(node==null){
            return;
        }
        sum+=node.student.age;
        count+=1;
        getAverageAge(node.left);
        getAverageAge(node.right);
    } 
 
    public static int getAverage(Node root) //Calculates the average
    { 
        getAverageAge(root);
        return sum/count;   
    } 
    public  static Node getMinimum(Node root)//Finds the minimum by going to the left most untill you can't anymore
    { 
        if(root.left==null){
            return root;
        }
        
        return getMinimum(root.left);
    } 
 
    public  static Node getMaximum(Node root)//Finds the maximum by going to the right most until you can't anymore
    { 
        if(root.right==null){
            return root;
        }
       
        return getMaximum(root.right);
    } 
 
    public static void printNodes(Node root) {//This will print all the values in node
        Stack<Node> stack = new Stack<>();
        Node currentNode = root;

        while (currentNode!=null || !stack.empty())
        {
            if (currentNode!=null)
            {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            else
            {
                currentNode = stack.pop();
                System.out.println(currentNode.student.toString());
                currentNode = currentNode.right;
            }
        }
    }
    public static void main(String[] args) {//Main function where everything is ran

        Node root = new Node(new Student("Steve Jobs", 55)); 
        root.left = new Node(new Student("Elon Musk", 45)); 
        root.right = new Node (new Student("Bill Gates", 75)); 
        root.left.left = new Node (new Student("Ben Stokes", 40)); 
        root.left.right = new Node (new Student("Angelina Jolie", 48)); 
        root.right.left = new Node(new Student("Warren Buffet", 72)); 
        root.right.right = new Node(new Student("Lizzy Bank", 80));   
         
        System.out.println("\nList of Students"); 
        System.out.println("***********************"); 
        printNodes(root); 
 
        System.out.println("\nClass Statistics"); 
        System.out.println("***********************"); 
        System.out.println("Youngest Student: " + getMinimum(root).student.toString()); 
        System.out.println("Oldest Student: " + getMaximum(root).student.toString()); 
        System.out.println("Average Age of Students: " + getAverage(root)); 
    }
}