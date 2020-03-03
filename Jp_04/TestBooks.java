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
public class TestBooks {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0]= new Author("Paul Tan", "Paul@nowwhere.com", 'm');
        authors[1]= new Author("Tan Ah Teck", "Ahteck@somewhere.com", 'm');
        
        Books javaDumy = new Books("Java for Dummy", authors, 19.99, 99);
        
        System.out.println(javaDumy);
        
        System.out.println(javaDumy.getAuthorName());
        
    }
}
