/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author AhmedMohamedHammadAb
 */
public class RandomQuiz {
    
    public static void main(String[] args) {
        Random item = new Random();
        int num1 = item.nextInt(10);
        int num2 = item.nextInt(10);
        
        int result = num1 + num2;
                
        System.out.println("What is the right answer?\n" + num1 + "+" + num2 + "= ");
        
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        
        boolean check = (answer == result);
                
        System.out.println(check);

    }
    
}
