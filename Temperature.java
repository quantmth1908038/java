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
public class Temperature {
    private double cTemp;
    
    public Temperature(){
        this.cTemp =24;
    }
    public Temperature(double c){
        this.cTemp=c;
    }
    public double getCTemp(){
        return this.cTemp;
    }
    public void setCTemp(double c){
        this.cTemp=c;
    }
    public double getKTemp(){
        return this.cTemp + 273.15;
    }
    public double getFTemp(){
        return (this.cTemp*1.8) + 32;
    }
}
