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
public class Constructoroverloading {

    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(11, 12);
        Rectangle r3 = new Rectangle(11);

        double vol;

        vol = r1.volume();
        System.out.println("Volume = " + vol);

        vol = r2.volume();
        System.out.println("Volume = " + vol);

        vol = r3.volume();
        System.out.println("Volume = " + vol);
    }

}
class Rectangle {
    float length;
    float breadth;
    
    Rectangle()
    {
        System.out.println("Rectangle created");
        length=10;
        breadth=10;
    }
     Rectangle(float l,float b)
    {
       
        length=l;
        breadth=b;
    }
      Rectangle(float l)
    {
       
        breadth=length=l;
        
    }
    double volume()
    {
        return length*breadth;
    }
}
