/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author prakash
 */
public class Box {

    private double w;
    private double h;
    private double d;

    public Box(double w, double h, double d) {
        this.w = w;
        this.h = h;
        this.d = d;
    }

    public Box() {
        w = -1;
        h = -1;
        d = -1;
    }

    double volume() {
        return w * h * d;
    }
     void show()
    {
        System.out.println("box Show");
    }
}

class boxweight extends Box
{
    double wgt;

    public boxweight(double w, double h, double d,double wgt) {
       super(w,h,d);
        this.wgt = wgt;
    }

    void show()
    {
        //super.show();
        System.out.println("boxwght Show");
    }
    
}

class shipment extends boxweight
{
    double cost;

    public shipment(double w, double h, double d, double wgt, double cost) {
        super(w, h, d, wgt);
        this.cost = cost;
    }
   void show()
    {
        //super.show();
        System.out.println("Shipment Show");
    }
    
}

class inheritancedemo
{
   public static void main(String[] args) {
        shipment s=new shipment(1,2,3,4,5);
        System.out.println(s.volume());
        System.out.println(s.wgt);
        System.out.println(s.cost);
        
        boxweight bw=new boxweight(1,2,3,4);
        Box b=new Box(1,2,3);
        
        
        b.show();
        bw.show();
        s.show();
        
   
    }
}