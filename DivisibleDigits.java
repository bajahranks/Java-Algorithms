/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisibledigits;

/**
 *
 * @author Ravi Lamontagne
 */
import java.io.IOException;
import java.util.Scanner;

public class DivisibleDigits {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        
        System.out.println(numberOfDigits(number));
	}
    
    // Method to calculate number of digits
    public static int numberOfDigits(int number){
        String str = "" + number;
        int number_of_digits = 0;
        char[] digits = str.toCharArray(); // Each digit placed in an array of chars
        for(char c: digits){
            int i = Integer.parseInt("" + c); // Convert digits back to integer
            if(i != 0 && number % i == 0){
                    number_of_digits++;
            }
        }
        return number_of_digits;
    }

    
    
}
