
public class Javaprogram6 {
	int a;
	static{System.out.println("1st Static Block");}

	{
		System.out.println("Executing Instance Block");
		a=20;
	}
	static {System.out.println("Executing after 1st static block ");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javaprogram6 ob  = new Javaprogram6();
		System.out.println("Value of a="+ ob.a);

	}

}
