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
public class ElectricLamp {
    private boolean status;
    
    public ElectricLamp(){
        this.status=false;
    }
    public void turnOn(){
        this.status=true;
    }
    public void turnOff(){
        this.status=false;
    }

    public void trangThai(){
        if(status==true){
            System.out.println("ElectricLamp: turnOn");
        }
        else{
            System.out.println("ElectricLamp: turnOff");
        }
    }
}
