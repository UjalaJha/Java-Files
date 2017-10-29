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
public class Extra {
    public static void main (String args[]){
    new Childthread();
    
    try {
             
                 System.out.println("Inside parent thread : ");
                 Thread.sleep(100);
             
         }catch (InterruptedException e){
                     System.out.println( "parent Interrupted ");
                     }
         System.out.println("Exiting parent thread ");
         }
}
    class Childthread extends Thread{

        Childthread(){
        super("Demo Child thread ");
            System.out.println("Child thread : "+this);
            start();
    }

        @Override
        public void run() {
             try {
                 
                     System.out.println("Inside child thread : ");
                     Thread.sleep(50);
                 
             }catch (InterruptedException e){
                         System.out.println( "Child Interrupted ");
                         }
             System.out.println("Exiting child thread ");
             }
        }