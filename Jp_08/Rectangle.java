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
public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
        super();
        this.width = 1;
        this.length = 1;
    }
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        return this.width*this.length;
    }
    
    public double getPerimeter(){
        return (this.width + this.length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + "," + "width=" + width + ", length=" + length + ']';
    }
    
    
}
