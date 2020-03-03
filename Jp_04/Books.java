/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jp_04;

import sun.security.util.Length;
import java.util.Arrays;
/**
 *
 * @author admin
 */
public class Books {
    private String name;
    private Author[] author;
    private double price;
    private int qty=0;


    public Books(String name, Author[] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Books(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }
    public Author[] getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        
        return "Books{" + "name=" + name + ", author=" + Arrays.toString(author) + ", price=" + price + ", qty=" + qty + '}';
    }
    
    public String getAuthorName(){
        String au = "";
        for (int i = 0; i < getAuthor().length; i++) {
            au+=getAuthor()[i].getName()+", ";
        }
        return au;
    }
}
