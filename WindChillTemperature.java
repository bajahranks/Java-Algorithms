/**
* How cold is it outside? The temperature alone
* is not enough to provide the answer. Other factors including wind speed, relative humidity, and sunshine play important roles in determining coldness outside.
* In 2001, the National Weather Service (NWS) implemented the new wind-chill
* temperature to measure the coldness using temperature and wind speed. The
* formula is t
* wc = 35.74 + 0.6215ta - 35.75v0.16 + 0.4275tav0.16
* where ta is the outside temperature measured in degrees Fahrenheit and v is the
* speed measured in miles per hour. two is the wind-chill temperature. The formula
* cannot be used for wind speeds below 2 mph or temperatures below -58 ºF or
* above 41ºF.
* Write a program that prompts the user to enter a temperature between -58 ºF and
* 41ºF and a wind speed greater than or equal to 2 and displays the wind-chill temperature. Use Math.pow(a, b) to compute v0.16.
*
* @author Ravi Lamontagne
*/



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
