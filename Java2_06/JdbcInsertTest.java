package MySQL;

import java.sql.*;
import java.util.Scanner;

public class JdbcInsertTest {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String sqlDelete = "delete from books where id > 8000";
            System.out.println("The SQL statement is: " + sqlDelete + "\n"); // Ech
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");

            String sqlInsert = "insert into books values (3005, 'Gone Fishing', 'Kumar',11.11,11)";
            System.out.println("The SQL statement is: " + sqlInsert + "\n"); // Ech
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

            sqlInsert = "insert into books values "
                    + "(8001, 'Java Core', 'Dang Kim Thi', 15.55, 55),"
                    + "(8002, 'Java Advanced', 'Jamen Gosling', 25.55, 55)";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

            sqlInsert = "insert into books (id, title, author) values (2003, 'Java JDBC MySQL', 'ThiDK')";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

            Scanner in = new Scanner(System.in);
            System.out.print("Enter id book to delete: ");
            int id = in.nextInt();
            sqlDelete = "delete from books where id ="+id;
            System.out.println("The SQL statement is: " + sqlDelete + "\n"); // Ech
            countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");

            System.out.print("Enter book id: ");
            id = in.nextInt();
            System.out.print("Enter book title: ");
            String title = in.nextLine();
            System.out.print("Enter book author: ");
            String author = in.nextLine();
            System.out.print("Enter book price: ");
            double price = in.nextDouble();
            System.out.print("Enter book qty: ");
            int qty = in.nextInt();
            sqlInsert = "insert into books values ("+ id + "," + "'" + title + "'" + "," + "'" + author + "'" + "," + price + "," + qty +")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");


            String strSelect = "select * from books";
            System.out.println("The SQL statement is: " + strSelect + "\n"); // Ech
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()) {
                System.out.println(rset.getInt("id") + ", "
                        + rset.getString("author") + ", "
                        + rset.getString("title") + ", "
                        + rset.getDouble("price") + ", "
                        + rset.getInt("qty"));
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}

