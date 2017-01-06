/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeconversion;

/**
 *
 * @author Ravi Lamontagne
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter time here - Example - 10:43:23PM: ");
        String time= in.next();
        
        System.out.println("The converted time is " + militaryTime(time));
    }    
    // Method to convert to 24 hour
    public static String militaryTime(String time) {
        SimpleDateFormat regular_time = new SimpleDateFormat("hh:mm:ssa"); 
        Date date_format = null;
        // Check for errors in input
        try {
            date_format = regular_time.parse(time); // Change String input into Date format 
        } catch (ParseException e) {
            System.out.println("Ensure time is in the following format - hh:mm:ssa. " +
                    "Example - 10:43:23PM");
        }
        SimpleDateFormat military_time = new SimpleDateFormat("HH:mm:ss");
        String converted_time = military_time.format(date_format); // convert time.

        return converted_time;
    }
}
