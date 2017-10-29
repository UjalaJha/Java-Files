 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_2;

/**
 *
 * @author prakash
 */
public class Rectangle {
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
       
        length=l;
        
    }
    double volume()
    {
        return length*breadth;
    }
}
