class Student{
    String name;
    int marks;

    Student(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
    public String toString(){
        return this.name+": "+this.marks;
    }
}
class Node
{
    Student value;
    Node left;
    Node right;

    Node(Student student)
    {
        this.value = student;
    }
    Node(Student student, Node left, Node right)
    {
        this.value = student;
        this.left = left;
        this.right = right;
    }
}
public class Driver { 
 
    public static Node updateMarks(Node root_A, Node root_B) 
    { 
       if (root_A==null){
        return root_A;
       }
       if (root_B==null){
        return root_B;
       }
       if(root_A.value.marks<root_B.value.marks){
        root_A.value.marks=root_B.value.marks;
       }
       updateMarks(root_A.left,root_B.left);
       updateMarks(root_A.right,root_B.right);
       return root_A;
    } 
 
    public static void preOrder(Node root) 
    { 
        if (root == null)
        {
            return;
        }
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    } 
    public static void main(String[] args) { 
        Node quiz_A = new Node(new Student("Steve", 85)); 
        quiz_A.left = new Node(new Student("Bill", 65)); 
        quiz_A.right = new Node(new Student("Elon", 90)); 
        quiz_A.left.left = new Node(new Student("Jeff", 55)); 
         
        Node quiz_B = new Node(new Student("Steve", 88)); 
        quiz_B.left = new Node(new Student("Bill", 75)); 
        quiz_B.right = new Node(new Student("Elon", 90)); 
        quiz_B.left.right = new Node(new Student("Lizzy", 80)); 
        quiz_B.right.right = new Node(new Student("Sheena", 95)); 
 
        System.out.println("\nQuiz A..."); 
        preOrder(quiz_A); 

        System.out.println("\nQuiz B..."); 
        preOrder(quiz_B); 
 
        System.out.println("\nResultant Tree"); 
        preOrder(updateMarks(quiz_A, quiz_B)); 
    } 
} 