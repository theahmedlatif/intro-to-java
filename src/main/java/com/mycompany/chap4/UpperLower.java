/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chap4;

import java.util.Scanner;

/**
 *
 * @author AhmedMohamedHammadAb
 */
public class UpperLower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a char: ");
        char letter = input.next().charAt(0);
        
        if(letter >= 'A' && letter <= 'Z')
        {
            int output = letter + ('a' - 'A');
            System.out.println((char)output);

        }
        else if(letter >= 'a' && letter <= 'z')
        {
            int output = letter - ('a' - 'A');
            System.out.println((char)output);
   
        }
        else
        {
            System.out.println("Not Alphabet!");           
        }
    }
}
