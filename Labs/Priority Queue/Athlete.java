public class Athlete {
    //Variable Initalization
    String name;
    int wins;
    Athlete(String name, int wins){//Parameterized constructor
        this.name=name;
        this.wins=wins;
    }
    public String toString(){//This toString function will return the name of the athlete
        return this.name;
    }
}
