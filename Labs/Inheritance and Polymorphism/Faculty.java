public class Faculty extends Person{
    String rank;
    //Default Constructor
    Faculty(){

    }
    //Parameterized Constructor
    Faculty(String  name,  String  address,  String  phoneNumber,  String 
    email, String rank){
        super(name,email,address,phoneNumber);
        this.rank=rank;
    }
    //Child faculty toString method
    public String toString(){
        return super.toString()+" Rank: "+ this.rank;
    }

}
