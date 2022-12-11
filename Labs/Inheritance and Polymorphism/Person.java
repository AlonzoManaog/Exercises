public class Person {
    String name;
    String address;
    String phoneNumber;
    String email;
    //Default Constructor
    Person(){

    }
    //Parameterized Constructor
    Person(String name, String address, String phoneNumber, String email){
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }
    //Parent toString method
    public String toString(){
        return "Name: "+ this.name + " Address: " +this.address + " Phone Number: " + this.phoneNumber + " Email: "+ this.email;
    }
}
