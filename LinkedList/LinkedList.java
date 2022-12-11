class Node
{
    public int value;
    public Node next;

    public Node(int value)
    {
        this.value = value;
    }
}


public class LinkedList {

    Node head;

    LinkedList()
    {
        this.head = null;
    }

    public void insertElement(int number)
    {
        Node node = new Node(number);

        if (this.head == null)
        {
            this.head = node;
        }
        else
        {
            Node currentNode = this.head;
            while (currentNode.next != null)
            {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
    }
    public void print()
    {
        Node currentNode = this.head;

        while (currentNode != null)
        {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }
    public void printEven(){
        Node currentNode=this.head;
        while(currentNode!=null){
            if(currentNode.value%2==0){
                System.out.print(currentNode.value+" ");
            }
            currentNode=currentNode.next;
        }
    }
    public  void insertAfter(int  number,  int  newNumber){
        Node currentNode=this.head;
        while(currentNode!=null){
            if(currentNode.value!=number){
                currentNode=currentNode.next;
            }
            else{
                Node newNode = new Node(newNumber);
                Node temp = currentNode.next;
                currentNode.next = newNode;
                newNode.next = temp;
                break;
            }
        }
    }
    public void sort()//Bubble Sort (Class Code has Selection Sort)
    {
        Node current = head, index = null;
 
        int temp;
 
        if (head == null) 
        {
            return;
        }
        else 
        {
            while (current != null) {
                index = current.next;
 
                while (index != null) {
                    if (current.value > index.value) 
                    {
                        temp = current.value;
                        current.value = index.value;
                        index.value = temp;
                    }
 
                    index = index.next;
                }
                current = current.next;
            }
        }
    }    
}