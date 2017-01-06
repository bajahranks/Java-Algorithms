/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angryteacher;

/**
 *
 * @author Ravi Lamontagne
 */
import java.io.IOException;
import java.util.Scanner;

public class AngryTeacher {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students followed by the threshold: ");
        int students = in.nextInt();
        int threshold = in.nextInt();
        int present = 0;
        int[] arrival_times = new int[students];
        
        System.out.print("Enter arrival times for each student: ");
        for(int i = 0; i < students; i++){
                arrival_times[i] = in.nextInt();
                if(arrival_times[i] >= 0){
                        present++;
                }
        }
        
        System.out.println(status(present, threshold));        
    } 
    
    public static String status(int present, int threshold){
        if(present >= threshold){
               return "CLASS IS NOT CANCELLED";
        } else{
               return "CLASS IS CANCELLED";
        }    
    }
}
