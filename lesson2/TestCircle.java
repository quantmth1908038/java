/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

/**
 *
 * @author admin
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle c1= new Circle();
        Circle c2 = new Circle(2.0);
        Circle c3 = new Circle(3.0,"Blue");
        
        System.out.println("radius = "+c1.getRadius() +" and color =" + c1.getColor() + ", Area =" + c1.getArea() +", Circumference =" +c1.getCircumference());
        System.out.println("radius = "+c2.getRadius() +" and color =" + c2.getColor() + ", Area =" + c2.getArea() +", Circumference =" +c2.getCircumference());
        System.out.println("radius = "+c3.getRadius() +" and color =" + c3.getColor() + ", Area =" + c3.getArea() +", Circumference =" +c3.getCircumference());
        
        c1.setColor("Green");
        c1.setRadius(1.5);
        c2.setRadius(2.5);
        c2.setColor("Gray");
        c3.setColor("Red");
        c3.setRadius(3.5);
        
        System.out.println(c1.toString());
        System.out.println(c2);
        System.out.println(c3);
    }
}
