import java.util.ArrayList; 
import java.util.PriorityQueue; 
 
public class Driver { 
 
    public static ArrayList<String> classifyAthletes(Athlete[] athletes) // This function will sort the athlete in descending order by wins
    // and returns the array list that contains the wins in order
    { 
        PriorityQueue<Athlete> winListOrdered = new PriorityQueue<Athlete>((a, b) -> b.wins - a.wins);
        ArrayList<String> highestWinOrder = new ArrayList<String>();
        for(int i=0;i<athletes.length;i++){
            winListOrdered.add(athletes[i]);
        }
        for(int j=0;j<athletes.length;j++){
                if(j==0){
                highestWinOrder.add(winListOrdered.peek().toString()+" : Highest Win");
                }
                else if(j==1){
                    highestWinOrder.add(winListOrdered.peek().toString()+" : 2nd Highest Win");
                }
                else if (j==2){
                    highestWinOrder.add(winListOrdered.peek().toString()+" : 3rd Highest Win");
                }
                else{
                    highestWinOrder.add(winListOrdered.peek().toString()+" : "+(int)(j+1)+ "th Highest Win");
                }
                winListOrdered.poll();
             }
        return highestWinOrder;
    } 
     
    public static void main(String[] args) { // The main function populate the array and runs the for each to display
        //the list from classifyAthletes
 
        Athlete[] athletes = new Athlete[]{ 
            new Athlete("Pete Sampras", 14), 
            new Athlete("Novak Djokovic", 21), 
            new Athlete("Roger Federer", 20), 
            new Athlete("Roy Emerson", 12), 
            new Athlete("Rafael Nadal", 22), 
            new Athlete("Bjorn Borg", 11), 
        }; 
 
        for (String rank: classifyAthletes(athletes)) 
        { 
            System.out.println(rank); 
        } 
         
    } 
} 