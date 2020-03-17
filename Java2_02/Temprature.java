package Java2_02;

import Jp_04.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        int n;
        int sum = 0, c = 0;
        double average;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of day: ");
        n = in.nextInt();
        while (n <= 0){
            System.out.print("Enter number of day: ");
            n = in.nextInt();
        }

        int[] tem = new int[n];
        for (int i=0; i < tem.length; i++){
            System.out.print("Enter temprature day "+ (i+1) +": ");
            tem[i] = in.nextInt();
            sum += tem[i];
        }
        average = sum/n;
        System.out.println("Average is: " + average);

        for (int i = 0; i < tem.length; i++) {
            if (average < tem[i]){
                c++;
            }
        }

        System.out.printf("There are %d days higher than average", c);
    }

}
