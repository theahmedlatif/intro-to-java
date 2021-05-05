/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chap4;

/**
 *
 * @author AhmedMohamedHammadAb
 */
public class Alphabet {
    
    public static void main(String[] args) {
        char letter = 'A';
        for(int i = 0; i <= 26; i++, letter++) {
            System.out.println(letter + " ");
        }
        
        letter = 'a';
        for(int i = 0; i <= 26; i++, letter++) {
            System.out.println(letter + " ");
        }
    }    
}
