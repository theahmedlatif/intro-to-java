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
public class WhatIsIt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter character: ");
        char userInput = input.next().charAt(0);
        
        System.out.println("isDigit: " + Character.isDigit(userInput));
        System.out.println("isLetter: " + Character.isLetter(userInput));
        System.out.println("isLetterOrDigit: " + Character.isLetterOrDigit(userInput));
        System.out.println("isLowerCase: " + Character.isLowerCase(userInput));
        System.out.println("isUpperCase: " + Character.isUpperCase(userInput));
        System.out.println("toLowerCase: " + Character.toLowerCase(userInput));
        System.out.println("toUpperCase: " + Character.toUpperCase(userInput));
        
    }
}
