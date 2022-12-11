import java.util.ArrayList;

class Node{
    //Initializing Node Class
    public People data;
    public Node next;

    public Node(People data)//Parametrized Constructor
    {
        this.data = data;
    }
}
public class LinkedList {
    Node head;//Initialize Node
    LinkedList(){//Default Constructor
        this.head=null;
    }
    public void print(){//Prints all the elememts of the linked list
        Node currentNode = this.head;

        while (currentNode != null)
        {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
    public void insertElement(People people)//Adds an element to the linked list
    {
        Node node = new Node(people);

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
    public  ArrayList<LinkedList>  split(LinkedList list){//Splits the linked list into vaccinated and unvaccinated. Returns an Arraylist
        LinkedList vaccinatedList = new LinkedList();
        LinkedList unvaccinatedList = new LinkedList();
        ArrayList<LinkedList> fullList = new ArrayList<LinkedList>();
        Node currentNode = this.head;
        while (currentNode != null){
            if(currentNode.data.status.equals("Vaccinated")){
                vaccinatedList.insertElement(currentNode.data);
            }
            else{
                unvaccinatedList.insertElement(currentNode.data);
            }
            currentNode=currentNode.next;
        }
        fullList.add(vaccinatedList);
        fullList.add(unvaccinatedList);
        return fullList;
    }   
    
}
