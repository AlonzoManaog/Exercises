public class People {
    String name,status;//Variable Initialization
    int age;

    People(String name, int age, String status){//Parameterized Constructor
        this.name=name;
        this.status=status;
        this.age=age;
    }
    public String toString(){//Returns the String of the information in constructor
        return this.name+", "+this.age+", "+this.status;
    }
}
