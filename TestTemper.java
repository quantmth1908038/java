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
public class TestTemper {
    public static void main(String[] args) {
        Temperature temp=new Temperature();
        temp.setCTemp(25);
        System.out.println("Do F: "+temp.getFTemp());
        System.out.println("Do K: "+temp.getKTemp());
        
    }
}
