import java.util.*;
public class Employee
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in); 
String mail,name,ecode,phone;
for(int i=1;i<=5;i++)
{
System.out.println("Enter the name");
name=in.next();
System.out.println("Enter the mailid");
mail=in.next();
System.out.println("Enter the employee code");
ecode=in.next();
System.out.println("Enter the number of phone");
phone=in.next();
}
System.out.println("Name="+name);
System.out.println("Mail id of employee:"+ mail);
System.out.println("Employee code:"+ ecode);
System.out.println("Name of phone="+ phone);
}
}