/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_5;

import java.applet.*;
import java.awt.*;

/*
 <applet code="Q1_U5" width=50 height=50>
 </applet>
  
 */
public class Q1_U5 extends Applet {

    public void paint(Graphics g) {
        int[] x = {50, 150, 100};
        int[] y = {100, 100, 25};
        g.setColor(Color.red);
        g.drawRect(50, 100, 100, 100);
        g.fillRect(50, 100, 100, 100);
        g.setColor(Color.yellow);
        g.drawRect(75, 125, 50, 75);
        g.fillRect(75, 125, 50, 75);
        g.setColor(Color.BLUE);
        g.drawPolygon(x, y, 3);
        g.fillPolygon(x, y, 3);
        g.setColor(Color.orange);
        g.drawOval(80, 50, 40, 40);
        g.fillOval(80, 50, 40, 40);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
