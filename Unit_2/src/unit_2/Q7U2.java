/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author prakash
 */
public class Q7U2 {
    public static void main(String args[] )
    { Scanner sc=new Scanner(System.in);
        Vector v=new Vector (5,1);
        
        System.out.println("Enter vector : ");
        String s;
        for(int i=0;i<v.capacity();i++)
        {
            s=sc.next();
            v.addElement(s);
        }
        
        
        System.out.println("Entered vector is: ");
        for(Object i:v)
        System.out.println(i+" ");
        
        
        int flag=1;
        System.out.println("Enter the Element to be added: ");
        
        String element=sc.next();
         for(int i=0;i<v.capacity();i++)
       {
            if(element.equals(v.elementAt(i)))
           {
               v.remove(v.elementAt(i)) ;
               flag=0;
            }
            
       }
         if (flag==1)
             v.addElement(element);
        
         Iterator itr = v.iterator();
   
   
         System.out.println(" Vector elements...");
         while(itr.hasNext())
         {
         System.out.println(itr.next());
         }
        
       }
       
}
