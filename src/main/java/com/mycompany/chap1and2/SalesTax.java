/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chap1and2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author AhmedMohamedHammadAb
 */
public class SalesTax {
    
    public static void main(String[] args){
        
        DecimalFormat format = new DecimalFormat("0.00"); //round to nearest two decimal places
        
        Scanner input = new Scanner(System.in); //get user input
        System.out.println("Enter your salary:");
        
        float salary = input.nextFloat();
        float tax = 0.20f;
        
        System.out.println("Taxes value = " + format.format(salary * tax));
        
        
    }
    
}
