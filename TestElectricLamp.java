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
public class TestElectricLamp {
    public static void main(String[] args) {
        ElectricLamp lamp1=new ElectricLamp();
        SwitchButton button1=new SwitchButton();
        
        button1.connectToLamp(lamp1);
        lamp1.trangThai();
        button1.switchOff();
        button1.switchOn();
        button1.switchOff();
        button1.switchOn();
        button1.switchOff();
        button1.switchOn();
        button1.switchOff();
        button1.switchOn();
        button1.switchOff();
        button1.switchOn();
        button1.switchOff();
        button1.switchOn();
        button1.switchOff();
        button1.switchOn();
        button1.switchOff();
        button1.switchOn();
        button1.switchOff();
        button1.switchOn();
        button1.switchOff();
        button1.switchOn();
        
        lamp1.trangThai();
        
    }
}
