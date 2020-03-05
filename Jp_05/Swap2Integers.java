/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jp_05;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Swap2Integers {
    public static void main(String[] args) {
        int number1, number2, number;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        number1 = in.nextInt();
        System.out.print("Enter second integer: ");
        number2 = in.nextInt();
        
        number = number1;
        number1 = number2;
        number2 = number;
        
        System.out.println("First integer is: " + number1);
        System.out.println("Second integer is: " + number2);
        
    }
}
