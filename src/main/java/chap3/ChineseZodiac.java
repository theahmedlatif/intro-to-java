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
public class ChineseZodiac {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = input.nextInt();
        
        int zodiac = year % 12;
        String zodiacName = "";
        
        switch(zodiac) {
            case 0:
                zodiacName = "Monkey";
                break;
            case 1:
                zodiacName = "Rooster";
                break;
            case 2:
                zodiacName = "Dog";
                break;
            case 3:
                zodiacName = "Pig";
                break;
            case 4:
                zodiacName = "Rat";
                break;
            case 5:
                zodiacName = "Ox";
                break;
            case 6:
                zodiacName = "Tiger";
                break;
            case 7:
                zodiacName = "Rabbit";
                break;
            case 8:
                zodiacName = "Dragon";
                break;
            case 9:
                zodiacName = "Snake";
                break;
            case 10:
                zodiacName = "Horse";
                break;
            case 11:
                zodiacName = "Sheep";
                break;
        }
        System.out.println("Chinese Zodiac: " + zodiacName);
    }
    
}
