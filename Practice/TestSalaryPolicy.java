package Practice;

import java.util.Scanner;

public class TestSalaryPolicy {
    public static void main(String[] args) {
        float baseSalary;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base Salary: ");
        baseSalary = in.nextFloat();

        EmployeeFullTime f1 = new EmployeeFullTime(baseSalary);
        EmployeePartime p2 = new EmployeePartime(baseSalary);

        System.out.println("Full Time Salary: " + f1.getSalary());
        System.out.println("Part Time Salary: " + p2.getSalary());

        SalaryPolicy s1 = new EmployeeFullTime(baseSalary);
        SalaryPolicy s2 = new EmployeePartime(baseSalary);

        System.out.println("Full Time Salary: " + s1.getSalary());
        System.out.println("Part Time Salary: " + s2.getSalary());

    }

}
