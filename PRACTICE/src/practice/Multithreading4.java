/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/*class MyThread2 extends Thread {

    String name;

    MyThread2(String name) {
        this.name = name;
         this.setPriority(1);
    }

    public void run() {

        try {
            System.out.println(name);
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception caught");
        }
        System.out.println("Exiting extend thread");
    }
}*/
class MyThread1 extends Thread {

    String name;

    MyThread1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + "   :   " + i);
        }
    }
}

public class Multithreading4 {

    public static void main(String args[]) {

        MyThread1 t1 = new MyThread1("thread 1");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();

        MyThread1 t2 = new MyThread1("thread 2");
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();

    }
}
