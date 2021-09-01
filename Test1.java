package Training;


import Training.defaultAcc.Demo;//import Demo class
import Training.privateAcc.Demo1;//import Test3 class
import Training.publicAcc.Demo2;//import Test4 class
import Training.protectAcc.Demo3;//import Test2 class





public class Test1 extends Demo3 {
	void supermth()
	{   //protected members or fields accessible by inheritance outside the package
		super.s=20; //Accessing protected member of class Demo3 using super 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create object of class Demo which have all methods and fields default
		Demo d =new Demo();
		//d.Multiplication(); Error: default not accessible outside the package 
		
		//Create object of class Demo1 which have all methods and fields private 
		Demo1 d1 =new Demo1();
		//d1.addition(); Error : not Accessible outside package
		
		
		//Create object of class Demo3 which have all methods and fields  protected 
		Demo3 d3=new Demo3();
		//d3.s=30;//Protected members not accessible outside package without using super 
		
		
       //Create object of class Demo2 which have all methods and fields  public
		//public is Accessible anywhere
		Demo2 d2=new Demo2();
		d2.division();
	
	}

}
/*
 * private is accessible only inside that class
 * default is accessible inside same class and same package
 * protected is accessible inside same class same package and subclass of other package 
 * public is accessible anywhere
 */
