/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author prakash
 */
public class Q7U2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector(5, 1);

        System.out.println("Enter vector : ");
        String s;
        for (int i = 0; i < v.capacity(); i++) {
            s = sc.next();
            v.addElement(s);
        }

        System.out.println("Entered vector is: ");
        for (Object i : v) {
            System.out.println(i + " ");
        }

        int c = 0;
        System.out.println("Enter the Element to be added: ");

        String sf = sc.next();
        
        for (int i = 0; i < v.capacity(); i++) {
            if (sf.equals(v.elementAt(i))) {
                c = 1;
            }

        }
        if (c == 0) {
            v.addElement(sf);
        } else {
            for (int i = 0; i < v.capacity(); i++) {
                {
                    v.remove(sf);
                }
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
