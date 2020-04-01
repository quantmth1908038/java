package Java2_08.Model;

import java.util.Scanner;

public class Book {
    private int id;
    private String tenSach;
    private double gia;
    private int soLuong;
    private String tacGia;

    public Book() {
    }

    public Book(String ten_sach, double gia, int so_luong, String tac_gia) {
        this.tenSach = ten_sach;
        this.gia = gia;
        this.soLuong = so_luong;
        this.tacGia = tac_gia;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        this.id = in.nextInt();
    }

    public String getTenSach() {
        return tenSach;
    }

    public double getGia() {
        return gia;
    }

    public void setGia() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Book Price: ");
        this.gia = in.nextDouble();
    }

    public void setSoLuong() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Book Qty: ");
        this.soLuong = in.nextInt();
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getTacGia() {
        return tacGia;
    }

    @Override
    public String toString() {
        return "'" + tenSach + '\'' + "," + gia + "," + soLuong;
    }
}
