/**
* Write a program that reads the subtotal
* and the gratuity rate, then computes the gratuity and total. For example, if the
* user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
* as gratuity and $11.5 as total
* 
* @author Ravi Lamontagne
*/

import javax.swing.*;

public class CalculateTips {
    public static void main(String[] args) {
        // Read the subtotal
        String subTotalString = JOptionPane.showInputDialog(null,
                "Enter subtotal",
                "Calculate Tips", JOptionPane.QUESTION_MESSAGE);

        Double subTotal = Double.parseDouble(subTotalString);

        // Read the gratuity
        String gratuityString = JOptionPane.showInputDialog(null,
                "Enter gratuity",
                "Calculate Tips", JOptionPane.QUESTION_MESSAGE);

        Double gratuity = Double.parseDouble(gratuityString);

        // calculate total gratuity
        Double gratuityAmount = gratuity / 100 * subTotal;

        // calculate total amount
        Double totalAmount = subTotal + gratuityAmount;

        JOptionPane.showMessageDialog(null,
                "Gratuity Amount is: $" + gratuityAmount + "\n" + "Total Amount is: $" + totalAmount,
                "Calculate Tips", JOptionPane.INFORMATION_MESSAGE);

    }
}

