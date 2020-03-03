/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jp_04;

/**
 *
 * @author admin
 */
public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
    this.v1.setXY(x1, y1);
    this.v2.setXY(x2, y2);
    this.v3.setXY(x3, y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + ']';
    }
    
    public double getPerimeter(){
        return v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
    }
    
    public String getType(){
        if(v1.distance(v2)==v2.distance(v3) || v1.distance(v2)==v1.distance(v3) || v2.distance(v3)==v1.distance(v3))
        {
            return "Isosceles Triangle";
        }
        if (v1.distance(v2)==v2.distance(v3) && v1.distance(v2)==v1.distance(v3)) 
        {
            return "Equilateral Triangle";
        }
        else
        {
            return "Scalene Triangle";
        }
    }
}
