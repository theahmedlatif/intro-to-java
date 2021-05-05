/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap3;

/**
 *
 * @author AhmedMohamedHammadAb
 */
public class LogicalOperators {
    
    public static void main(String[] args) {
        int x = 9;
        boolean a = (x++ < 10) && (++x < 10); //&
        
        System.out.println(a);
    }
    
}
