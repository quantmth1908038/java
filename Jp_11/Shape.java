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
abstract public class Shape {
    protected String color;
    protected Boolean filled;

    public Shape() {
        this.color = "RED";
        this.filled = true;
    }
    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public Boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    abstract public double getArea();
    
    abstract public double getPerimeter();
    
    @Override
    public String toString() {
        return "Shape[" + "color=" + color + ", filled=" + filled + ']';
    }
 
}
