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
public class Rectangle {
    private int width,height,i=0,j=0;
    
    public Rectangle(){
        this.width = 7;
        this.height=3;
    }
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea(){
        return this.height * this.width;
    }
    public int getPerimeter(){
        return (this.width + this.height)*2;
    }
    public int getWidth(){
        return this.width;
    }
    public void setWidth(int value){
        this.width=value;
    }
    public int getHeight(){
        return this.height;
    }
    public void setHeight(int value){
        this.height=value;
    }
    public void display(){
        while (i<this.height) {            
            while(j<this.width){
                System.out.printf("#");
                j++;
            }
            System.out.println("");
            i++;
            j=0;
        }
    }
}
