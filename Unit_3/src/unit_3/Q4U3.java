package unit_3;

import unit_3.Mypackage.Compare;
/**
 *
 * @author prakash
 */
public class Q4U3 {
    public static void main(String args[]) 
    {
      int x = 1, y = 2;
      Compare comp = new Compare();
      int max = comp.getMax(x, y); // get the max value
      System.out.println("Maximum value is " + max);
   }
}
