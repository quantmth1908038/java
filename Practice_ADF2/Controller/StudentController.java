package Practice_ADF2.Controller;

import Practice_ADF2.Model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudent() {
        System.out.printf(" %-25s", "Student ID");
        System.out.printf("%-25s", "Student Name");
        System.out.printf("%-25s", "Address");
        System.out.printf("%-25s", "Phone");
        System.out.println();
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            System.out.printf(" %-25s", student.getStudentID());
            System.out.printf("%-25s", student.getName());
            System.out.printf("%-25s", student.getAddress());
            System.out.printf("%-25s", student.getPhone());
            System.out.println();
        }
    }

    public void saveStudent() throws SQLException {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/school?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", ""); // For MySQL only
                PreparedStatement pstmt = conn.prepareStatement(
                        "insert into student(id, name, address, phone) values (?, ?, ?, ?)");
                PreparedStatement pstmtSelect = conn.prepareStatement("select id, name, address, phone from student");
        ) {
            try {
                conn.setAutoCommit(false);
                Iterator<Student> studentIterator = students.iterator();
                while (studentIterator.hasNext()) {
                    Student student = studentIterator.next();
                    pstmt.setString(1,student.getStudentID());
                    pstmt.setString(2,student.getName());
                    pstmt.setString(3,student.getAddress());
                    pstmt.setString(4,student.getPhone());
                    pstmt.addBatch();
                }
                int[] returnCodes = pstmt.executeBatch();
                System.out.print("Return codes are: ");
                for (int code : returnCodes) System.out.printf(code + ", ");
                System.out.println();
                conn.commit();

                students.clear();

            }catch(SQLException ex) {
                System.out.println("-- Rolling back changes --");
                conn.rollback();
                ex.printStackTrace();
            }
        }

    }

    public void selectStudent(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/school?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", ""); // For MySQL only
                PreparedStatement pstmtSelect = conn.prepareStatement("select id, name, address, phone from student");
        ){
            ResultSet rset = pstmtSelect.executeQuery();
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-25s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-25s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; ++i) {
                    System.out.printf("%-25s", rset.getString(i));
                }
                System.out.println();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Student scanStudent(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        String id = in.nextLine();
        System.out.print("Enter Student Name: ");
        String name = in.nextLine();
        System.out.print("Enter Student Address: ");
        String address = in.nextLine();
        System.out.print("Enter Student Phone: ");
        String phone = in.nextLine();
        Student student = new Student(id,name,address,phone);
        return student;
    }

}
