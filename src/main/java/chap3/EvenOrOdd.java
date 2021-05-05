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
public class EvenOrOdd {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        
        String feedback = (number % 2 == 0)? "Even" : "Odd";
        System.out.println(feedback);
    }
    
}
