/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author prakash
 */
public class Advt extends Applet implements Runnable {

    String str = "HEllO TO THE WORLD OF JAVA. ";

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
    public Advt() {
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        char ch;
        for (;;) {
            try {
                repaint();
                Thread.sleep(250);
                ch = str.charAt(0);
                str = str.substring(1, str.length());
                str = str + ch;
            } catch (InterruptedException e) {
            }
        }
    }

    public void paint(Graphics g) {
        Font f = new Font("Times New Roman", Font.ITALIC, 24);
        g.setFont(f);
        g.drawString(str, 0, 100);
    }
}
