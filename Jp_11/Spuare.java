/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jp_11;

/**
 *
 * @author admin
 */
public class Spuare extends Rectangle{

    public Spuare() {
        super();
    }
    public Spuare(double side) {
        super(side, side);
    }
    public Spuare(double side, String color, Boolean filled) {
        super(side, side, color, filled);
    }
    
    public double getSide(){
        return super.getWidth();
    }
    
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    
    @Override
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }        

    @Override
    public String toString() {
        return "Spuare["+ super.toString() + ']';
    }
}
