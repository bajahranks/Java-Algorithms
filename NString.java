/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n.string;

/**
 *
 * @author Ravi Lamontagne
 */

import java.io.IOException;
import java.util.Scanner;

public class NString {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = in.next();
        System.out.print("Enter number limit: ");
        int number = in.nextInt();
        
        System.out.println(gCount(string, number));
    }
    // Method to calculate the number of Gs
    public static int gCount(String string, int number){
        int size = string.length();
        int full = number/size;
        int remainder = number%size;
        int fullCount=0;
        int remainderCount=0;
        for(int i = 0; i < size; i++){
            if(string.charAt(i) == 'g'){
                fullCount++;
                if(i < remainder){
                        remainderCount++;
                }
            }
        }
        return full*fullCount+remainderCount;
    }
}