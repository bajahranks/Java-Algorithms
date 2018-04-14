/**
* Suppose you save $100 each month
* into a savings account with the annual interest rate 5%. Thus, the monthly interest rate is 0.05/12 = 0.00417. After the first month, the value in the account
* becomes 100 * (1 + 0.00417) = 100.417
* After the second month, the value in the account becomes (100 + 100.417) * (1 + 0.00417) = 201.252
* After the third month, the value in the account becomes (100 + 201.252) * (1 + 0.00417) = 302.507 and so on.
* Write a program that prompts the user to enter a monthly saving amount and displays the account value after the sixth month. 
* 
* @author Ravi Lamontagne
*/

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
