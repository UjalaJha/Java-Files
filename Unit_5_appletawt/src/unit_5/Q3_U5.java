/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_5;

import java.applet.*;
import java.awt.*;

/**
 *
 * @author prakash
 */
public class Q3_U5 extends Applet implements Runnable{
                String msg = "HEllO TO THE WORLD OF JAVA. ";
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
   public void init()
    {
        setBackground(Color.YELLOW);
        setForeground(Color.RED);
    }
    
    public void start()
    {
        Thread t = new Thread(this);
        t.start();
    }
    
    public void run()
    {
        for(;;)
        {
            repaint();
            try
            {
                Thread.sleep(100);
            }
            catch(Exception e)
            {}
        }
    }
    
    public void paint(Graphics g)
    {
        Font f = new Font("Times New Roman",Font.ITALIC,24);
        char ch;
        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg+=ch;
        g.setFont(f);
        g.drawString(msg, 0, 100);
        showStatus("Exp5 Advertisement");
    }
}
