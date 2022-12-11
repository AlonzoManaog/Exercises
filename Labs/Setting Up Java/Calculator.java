public class Calculator {
    double x,y;
    //Default  Constructor
    Calculator(){
        this.x=0;
        this.y=0;
    }
    //Parameterized Constructor
    Calculator(double x, double y){
        this.x=x;
        this.y=y;
    }
    //Add Function which returns the sum of x and y
    public double add(double x, double y){
        return x+y;
    }
    //Multiply function which returns the product of x and y
    public double multiply(double x, double y){
        return x*y;
    }
}

