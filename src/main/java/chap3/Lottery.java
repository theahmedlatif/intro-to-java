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
public class Lottery {
    
    public static void main(String[] args) {
        Random value = new Random();
        int lottery = value.nextInt(99 - 10) + 10; //range from 10 to 99
        System.out.println(lottery);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Guess Lottery random 2 digits: ");
        int guess = input.nextInt();
        
        if(guess == lottery) {
            System.out.println("EXACT MATCH!\nCongrats! you have won $10000.");
        }
        else {
            String lotteryString = String.valueOf(lottery);
            String guessString = String.valueOf(guess);
            
            if((lotteryString.contains(guessString.substring(0, 0))) && 
                    (lotteryString.contains(guessString.substring(1, 1)))) {
                System.out.println("RIGHT ANSWER but not Exact Match!\nCongrats! you have won $3000.");
            }
            else if((lotteryString.contains(guessString.substring(0, 0))) ^ 
                    (lotteryString.contains(guessString.substring(1, 1)))) {
                System.out.println("Well done! one value existed in the random number.\nCongrats! you have won $1000.");
            }
            else {
                System.out.println("Hard luck!");
            }
        }
    }
}
