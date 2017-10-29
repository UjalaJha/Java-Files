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
public class cmd3 {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            if (args[i].equalsIgnoreCase("true") || args[i].equalsIgnoreCase("false")) {
                System.out.println("Primitive : BOOLEAN");
                return;
            }

            try {
                long num = Long.parseLong(args[i]);
                System.out.println("Primitive : LONG");
            } catch (NumberFormatException ex) {
            }
            try {
                int num = Integer.parseInt(args[i]);
                System.out.println("Primitive : INTEGER");
            } catch (NumberFormatException ex) {
            }
            try {
                byte num = Byte.parseByte(args[i]);
                System.out.println("Primitive : BYTE");
            } catch (NumberFormatException ex) {
            }
            try {
                short num = Short.parseShort(args[i]);
                System.out.println("Primitive : SHORT");
            } catch (NumberFormatException ex) {
            }

            try {
                double num = Double.parseDouble(args[i]);
                System.out.println("Primitive: DOUBLE");
            } catch (Exception e) {
            }

            if (args[i].length() == 1) {
                System.out.println("Primitive: CHAR");
            }

        }

    }
}
