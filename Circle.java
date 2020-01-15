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
public class Circle {
    private String color;
    private double radius;
    
    public Circle(String c, double r){
        this.color = c;
        this.radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
