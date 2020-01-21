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

    public Student(String name) {
        this.name = name;
    }
    public Student(String n, double g){
        this.name = n;
        this.gpa = g;
    }
    public String getName(){
        return name;
    }
    public void setGpa(double gpa){
        this.gpa=gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", gpa=" + gpa + '}';
    }
    
}
