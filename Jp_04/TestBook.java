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
public class TestBook {
    public static void main(String[] args) {
        Author codeLean = new Author("Code Lean", "codeleanvn@gmail.com", 'f');
        System.out.println(codeLean);
        
        Book dummyBook = new Book("Java for dummy", codeLean, 19.95, 99);
        System.out.println(dummyBook);
        
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        Book anotherBook = new Book("more Java",
                new Author("Dang Kim Thi", "dangkimthi@gmail.com", 'f'), 29.95);
        System.out.println(anotherBook);
        
    }
}
