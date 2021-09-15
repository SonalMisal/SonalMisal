/**
 * 
 */
package Thread;

/**
 * @author Sonal
 *
 */
class MythreadA extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			Thread.yield();
			System.out.println("From MythreadA.."+i);
		}
		System.out.println("MythreadA ended:"+Thread.currentThread().getName());
	}
}// MythreadA is end

class MythreadB extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			
			System.out.println("From MythreadB..."+i);
		}
		System.out.println("MythreadB ended:"+Thread.currentThread().getName());
	}
}//MythreadB is end

public class MultiThreading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MythreadA m1=new MythreadA();
		MythreadB m2=new MythreadB();
		m1.start();
		m2.start();
	}

}
/*
 * output
 * From MythreadB...1
From MythreadB...2
From MythreadB...3
From MythreadB...4
From MythreadB...5
From MythreadB...6
From MythreadB...7
From MythreadB...8
From MythreadB...9
From MythreadB...10
MythreadB ended:Thread-1
From MythreadA..1
From MythreadA..2
From MythreadA..3
From MythreadA..4
From MythreadA..5
From MythreadA..6
From MythreadA..7
From MythreadA..8
From MythreadA..9
From MythreadA..10
MythreadA ended:Thread-0
*/
