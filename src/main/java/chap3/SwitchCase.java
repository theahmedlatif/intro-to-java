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
public class SwitchCase {
    
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        System.out.println("Select your filling status:\n"
                + "1. Single\n"
                + "2. Married Filing Jointly\n"
                + "3. Married Filling Separately\n"
                + "4. Head of Household");
        int status = input.nextInt();
        
        switch(status) {
            case 1:
                System.out.println("Single taxes calculation.");
                break;
            case 2:
                System.out.println("Married Filling Jointly.");
                break;
            case 3:
                System.out.println("Married Filling Separately.");
                break;
            case 4:
                System.out.println("Head of Household");
                break;
            default:
                System.out.println("Error: invalid status!");
                System.exit(1);
        }
    }
    
}
