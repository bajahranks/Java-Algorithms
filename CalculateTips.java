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

