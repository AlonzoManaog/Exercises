public class Logs {
    //Variable Initialization
    String username;
    String tasks;
    int year;
    //Parameterzied Constructor
    Logs(String username,String tasks, int year){
        this.username=username;
        this.tasks=tasks;
        this.year=year;
    }
    //Returns the string statement
    public String toString(){
        return "Name: "+ this.username+ " | Task: "+this.tasks+" | Year: "+this.year; 
    }
}