public class Country {
    //Variable Initalization
    String name;
    double population;

    Country(String name, double population){//Parameterized Constructor
        this.name=name;
        this.population=population;
    }
    public String toString(){//ToString method
        return String.format( "%s%s%,.2f%s", this.name," : ",this.population,"\n");
    
}
}
