/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_3;
import java.io.*;
import static java.lang.Math.pow;
import java.util.Scanner;
/**
 *
 * @author prakash
 */
public class Q3U3 {
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter 2 nums ");
        a=sc.nextInt();
        b=sc.nextInt();
        int c=(int) pow(a,b);
        System.out.println("pow="+c);
    }
}
