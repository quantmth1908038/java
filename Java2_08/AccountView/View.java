package Java2_08.AccountView;

import Java2_08.Controller.AccountController;
import Java2_08.Controller.BookController;
import Java2_08.Controller.CustomerController;
import Java2_08.Model.Book;
import Java2_08.Model.Customer;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        AccountController accCtl = new AccountController();
        do {
            System.out.print("Account: \n" +
                    "1. Sign Up.\n" +
                    "2. Log In.\n" +
                    "0. Exit\n" +
                    "Choose your action: ");
            n = in.nextInt();
            while ( n<0 || n>2 ){
                System.out.print("Account: \n" +
                        "1. Sign Up.\n" +
                        "2. Log In.\n" +
                        "0. Exit\n" +
                        "Choose your action: ");
                n = in.nextInt();
            }
            switch (n){
                case 1:
                    accCtl.signUp(accCtl.scannerSignUp());
                    break;
                case 2:
                    boolean check = accCtl.logIn(accCtl.scannerLogIn());
                    if (check){
                        int a,b;
                        do {
                            System.out.print("Choose Account: \n" +
                                    "1. Book Manager.\n" +
                                    "2. Customer Manager.\n" +
                                    "0. Exit\n" +
                                    "Choose your action: ");
                            a = in.nextInt();
                            while ( a<0 || a>2 ){
                                System.out.print("Choose Account: \n" +
                                        "1. Book Manager.\n" +
                                        "2. Customer Manager.\n" +
                                        "0. Exit\n" +
                                        "Choose your action: ");
                                a = in.nextInt();
                            }
                            switch (a){
                                case 1:
                                    Book book = new Book();
                                    BookController boolCtr = new BookController();
                                    do {
                                        System.out.print("Book Manager Account: \n" +
                                                "1. Insert Book.\n" +
                                                "2. Update Book.\n" +
                                                "3. Delete Book.\n" +
                                                "4. Print 100 Books.\n" +
                                                "0. Exit\n" +
                                                "Choose your action: ");
                                        b = in.nextInt();
                                        while ( b<0 || b>4 ){
                                            System.out.print("Book Manager Account: \n" +
                                                    "1. Insert Book.\n" +
                                                    "2. Update Book.\n" +
                                                    "3. Delete Book.\n" +
                                                    "4. Print 100 Books.\n" +
                                                    "0. Exit\n" +
                                                    "Choose your action: ");
                                            b = in.nextInt();
                                        }
                                        switch (b){
                                            case 1:
                                                boolCtr.insertBook(boolCtr.scannerBook());
                                                break;
                                            case 2:
                                                boolCtr.updateBook(book);
                                                break;
                                            case 3:
                                                boolCtr.deleteBook(book);
                                                break;
                                            case 4:
                                                boolCtr.selectBook();
                                                break;
                                        }

                                    }while (b!=0);
                                    break;
                                case 2:
                                    Customer customer = new Customer();
                                    CustomerController cusCtr = new CustomerController();
                                    do {
                                        System.out.print("Customer Manager Account: \n" +
                                                "1. Insert Customer.\n" +
                                                "2. Update Customer.\n" +
                                                "3. Delete Customer.\n" +
                                                "4. Print 100 Customers.\n" +
                                                "0. Exit\n" +
                                                "Choose your action: ");
                                        b = in.nextInt();
                                        while ( b<0 || b>4 ){
                                            System.out.print("Customer Manager Account: \n" +
                                                    "1. Insert Customer.\n" +
                                                    "2. Update Customer.\n" +
                                                    "3. Delete Customer.\n" +
                                                    "4. Print 100 Customers.\n" +
                                                    "0. Exit\n" +
                                                    "Choose your action: ");
                                            b = in.nextInt();
                                        }
                                        switch (b){
                                            case 1:
                                                cusCtr.insertCustomer(cusCtr.scannerCustomer());
                                                break;
                                            case 2:
                                                cusCtr.updateCustomer(customer);
                                                break;
                                            case 3:
                                                cusCtr.deleteCusmoter(customer);
                                                break;
                                            case 4:
                                                cusCtr.selectCustomer();
                                                break;
                                        }

                                    }while (b!=0);
                                    break;
                            }
                        }while (a!=0);
                    }
                    break;
            }

        }while (n!=0);

    }
}
