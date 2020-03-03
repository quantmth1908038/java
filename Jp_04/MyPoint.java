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
public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint() {
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public  int[] getXY(){
        int[] xy ={this.x,this.y};
        return xy;
    }
    
    public void setXY(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }
    
    public double distance(int x,int y){
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }
   
    public double distance(MyPoint another){
        return Math.sqrt(Math.pow((another.x-this.x),2)+Math.pow((another.y-this.y),2));
        
    }
    
    public double distance(){
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }
}
