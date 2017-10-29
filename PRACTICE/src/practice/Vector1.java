/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author prakash
 */
public class Vector1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector(5, 1);
        String n;
        System.out.println("Enter vector is: ");
        for (int i = 0; i < v.capacity(); i++) {
            n = sc.next();
            v.addElement(n);
        }
        System.out.println("Entered vector is: ");
        for (int i = 0; i < v.capacity(); i++) {
            System.out.println(v.elementAt(i));
        }
        System.out.println("Entered vector to find its frequency: ");
        String s = sc.next();
        int c = 0;
        for (int i = 0; i < v.capacity(); i++) {
            {
                if (s.equals(v.elementAt(i))) {
                    c++;
                }

            }

        }
        System.out.println("frequency: " + c);

        if (c == 0) {
            v.addElement(s);
        } else {
            for (int i = 0; i < v.capacity(); i++) {
                {
                    v.remove(s);
                }
            }

            System.out.println("vector is: ");
            try {
                for (int i = 0; i < v.capacity(); i++) {
                    System.out.println(v.elementAt(i));
                }
            } catch (ArrayIndexOutOfBoundsException ae) {
            }
        }
    }
}
