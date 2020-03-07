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
public class Point {
    private float x;
    private float y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }

    public  float[] getXY(){
        float[] xy ={this.x,this.y};
        return xy;
    }
    
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }
}
