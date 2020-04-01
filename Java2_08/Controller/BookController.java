package Java2_08.Controller;

import Java2_08.Model.Book;

import java.sql.*;
import java.util.Scanner;

public class BookController {
    public void insertBook(Book book) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String sqlInsert1 = "insert into tac_gia(ten_tg) value ('"+ book.getTacGia() +"')";
            String sqlInsert2 = "insert into sach(ten_sach, gia, so_luong,tg_id) VALUE ("+ book +",(select id from tac_gia order by id desc limit 1))";
            System.out.println("The SQL statement is: " + sqlInsert1 + "\n" + sqlInsert2 + "\n");
            int countInserted1 = stmt.executeUpdate(sqlInsert1);
            int countInserted2 = stmt.executeUpdate(sqlInsert2);
            System.out.println(countInserted2 + " records inserted.\n");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateBook(Book book) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            book.setId();
            book.setGia();
            book.setSoLuong();
            String sqlInsert = "update sach set gia = "+ book.getGia() +",so_luong = "+ book.getSoLuong() +" where id ="+ book.getId();
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBook(Book book) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            book.setId();
            String sqlDelete = "delete from sach where id = "+ book.getId() +" and "+ book.getId() +" not in (select sach_id from don_hang_chi_tiet)";
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            if (countDeleted ==0 ){
                System.out.println("Can't Delete! \n");
            }else {
                System.out.println(countDeleted + " records deleted.\n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectBook() {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select sach.id, ten_sach, gia, so_luong,ten_tg  from sach,tac_gia where sach.tg_id = tac_gia.id limit 100";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("The records selected are:");
            while(rset.next()) {
                System.out.println(rset.getInt("sach.id") + "," + rset.getString("ten_sach")
                        + ", " + rset.getString("ten_tg") + ", " + rset.getDouble("gia")
                        + ", " + rset.getInt("so_luong") + "\n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Book scannerBook(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        String ten_sach = in.nextLine();
        System.out.print("Enter Book Author: ");
        String tac_gia = in.nextLine();
        System.out.print("Enter Book price: ");
        double gia = in.nextDouble();
        System.out.print("Enter Book Qty: ");
        int so_luong = in.nextInt();
        Book book = new Book(ten_sach,gia,so_luong,tac_gia);
        return book;
    }



}
