/**
* The U.S. Census Bureau projects population based on the following assumptions:
* ■ One birth every 7 seconds
* ■ One death every 13 seconds
* ■ One new immigrant every 45 seconds
* Write a program to display the population for each of the next five years. Assume the
* current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
* integers perform division, the result is an integer. The fractional part is truncated. For
* example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
* the fractional part, one of the values involved in the division must be a number with a
* decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
*
* Updated
* Prompt the user to enter the number of years and displays the population after the number of years.
* 
* @author Ravi Lamontagne
*/




import javax.swing.*;

public class PopulationProjection {
    public static void main (String[] args){
        int secondsInAYear = 60 * 60 * 24 * 365;
        int birthsPerYear = secondsInAYear / 7;
        int deathsPerYear = secondsInAYear / 13;
        int newImmigrantPerYear = secondsInAYear / 45;
        int currentPopulation = 312032486;

        int populationIncreasePerYear = birthsPerYear + newImmigrantPerYear - deathsPerYear;

        String yearString = JOptionPane.showInputDialog(null, "Enter the number of years", "Population Projection",
                JOptionPane.QUESTION_MESSAGE);
        int year = Integer.parseInt(yearString);

        int projectedPopulation = currentPopulation + (populationIncreasePerYear * year);

        if (year == 1){
            JOptionPane.showMessageDialog(null,
                    "Projected population after " + year + " year: " + projectedPopulation,
                    "Population Projection", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Projected population after " + year + " years: " + projectedPopulation,
                    "Population Projection", JOptionPane.INFORMATION_MESSAGE);
        }


        /* Old Method
        int populationAfterYear1 = currentPopulation + populationIncreasePerYear;
        int populationAfterYear2 = populationAfterYear1 + populationIncreasePerYear;
        int populationAfterYear3 = populationAfterYear2 + populationIncreasePerYear;
        int populationAfterYear4 = populationAfterYear3 + populationIncreasePerYear;
        int populationAfterYear5 = populationAfterYear4 + populationIncreasePerYear;

        System.out.println("Population after the first year is: " + populationAfterYear1);
        System.out.println("Population after the second year is: " + populationAfterYear2);
        System.out.println("Population after the third year is: " + populationAfterYear3);
        System.out.println("Population after the fourth year is: " + populationAfterYear4);
        System.out.println("Population after the fifth year is: " + populationAfterYear5);
        */
    }
}
