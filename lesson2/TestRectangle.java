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
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3, 5);
        
        System.out.println("Length= " + r1.getLength() + ", width= " + r1.getWidth() + ", Area= " + r1.getArea() + ", Perimeter= "+r1.getPerimeter());
        System.out.println("Length= " + r2.getLength() + ", width= " + r2.getWidth() + ", Area= " + r2.getArea() + ", Perimeter= "+r2.getPerimeter());
        
        r1.setLength(2);
        r1.setWidth(2);
        r2.setLength(4);
        r2.setWidth(6);
        
        System.out.println(r1);
        System.out.println(r2);
        
    }
}
