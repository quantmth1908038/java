/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author admin
 */
public class Car {
    private String plateNumber;
    private int x,y,speed;
    
    public Car(String pn){
        this.plateNumber = pn;
    }
    public void moveUp(){
        this.y = y + 1;
        this.speed++;
    }
    public void moveDown(){
        this.y = (int) (y + 0.5);
        this.speed--;
    }
    public void moveL(){
        this.x--;
    }
    public void moveR(){
        this.x++;
    }
    public void park(){
        speed=0;
    }
    public void accelerate(){
        this.y = y + 2;
        this.speed = speed +2;
    }

    @Override
    public String toString() {
        return "Car{" + "plateNumber=" + plateNumber + ", x=" + x + ", y=" + y + ", speed=" + speed + '}';
    }
    
}
