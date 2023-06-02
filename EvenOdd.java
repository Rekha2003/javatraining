import java.util.Scanner;
public class EvenOdd{
public static boolean isEven(int n)
{
return((n/2)*2==n);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the number:");
n=sc.nextI)nt();
if(isEven(n))
   {
	System.out.println(n+"is Even\n");
	}
else
	{
	System.out.println(n+"is Odd\n");
	}
}
}