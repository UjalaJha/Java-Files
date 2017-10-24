/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_2;

import java.util.Vector;

/**
 *
 * @author prakash
 */
public class Q4U2 
{
     public static void main(String[] args) 
     {
         Vector v= new Vector(3,3);
         System.out.println("Initial Size : = "+v.size()+" Initial Capacity = "+v.capacity());
         v.addElement(1);
         v.addElement(2);
         v.addElement(3);
         v.addElement(4);
         v.addElement(5);
         v.addElement(6);
         System.out.println("Current capacity = "+ v.capacity());
         v.addElement(7);
         System.out.println("Current capacity = "+ v.capacity());
         v.addElement(8);
         System.out.println("Current capacity = "+ v.capacity());
         System.out.println("First element = "+v.firstElement());
         System.out.println("last element = "+v.lastElement());
         System.out.println("Elements in Vector ");
         
         for(Object i:v)
             System.out.println(i+" ");
     }
}
