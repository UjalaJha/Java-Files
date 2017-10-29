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
public class cmd {
    
    public static void main(String[] args) 
    {
        int count=0;
        for(int i=0;i<args.length;i++)
        {
            try
            {
                int n=Integer.parseInt(args[i]);
            }
            catch(Exception e)
            {
                count++;
            }
          
        }
  	System.out.println("Total valid integers: " + (args.length - count));
        System.out.println("Total invalid integers: " + count);
    }
    
}
