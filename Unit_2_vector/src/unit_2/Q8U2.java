/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_2;

import java.util.Scanner;

/**
 *
 * @author prakash
 */
public class Q8U2 {
     public static void main(String[] args) 
    {
        Operation N=new Operation();
        Scanner sc=new Scanner(System.in);
        int c;
     do
        {
            System.out.println("------------MENU-----------"
                    + "\n 1 : GCD LCM" 
                    + "\n 2 : X raise to Y"
                    + "\n 3 : Fibonacci series "
                    + "\n 4 : Reverse of a num "
                    + "\n 5 : sum of n number in natural no set "
                    + "\n------------------------------\n" );
           
           c=sc.nextInt();
           switch(c)
            {
                case 1:
                {
                    System.out.println("Enter 2 no for gcd and lcm");
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    int lcm;
                    System.out.println(N.GCD(a,b));
                    int gcd=N.GCD(a,b);
                    System.out.println(N.LCM(a, b, gcd));
                    break;
                }
                                       
                case 2:
                {
                    System.out.println("Enter 2 no to find X^Y");
                    int x=sc.nextInt();
                    int y=sc.nextInt();
                    System.out.println(N.power(x,y));
                    break;
                }
                
                case 3:
                {
                    System.out.println("Enter a no of terms to find fibonacci");
                    int n=sc.nextInt();
                    int i;
                    for(i=0;i<n;i++)
                    {
                    System.out.println(N.fibonacci(i));
                    }
                    break;
                }
                
                case 4:
                {
                    System.out.println("Enter a no to reverse");
                    int n=sc.nextInt();
                    System.out.println(N.reverse(n));
                    break;
                }
                case 5:
                {
                    System.out.println("Enter a no to find sum till that");
                    int n=sc.nextInt();
                    System.out.println(N.sum(n));
                    break;
                }
                
                
                
                
            }
        }
        while(c!=0);

}
}
