import java.util.Arrays; 
import java.util.Collections; 
import java.util.HashMap; 
 
public class Driver { 
 
    public static String[] sortByWins(String[] players, Integer[] wins) { 
        HashMap<Integer, String> map = new HashMap<>();
        String[] orderedString= new String[wins.length];
        for(int i=0;i<wins.length;i++){
            map.put(wins[i],players[i]);
        }
        Arrays.sort(wins,Collections.reverseOrder());
        for(int j=0;j<wins.length;j++){
            orderedString[j]=(map.get(wins[j])+ " : "+wins[j]);
        }
        return orderedString;
    } 
 
    public static void main(String[] args) {  
        String[] players = new String[]{ 
            "Pete Sampras", "Novak Djokovic", "Roger Federer", "Roy Emerson", "Rafael Nadal", "Bjorn Borg" 
        }; 
 
        Integer[] wins = new Integer[]{ 
            14, 21, 20, 12, 22, 11 
        }; 
 
        for (String result: sortByWins(players, wins)) 
        { 
            System.out.println(result); 
        } 
         
    } 
} 
 