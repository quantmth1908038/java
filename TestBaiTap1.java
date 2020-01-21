/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author admin
 */
public class TestBaiTap1 {
    public static void main(String []agrs) {
        BaiTap1 studentA;
        BaiTap1 studentB;
        studentA=new BaiTap1();
        studentB=new BaiTap1(1,"Nguyen Van A",true);
        studentB.printInfo();
        studentB.setName("Nguyen Van B");
        studentB.printInfo();
    }
}
