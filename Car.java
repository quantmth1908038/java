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
    public void move(){
        x++;
        y++;
        speed++;
    }
    public void park(){
        speed=0;
    }
    public void accelerate(){
        speed = speed +2;
    }
}
