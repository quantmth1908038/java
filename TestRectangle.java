/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author admin
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle Re1=new Rectangle();
        Re1.display();
        Re1.setWidth(10);
        Re1.setHeight(5);
        System.out.println("Dien Tich: "+Re1.getArea());
        System.out.println("Chu Vi: "+Re1.getPerimeter());
       
    }
}
