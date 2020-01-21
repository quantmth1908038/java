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
public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("B92.81023");
        car1.moveUp();
        car1.moveDown();
        car1.moveL();
        car1.moveR();
        car1.park();
        car1.accelerate();
        car1.toString();
    }
}
