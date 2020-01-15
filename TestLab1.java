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
public class TestLab1 {
    public static void main(String[] args){
        Student s1 = new Student("Quan",7.0);
        System.out.println("ten: " + s1.getName());
        System.out.println("Diem GPA: " + s1.setGpa());
        
        Circle c1 = new Circle("red",2);
        System.out.println("Ban kinh = " + c1.getRadius());
        System.out.println("Dien tich = " + c1.getArea());
        
        SoccerPlayer SP1 = new SoccerPlayer("messi",10);
        SP1.run();
        SP1.jump();
        SP1.kickBall();
        
        Car car1 = new Car("B92.81023");
        car1.move();
        car1.park();
        car1.accelerate();
    }
}
