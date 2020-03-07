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
public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
        super();
        this.xSpeed = 0;
        this.ySpeed = 0;
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed, float x, float y) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public  float[] getXY(){
        float[] xy ={this.xSpeed,this.ySpeed};
        return xy;
    }

    @Override
    public String toString() {
        return super.toString() + "," + "Speed=(" + xSpeed + "," + ySpeed + ')';
    }
    
    public MovablePoint move(){
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
        return this;
    }
    
}
