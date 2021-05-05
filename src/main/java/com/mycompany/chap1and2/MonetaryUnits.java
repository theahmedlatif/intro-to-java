/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chap1and2;

import java.util.Scanner;

/**
 *
 * @author AhmedMohamedHammadAb
 */
public class MonetaryUnits {
    
    public static void main(String[] args) {
                      
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter dollars: ");
        float dollars = input.nextFloat();
        float quarters = dollars / 0.25f;
        float dimes = dollars / 0.1f;
        float nickels = dollars / 0.05f;
        float pennies = dollars / 0.01f;
        
        System.out.println("Your input was " + dollars + " dollars.\n" + 
                "This equal to " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels and "
         + pennies + " pennies.");
    }
    
}
