package giftcontroller;


import giftmodel.Gift;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiftController {
    Scanner in = new Scanner(System.in);
    public void selectGift (){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC","root", ""); // For MySQL only
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select id,title, price, qty from books";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("The records selected are:");
            while(rset.next()) {
                int id = rset.getInt("id");
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(id + "," +title + ", " + price + ", " + qty);
            }
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insertGift (){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC","root", ""); // For MySQL only
                Statement stmt = conn.createStatement();
        ){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter book title: ");
            String title = in.nextLine();
            System.out.print("Enter book id: ");
            int id = in.nextInt();
            System.out.print("Enter book price: ");
            double price = in.nextDouble();
            System.out.print("Enter book qty: ");
            int qty = in.nextInt();
            Gift gift = new Gift(id,title,price,qty);
            String sqlInsert = "insert into books(id,title, price,qty) values ("+gift+")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteGift (){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC","root", ""); // For MySQL only
                Statement stmt = conn.createStatement();
        ){
            System.out.print("Enter book id to delete: ");
            int id = in.nextInt();
            String sqlDelete = "delete from books where id =" + id;
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}
