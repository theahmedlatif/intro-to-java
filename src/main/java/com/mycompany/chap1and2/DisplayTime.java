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
public class DisplayTime {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Remaining hours: ");
        int hour = input.nextInt();
        
        System.out.println("Remaining minutes: ");
        int minute = input.nextInt();
        
        System.out.println(hour + ":" + minute);
    }
    
}
