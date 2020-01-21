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
public class Product {
    private int id;
    private String name;
    private double price;
    private int qty;
    private String description;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public Product(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Product(int id, String name, double price, int qty, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.description = description;
    }
    
    public double getPrice(){
        return getPrice();
    }
    public int getQyt(){
        return getQyt();
    }
    public void setPrive(double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + ", description=" + description + '}';
    }
    
}
