public class Student{
    //Variable Initialization
    String name;
    int age;
    
    Student(String name,int age){//Parameterized Constructor
        this.name=name;
        this.age=age;
    }

    public String toString(){//Returns the name and age as string       
        return this.name+" : "+this.age;
    }
}