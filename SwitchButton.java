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
public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;
    
    public SwitchButton(){
        this.status=false;
    }
    public void connectToLamp(ElectricLamp lamp){
        this.lamp = lamp;
    }
    public void switchOff(){
        this.status=false;
        lamp.turnOff();
    }
    public void switchOn(){
        this.status=true;
        lamp.turnOn();
    }
}
