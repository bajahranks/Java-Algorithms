/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal.triangle;

/**
 *
 * @author Ravi Lamontagne
 */

import java.util.Scanner;  //import Scanner to get input from user

public class PascalTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); //create instance of class Scanner
       System.out.print("Enter the number of rows you would like to be printed: ");
       int row = scanner.nextInt(); //stores input from user as an integer.
       print(row);
    }
   
    public static void print(int row) {
        for (int n = 0; n < row; n++) { //number of rows
            for (int k = 0; k <= n; k++) { //number of elements in each row
               System.out.print(nCk(n, k) + " ");
            }
            System.out.println();
        }
    } 
    //Binomial Coefficient Method
    public static int nCk(int n, int k) {
        int numerator = fact(n);
        int denominator = fact(k) * fact(n - k);
        int result = (int) (numerator / denominator);
        return result;
    }
    //Factorial Method
    public static int fact(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
           result = result * i;
        }
        return result;
    }
}
