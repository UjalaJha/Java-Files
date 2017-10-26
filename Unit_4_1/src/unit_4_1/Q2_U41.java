package unit_4_1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author prakash
 */
class Table5 extends Thread {

    Table5() {
        super(" Table 5 ");
        System.out.println("Child thread : " + this);
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(5 + "*" + i + " = " + (5 * i));
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("Table 5 Interrupted ");
        }
        System.out.println("Exiting Table 5 thread ");
    }
}

class Table7 extends Thread {

    Table7() {
        super(" Table 7 ");
        System.out.println("Child thread : " + this);
        start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(250);
            for (int i = 1; i <= 10; i++) {
                System.out.println(7 + "*" + i + " = " + (7 * i));

            }
        } catch (InterruptedException e) {
            System.out.println("Table 7 Interrupted ");
        }
        System.out.println("Exiting Table 7 thread ");
    }
}

class Table13 extends Thread {

    Table13() {
        super(" Table 13 ");
        System.out.println("Child thread : " + this);
        start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500);
            for (int i = 1; i <= 10; i++) {
                System.out.println(13 + "*" + i + " = " + (13 * i));

            }
        } catch (InterruptedException e) {
            System.out.println("Table 13 Interrupted ");
        }
        System.out.println("Exiting Table 13 thread ");
    }
}

class Q2_U41 {

    public static void main(String[] args) {
        Table5 t1 = new Table5();
        Table7 t2 = new Table7();
        Table13 t3 = new Table13();
    }
}
