package com.mycompany.chap4;

public class MathTest {
    public static void main(String args[]){
        System.out.println("sin: " + Math.sin(0));
        System.out.println("sin: " + Math.sin(Math.PI));
        System.out.println("asin: " + Math.asin(2));
        System.out.println("random: " + Math.random());
        System.out.println("toRadians" + Math.toRadians(Math.random()));
        System.out.println("e to power of random number: " + Math.exp(Math.random()));
        System.out.println("log: " + Math.log(80));
        System.out.println("sqrt: " + Math.sqrt(8));
        System.out.println("ceil: " + Math.ceil(4.5));
        System.out.println("floor: " + Math.floor(4.5));
        System.out.println("rint: " + Math.rint(4.5));
        System.out.println("rint: " + Math.rint(5.5));
        System.out.println("round: " + Math.round(4.5));
        System.out.println("round: " + Math.round(4.5));
        System.out.println("minimum of 123 & 293: " + Math.min(123, 293));
        System.out.println("maximum of 123 & 293: " + Math.max(123, 293));
        System.out.println("abosolute value -123: " + Math.abs(-123));
    }
}