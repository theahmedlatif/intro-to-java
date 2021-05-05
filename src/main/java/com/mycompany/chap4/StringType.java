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
public class StringType {
    
    public static void main(String[] args) {
        
        String text = "Welcom to Java! ";
        System.out.println(text + "|| text length is " + text.length());
        
        text = text.trim();
        System.out.println(text + "|| text length is " + text.length());
    }
    
}
