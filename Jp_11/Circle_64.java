/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jp_11;

/**
 *
 * @author admin
 */
public class Circle_64 implements GeometricObject{
    protected double radius=1;

    public Circle_64(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[" + "radius=" + radius + ']';
    }

    @Override
    public double getPerimeter() {
        return radius*Math.PI*2;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

}
