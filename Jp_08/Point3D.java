/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jp_08;

/**
 *
 * @author admin
 */
public class Point3D extends Point2D{
    private float z;

    public Point3D() {
        super();
        this.z = 0;
    }
    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    
    public void setXYZ(float x,float y,float z){
        super.setXY(x, y);
        this.z = z;
    }
    
    public float[] getXYZ(){
        float[] XYZ = {super.getX(),super.getY(),this.z};
        return XYZ;
    }
    
    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + z +')';
    }
    
}
