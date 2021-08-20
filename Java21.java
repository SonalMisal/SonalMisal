/**
 * 
 */

/**
 * @author Chintu
 *code for demonstrate java methods
 */
public class Java21 {

	/**
	 * @param args
	 */
	
//  method without argument and without return type
  void greet(){
      System.out.println("Hii I am Sonal...");
  }

//  method with argument and with return type
  int add(int x,int y){
      return x+y;
  }

//  method without argument and with return type
  double temperatue(){
      return 25;
  }

//  method with argument and without return type
  void fullName(String fName,String mName,String lName ){
      System.out.println(fName+" "+mName+" "+lName);
  }

  // static method
//  We can call static method using class name
//  static method belongs to class...there is only one copy of static method
  static void course(){
      System.out.println("Java Programming");
  }


  static void outcome(){
      //lets call static method here
      Java21.course();//yes we can call static method from this static method
      System.out.println("This course will give you knowledge about java and advance java ");
      //lets call instance method here
      Java21 ob1=new Java21();
      ob1.greet(); // yes we can call instance method but using object only
  }

  //instance method
  void instanceM(){
      System.out.println("Instance method called using object of this class only...");
      //lets call static method here
      Java21.course(); // we can call static method inside insatance method
  }
  	
  	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Java21 obj=new Java21();
        obj.greet();//calling method without argument and without return type

        int a=obj.add(23,78);//calling method with argument and with return type
        System.out.println("The sum is: "+a);

        double temp=obj.temperatue();// calling method without argument and with return type
        System.out.println("Temperatue is: "+temp);

        obj.fullName("Sonal","Raghunath","Misal");//calling method with argument and without return type

        // calling static method using class name
        Java21.course();
        Java21.outcome();
	}

}
