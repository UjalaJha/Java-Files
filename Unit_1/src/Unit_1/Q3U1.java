/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_1;

import java.util.Scanner;

/**
 *
 * @author prakash
 */
public class Q3U1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s,rev="";
        System.out.println("Enter the string");
        s=sc.nextLine();
        int n=s.length();
        int i;
        
        for (i=n-1;i>=0;i--)
         {
            rev=rev+s.charAt(i);
         }
 
      if(s.equals(rev))
         System.out.println("Entered string is a palindrome.");
      else
         System.out.println("Entered string is not a palindrome.");
        
    }
    
}
