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
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if(0<=hour && hour<=23 && 0<=minute && minute<=59 && 0<=second && second<=59){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    
    public void setTime(int hour, int minute, int second){
        if(0<=hour && hour<=23 && 0<=minute && minute<=59 && 0<=second && second<=59){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    @Override
    public String toString() {
        if(hour<=9 && minute>9 && second>9){
            return "Time= " + "0"+hour + ":" + minute + ":" + second + '}';
        }
        if(hour>9 && minute<=9 && second>9){
            return "Time= " + hour + ":" + "0"+minute + ":" + second + '}';
        }
        
        if(hour>9 && minute>9 && second<=9){
            return "Time= " + hour + ":" + minute + ":" + "0"+second + '}';
        }
            
        if(hour<=9 && minute<=9 && second>9){
            return "Time= " + "0"+hour + ":" + "0"+minute + ":" + second + '}';
        }
            
        if(hour>9 && minute<=9 && second<=9){
            return "Time= " + hour + ":" + "0"+minute + ":" + "0"+second + '}';
        }
            
        if(hour<=9 && minute<=9 && second<=9){
            return "Time= " + "0"+hour + ":" + "0"+minute + ":" + "0"+second + '}';
        }
        else{
            return "Time= " + hour + ":" + minute + ":" + second + '}';
        }
    }
    
    public Time nextSecond(){
        return new Time(hour, minute, second+1);
   }
    public Time preiousSecond(){
        return new Time(hour, minute, second-1);
   }

}
