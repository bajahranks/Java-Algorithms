/**
* You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:
* ax + by = e
* cx + dy = f
* x = ed - bf/ad - bc
* y = af - ec/ad - bc
* Write a program that solves the following equation and displays the value for x and y:
* 3.4x + 50.2y = 44.5
* 2.1x + .55y = 5.9
*
* @author Ravi Lamontagne
*/

public class TwoByTwoLinearEquations {
    public static void main (String[] args){
        double solveX = ((44.5 * 55) - (50.2 * 5.9)) / ((3.4 * 55) - (50.2 * 2.1));
        double solveY = ((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * 55) - (50.2 * 2.1));

        System.out.println("X is: " + solveX);
        System.out.println("Y is: " + solveY);
    }
}
