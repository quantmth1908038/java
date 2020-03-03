/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jp_04;

/**
 *
 * @author admin
 */
public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
        this.center.setXY(0, 0);
        this.radius = 1;
    }
    public MyCircle(int x, int y, int radius) {
        this.center.setX(x);
        this.center.setY(y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }
    public int getRadius() {
        return radius;
    }
    public int getCenterX(){
        return center.getX();
    }
    public int getCenterY(){
        return center.getY();
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public void setCenterY(int y){
        this.center.setY(y);
    }
    
    public int[] getCenterXY(){
        int[] xy={this.center.getX(),this.center.getY()};
        return xy;
    }
    
    public void setCenterXY(int x, int y){
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public String toString() {
        return "MyCircle{" + "center=" + center + ", radius=" + radius + '}';
    }
    
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumference(){
        return Math.PI*radius*2;
    }
    
    public double distance(MyCircle another){
        return center.distance(another.center); 
    }
    
    
    
    
}
