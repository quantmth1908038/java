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
public class TestCircle {
    public static void main(String[] args) {
        Circle C1 =new Circle("blue");
        Circle C2=new Circle(4);
        Circle C3 = new Circle("red",2);
        System.out.println("Ban kinh = " + C1.getRadius());
        System.out.println("mau: " + C1.getColor());
        System.out.println("Dien tich = " + C1.getArea());
        
        System.out.println("Ban kinh = " + C2.getRadius());
        System.out.println("mau: " + C2.getColor());
        System.out.println("Dien tich = " + C2.getArea());
        
        System.out.println("Ban kinh = " + C3.getRadius());
        System.out.println("mau: " + C3.getColor());
        System.out.println("Dien tich = " + C3.getArea());
    }
}
