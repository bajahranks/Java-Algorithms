import javax.swing.*;

public class CompoundValue {
    public static void main (String[] args){
        final double interestRate = 0.00417;

        String monthlySavingsString = JOptionPane.showInputDialog(null, "Enter your monthly savings amount",
                "CompoundValue", JOptionPane.QUESTION_MESSAGE);
        double monthlySavings = Double.parseDouble(monthlySavingsString);

        double month1 = monthlySavings * (1 + interestRate);
        double month2 = (monthlySavings + month1) * (1 + interestRate);
        double month3 = (monthlySavings + month2) * (1 + interestRate);
        double month4 = (monthlySavings + month3) * (1 + interestRate);
        double month5 = (monthlySavings + month4) * (1 + interestRate);
        double month6 = (monthlySavings + month5) * (1 + interestRate);

        JOptionPane.showMessageDialog(null, "The amount after 6 months is: " + month6,
                "CompoundValue", JOptionPane.INFORMATION_MESSAGE);
    }
}
