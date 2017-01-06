/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ropecut;

/**
 *
 * @author Ravi Lamontagne
 *
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RopeCut {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of ropes here: ");
        int no_of_ropes = in.nextInt();
        System.out.print("Enter length of ropes here: ");
        // Array to lengths of each rope
        ArrayList<Integer> rope_lengths = new ArrayList<>();
        for(int i = 0; i < no_of_ropes; i++){
            rope_lengths.add(in.nextInt());
        }
        
        ropesLeft(rope_lengths);
        
    }
    // Method to calculate the number of ropes left before each cut
    public static void ropesLeft(ArrayList<Integer> rope_lengths){
        
        Collections.sort(rope_lengths);
        while(rope_lengths.size() > 0){
            //int cur = rope_lengths.get(0);
            
            System.out.print("Ropes Left: ");
            System.out.println(rope_lengths.size());
            System.out.println(rope_lengths);
            
            for(int i = 0; i < rope_lengths.size(); i++){
                //reduce on the length of each rope
                rope_lengths.set(i, rope_lengths.get(i) - 1);
            }// drop all ropes of length zero
            while(rope_lengths.get(0) == 0){
                    rope_lengths.remove(0);
                    if(rope_lengths.isEmpty()) break;
            }
        } 
    }
}
