/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author prakash
 */
public class Userdefinedexcptn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter Age ");
        int age=sc.nextInt();
        validate(age);
        }
        catch(AgeException ae)
        {
            System.out.println("Caught "+ae);
        }
    }

     static void validate(int age) throws AgeException{
        
         if(age<18)
         {
         throw new AgeException("Less than 18 "); 
         }
         System.out.println("Normal EXIT");

    }

  
}
   class AgeException extends Exception {
        String message;

        public AgeException(String message) {
            this.message=message;
        }

    @Override
    public String toString() {
        return "Age Exception { " + message + " }";//To change body of generated methods, choose Tools | Templates.
    }
      
      
    }