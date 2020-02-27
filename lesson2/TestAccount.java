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
public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("A1", "Tung");
        Account acc2 = new Account("T2", "Thang", 12000000);
        
        System.out.println("id=" + acc1.getId() + ", name=" + acc1.getName() + ", balance=" + acc1.getBalance());
        System.out.println("id=" + acc2.getId() + ", name=" + acc2.getName() + ", balance=" + acc2.getBalance());
        
        System.out.println("credit acc1= "+acc1.credit(1000000));
        System.out.println("credit acc2= "+acc2.credit(5000000));
        
        System.out.println("debit acc1= "+acc1.debit(2000000));
        System.out.println("debit acc2= "+acc2.debit(2000000));
        
        System.out.println("balance acc2 transfer to= "+acc2.transferTo(acc1, 3000000));
        
        System.out.println(acc1);
        System.out.println(acc2);
        
    }
}
