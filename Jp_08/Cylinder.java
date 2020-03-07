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
public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }
    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0;
    }
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getVolume(){
        return super.getArea()*height;
    }
    
}
