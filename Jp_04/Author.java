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
public class Author {
    private String name;
    private String email;
    private char genner;

    public Author(String name, String email, char genner) {
        this.name = name;
        this.email = email;
        this.genner = genner;
    }

    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenner() {
        return genner;
    }

    @Override
    public String toString() {
        return "Author{" + "name=" + name + ", email=" + email + ", genner=" + genner + '}';
    }
    

}
