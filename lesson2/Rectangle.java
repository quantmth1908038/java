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
public class Rectangle {
    private float length;
    private float width;
    
    public Rectangle(){
        length = (float) 1.0;
        width = (float) 1.0;
    }
    public Rectangle(float l, float w){
        this.length = l;
        this.width = w;
    }
    
    public float getLength(){
        return length;
    }
    public void setLength(float length){
        this.length = length;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return (length+width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length= " + length + ", width= " + width + '}';
    }
    
}
