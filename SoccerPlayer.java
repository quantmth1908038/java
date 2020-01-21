/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author admin
 */
public class SoccerPlayer {
    private String name;
    private int number;
    private int x,y;
    
    public SoccerPlayer(String name, int num){
        this.name = name;
        this.number = num;
    }

    public void runR(){
        this.x++;
    }
    public void runL(){
        this.x--;
    }
    public void jump(){
       this.y++;
    }
    public void kickBall(){
        
    }
}
