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
public class LoanPaymentCalculator {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        DecimalFormat decimalPlaces = new DecimalFormat("0.00");
        
        System.out.println("Enter Loan Amount: ");
        float loanAmount = input.nextFloat();
        
        System.out.println("Enter Monthly Interest Rate: ");
        float monthlyInterestRate = input.nextFloat();
        
        System.out.println("Number of Installment Years: ");
        int numberOfYears = input.nextInt();
        
        double monthlyPayment = (loanAmount * monthlyInterestRate)/(1 - (1/Math.pow(1+monthlyInterestRate,numberOfYears * 12)));
        
        System.out.println("Monthly Payment: " + decimalPlaces.format(monthlyPayment));
    }
}
