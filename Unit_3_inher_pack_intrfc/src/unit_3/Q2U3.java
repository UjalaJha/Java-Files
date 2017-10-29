/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_3;

/**
 *
 * @author prakash
 */
interface Bank {

    float years = 10;
    float amount = 10000;

    float computeinterest();

    public void display();
}

interface amount extends Bank {

    void display();
}

class SBI implements amount {

    public void display() {
        System.out.println("SBI BANK ");
    }

    @Override
    public float computeinterest() {
        float rate = (float) 9.5;
        return years * amount * rate;
    }

}

class PNB implements amount {

    @Override
    public void display() {
        System.out.println("PNB BANK ");
    }

    public float computeinterest() {
        float rate = (float) 9.75;
        return years * amount * rate;
    }

}

class Test {

    public static void main(String[] args) {
        Bank b = new SBI();
        b.display();
        System.out.println(b.computeinterest());

        Bank c = new PNB();
        c.display();
        System.out.println(c.computeinterest());
    }
}
