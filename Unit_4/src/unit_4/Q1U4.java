/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_4;

import java.util.Scanner;

/**
 *
 * @author prakash
 */
public class Q1U4 {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        
        int i;
        Scanner sc = new Scanner(System.in);
        int a,b,c=0;
        try
        {
            System.out.print("Enter first number  : ");
            a= sc.nextInt();
            System.out.print("Enter second number : ");
            b=sc.nextInt();
            c= a/b;
            throw new ArrayIndexOutOfBoundsException("DEMO");
            
        }catch(ArithmeticException e)
        {
            System.out.println("denominator cannot be 0");
        }
        
        catch(ArrayIndexOutOfBoundsException k)
        {
            System.out.println("EXCEPTION : "+k);
        }
        
        finally
        {
            System.out.println("Try,Catch,Throw and Finally done");
        }
        
        ThrowsDemo td= new ThrowsDemo();
        try
        {
            td.Throws();   
        }
        catch(ArithmeticException e)
        {
            //System.out.println("Thrown an arithmetic Exception");
            System.out.println("Caught : "+e);
        }
    }
    
}

class ThrowsDemo
{
    int a=0,b=0,c=0;
    void Throws() throws ArithmeticException
    {
        c=a/b;
    }
}

