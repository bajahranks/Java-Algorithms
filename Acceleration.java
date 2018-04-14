/* Created by Ravi Lamontagne */

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
