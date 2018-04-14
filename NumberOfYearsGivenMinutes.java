/**
* Write a program that prompts the user to enter the
* minutes (e.g., 1 billion), and displays the number of years and days for the minutes. 
* For simplicity, assume a year has 365 days.
*
* @author Ravi Lamontagne
*/


import javax.swing.*;

public class NumberOfYearsGivenMinutes {
    public static void main (String[] args){
        // Read the minutes from user
        String minutesString = JOptionPane.showInputDialog(null, "Enter the number of minutes",
                "Number of Years given Minutes", JOptionPane.QUESTION_MESSAGE);
        long minute = Long.parseLong(minutesString);

        // Calculate hour, day and year
        long hour = minute / 60;
        int day = (int) (hour / 24);
        int year = day / 365;
        int remainingDays = day % 365;

        // Display answer to user
        if(year == 1){
            JOptionPane.showMessageDialog(null,
                    minute + " minutes is " + year + " year and " + remainingDays + " days",
                    "Number of Years given Minutes", JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null,
                    minute + " minutes is " + year + " years and " + remainingDays + " days",
                    "Number of Years given Minutes", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
