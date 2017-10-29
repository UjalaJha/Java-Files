/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_2;

import java.util.Scanner;

/**
 *
 * @author prakash
 */
public class Q3U2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1");
        String str1 = sc.nextLine();
        System.out.println("Lower case of input string 1 = " + str1.toLowerCase());
        System.out.println("upper case of input string 1 = " + str1.toUpperCase());
        System.out.println("Length of the given string 1=" + str1.length());
        System.out.println("Character at the index 1 is " + str1.charAt(1));
        System.out.println(" one Substring at the index 1 is " + str1.substring(3, 9));
    }

}
