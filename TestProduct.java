/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

/**
 *
 * @author admin
 */
public class TestProduct {
    public static void main(String[] args) {
        Product p1 = new Product(1,"nuoc khoang", 5000);
        Product p2 = new Product(2,"coca coala", 10000, "nuoc ngot");
        Product p3 = new Product(3, "Sting", 5000, 10);
        Product p4 = new Product(4, "Pessi", 10000, 20, "nuoc ngot");
        
        System.out.println(p1.getPrice());
        System.out.println(p1.getQyt());
        p1.setPrive(6000);
        System.out.println(p1.toString());
        
        System.out.println(p2.getPrice());
        System.out.println(p2.getQyt());
        p2.setPrive(7000);
        System.out.println(p2.toString());
        
        System.out.println(p3.getPrice());
        System.out.println(p3.getQyt());
        p3.setPrive(6000);
        System.out.println(p3.toString());
        
        System.out.println(p4.getPrice());
        System.out.println(p4.getQyt());
        p4.setPrive(9000);
        System.out.println(p4.toString());
    }
}
