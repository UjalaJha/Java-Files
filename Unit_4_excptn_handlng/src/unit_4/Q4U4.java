/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_4;

import java.util.Scanner;

/**
 *
 * @author prakash
 */
class PayOutOfBoundsException extends Exception {

    String message;

    public PayOutOfBoundsException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "PayOutOfBoundsException{" + "message=" + message + '}';
    }

}

public class Q4U4 {

    private static void validate(int i) throws PayOutOfBoundsException {
        if (i < 8000) {
            throw new PayOutOfBoundsException("salary should be greater than 8000");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basic = 0, da = 0, hra = 0;
        System.out.println("Enter Name");
        String name = sc.nextLine();

        try {
            System.out.println("Basic");
            basic = sc.nextInt();
            validate(basic);
            if (basic <= 20000) {
                da = (int) (basic * 0.9);
                hra = (int) (basic * 0.25);
            } else {
                da = (int) (basic * 0.95);
                hra = (int) (basic * 0.3);
            }

            /* Calculate gross salary */
            int gross = basic + hra + da;
            System.out.println("Gross salary = " + gross);

        } catch (PayOutOfBoundsException m) {
            System.out.println("Exception caught " + m);
        }

    }

}
