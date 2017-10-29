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
class prime extends Thread {

    prime() {
        super("First 20 prime no ");
        System.out.println("Child thread : " + this);
        start();
    }

    @Override
    public void run() {
        try {

            int p = 2;
            int i = 1;
            while (i <= 20) {
                int flag = 1;
                int d;
                for (d = 2; d <= p - 1; d++) /* d<=p/2 is also correct */ {
                    if (p % d == 0) /* True if number is not prime */ {
                        flag = 0;

                        break;
                        /* Loop terminates if p is not prime  */
                    }
                }
                if (flag == 1) {
                    System.out.println(p);
                    i++;
                }
                p++;
            }
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("execution Interrupted ");
        }
        System.out.println("First 20 prime no printed ");
    }
}

class fibo extends Thread {

    fibo() {
        super(" first 15 fibo no ");
        System.out.println("Child thread : " + this);
        start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(250);
            int t1 = 0, t2 = 1;
            System.out.println(t1);
            System.out.println(t2);
            for (int i = 3; i <= 15; i++) {
                int c = t1 + t2;
                System.out.println(c);
                t1 = t2;
                t2 = c;

            }
        } catch (InterruptedException e) {
            System.out.println("fibo Interrupted ");
        }
        System.out.println("first 15 fibo printed ");
    }
}

class Q3_U41 {

    public static void main(String[] args) {
        prime t1 = new prime();
        fibo t2 = new fibo();

    }
}
