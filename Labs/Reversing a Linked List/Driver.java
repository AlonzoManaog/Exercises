class Node //Node Class containing country
{ 
    Country country; 
    Node next; 
     
    Node(Country country) 
    { 
        this.country = country; 
    } 
} 
 
public class Driver { 
 
    public static void displayLinkedList(Node node) //Displays the linked LIST
    { 
        Node currentNode = node;

        while(currentNode != null)
        {
            System.out.print(currentNode.country.toString());
            currentNode = currentNode.next;
        } 
    } 
    //Iterative
    /*    while (next != null) {
        cur.next = prev;
        prev = cur;
        cur = next;
        next = next.next;
    } 
    (Converted recursively)
    */
    public static Node sortDescending(Node head)  
    { 
        if (head == null || head.next == null)
            return head;
           
        Node restOfList = sortDescending(head.next); //Reverse rest of the list next onwards
        head.next.next = head;//Joining the two lists
        head.next = null; //Unlinks the next one from the rest of the list 
        return restOfList;//Return the rest of the list
    }
    
 
 
    public static void main(String[] args) { //Main String that displays ascending order and descending order
 
        Node head = new Node(new Country("Australia", 25499884)); 
        head.next = new Node(new Country("Canada", 37742154)); 
        head.next.next = new Node(new Country("United States", 338289857)); 
        head.next.next.next = new Node(new Country("India", 1417173173)); 
        head.next.next.next.next = new Node(new Country("China", 1425887337)); 
 
        System.out.println("\nOriginal Linked List:"); 
        System.out.println("*********************"); 
        displayLinkedList(head); 
 
        System.out.println("\nSorted Linked List:"); 
        System.out.println("*********************"); 
        displayLinkedList(sortDescending(head)); 
    } 
} 
 