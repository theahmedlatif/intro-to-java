/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chap4;

import java.util.Scanner;

/**
 *
 * @author AhmedMohamedHammadAb
 */
public class StringInput {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = input.nextLine();
        System.out.print ("Your message was: " + text + "\n");
        System.out.println("First letter is: " + text.charAt(0));
        System.out.println("Last letter is: " + text.charAt(text.length()-1));
        
        System.out.println("Enter text: ");
        String text2 = input.nextLine();
        System.out.println("both messages are exactly the same: " + text.equals(text2));
        System.out.println("both messages are the same case insensitive: " + text.equalsIgnoreCase(text2));
        System.out.println("first message starts with \"H\": " + text.startsWith("H"));
        System.out.println("second message starts with \"H\": " + text.endsWith("!"));
        
        System.out.println("first message compared to second message case sensitive: " + text.compareTo(text2));
        System.out.println("first message compared to second message case insensitive: " + text.compareToIgnoreCase(text2));
        
        System.out.println("first message contains the word \"world\": " + text.contains("world"));
        System.out.println("second message contains the letter \"o\": " + text.contains("o"));
        
        System.out.println("first message substring from index 3 to index 6: " + text.substring(3, 6));
        System.out.println("second message substring from index 5: " + text.substring(5));

        int i = text.indexOf(' ');
        System.out.println("first message first word: " + text.substring(0,i));
        System.out.println("first message starting second word: " + text.substring(i+1));
        
        i = text2.lastIndexOf(' ');
        System.out.println("second message last word: " + text2.substring(i));
        //System.out.println("second message pre-last word: " + text2.substring(i-1, i));

    }
    
}