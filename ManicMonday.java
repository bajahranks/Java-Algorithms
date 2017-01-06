/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manicmonday;

/**
 *
 * @author Ravi Lamonatagne
 */

import java.io.IOException;
import java.util.Scanner;


public class ManicMonday {
    
    private static int socks_required; 
    private static int time_taken;
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of pairs of socks: ");
        int pairs_of_socks = in.nextInt();
        
        socks_required = socksRequired(pairs_of_socks);
        time_taken = timeTaken();
        
        System.out.println(punctuality());
        System.out.println((float)time_taken/60.0);
        System.out.println(socks_required);
	}
    
    public static int socksRequired(int pairs_of_socks){
        // worst case scenario, number of socks required to make a pair
        socks_required = pairs_of_socks + 1; 
        return socks_required;
    }
    
    public static int timeTaken(){
        time_taken = socks_required * 5;
        return time_taken;
    }
    
    public static String punctuality(){
        String status;
        
        if(time_taken <= 120){
                status ="NOT LATE TO WORK";
        }
        else{
                status = "LATE TO WORK";
        }
        return status;
    }
}
