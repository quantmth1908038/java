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
        else{
            System.out.println("Not Time Value");
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
        if(0<=hour && hour<=23)
        {
            this.hour = hour;
        }
        else{
            System.out.println("Not Time Value");
        }
    }
    public void setMinute(int minute) {
        if(0<=minute && minute<=59)
        {
            this.minute = minute;
        }
        else{
            System.out.println("Not Time Value");
        }
    }
    public void setSecond(int second) {
        if(0<=second && second<=59)
        {
            this.second = second;
        }
        else{
            System.out.println("Not Time Value");
        }
    }
    
    public void setTime(int hour, int minute, int second){
        if(0<=hour && hour<=23 && 0<=minute && minute<=59 && 0<=second && second<=59){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        else{
            System.out.println("Not Time Value");
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour,minute,second);
    }
    
    public Time nextSecond(){
        second+=1;
        if(second==60){
            minute+=1;
            second=0;
        }
        if(minute==60){
            hour+=1;
            minute=0;
        }
        if(hour==24){
            hour=0;
            minute=0;
            second=0;        
        }
        return new Time(hour, minute, second);
   }
    public Time preiousSecond(){
        second-=1;
        if(second==-1){
            minute-=1;
            second=0;
        }
        if(minute==-1){
            hour-=1;
            minute=0;
        }
        if(hour==-1){
            hour=23;
            minute=59;
            second=59;        
        }
        return new Time(hour, minute, second);
   }
}
