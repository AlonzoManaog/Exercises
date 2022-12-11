public class Student extends Person{
    String status;
    //Default Constructor
    Student(){

    }
    //Parameterized Constructor
    Student(String  name,  String  address,  String  phoneNumber,  String email, String status) {
        super(name,email,address,phoneNumber);
        this.status=status;
    }
    //Child student to string method
    public String toString(){
        return super.toString()+" Status: "+ this.status;
    }

}
