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
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;
        
        int taxableIncome;
        double taxPayable;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the taxable income: $");
        taxableIncome = in.nextInt();
        
        if(taxableIncome <= 20000){
            taxPayable = 0;
        }
        else if(taxableIncome <= 40000) {
            taxPayable = (taxableIncome-20000)*TAX_RATE_ABOVE_20K;
        }
        else if(taxableIncome <= 60000){
            taxPayable = 2000 + (taxableIncome-40000)*TAX_RATE_ABOVE_40K;
        }
        else{
            taxPayable = 6000 + (taxableIncome-60000)*TAX_RATE_ABOVE_60K;
        }
        
        System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
    }
}
