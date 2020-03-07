/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jp_08;

/**
 *
 * @author admin
 */
public class CircleShape extends Shape{
    private double radius;

    public CircleShape() {
        super();
        this.radius = 1;
    }
    public CircleShape(double radius) {
        super();
        this.radius = radius;
    }
    public CircleShape(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    public double getPerimeter(){
        return radius*Math.PI*2;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + "," + "radius=" + radius + ']';
    }

}
