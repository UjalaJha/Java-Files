/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_4_1;

/**
 *
 * @author prakash
 */
class CallMe
{
	void call(String msg)
	{
		System.out.print("["+msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}


class Caller implements Runnable
{
	String msg;
	CallMe target;
	Thread t;
	public Caller(CallMe targ, String s)
	{
          
		target=targ;
                msg=s;
		t=new Thread(this);
		t.start();
	}
	
	public void run()
	{
            synchronized(target){
               target.call(msg); 
            }
		
	}
}
public class Q6_U41
{
	public  static void main(String[] args)
	{
		CallMe target=new CallMe();
		Caller c1=new Caller(target,"Hello");
		Caller c2=new Caller(target,"Syncronized");
		Caller c3=new Caller(target,"World");
                try{
                    c1.t.join();
                    c2.t.join();
                    c3.t.join();
                    
                }catch(InterruptedException e){
                    System.out.println("interrupted");
                }
	}
}

