package Java2_07;

import java.sql.*;

public class JdbcUpdateNorthWind {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC","root", ""); // For MySQL only
                Statement stmt = conn.createStatement();
        ) {
            //////////////1///////////
            String strUpdate = "update categories set CategoryName = 'SeaFood VN' where CategoryName like 'Seafood'";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");

            String strSelect = "select * from categories";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()) {
                System.out.println(rset.getInt("CategoryID") + ", "
                        + rset.getString("CategoryName") + ", "
                        + rset.getString("Description"));
            }

            ////////////2///////////
            strUpdate = "update customers set Address = '1A Yet Kieu', City = 'Ha Noi', Country = 'Vietnam' where CustomerID = 'FRANK'";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");

            strSelect = "select * from customers where CustomerID = 'FRANK'";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            rset = stmt.executeQuery(strSelect);
            while(rset.next()) {
                System.out.println(rset.getString("CustomerID") + ", "
                        + rset.getString("CompanyName") + ", "
                        + rset.getString("ContactName")+ ", "
                        + rset.getString("ContactTitle")+ ", "
                        + rset.getString("Address")+ ", "
                        + rset.getString("City")+ ", "
                        + rset.getString("Region")+ ", "
                        + rset.getString("PostalCode")+ ", "
                        + rset.getString("Country")+ ", "
                        + rset.getString("Phone")+ ", "
                        + rset.getString("Fax"));
            }
            ///////////3//////////
//            strUpdate = "update products set UnitPrice = UnitPrice + UnitPrice*0.1 where CategoryID in (5,7,8)";
//            System.out.println("The SQL statement is: " + strUpdate + "\n");
//            countUpdated = stmt.executeUpdate(strUpdate);
//            System.out.println(countUpdated + " records affected.\n");
//
//            strSelect = "select * from products where CategoryID in (5,7,8)";
//            System.out.println("The SQL statement is: " + strSelect + "\n");
//            rset = stmt.executeQuery(strSelect);
//            while(rset.next()) {
//                System.out.println(rset.getInt("ProductID") + ", "
//                        + rset.getString("ProductName") + ", "
//                        + rset.getInt("SupplierID")+ ", "
//                        + rset.getInt("CategoryID")+ ", "
//                        + rset.getString("QuantityPerUnit") + ", "
//                        + rset.getDouble("UnitPrice") + ", "
//                        + rset.getInt("UnitsInStock")+ ", "
//                        + rset.getInt("UnitsOnOrder")+ ", "
//                        + rset.getInt("ReorderLevel")+ ", "
//                        + rset.getBoolean("Discontinued"));
//            }
            //////////////4/////////////
            strUpdate = "update orders set ShipVia = 3 where OrderID = 10313";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");

            strSelect = "select * from orders where OrderID = 10313";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            rset = stmt.executeQuery(strSelect);
            while(rset.next()) {
                System.out.println(rset.getInt("OrderID") + ", "
                        + rset.getString("CustomerID") + ", "
                        + rset.getInt("EmployeeID")+ ", "
                        + rset.getString("OrderDate")+ ", "
                        + rset.getString("RequiredDate")+ ", "
                        + rset.getString("ShippedDate")+ ", "
                        + rset.getInt("ShipVia")+ ", "
                        + rset.getDouble("Freight") + ", "
                        + rset.getString("ShipName") + ", "
                        + rset.getString("ShipAddress") + ", "
                        + rset.getString("ShipCity") + ", "
                        + rset.getString("ShipRegion") + ", "
                        + rset.getString("ShipPostalCode") + ", "
                        + rset.getString("ShipCountry"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
