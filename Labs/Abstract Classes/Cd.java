public abstract class Cd {
    //Variable Initialization
    protected String performers;
    protected String label;
    protected int selection;
    protected double playtime;
    //Default Constructor
    Cd(){
        this.performers= "Unknown";
        this.label="Unknown";
        this.selection=0;
        this.playtime=0.0;
    }
    //Parametrized Constructor
    Cd(String performers, String label, int selection, double playtime){
        this.performers= performers ;
        this.label= label;
        this.selection=selection;
        this.playtime=playtime;
    } 
    //Abstract method of calling report from classic class
    abstract void Report();
}