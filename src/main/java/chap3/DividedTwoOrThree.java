/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap3;

import java.util.Scanner;

/**
 *
 * @author AhmedMohamedHammadAb
 */
public class DividedTwoOrThree {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int value = input.nextInt();
        
        System.out.println("Is " + value + " divisible by two or three but not both?\n"
                + "Answer: " + ((value % 2 == 0) ^ (value % 3 == 0)));
        
        boolean byTwo = (value % 2 == 0);
        boolean byThree = (value % 3 == 0);
        
        if(byTwo ^ byThree) {
            System.out.println("Divided by ");
            if(byTwo)
                System.out.print("two not three!");
            else if(byThree)
                System.out.print("three not two!");
        }
        else {
            System.out.println("Divisible or indivisible by both two or three!");
        }
        
    }
    
}
