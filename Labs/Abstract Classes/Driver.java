public class Driver {
    // Main Method
    public static void main(String[]args){
        System.out.println("\nCalling through Classic Object..."); 
        System.out.println("*************************************"); 
        //Creates new classic class
        Classic fantasia = new Classic("Fantasia in C", "Alfred Brendel", "Philips", 2, 57.17);
        fantasia.Report();
        System.out.println("\nCalling through CD Object..."); 
        System.out.println("*************************************"); 
        //Creating classic class in reference to cd class
        Cd beatles = new Classic(null, "Beatles", "Capitol", 14, 35.5);
        beatles.Report();
    }
}
