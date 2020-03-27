package Java2_04;

import java.sql.*;
import java.util.Scanner;

public class JdbcSelectNorthWind {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC","root", ""); // For MySQL only
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select * from customers";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("The records selected are:");

            while(rset.next()) {
                String customerID = rset.getString("CustomerID");
                String companyName = rset.getString("CompanyName");
                String contactName = rset.getString("ContactName");
                String contactTitle  = rset.getString("ContactTitle");
                String address = rset.getString("Address");
                String city = rset.getString("City");
                String region = rset.getString("Region");
                String postalCode = rset.getString("PostalCode");
                String country = rset.getString("Country");
                String phone = rset.getString("Phone");
                String fax = rset.getString("Fax");
                System.out.println(customerID + ", " + companyName + ", " + contactName + ", " + contactTitle + ", "
                        + address + ", " + city + ", " + region + ", " + postalCode + ", " + country + ", " + phone + ", " + fax);
            }


            Scanner in = new Scanner(System.in);
            System.out.print("Enter name customer: ");
            String cus = in.nextLine();
            strSelect = "select * from customers where CompanyName like '"+ cus +"'";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            rset = stmt.executeQuery(strSelect);
            System.out.println("The records find name customer:");

            while(rset.next()) {
                String customerID = rset.getString("CustomerID");
                String companyName = rset.getString("CompanyName");
                String contactName = rset.getString("ContactName");
                String contactTitle  = rset.getString("ContactTitle");
                String address = rset.getString("Address");
                String city = rset.getString("City");
                String region = rset.getString("Region");
                String postalCode = rset.getString("PostalCode");
                String country = rset.getString("Country");
                String phone = rset.getString("Phone");
                String fax = rset.getString("Fax");
                System.out.println(customerID + ", " + companyName + ", " + contactName + ", " + contactTitle + ", "
                        + address + ", " + city + ", " + region + ", " + postalCode + ", " + country + ", " + phone + ", " + fax);
            }


            strSelect = "select * from products";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            rset = stmt.executeQuery(strSelect);
            System.out.println("The records selected are:");

            while(rset.next()) {
                int productID = rset.getInt("ProductID");
                String productName = rset.getString("ProductName");
                String quantityPerUnit = rset.getString("QuantityPerUnit");
                double unitPrice  = rset.getDouble("UnitPrice");
                int unitsInStock = rset.getInt("UnitsInStock");
                int unitsOnOrder = rset.getInt("UnitsOnOrder");
                int reorderLevel = rset.getInt("ReorderLevel");
                boolean discontinued = rset.getBoolean("Discontinued");

                System.out.println(productID + ", " + productName + ", " + quantityPerUnit + ", " + unitPrice + ", "
                        + unitsInStock + ", " + unitsOnOrder + ", " + reorderLevel + ", " + discontinued);
            }

            System.out.print("Enter price to: ");
            double price1 = in.nextDouble();
            System.out.print("from: ");
            double price2 = in.nextDouble();
            strSelect = "select * from products where UnitPrice > "+ price1 +" and  UnitPrice < "+ price2;
            System.out.println("The SQL statement is: " + strSelect + "\n");
            rset = stmt.executeQuery(strSelect);
            System.out.println("The records selected are:");

            while(rset.next()) {
                int productID = rset.getInt("ProductID");
                String productName = rset.getString("ProductName");
                String quantityPerUnit = rset.getString("QuantityPerUnit");
                double unitPrice  = rset.getDouble("UnitPrice");
                int unitsInStock = rset.getInt("UnitsInStock");
                int unitsOnOrder = rset.getInt("UnitsOnOrder");
                int reorderLevel = rset.getInt("ReorderLevel");
                boolean discontinued = rset.getBoolean("Discontinued");

                System.out.println(productID + ", " + productName + ", " + quantityPerUnit + ", " + unitPrice + ", "
                        + unitsInStock + ", " + unitsOnOrder + ", " + reorderLevel + ", " + discontinued);
            }


            strSelect = "select * from orders,`order details` where orders.OrderID = `order details`.OrderID limit 1";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            rset = stmt.executeQuery(strSelect);
            System.out.println("The records selected are:");

            while(rset.next()) {
                int orderID = rset.getInt("OrderID");
                String customerID = rset.getString("CustomerID");
                int employeeID = rset.getInt("EmployeeID");
                String orderDate = rset.getString("OrderDate");
                String requiredDate  = rset.getString("RequiredDate");
                String unitsInStock = rset.getString("ShippedDate");
                int shipVia = rset.getInt("ShipVia");
                double freight = rset.getDouble("Freight");
                String shipName = rset.getString("ShipName");
                String shipAddress = rset.getString("ShipAddress");
                String shipCity = rset.getString("ShipCity");
                String shipRegion = rset.getString("ShipRegion");
                String shipPostalCode = rset.getString("ShipPostalCode");
                String shipCountry = rset.getString("ShipCountry");
                double unitPrice = rset.getDouble("UnitPrice");
                int quantity = rset.getInt("Quantity");
                double discount = rset.getDouble("Discount");

                System.out.println(orderID + ", " + customerID + ", " + employeeID + ", " + orderDate + ", "
                        + requiredDate + ", " + unitsInStock + ", " + shipVia + ", " + freight + ", " + shipName + ", " + shipAddress
                        + ", " + shipCity + ", " + shipRegion + ", " + shipPostalCode + ", " + shipCountry + ", " + unitPrice + ", " + quantity + ", " + discount);
            }


        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }



}
