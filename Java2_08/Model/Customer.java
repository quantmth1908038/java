package Java2_08.Model;

import java.util.Scanner;

public class Customer {
    private int id;
    private String costomerName;
    private String email;
    private String phone;
    private String address;
    private int level;

    public Customer() {
    }

    public Customer(String costomerName, String email, String phone, String address, int level) {
        this.costomerName = costomerName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Customer ID: ");
        this.id = in.nextInt();
    }

    public String getCostomerName() {
        return costomerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Email: ");
        this.email = in.nextLine();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Customer Phone: ");
        this.phone = in.nextLine();
    }

    public void setLevel() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Customer Level: ");
        this.level = in.nextInt();
    }

    public String getAddress() {
        return address;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "'" + costomerName + '\'' +
                ",'" + email + '\'' +
                ",'" + phone + '\'' +
                ",'" + address + '\'' +
                "," + level;
    }
}
