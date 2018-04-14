/**
 *
 * @author Ravi Lamontagne
 */
import java.io.IOException; //handle any errors that may arise
import java.util.Scanner; //import Scanner to get input from user

public class AmoebaInAJar {
    private static int every_minute;
    private static int max_minutes;
    private static int max_capacity;
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
	System.out.print("Every how many minutes will the Amoeba duplicate itself: ");
        every_minute = in.nextInt();
        System.out.print("For a total of how many minutes: ");
	max_minutes = in.nextInt();
        System.out.print("Enter the maximum capacity of the Jar: ");
	max_capacity = in.nextInt();
		
        System.out.println("Maximum Capacity: " + maximumCapacity(every_minute, max_minutes));
        System.out.println("Maximum Minutes: " + maximumMinutes(max_capacity));
    }
    //Maximum capacity method. 2 raised to the power of ____
    public static int maximumCapacity(int every_minute, int max_minutes){
        return (int)Math.pow(2, max_minutes/every_minute);
    }
    //Maximum minutes method.
    public static int maximumMinutes(int max_capacity){
        //Find the power
        int power = 0;
        while(max_capacity > 1){
            max_capacity /= 2; // divide by 2
            power++; // increase power while condition is true
        }
        return every_minute *(power);
    }
}
    

