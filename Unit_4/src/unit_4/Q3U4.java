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
class MarksOutOfBoundsException extends Exception {

    String message;

    public MarksOutOfBoundsException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MarksOutOfBoundsException{" + "message=" + message + '}';
    }

}

public class Q3U4 {

    private static void validate(int i) throws MarksOutOfBoundsException {
        if (i > 100 || i < 0) {
            throw new MarksOutOfBoundsException("MarksOutofBounds.Marks must be between 0-100");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int LD = 0, DSA = 0, DBMS = 0;
        System.out.println("Enter Name");
        String name = sc.nextLine();
        System.out.println("Enter Seat no");
        String seat = sc.nextLine();
        System.out.println("Enter Date");
        int date = sc.nextInt();
        try {
            System.out.println("Enter LD marks");
            LD = sc.nextInt();
            validate(LD);
            System.out.println("Enter DSA marks");
            DSA = sc.nextInt();
            validate(DSA);
            System.out.println("Enter DBMS marks");
            DBMS = sc.nextInt();
            validate(DBMS);
            System.out.println("\n" + "Name = " + name);
            System.out.println("Seat No = " + seat);
            System.out.println("LD marks = " + LD);
            System.out.println("DSA marks = " + DSA);
            System.out.println("DBMS marks = " + DBMS);
        } catch (MarksOutOfBoundsException m) {
            System.out.println("Exception caught " + m);
        }

    }

}
