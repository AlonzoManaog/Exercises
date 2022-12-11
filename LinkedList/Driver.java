public class Driver {
    public static void main (String[] args){
        LinkedList list = new LinkedList();
        list.insertElement(2);
        list.insertElement(3);
        list.insertElement(4);
        list.printEven();
        list.insertAfter(3,5);
        list.print();
        list.sort();//Bubble Sort
        list.print();
    }
}
