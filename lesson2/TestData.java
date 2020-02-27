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
public class TestData {
      public static void main(String[] args) {
        Data d1 = new Data(27, 2, 2020);
        
          System.out.println("day: "+d1.getDay());
          System.out.println("month: "+d1.getMonth());
          System.out.println("year: "+d1.getYear());
          
          d1.setDay(25);
          d1.setMonth(1);
          d1.setYear(2021);
          System.out.println(d1);
          
          d1.setDate(2, 2,2020 );
          System.out.println(d1);
    }
}
