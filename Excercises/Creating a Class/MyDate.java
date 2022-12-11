public class MyDate{
    int month;
    int day;
    int year;
    public void setDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year; 
    }
    public String toString(){
        return this.day+"-"+this.month+"-"+this.year;
    }
}