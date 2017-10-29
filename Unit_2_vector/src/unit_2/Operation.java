/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_2;

import static java.lang.Math.log;
import static java.lang.Math.log10;
import static java.lang.Math.pow;

/**
 *
 * @author prakash
 */
public class Operation {
    int GCD(int a,int b)
    {
        while (a != b)
    {
        if (a > b)
        {
            return GCD(a - b, b);
        }
        else
        {
            return GCD(a, b - a);
        }
    }
    return a;
    }
    
    int LCM(int a,int b, int gcd)
    {
        return (a*b)/gcd;
    }
    
    
   int power(int num,int pow)
    {
        if (pow!=0)
    {
        return (num * power(num, pow - 1));
    }
    return 1;
    }
   
   int  reverse(int num)
    {
         int digit = (int) log10(num);
    
    // Base condition
    if(num == 0)
        return 0;
    
    return (int) ((num%10 * pow(10, digit)) + reverse(num/10));
    
    }
    int sum(int n)
    {
       if(n != 0)
        return n + sum(n-1);
       else
        return n;
    }
  
    int fibonacci(int n)
    {
         if(n< 2)
            return n;
         return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
