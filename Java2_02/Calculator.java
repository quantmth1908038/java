package Java2_02;

import java.util.Scanner;

public class Calculator {
    public int[] intArray(int size){
        int[] n = new int[size];
        Scanner in = new Scanner(System.in);
        for (int i=0; i<size; i++){
            n[i] = in.nextInt();
        }
        return n;
    }

    public double getAverage(int[] array){
        int sum=0;
        for (int i=0; i<array.length; i++) {
            sum+= array[i];
        }
        return sum/array.length;
    }

    public static void main(String[] args) {
        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size array: ");
        size = in.nextInt();
        while (size < 0){
            System.out.print("Enter size array: ");
            size = in.nextInt();
        }
        Calculator c1 = new Calculator();
        System.out.println(c1.getAverage(c1.intArray(size)));
    }

}
