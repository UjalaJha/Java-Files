/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author prakash
 */
public class Exceptnhandling1 {
    public static void main(String[] args) {
        try{
           
            
            int a[]=new int[5] ;
            System.out.println(a[9]);
             throw new ArithmeticException("Armtic excpn");
            
        }catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("caught arrayindex exceptn");
        }
        catch(ArithmeticException a)
        {
            System.out.println("caught artmtc excptn");
        }
        finally{
            System.out.println("Outside try catch block");
        }
        
        throwsdemo td=new throwsdemo();
        {
            try{
            td.Throws();
        }catch(ArithmeticException a)
        {
           System.out.println("caught throws error");
        }
        }
    }
}

class throwsdemo
{
    int a=1,b=0;
    void Throws() throws ArithmeticException {
        int c = a / b;
    }
}
