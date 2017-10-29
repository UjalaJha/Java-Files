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

interface bank
{
float years=10;
float amount=1000;

float computeinterest();
//void display();

}
interface bankloan extends bank
{
    void display();
}



 class Interface1 implements bankloan {

    @Override
    public void display() {
        System.out.println("SBI Bank");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float computeinterest() {
        float rate = (float) 9.5;
        return years * amount * rate;
       
    }
    
}
 class interface2 implements bankloan
 {

    @Override
    public void display() {
       System.out.println("PNB Bank"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float computeinterest() {
        float rate = (float) 9.9;
        return years * amount * rate; //To change body of generated methods, choose Tools | Templates.
    }
     
 }
public class Interfaces{
    public static void main(String[] args) {
        Interface1 obj1=new Interface1();
        interface2 obj2=new interface2();
        obj1.display();
        System.out.println("Interest"+obj1.computeinterest());
        obj2.display();
        System.out.println("Interest"+obj2.computeinterest());
    }
}