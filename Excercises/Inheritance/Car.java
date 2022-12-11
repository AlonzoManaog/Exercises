public class Car extends CarbonFootprint{
    double gallons;
    Car(double gallons){
        this.gallons=gallons;
    }
    double CarbonFootprint(){
        return gallons*20;
    }
}