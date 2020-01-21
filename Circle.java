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
    
    public Circle(String c){
        this.color = c;
    }
    public Circle(double r){
        this.radius = r;
    }
    public Circle(String c, double r){
        this.color = c;
        this.radius = r;
    }
    /**
     * lay ra ban kinh
     * @return 
     */
    public double getRadius(){
        return radius;
    }
    /**
     * lay ra mau sac
     * @return 
     */
    public String getColor(){
        return color;
    }
    /**
     * lay ra dien tich
     * @return 
     */
    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" + "color=" + color + ", radius=" + radius + '}';
    }
    
}
