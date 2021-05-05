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
public class LeapYear {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: ");

        int year = input.nextInt();

        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Leap Year!");
        }
        else {
            System.out.println("Not Leap Year!");
        }
    }
}
