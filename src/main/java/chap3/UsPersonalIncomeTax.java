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
public class UsPersonalIncomeTax {
    public static void main(String[] args) {
              
        Scanner input = new Scanner(System.in);
        System.out.println("Select your filling status:\n"
                + "1. Single\n"
                + "2. Married Filing Jointly\n"
                + "3. Married Filling Separately\n"
                + "5. Head of Household");
        int status = input.nextInt();
        
        System.out.println("Enter your input: ");
        int income = input.nextInt();
        
        if(status == 1)
        {
            if(income > 0 && income <= 8350) {
                System.out.println("tax income: " + (income * .10));
            }
            else if(income > 8350 && income <= 33950) {
                System.out.println("tax income: " + (income * .15));
            }
            else if(income > 33950 && income <= 82250) {
                System.out.println("tax income: " + (income * .25));
            }
            else if(income > 82250 && income <= 171550) {
                System.out.println("tax income: " + (income * .28));
            }
            else if(income > 171550 && income <= 372950) {
                System.out.println("tax income: " + (income * .33));
            }
            else if(income > 372950) {
                System.out.println("tax income: " + (income * .35));
            }
            else
            {
                System.out.println("Wrong income input!");
            }
        }
        else if(status == 2) {
            if(income > 0 && income <= 16700) {
                System.out.println("tax income: " + (income * .10));
            }
            else if(income > 16700 && income <= 67900) {
                System.out.println("tax income: " + (income * .15));
            }
            else if(income > 67900 && income <= 137050) {
                System.out.println("tax income: " + (income * .25));
            }
            else if(income > 137050 && income <= 208850) {
                System.out.println("tax income: " + (income * .28));
            }
            else if(income > 208850 && income <= 372950) {
                System.out.println("tax income: " + (income * .33));
            }
            else if(income > 372950) {
                System.out.println("tax income: " + (income * .35));
            }
            else
            {
                System.out.println("Wrong income input!");
            }
        }
        else if(status == 3) {
            if(income > 0 && income <= 8350) {
                System.out.println("tax income: " + (income * .10));
            }
            else if(income > 8350 && income <= 33950) {
                System.out.println("tax income: " + (income * .15));
            }
            else if(income > 33950 && income <= 68525) {
                System.out.println("tax income: " + (income * .25));
            }
            else if(income > 68525 && income <= 104425) {
                System.out.println("tax income: " + (income * .28));
            }
            else if(income > 104425 && income <= 186475) {
                System.out.println("tax income: " + (income * .33));
            }
            else if(income > 186475) {
                System.out.println("tax income: " + (income * .35));
            }
            else
            {
                System.out.println("Wrong income input!");
            }
        }
        else if(status == 4) {
            if(income > 0 && income <= 11950) {
                System.out.println("tax income: " + (income * .10));
            }
            else if(income > 11950 && income <= 45500) {
                System.out.println("tax income: " + (income * .15));
            }
            else if(income > 45500 && income <= 117450) {
                System.out.println("tax income: " + (income * .25));
            }
            else if(income > 117450 && income <= 190200) {
                System.out.println("tax income: " + (income * .28));
            }
            else if(income > 190200 && income <= 372950) {
                System.out.println("tax income: " + (income * .33));
            }
            else if(income > 372950) {
                System.out.println("tax income: " + (income * .35));
            }
            else
            {
                System.out.println("Wrong income input!");
            }
        }
        else {
            System.out.println("Wrong status input!");
        }
    }
}
