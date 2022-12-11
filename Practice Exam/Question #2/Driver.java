class Node
{
    String value;
    Node next;

    Node()
    {
        this.value = "";
    }

    Node(String value)
    {
        this.value = value;
    }
}
public class Driver { 
    public static Node removeCitiesWithO(Node head) 
    { 
        if (head == null)
        {
            return null;
        }

        Node temp = new Node();
        temp.next = head;
        Node currentNode = temp;

        while (currentNode.next != null)
        {
            if (currentNode.next.value.contains("O") || currentNode.next.value.contains("o"))
            {
                currentNode.next = currentNode.next.next;
            }
            else
            {
                currentNode = currentNode.next;
            }
        }
        return temp.next;
        // Time Complexity = O(n^2)
        // Space Complexity = O(1)
    } 
 
    public static void printList(Node head) 
    { 
        Node currentNode = head;

        if (head == null)
        {
            System.out.println("List is empty");
        }

        while (currentNode != null)
        {
                System.out.println(currentNode.value);
                currentNode = currentNode.next;
        } 
    } 
    public static void main(String[] args)  
    { 
        Node head = new Node("Toronto"); 
        head.next = new Node("Oshawa"); 
        head.next.next = new Node("Ajax"); 
        head.next.next.next = new Node("Whitby"); 
        head.next.next.next.next = new Node("Markham"); 
 
        System.out.println("\nOriginal Linked List..."); 
        printList(head); 
 
        System.out.println("\n\nModified Linked List..."); 
        printList(removeCitiesWithO(head)); 
         
    } 
}