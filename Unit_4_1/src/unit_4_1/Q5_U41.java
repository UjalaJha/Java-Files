/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_4_1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Q5_U41 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Input c = new Input();
        System.out.println("Enter the Input Value: ");
        String num = sc.nextLine();
        c.showData(num);
    }
}

class Input {

    public void showData(String input) {
        if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
            System.out.println("Primitive : BOOLEAN");
            return;
        }
        try {
            long num = Long.parseLong(input);
            if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
                System.out.println("Primitive : BYTE");
            } else if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
                System.out.println("Primitive : SHORT");
            } else if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
                System.out.println("Primitive : INTEGER");
            } else {
                System.out.println("Primitive : LONG");
            }

        } catch (NumberFormatException ex) {
        }

        try {
            double num = Double.parseDouble(input);
            if (num >= Double.MIN_VALUE && num <= Double.MAX_VALUE) {
                System.out.println("Primitive: DOUBLE");
            }
        } catch (Exception e) {
        }

        if (input.length() == 1) {
            System.out.println("Primitive: CHAR");
        }

        System.out.println("Primitive: STRING");
    }
}
