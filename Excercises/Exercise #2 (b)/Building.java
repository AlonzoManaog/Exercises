public class Building extends CarbonFootprint{
    int squareFeet, wood, concrete, steel, glass ;
    Building(int squareFeet,int wood,int concrete,int steel,int glass ){
        this.squareFeet=squareFeet;
        this.wood=wood;
        this.concrete=concrete;
        this.steel=steel;
        this.glass=glass;
    }
    double CarbonFootprint(){
        return squareFeet*(wood+concrete+steel+glass);
    }
}