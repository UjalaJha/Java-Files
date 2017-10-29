/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_2;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author prakash
 */
public class Q5U2 {
     public static void main(String[] args) 
     {
         Scanner sc=new Scanner(System.in);
         Vector v= new Vector(5); //default size 10
         v.addElement(1);
         v.addElement(2);
         v.addElement(3);
         v.addElement(4);
         v.addElement(5);
         for(Object i:v)
         System.out.println(i+" ");
         
         System.out.println("Enter the element to check presence");
         int n=sc.nextInt();
         boolean find = v.contains(n);
         System.out.println("Does Vector contain "+n+" ? " + find);
}
}
