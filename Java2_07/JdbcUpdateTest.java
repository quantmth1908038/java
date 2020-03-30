package Java2_07;

import java.sql.*;

public class JdbcUpdateTest {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC","root", ""); // For MySQL only
                Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "update books set price = price + price*0.5 where title like 'A Cup of Java'";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");

            strUpdate = "update books set qty = 0 where title like 'A Teaspoon of Java'";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");

            String strSelect = "select * from books";
            System.out.println("The SQL statement is: " + strSelect + "\n");
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
