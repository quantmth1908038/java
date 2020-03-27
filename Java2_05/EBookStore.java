package java2_05;

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
            String sltTop3N = "select id,ten_sach,nam_xuat_ban,so_lan_xuat_ban,gia,so_luong from sach order by nam_xuat_ban desc limit 3";
            ResultSet rset = stmt.executeQuery(sltTop3N);
            System.out.println("Top 3 cuon sach moi nhat:");
            while(rset.next()) {
                int id = rset.getInt("id");
                String tenSach = rset.getString("ten_sach");
                int namXB = rset.getInt("nam_xuat_ban");
                int lBan = rset.getInt("so_lan_xuat_ban");
                double gia = rset.getDouble("gia");
                double sl = rset.getDouble("so_luong");
                System.out.println(id + "," + tenSach + "," + namXB + "," + lBan + "," + gia + "," + sl);
            }


            String sltTop5S = "select sach.*,sum(don_hang_chi_tiet.so_luong) as da_ban from sach,don_hang_chi_tiet\n" +
                    "where don_hang_id in (select id from don_hang where trang_thai = 5) and id=sach_id\n" +
                    "group by don_hang_chi_tiet.sach_id order by da_ban desc limit 5";
            rset = stmt.executeQuery(sltTop5S);

            System.out.println("Top 5 cuon ban chay nhat:");
            while(rset.next()) {
                int id = rset.getInt("id");
                String tenSach = rset.getString("ten_sach");
                int namXB = rset.getInt("nam_xuat_ban");
                int lBan = rset.getInt("so_lan_xuat_ban");
                double gia = rset.getDouble("gia");
                double sl = rset.getDouble("so_luong");
                System.out.println(id + "," + tenSach + "," + namXB + "," + lBan + "," + gia + "," + sl);
            }


            Scanner in = new Scanner(System.in);
            System.out.print("Tim sach theo the loai: ");
            String ls = in.nextLine();
            String sltTheLoai = "select * from sach where tl_id = (select id from the_loai where loai_sach like '"+ ls + "')";

            rset = stmt.executeQuery(sltTheLoai);
            while(rset.next()) {
                int id = rset.getInt("id");
                String tenSach = rset.getString("ten_sach");
                int namXB = rset.getInt("nam_xuat_ban");
                int lBan = rset.getInt("so_lan_xuat_ban");
                double gia = rset.getDouble("gia");
                double sl = rset.getDouble("so_luong");
                System.out.println(id + "," + tenSach + "," + namXB + "," + lBan + "," + gia + "," + sl);
            }

            System.out.print("Tim sach theo ten tac gia: ");
            String tg = in.nextLine();
            System.out.println(tg);
            String sltTacGia = "select * from sach where tg_id = (select id from tac_gia where ten_tg like '" + tg + "')";
            rset = stmt.executeQuery(sltTacGia);
            while(rset.next()) {
                int id = rset.getInt("id");
                String tenSach = rset.getString("ten_sach");
                int namXB = rset.getInt("nam_xuat_ban");
                int lBan = rset.getInt("so_lan_xuat_ban");
                double gia = rset.getDouble("gia");
                double sl = rset.getDouble("so_luong");
                System.out.println(id + "," + tenSach + "," + namXB + "," + lBan + "," + gia + "," + sl);
            }

            System.out.print("Tim sach theo ID: ");
            int ID = in.nextInt();
            String sltID = "select * from sach where id ="+ ID;

            rset = stmt.executeQuery(sltID);
            while(rset.next()) {
                int id = rset.getInt("id");
                String tenSach = rset.getString("ten_sach");
                int namXB = rset.getInt("nam_xuat_ban");
                int lBan = rset.getInt("so_lan_xuat_ban");
                double gia = rset.getDouble("gia");
                double sl = rset.getDouble("so_luong");
                System.out.println(id + "," + tenSach + "," + namXB + "," + lBan + "," + gia + "," + sl);
            }
            ////////////3/////////
            System.out.println("Danh sach 30 don moi tiep nhan: ");
            String strSelecte = "select don_hang.* from don_hang where trang_thai = 1";

            rset = stmt.executeQuery(strSelecte);
            while(rset.next()) {
                int id = rset.getInt("id");
                String tenSach = rset.getString("ten_sach");
                int namXB = rset.getInt("nam_xuat_ban");
                int lBan = rset.getInt("so_lan_xuat_ban");
                double gia = rset.getDouble("gia");
                double sl = rset.getDouble("so_luong");
                System.out.println(id + "," + tenSach + "," + namXB + "," + lBan + "," + gia + "," + sl);
            }

            System.out.println("Danh sach don hang theo ma khach hang: ");
            strSelecte = "select kh_id,don_hang.* from don_hang,khach_hang where kh_id = khach_hang.id order by kh_id asc";

            rset = stmt.executeQuery(strSelecte);
            while(rset.next()) {
                int id = rset.getInt("id");
                String tenSach = rset.getString("ten_sach");
                int namXB = rset.getInt("nam_xuat_ban");
                int lBan = rset.getInt("so_lan_xuat_ban");
                double gia = rset.getDouble("gia");
                double sl = rset.getDouble("so_luong");
                System.out.println(id + "," + tenSach + "," + namXB + "," + lBan + "," + gia + "," + sl);
            }

            System.out.println("Trang Thai don hang: ");
            strSelecte = "select id,trang_thai from don_hang order by id asc";

            rset = stmt.executeQuery(strSelecte);
            while(rset.next()) {
                int id = rset.getInt("id");
                String tenSach = rset.getString("ten_sach");
                int namXB = rset.getInt("nam_xuat_ban");
                int lBan = rset.getInt("so_lan_xuat_ban");
                double gia = rset.getDouble("gia");
                double sl = rset.getDouble("so_luong");
                System.out.println(id + "," + tenSach + "," + namXB + "," + lBan + "," + gia + "," + sl);
            }

            System.out.print("Tim don hang theo ma: ");
            ID = in.nextInt();
            strSelecte = "select * from don_hang where id ="+ ID;

            rset = stmt.executeQuery(strSelecte);
            while(rset.next()) {
                int id = rset.getInt("id");
                String tenSach = rset.getString("ten_sach");
                int namXB = rset.getInt("nam_xuat_ban");
                int lBan = rset.getInt("so_lan_xuat_ban");
                double gia = rset.getDouble("gia");
                double sl = rset.getDouble("so_luong");
                System.out.println(id + "," + tenSach + "," + namXB + "," + lBan + "," + gia + "," + sl);
            }

            System.out.println("Don hang dang cho xu ly: ");
            strSelecte = "select don_hang.* from don_hang where trang_thai = 2";

            rset = stmt.executeQuery(strSelecte);
            while(rset.next()) {
                int id = rset.getInt("id");
                String tenSach = rset.getString("ten_sach");
                int namXB = rset.getInt("nam_xuat_ban");
                int lBan = rset.getInt("so_lan_xuat_ban");
                double gia = rset.getDouble("gia");
                double sl = rset.getDouble("so_luong");
                System.out.println(id + "," + tenSach + "," + namXB + "," + lBan + "," + gia + "," + sl);
            }

            System.out.println("Don hang da dong goi: ");
            strSelecte = "select don_hang.* from don_hang where trang_thai = 3";

            rset = stmt.executeQuery(strSelecte);
            while(rset.next()) {
                int id = rset.getInt("id");
                String tenSach = rset.getString("ten_sach");
                int namXB = rset.getInt("nam_xuat_ban");
                int lBan = rset.getInt("so_lan_xuat_ban");
                double gia = rset.getDouble("gia");
                double sl = rset.getDouble("so_luong");
                System.out.println(id + "," + tenSach + "," + namXB + "," + lBan + "," + gia + "," + sl);
            }

            System.out.println("Don hang dang van chuyen: ");
            strSelecte = "select don_hang.* from don_hang where trang_thai = 4";

            rset = stmt.executeQuery(strSelecte);
            while(rset.next()) {
                int id = rset.getInt("id");
                String tenSach = rset.getString("ten_sach");
                int namXB = rset.getInt("nam_xuat_ban");
                int lBan = rset.getInt("so_lan_xuat_ban");
                double gia = rset.getDouble("gia");
                double sl = rset.getDouble("so_luong");
                System.out.println(id + "," + tenSach + "," + namXB + "," + lBan + "," + gia + "," + sl);
            }

            System.out.println("Don hang giao thanh cong: ");
            strSelecte = "select don_hang.* from don_hang where trang_thai = 5";

            rset = stmt.executeQuery(strSelecte);
            while(rset.next()) {
                int id = rset.getInt("id");
                String tenSach = rset.getString("ten_sach");
                int namXB = rset.getInt("nam_xuat_ban");
                int lBan = rset.getInt("so_lan_xuat_ban");
                double gia = rset.getDouble("gia");
                double sl = rset.getDouble("so_luong");
                System.out.println(id + "," + tenSach + "," + namXB + "," + lBan + "," + gia + "," + sl);
            }

            System.out.println("Don hang da huy: ");
            strSelecte = "select don_hang.* from don_hang where trang_thai = 0";

            rset = stmt.executeQuery(strSelecte);
            while(rset.next()) {
                int id = rset.getInt("id");
                String tenSach = rset.getString("ten_sach");
                int namXB = rset.getInt("nam_xuat_ban");
                int lBan = rset.getInt("so_lan_xuat_ban");
                double gia = rset.getDouble("gia");
                double sl = rset.getDouble("so_luong");
                System.out.println(id + "," + tenSach + "," + namXB + "," + lBan + "," + gia + "," + sl);
            }

        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}
