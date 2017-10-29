/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import Mypackage.Operations;
import java.util.Scanner;
/**
 *
 * @author prakash
 */
public class Userdeinedpackage 
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter 2 nos ");
         int a= sc.nextInt();
         int b=sc.nextInt();
         System.out.println("Addition is "+Operations.add(a,b));
         System.out.println("Subtraction is "+Operations.sub(a,b));
}
}
