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
public class Student {
    private String name;
    private double gpa;
    
    public Student(String n, double g){
        this.name = n;
        this.gpa = g;
    }
    public String getName(){
        return name;
    }
    public double setGpa(){
        return gpa;
    }
}
