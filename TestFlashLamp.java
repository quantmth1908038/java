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
public class TestFlashLamp {
    public static void main(String[] args) {
        FlashLamp F1=new FlashLamp();
        Battery bat1=new Battery();
        bat1.setEnergy(91);
        F1.setBattery(bat1);
        F1.turnOn();
        F1.turnOff();
        F1.turnOn();
        F1.turnOff();
        F1.turnOn();
        F1.turnOff();
        F1.turnOn();
        F1.turnOff();
        F1.turnOn();
        F1.turnOff();
        F1.turnOn();
        F1.turnOff();
        F1.turnOn();
        F1.turnOff();
        F1.turnOn();
        F1.turnOff();
        F1.turnOn();
        F1.turnOff();
        F1.turnOn();
        F1.turnOff();
        System.out.println(bat1.getEnergy());
    }
}
