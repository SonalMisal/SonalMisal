import java.util.Scanner;
class Alphabet
{
public static void main (String args[])
{
System.out.println("Enter a alphabet to check wether the it is vowel or consonant ");
Scanner sc = new Scanner (System.in);
char ch = sc.next().charAt(0);
switch(ch)
{
case'a':
case'e':
case'i':
case'o':
case'u':
case'A':
case'E':
case'I':
case'O':
case'U':
System.out.println("vowel...");
break;
default:
System.out.println("consonent..");
}
}
}

 