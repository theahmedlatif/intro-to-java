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
public class FahrenToCel {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Fahrenheit degree: ");
        float fahrenheit = input.nextFloat();
        
        float celsius = (5.0f/9.0f) * (fahrenheit - 32);
        
        System.out.println("Celsius degree is " + celsius);
    }
    
}
