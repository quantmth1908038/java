package giftmodel;

import java.util.Scanner;

public class Gift {
    private int id;
    private String name;
    private double price;
    private int qty;

    public Gift() {
    }

    public Gift(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Gift(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public int getQty() {
        return qty;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + ","+ "'" + name + "'" + ","+ price + "," + qty ;
    }

}
