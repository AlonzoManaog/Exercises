public class Classic extends Cd {
    //Variable initialization
    private String primaryWork;

    //Default Constructor
    Classic(){
        this.primaryWork="Unknown";
    }
    //Parameterized Constructor
    Classic(String primaryWork,String performers, String label, int selection, double playtime){
        super(performers,label,selection,playtime);
        if(primaryWork==null){
            this.primaryWork="Unknown";
        }
        else{
            this.primaryWork=primaryWork;
        }
    }
    //This method will print the data from both classes
    void Report(){
        System.out.println("Performers: "+ this.performers + "\nLabel: "+this.label+"\nSelection: "+ this.selection + "\nPlaytime: "+this.playtime+"\nPrimary Work: "+this.primaryWork);
    }
}
