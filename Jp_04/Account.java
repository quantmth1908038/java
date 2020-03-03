/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jp_04;

/**
 *
 * @author admin
 */
public class Account {
    private int ID;
    private Customer2 customer;
    private double balance=0;

    public Account(int ID, Customer2 customer, double balance) {
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int ID, Customer2 customer) {
        this.ID = ID;
        this.customer = customer;
    }

    public int getID() {
        return ID;
    }
    public Customer2 getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return customer + " balance=" + Math.round(balance*100)/100 ;
    }
    
    public String getCustomerName(){
        return customer.getName();
    }
    
    public Account deposit(double amount){
        Account acc = new Account(ID, customer, balance);
        this.balance+= amount;
        return acc;
    }
    
    public Account withdraw(double amount){
        Account acc = new Account(ID, customer, balance);
        if (balance >= amount) 
        {
            this.balance-= amount;
            return acc;
        }
        else
        {
            System.out.println("amount withdraw exceeds the current balance");
        }
        return null;
    }
    
}
