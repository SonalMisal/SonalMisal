import java.util.*;
class EvenOdd
{
public static void main(String args[])
{
System.out.println("Enter any number");
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
if(n%2==0)
{
System.out.println("number is even");
}
else
{
System.out.println("number is odd");
}
}
}