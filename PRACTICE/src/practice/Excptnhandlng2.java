/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author prakash
 */
/*public class Excptnhandlng2 {
    
}*/
public class Excptnhandlng2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the value ");
        String no = sc.next();

       
            if ( no.equalsIgnoreCase("true") ||  no.equalsIgnoreCase("false")) {
                System.out.println("Primitive : BOOLEAN");
                return;
            }

            try {
                long num = Long.parseLong( no);
                System.out.println("Primitive : LONG");
            } catch (NumberFormatException ex) {
            }
            try {
                int num = Integer.parseInt( no);
                System.out.println("Primitive : INTEGER");
            } catch (NumberFormatException ex) {
            }
            try {
                byte num = Byte.parseByte( no);
                System.out.println("Primitive : BYTE");
            } catch (NumberFormatException ex) {
            }
            try {
                short num = Short.parseShort( no);
                System.out.println("Primitive : SHORT");
            } catch (NumberFormatException ex) {
            }

            try {
                double num = Double.parseDouble( no);
                System.out.println("Primitive: DOUBLE");
            } catch (Exception e) {
            }

            if ( no.length() == 1) {
                System.out.println("Primitive: CHAR");
            }
            

        }

    }
