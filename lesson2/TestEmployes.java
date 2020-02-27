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
public class TestEmployes {
    public static void main(String[] args) {
        Employes e1 = new Employes(1, "Quan", "Truong", 5000000);
        
        System.out.println("id= "+ e1.getId()+ ", first name: "+e1.getFirstName()+", last name: "+e1.getLastName()+", salary= "+e1.getSalary());
        System.out.println("Name: "+e1.getName());
        
        e1.setSalary(5500000);
        System.out.println("Annul Salary= "+e1.getAnnulSalary());
        System.out.println("raise Salary= "+e1.raiseSalary(10));
        
        System.out.println(e1);
        
    }
}
