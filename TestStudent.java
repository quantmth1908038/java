/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author admin
 */
public class TestStudent {
    public static void main(String[] args){
        Student St1 =new Student("Thanh");
        Student St2 = new Student("Quan",7.0);
        System.out.println("ten: " + St1.getName());
        St1.setGpa(5.0);
        System.out.println(St1.toString());
        System.out.println(St2.toString());
        
        Circle c1 = new Circle("red",2);
        System.out.println("Ban kinh = " + c1.getRadius());
        System.out.println("Dien tich = " + c1.getArea());
       
    }
    
}
