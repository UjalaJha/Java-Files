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
abstract class a {
    abstract void callme();
    
    void callmetoo()
    {
        System.out.println("HEy ! ");
    }
}

class b extends a
{
    void callme()
    {
        System.out.println("Overridenn callme");
    }
}
public class Abstractclass
{
    public static void main(String[] args) {
        b ob=new b();   
        ob.callme();
        ob.callmetoo();
        a obj;
        obj=ob;
        obj.callme();
    }
}