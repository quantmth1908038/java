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
public class TestAuthor {
    public static void main(String[] args) {
        Author codeLean = new Author("Code Lean", "codeleanvn@gmail.com", 'm');
        
        System.out.println(codeLean);
        codeLean.setEmail("codelean@gmail.com");
        System.out.println("name is: " + codeLean.getName()); 
        System.out.println("eamil is: " + codeLean.getEmail());
        System.out.println("gender is: " + codeLean.getGenner());
        
    }
}
