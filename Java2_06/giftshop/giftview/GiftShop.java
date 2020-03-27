package giftview;

import giftcontroller.GiftController;

import java.util.Scanner;

public class GiftShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        GiftController giftC = new GiftController();
        do {
            System.out.print("Gift Shop: \n" +
                    "1. print all book.\n" +
                    "2. insert book.\n" +
                    "3. delete book.\n" +
                    "0. Exit\n" +
                    "Choose your action: ");
            n = in.nextInt();
            while ( n<0 || n>3 ){
                System.out.print("Gift Shop: \n" +
                        "1. print all book.\n" +
                        "2. insert book.\n" +
                        "3. delete book.\n" +
                        "0. Exit\n" +
                        "Choose your action: ");
                n = in.nextInt();
            }
            switch (n) {
                case 1:
                    giftC.selectGift();
                    break;
                case 2:
                    giftC.insertGift();
                    break;
                case 3:
                    giftC.deleteGift();
                    break;
            }
        }while (n != 0);
    }
}
