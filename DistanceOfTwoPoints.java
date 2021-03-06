/**
* Write a program that prompts the user to enter
* two points (x1, y1) and (x2, y2) and displays their distance between them.
* The formula for computing the distance is 2(x2 - x1)2 + (y2 - y1)2. Note that
* you can use Math.pow(a, 0.5) to compute 2a. 
*
* @author Ravi Lamontagne
*/

import javax.swing.*;

public class DistanceOfTwoPoints {
    public static void main (String[] args){
        String x1String = JOptionPane.showInputDialog(null, "Enter the x value of the first point",
                "Distance Of Two Points", JOptionPane.QUESTION_MESSAGE);
        double x1 = Double.parseDouble(x1String);

        String y1String = JOptionPane.showInputDialog(null, "Enter the y value of the first point",
                "Distance Of Two Points", JOptionPane.QUESTION_MESSAGE);
        double y1 = Double.parseDouble(y1String);

        String x2String = JOptionPane.showInputDialog(null, "Enter the x value of the second point",
                "Distance Of Two Points", JOptionPane.QUESTION_MESSAGE);
        double x2 = Double.parseDouble(x2String);

        String y2String = JOptionPane.showInputDialog(null, "Enter the y value of the second point",
                "Distance Of Two Points", JOptionPane.QUESTION_MESSAGE);
        double y2 = Double.parseDouble(y2String);

        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        JOptionPane.showMessageDialog(null, "The distance is: " + distance,
                "Distance Of Two Points", JOptionPane.INFORMATION_MESSAGE);
    }
}
