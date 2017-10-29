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
public class Multithreading2 {

    public static void main(String[] args) {
        table5 t5 = new table5();
        t5.start();
        table7 t7 = new table7();
        t7.start();
    }
}

class table5 extends Thread {

    @Override
    public void run() {
        synchronized (this) {
            try {
                System.out.println("Table of 5 ");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(5 * i);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                System.out.println("Exception caught");
            }
        }
    }

}

class table7 extends Thread {

    @Override
    public void run() {
        synchronized (this) {
            try {
                System.out.println("Table of 7 ");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(7 * i);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                System.out.println("Exception caught");
            }
        }
    }

}
