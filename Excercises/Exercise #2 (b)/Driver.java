public class Driver {
    public static void main(String[] args) {
        CarbonFootprint carbonFootprint[] = new CarbonFootprint[3];
        carbonFootprint[0] = new Bicycle();
        carbonFootprint[1] = new Car(20.0);
        carbonFootprint[2] = new Building(2500, 50, 60, 70, 80);
        for (int i=0; i<3; i++)
        {
            if (carbonFootprint[i].getClass() == Bicycle.class)
            {
                System.out.println("Biycle: " + 
carbonFootprint[i].getCarbonFootprint());
            }
            else if (carbonFootprint[i].getClass() == Car.class)
            {
                System.out.printf("Car (%.2f gallons): %.2f\n", 
((Car)carbonFootprint[i]).gallons, carbonFootprint[i].getCarbonFootprint());
            }
            else if (carbonFootprint[i].getClass() == Building.class)
            {
                System.out.printf("Building (%d squarefeet, %d wood, %d concrete, %d steel, %d glass):  %.2f\n",((Building)carbonFootprint[i]).squareFeet, 
((Building)carbonFootprint[i]).wood, ((Building)carbonFootprint[i]).concrete, 
((Building)carbonFootprint[i]).steel, ((Building)carbonFootprint[i]).glass 
,carbonFootprint[i].getCarbonFootprint());
            }
        }
    }
}