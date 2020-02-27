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
public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem in1 = new InvoiceItem("I01", "T1", 100, 15000);
        
        System.out.println("id=" + in1.getId() + ", desc=" + in1.getDesc() + ", qty=" + in1.getQty() + ", unitPrice=" + in1.getUnitPrice());
        
        in1.setQty(200);
        in1.setUnitPrice(14000);
        
        System.out.println("Total= "+in1.getTotal());
        System.out.println(in1);
        
    }
}
