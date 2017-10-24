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
class NewThread implements Runnable{
    Thread t;
    NewThread(){
    t=new Thread(this,"Demo implement Thread ");
        System.out.println("Child thread : "+t);
        t.start();
}

    @Override
    public void run() {
         try {
             for(int i=5;i>0;i--)
             {
                 System.out.println("child thread : "+ i);
                 Thread.sleep(500);
             }
         }catch (InterruptedException e){
                     System.out.println( "Child Interrupted ");
                     }
         System.out.println("Exiting child thread ");
         }
    }

 class Q1_U41 {
public static void main (String args[]){
    new NewThread();
    new NewThread2();
    try {
             for(int i=5;i>0;i--)
             {
                 System.out.println("parent thread : "+ i);
                 Thread.sleep(1000);
             }
         }catch (InterruptedException e){
                     System.out.println( "parent Interrupted ");
                     }
         System.out.println("Exiting parent thread ");
         }
    
}
class NewThread2 extends Thread{
    
    NewThread2(){
    super("Demo extend Thread ");
        System.out.println("Child thread : "+this);
        start();
}

    @Override
    public void run() {
         try {
             for(int i=5;i>0;i--)
             {
                 System.out.println("child2 thread : "+ i);
                 Thread.sleep(500);
             }
         }catch (InterruptedException e){
                     System.out.println( "Child2 Interrupted ");
                     }
         System.out.println("Exiting child2 thread ");
         }
    }
