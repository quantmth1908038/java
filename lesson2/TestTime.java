/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

/**
 *
 * @author admin
 */
public class TestTime {
    public static void main(String[] args) {
        Time Time1 = new Time(5,30,13);
        
        System.out.println("hour: "+Time1.getHour());
        System.out.println("minute: "+Time1.getMinute());
        System.out.println("sencond: "+Time1.getSecond());
        
        Time1.setHour(24);
        Time1.setMinute(00);
        Time1.setSecond(60);
        
        System.out.println(Time1);
        System.out.println(Time1.preiousSecond());
        
        Time1.setTime(2,30, 59);
        
        System.out.println(Time1);
        System.out.println(Time1.nextSecond().toString());
    }
}
