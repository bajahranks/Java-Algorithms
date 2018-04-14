import javax.swing.*;

public class AreaOfTriangleFromGivenPoints {
    public static void main (String[] args){
        String side1xString = JOptionPane.showInputDialog(null, "Enter x value of side 1: ",
                "Area Of Triangle From Given Points", JOptionPane.QUESTION_MESSAGE);
        double side1x = Double.parseDouble(side1xString);

        String side1yString = JOptionPane.showInputDialog(null, "Enter y value of side 1: ",
                "Area Of Triangle From Given Points", JOptionPane.QUESTION_MESSAGE);
        double side1y = Double.parseDouble(side1yString);

        String side2xString = JOptionPane.showInputDialog(null, "Enter x value of side 2: ",
                "Area Of Triangle From Given Points", JOptionPane.QUESTION_MESSAGE);
        double side2x = Double.parseDouble(side2xString);

        String side2yString = JOptionPane.showInputDialog(null, "Enter y value of side 2: ",
                "Area Of Triangle From Given Points", JOptionPane.QUESTION_MESSAGE);
        double side2y = Double.parseDouble(side2yString);

        String side3xString = JOptionPane.showInputDialog(null, "Enter x value of side 3: ",
                "Area Of Triangle From Given Points", JOptionPane.QUESTION_MESSAGE);
        double side3x = Double.parseDouble(side3xString);

        String side3yString = JOptionPane.showInputDialog(null, "Enter y value of side 3: ",
                "Area Of Triangle From Given Points", JOptionPane.QUESTION_MESSAGE);
        double side3y = Double.parseDouble(side3yString);

        double area = Math.abs((side1x * (side2y - side3y)) + (side2x * (side3y - side1y)) +
                (side3x * (side1y - side2y))/2);

        JOptionPane.showMessageDialog(null, "The area is: " + area,
                "Area Of Triangle From Given Points", JOptionPane.INFORMATION_MESSAGE);
    }
}
