package Java2_09;

import java.sql.*;
import java.util.Scanner;

public class EBookStore {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC","root", "");

                Statement stmt = conn.createStatement();
                )
        {
            /////////////2//////
            String strSelecte = "select id,ten_sach,nam_xuat_ban,so_lan_xuat_ban,gia,so_luong from sach order by nam_xuat_ban desc limit 3";
            ResultSet rset = stmt.executeQuery(strSelecte);
            System.out.println("Top 3 cuon sach moi nhat:");
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; ++i) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }


            strSelecte = "select sach.*,sum(don_hang_chi_tiet.so_luong) as da_ban from sach,don_hang_chi_tiet\n" +
                    "where don_hang_id in (select id from don_hang where trang_thai = 5) and id=sach_id\n" +
                    "group by don_hang_chi_tiet.sach_id order by da_ban desc limit 5";
            rset = stmt.executeQuery(strSelecte);

            System.out.println("Top 5 cuon ban chay nhat:");
            rsetMD = rset.getMetaData();
            numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; ++i) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }


            Scanner in = new Scanner(System.in);
            System.out.print("Tim sach theo the loai: ");
            String ls = in.nextLine();
            strSelecte = "select * from sach where tl_id = (select id from the_loai where loai_sach like '"+ ls + "')";

            rset = stmt.executeQuery(strSelecte);
            rsetMD = rset.getMetaData();
            numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; ++i) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }

            System.out.print("Tim sach theo ten tac gia: ");
            String tg = in.nextLine();
            System.out.println(tg);
            strSelecte = "select * from sach where tg_id = (select id from tac_gia where ten_tg like '" + tg + "')";
            rset = stmt.executeQuery(strSelecte);
            rsetMD = rset.getMetaData();
            numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; ++i) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }

            System.out.print("Tim sach theo ID: ");
            int ID = in.nextInt();
            strSelecte = "select * from sach where id ="+ ID;

            rset = stmt.executeQuery(strSelecte);
            rsetMD = rset.getMetaData();
            numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; ++i) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }

            ////////////3/////////
            System.out.println("Danh sach 30 don moi tiep nhan: ");
            strSelecte = "select don_hang.* from don_hang where trang_thai = 1";

            rset = stmt.executeQuery(strSelecte);
            rsetMD = rset.getMetaData();
            numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; ++i) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }

            System.out.println("Danh sach don hang theo ma khach hang: ");
            strSelecte = "select kh_id,don_hang.* from don_hang,khach_hang where kh_id = khach_hang.id order by kh_id asc";

            rset = stmt.executeQuery(strSelecte);
            rsetMD = rset.getMetaData();
            numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; ++i) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }

            System.out.println("Trang Thai don hang: ");
            strSelecte = "select id,trang_thai from don_hang order by id asc";

            rset = stmt.executeQuery(strSelecte);
            rsetMD = rset.getMetaData();
            numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; ++i) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }

            System.out.print("Tim don hang theo ma: ");
            ID = in.nextInt();
            strSelecte = "select * from don_hang where id ="+ ID;

            rset = stmt.executeQuery(strSelecte);
            rsetMD = rset.getMetaData();
            numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; ++i) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }

            System.out.println("Don hang dang cho xu ly: ");
            strSelecte = "select don_hang.* from don_hang where trang_thai = 2";

            rset = stmt.executeQuery(strSelecte);
            rsetMD = rset.getMetaData();
            numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; ++i) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }

            System.out.println("Don hang da dong goi: ");
            strSelecte = "select don_hang.* from don_hang where trang_thai = 3";

            rset = stmt.executeQuery(strSelecte);
            rsetMD = rset.getMetaData();
            numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; ++i) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }

            System.out.println("Don hang dang van chuyen: ");
            strSelecte = "select don_hang.* from don_hang where trang_thai = 4";

            rset = stmt.executeQuery(strSelecte);
            rsetMD = rset.getMetaData();
            numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; ++i) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }

            System.out.println("Don hang giao thanh cong: ");
            strSelecte = "select don_hang.* from don_hang where trang_thai = 5";

            rset = stmt.executeQuery(strSelecte);
            rsetMD = rset.getMetaData();
            numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; ++i) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }

            System.out.println("Don hang da huy: ");
            strSelecte = "select don_hang.* from don_hang where trang_thai = 0";

            rset = stmt.executeQuery(strSelecte);
            rsetMD = rset.getMetaData();
            numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; ++i) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }

        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}
