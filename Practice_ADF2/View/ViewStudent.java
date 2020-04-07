package Practice_ADF2.View;

import Practice_ADF2.Controller.StudentController;

import java.sql.SQLException;
import java.util.Scanner;

public class ViewStudent {
    public static void main(String[] args) throws SQLException {
        Scanner in = new Scanner(System.in);
        int n;
        StudentController stuCtl = new StudentController();
        do{
            System.out.print("Menu: \n" +
                    "1. Add student records.\n" +
                    "2. Display student records.\n" +
                    "3. Save.\n" +
                    "4. Exit\n" +
                    "Choose your action: ");
            n = in.nextInt();
            while (n < 0 || n > 4) {
                System.out.print("Menu: \n" +
                        "1. Add student records.\n" +
                        "2. Display student records.\n" +
                        "3. Save.\n" +
                        "4. Exit\n" +
                        "Choose your action: ");
                n = in.nextInt();
            }
            switch (n) {
                case 1:
                    stuCtl.addStudent(stuCtl.scanStudent());
                    break;
                case 2:
                    stuCtl.displayStudent();
                    break;
                case 3:
                    stuCtl.saveStudent();
                    stuCtl.selectStudent();
                    break;
            }
        }while (n!=4);
    }

}
