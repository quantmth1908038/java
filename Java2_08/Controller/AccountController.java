package Java2_08.Controller;

import Java2_08.Model.Account;

import java.sql.*;
import java.util.Scanner;

public class AccountController {
    public void signUp(Account account){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC","root", ""); // For MySQL only
                Statement stmt = conn.createStatement();
        ) {
            String sqlInsert = "insert into book_manager(username, passwork, role) value ('"+ account.getUsername() +"','"+ account.getPassword()+"',"+account.getRole()+")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            if (countInserted == 1){
                System.out.println("Sign up successfully.\n");
            }else {
                System.out.println("User name already exist.\n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean logIn(Account account){
        boolean login = false;
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC","root", ""); // For MySQL only
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select * from book_manager where username = '"+ account.getUsername() +"' and passwork = '"+ account.getPassword() +"'";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset.next()){
                System.out.println("Logged in successfully.\n");
                login = true;
            }else {
                System.out.println("Login Unsuccessful.\n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return login;
    }

    public Account scannerSignUp(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter User Name: ");
        String username = in.nextLine();
        System.out.print("Enter Password: ");
        String password = in.nextLine();
        System.out.print("Enter Role: ");
        int role = in.nextInt();
        Account account = new Account(username,password,role);
        return account;
    }

    public Account scannerLogIn(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter User Name: ");
        String username = in.nextLine();
        System.out.print("Enter Password: ");
        String password = in.nextLine();
        Account account = new Account(username,password);
        return account;
    }

}
