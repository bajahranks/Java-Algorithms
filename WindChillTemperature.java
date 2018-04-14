import javax.swing.*;

public class WindChillTemperature {
    public static void main (String[] args){
        String temperatureString = JOptionPane.showInputDialog(null, "Enter the temperature in Fahrenheit between -58 and 41 degrees",
                "Wind Chill Temperature Calculator", JOptionPane.QUESTION_MESSAGE);
        double temperature = Double.parseDouble(temperatureString);

        // Ensure that user enters the correct value
        while (temperature < -58 || temperature > 41){
            temperatureString = JOptionPane.showInputDialog(null,
                    "Enter the temperature in Fahrenheit between -58 and 41 degrees",
                    "Wind Chill Temperature Calculator", JOptionPane.QUESTION_MESSAGE);
            temperature = Double.parseDouble(temperatureString);
        }

        String windSpeedString = JOptionPane.showInputDialog(null, "Enter a wind speed more than or equal to 2 in miles per hour",
                "Wind Chill Temperature Calculator", JOptionPane.QUESTION_MESSAGE);
        double windSpeed = Double.parseDouble(windSpeedString);

        while (windSpeed < 2){
            windSpeedString = JOptionPane.showInputDialog(null, "Enter a wind speed more than or equal to 2 in miles per hour",
                    "Wind Chill Temperature Calculator", JOptionPane.QUESTION_MESSAGE);
            windSpeed = Double.parseDouble(windSpeedString);
        }

        double windChillTemperature = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) +
                (0.4275 * temperature * Math.pow(windSpeed, 0.16));

        JOptionPane.showMessageDialog(null, "The Wind Chill Temperature is: " + windChillTemperature,
                "Wind Chill Temperature Calculator", JOptionPane.INFORMATION_MESSAGE);
    }
}
