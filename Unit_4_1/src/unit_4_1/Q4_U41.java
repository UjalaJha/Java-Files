/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_4_1;

/**
 *
 * @author prakash
 */
class Q4_U41
{  
    public static void main(String args[]){  
        try
        {  
            
            System.out.println("going to divide");  
            int b =39/0;  
            try
            {  
                int a[]=new int[5];  
                a[5]=4;  
            }catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Caugth : "+e);
            }  

          System.out.println("other statement");  
        }
        catch(ArithmeticException e)
            {
                System.out.println("Caugth : "+e);
            }   

        System.out.println("normal flow..");  
    }  
} 