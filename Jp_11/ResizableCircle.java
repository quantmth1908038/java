/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jp_11;

/**
 *
 * @author admin
 */
public class ResizableCircle extends Circle_64 implements Resizable{

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void resize(int percent) {
        super.radius *= percent/100;
    }

}
