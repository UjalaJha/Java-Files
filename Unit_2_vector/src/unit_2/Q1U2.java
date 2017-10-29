/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_2;

/**
 *
 * @author prakash
 */
public class Q1U2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(11,11);
        Rectangle r3 = new Rectangle(11);
        
        double vol ;
        
        vol=r1.volume();
        System.out.println("Volume = "+vol);
        
        vol=r2.volume();
        System.out.println("Volume = "+vol);
        
        vol=r3.volume();
        System.out.println("Volume = "+vol);
    }
    
}
