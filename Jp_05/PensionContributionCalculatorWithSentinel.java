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
public class PensionContributionCalculatorWithSentinel {
    public static void main(String[] args) {
        final int SENTINEL = -1;
         
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;
        
        int salary, age;
        int contributableSalary;
        double employeeContribution, employerContribution, totalContribution;
        Scanner in = new Scanner(System.in);
        
        do{
            System.out.print("\"Enter the monthly salary (or -1 to end): $");
            salary = in.nextInt();
            System.out.print("Enter the age: ");
            age = in.nextInt();
            
            if(salary > 6000){
                contributableSalary = 6000;
            }
            else{
                contributableSalary = salary;
            }
            if(age <= 55){
                employeeContribution = contributableSalary*EMPLOYEE_RATE_55_AND_BELOW;
                employerContribution = contributableSalary*EMPLOYER_RATE_55_AND_BELOW;
            }
            else if(age <= 60){
                employeeContribution = contributableSalary*EMPLOYEE_RATE_55_TO_60;
                employerContribution = contributableSalary*EMPLOYER_RATE_55_TO_60;
            }
            else if(age <= 65){
                employeeContribution = contributableSalary*EMPLOYEE_RATE_60_TO_65;
                employerContribution = contributableSalary*EMPLOYER_RATE_60_TO_65;      
            }       
            else{            
                employeeContribution = contributableSalary*EMPLOYEE_RATE_65_ABOVE;            
                employerContribution = contributableSalary*EMPLOYER_RATE_65_ABOVE;      
            }
              
            totalContribution = employeeContribution + employerContribution;
           
            System.out.printf("The employee's contribution is: $%.2f%n", employeeContribution);    
            System.out.printf("The employer's contribution is: $%.2f%n", employerContribution);     
            System.out.printf("The total contribution is: $%.2f%n", totalContribution);
        }while (salary != SENTINEL);
        System.out.println("Bye!");
    }
}
