/**
 * 
 */
package exceptioninjava;

/**
 * @author Sonal
 *
 */
public class VotingAge {

void VotingAge(int ageofvote) {
	// try open
	try {
		// body of if else
		if(ageofvote>18)
		{
			System.out.println(" you are eligible to voting");
		}
		else
		{
			throw new Exception("You are noy eligible to voting");
		}//close the body of if else
	}//try close
	catch(Exception e)
	{
		System.out.println(e);
	}//catch close
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VotingAge obj=new VotingAge();
		obj.VotingAge(17);
	}//main close

}// class close
/*output
 * java.lang.Exception: You are noy eligible to voting
 */





