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
public class Multithreading1 {

    public static void main(String[] args) {
        new runnabledemo();
        new extendingdemo();
        //new extendingdemo2();
        Thread t=Thread.currentThread();
        t.setPriority(10);
        t.setName("main thread");
        System.out.println("Current Thread : "+t);
         try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception caught");
        }
        System.out.println("Exiting main thread");
        
     
    }
}

class runnabledemo implements Runnable {

    Thread t;
    

    runnabledemo() {
        t=new Thread(this,"Runnable demo ");
        System.out.println("Child Thread :"+t);
        t.setPriority(5);
        t.start();

    }

    @Override
    public void run() {
        
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(0);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception caught");
        }
        System.out.println("Exiting implement thread");
    
    }

}

class extendingdemo extends Thread {

    extendingdemo() {
        super("Extended Thread :");
        System.out.println("Child Thread :"+this);
        start();
        this.setPriority(10);
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(0);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception caught");
        }
        System.out.println("Exiting extend thread");
    }

}

/*class extendingdemo2 extends Thread {

    extendingdemo2() {
        super("Extended Thread 2:");
        System.out.println("Child Thread :"+this);
        start();
        this.setPriority(15);
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(0);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception caught");
        }
        System.out.println("Exiting extend2 thread");
    }

}*/

