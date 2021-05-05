/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author AhmedMohamedHammadAb
 */
public class BodyMassIndex {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter weight (KGs): ");
        float kg = input.nextFloat();
        
        System.out.println("Enter tall (CMs): ");
        float cm = input.nextFloat();
        
        DecimalFormat patttern = new DecimalFormat("0.00");
        double BMI = kg / Math.pow((cm/100),2);
        
        System.out.println("Your BMI: " + BMI);
        if(BMI < 18.5) {
            System.out.println("Under weight");
        }
        else if(BMI < 25.0) {
            System.out.println("Normal");
        }
        else if(BMI < 30.0) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
        
    }
    
}
