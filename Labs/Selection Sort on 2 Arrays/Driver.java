import java.util.ArrayList; 
import java.util.Arrays; 
 
public class Driver { 
 
    public static void selectionSort(ArrayList<Integer[]> tuples) //Selection Sort method for tuple of the order of team and points
    { 
        int size =  tuples.get(0).length;

        for (int i=0; i<size-1; i++)
        {
            int smallest = i;

            for (int j=i+1; j<size; j++)
            {
                if (tuples.get(1)[smallest] < tuples.get(1)[j])
                {
                    smallest = j;
                }
            }

            int temp = tuples.get(1)[smallest];
            tuples.get(1)[smallest] = tuples.get(1)[i];
            tuples.get(1)[i] = temp;
            int temp2 = tuples.get(0)[smallest];
            tuples.get(0)[smallest] = tuples.get(0)[i];
            tuples.get(0)[i] = temp2;
        }
    } 
 
    public static String[] sortTeams(String[] teams, int[] points)//Teams 
    { 
        ArrayList<Integer[]> tuples = new ArrayList<Integer[]>();
        Integer[]teamOrder= new Integer[teams.length];//initalizes into Integer for the tuple
        Integer[]pointsConverted=new Integer[points.length];
        for(int i=0;i<teams.length;i++){
            teamOrder[i]=i;
            pointsConverted[i]=points[i];
        }
        tuples.add(teamOrder);
        tuples.add(pointsConverted);
        selectionSort(tuples);//Calls selectionSort
        String[]sortedTeams= new String[teams.length];
        for(int j=0;j<teams.length;j++){//Fill new string to return and print in main function
            sortedTeams[j]=teams[tuples.get(0)[j]];
        }
        return sortedTeams;
    } 
    public static void main(String[] args)//Main Function 
    { 
        String[] teams = new String[]{"Italy","Argentia", "England", "Brazil", "Belgium", 
"France", "Spain"}; 
        int[] points = new int[] {1726, 1773, 1728, 1841, 1816, 1759, 1715}; 
 
        System.out.println("\nOriginal Teams Array"); 
        System.out.println("********************"); 
        System.out.println(Arrays.toString(teams)); 
 
        System.out.println("\nOriginal Points Array"); 
        System.out.println("********************"); 
        System.out.println(Arrays.toString(points)); 
 
        System.out.println("\nTeams Sorted by their points"); 
        System.out.println("*******************************"); 
        System.out.println(Arrays.toString(sortTeams(teams, points))); 
         
    } 
} 