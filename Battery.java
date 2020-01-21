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
public class Battery {
    private int energy;
    public Battery(){
     energy=100;
    }
    public void setEnergy(int value) {
        energy=value;
    }
    public int getEnergy() {
        return energy;
    }
    public void decreaseEnergy() {
        energy--;
    }
}
