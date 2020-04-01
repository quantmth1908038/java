package Java2_08.Controller;

import Java2_08.Model.Book;
import Java2_08.Model.Customer;

import java.sql.*;
import java.util.Scanner;

public class CustomerController {
    public void insertCustomer(Customer customer) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String sqlInsert = "insert into khach_hang(ten_kh, email, so_dien_thoai, dia_chi_giao_hang, level) value ("+ customer +")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCustomer(Customer customer) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            customer.setId();
            customer.setEmail();
            customer.setPhone();
            customer.setLevel();
            String sqlInsert = "update khach_hang set email = '"+ customer.getEmail() +"', so_dien_thoai = '"+ customer.getPhone() +"', khach_hang.level = "+ customer.getLevel() +" where id ="+ customer.getId();
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCusmoter(Customer customer) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            customer.setId();
            String sqlDelete = "delete from khach_hang where id = "+ customer.getId() +" and "+ customer.getId() +" not in (select kh_id from don_hang)";
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

    public void selectCustomer() {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select id, ten_kh, dia_chi_giao_hang, so_dien_thoai, email, level from khach_hang limit 100";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("The records selected are:");
            while(rset.next()) {
                System.out.println(rset.getInt("id") + "," + rset.getString("ten_kh")
                        + ", " + rset.getString("email") + ", " + rset.getString("so_dien_thoai")
                        + ", " + rset.getString("dia_chi_giao_hang") + ", " + rset.getInt("level")+"\n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Customer scannerCustomer(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String customerName = in.nextLine();
        System.out.print("Enter Email: ");
        String email = in.nextLine();
        System.out.print("Enter Phone: ");
        String phone = in.nextLine();
        System.out.print("Enter Address: ");
        String address = in.nextLine();
        System.out.print("Enter Level: ");
        int level = in.nextInt();
        Customer customer = new Customer(customerName,email,phone,address,level);
        return customer;
    }


}
