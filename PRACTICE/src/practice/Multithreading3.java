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
public class Multithreading3 {

    public static void main(String args[]) {
        table t = new table();
        thread5 t1 = new thread5(t);
        t1.start();
        thread13 t2 = new thread13(t);
        t2.start();

    }
}
class table {

        public void printtable(int n) {
            synchronized (this) {//synchronized block

                try {

                    for (int i = 1; i <= 10; i++) {
                        System.out.println(n + "x" + i + "=" + n * i);
                    }
                } catch (Exception e) {
                    System.out.println("Exiting" + e);
                }

            }
        }
    }

    class thread5 extends Thread {

        table t;

        thread5(table t) {
            this.t = t;
        }

        @Override
        public void run() {
            t.printtable(5);
            t.printtable(7);
            
        }

    
}
class thread13 extends Thread {

        table t;

        thread13(table t) {
            this.t = t;
        }

        @Override
        public void run() {
            t.printtable(13);
        }

    
}
