import java.io.*;
class LargestNumber
{
public static void main(String args[])
{
System.out.println("Enter any three numbers");
try
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int a=Integer. parseInt(br. readLine());
int b=Integer. parseInt (br. readLine());
int c=Integer. parseInt (br. readLine());
if(a>b&&a>c)
{
System.out.println("a is"+a+"largest");
}
else if(b>a&&b>c)
{
System.out.println("b is"+b+"largest");
}
else if(c>a&&c>b)
{
System.out.println("c is"+c+"largest");
}
else
{
System.out.println("three numbers are equal");
}
}
catch (Exception e)
{
System.out.println(e);
}
}
}