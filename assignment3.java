
public class assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int avgOfThreeEmpInOneWeek=1000; 
	        int E1_Salary=1100;
	        int E2_Salary=500;
	        float E3_Salary; 

	        // (E1=E2+E3)/3=$1000
	        //E3 =  1000*3 / (1100+500)
	  E3_Salary= (float) ((avgOfThreeEmpInOneWeek*3.0)/ (E1_Salary+E2_Salary));
	  System.out.println("Salary of thid employee is: "+E3_Salary);
	}

}
