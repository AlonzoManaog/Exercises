public class Driver { 
    public static void main(String[] args) { 
        LinkedList list = new LinkedList(); //Variable Initialization
        list.insertElement(new People("Steve Jobs", 55, "Not Vaccinated")); 
        list.insertElement(new People("Bill Gates", 65, "Vaccinated")); 
        list.insertElement(new People("Angelina Jolie", 50, "Not Vaccinated")); 
        list.insertElement(new People("Warren Buffet", 75, "Not Vaccinated")); 
        list.insertElement(new People("Tim David", 35, "Vaccinated")); 
        list.insertElement(new People("Lizzy Stone", 25, "Vaccinated")); 
        list.insertElement(new People("Eva Jobs", 55, "Not Vaccinated")); 
        list.insertElement(new People("Melinda Gates", 55, "Vaccinated")); 
        list.insertElement(new People("Elon Musk", 53, "Not Vaccinated")); 
        
        System.out.println("\nOriginal List"); 
        System.out.println("*********************"); 
        list.print();//Prints whole List
 
        System.out.println("\nVaccinated People"); 
        System.out.println("*********************"); 
        list.split(list).get(0).print();//Prints Vaccinated People
 
        System.out.println("\nUnvaccinated People"); 
        System.out.println("*********************"); 
        list.split(list).get(1).print();//Prints Unvaccinated People
         
 
    } 
} 