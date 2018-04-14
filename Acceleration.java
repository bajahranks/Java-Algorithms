/**
* Average acceleration is defined as the change of velocity
*divided by the time taken to make the change, as shown in the following formula:
* a = v1 - v0 / t
* Write a program that prompts the user to enter the starting velocity v0 in meters/
* second, the ending velocity v1 in meters/second, and the time span t in seconds,
* and displays the average acceleration.
* 
* @author Ravi Lamontagne 
*/

import javax.swing.*;

public class Acceleration {
    public static void main (String[] args){
        // Read starting velocity
        String startingVelocityString = JOptionPane.showInputDialog(null,
                "Enter the starting velocity", "Acceleration", JOptionPane.QUESTION_MESSAGE);
        double startingVelocity = Double.parseDouble(startingVelocityString);

        // Read ending velocity
        String endingVelocityString = JOptionPane.showInputDialog(null,
                "Enter the ending velocity", "Acceleration", JOptionPane.QUESTION_MESSAGE);
        double endingVelocity = Double.parseDouble(endingVelocityString);

        // Read time
        String timeString = JOptionPane.showInputDialog(null,
                "Enter the time", "Acceleration", JOptionPane.QUESTION_MESSAGE);
        int time = Integer.parseInt(timeString);

        // Calculate acceleration
        double acceleration = (endingVelocity - startingVelocity) / time;

        // Display answer to user
        JOptionPane.showMessageDialog(null,
                "Acceleration is : " + acceleration, "Acceleration", JOptionPane.INFORMATION_MESSAGE);
    }
}
