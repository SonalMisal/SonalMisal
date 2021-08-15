import java.io.*;
class Nested
{
public static void main(String args[])
{
try
{
DataInputStream din=new DataInputStream(System.in);
int a,b,c;
System.out.println("Enter any three numbers");
a=Integer.parseInt(din.readLine());
b=Integer.parseInt(din.readLine());
c=Integer.parseInt(din.readLine());
if(a>b)
{
if(a>c)
{
System.out.println("a is"+a+"largest");
}
else
{
System.out.println("c is"+c+"largest");
}
}
else
{
if(b>c)
{
System.out.println("b is"+b+"largest");
}
else
{
System.out.println("c is"+c+"largest");
}
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}

