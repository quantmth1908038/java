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
public class CricleComputation {
    public static void main(String[] args) {
        double radius, diameter, circumference, area;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        
        diameter = radius*2;
        circumference = diameter*Math.PI;
        area = radius*radius*Math.PI;
        
        System.out.printf("Disameter is: %.2f%n", diameter);
        System.out.printf("Circumference is: %.2f%n", circumference);
        System.out.printf("Area is: %.2f%n", area);
        
    }
}
