/**
* Write a program that reads a number in feet, converts it
* to meters, and displays the result. One foot is 0.305 meter.
*/

import javax.swing.*;

public class FeetToMeters {
    public static void main(String[] args){
        // receive input from user
        String feetString = JOptionPane.showInputDialog(null,
                "Enter feet",
                "Feet to Meter Converter", JOptionPane.QUESTION_MESSAGE);

        // convert string to a number
        Double feet = Double.parseDouble(feetString);

        // calculate meters
        Double meter = feet * 0.305;

        // display answer to user
        JOptionPane.showMessageDialog(null, feet + " feet = " +
                meter + " meters", "Feet to Meter Converter",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
