import javax.swing.*;

public class CelsiusToFahrenheit {
    public static void main(String[] args){
        // receive input from user
        String celsiusString = JOptionPane.showInputDialog(null,
                "Enter the degree in Celsius",
                "Celsius to Fahrenheit Converter", JOptionPane.QUESTION_MESSAGE);

        // convert string to a number
        Double celsius = Double.parseDouble(celsiusString);

        // calculate fahrenheit
        Double fahrenheit = (9.0 / 5) * celsius + 32;

        // display answer to user
        JOptionPane.showMessageDialog(null, celsius + " degrees Celsius is = " +
                fahrenheit + " degrees fahrenheit", "Celsius to Fahrenheit Converter",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
