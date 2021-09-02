/**
 * 
 */
package exceptioninjava;

/**
 * @author Sonal
 *
 */
public class JavaEexception {

	/**
	 * @param args
	 */
	int x,y;
void arithmeticoperation(int x, int y) {
	
	try {
		
		System.out.println("div: "+(y/x));
	
	}//try close
	catch(ArithmeticException e)
	{
		System.out.println("Division by 0 is not allou"+e);
		
	}//catch close
	catch(Exception e)
	{
		System.out.println(e);
		
	}//catch close
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaEexception obj=new JavaEexception();
		obj.arithmeticoperation(0,45);
	}//main close

}//class close

/*output
 
 Division by 0 is not alloujava.lang.ArithmeticException: / by zero

 
 */
