//java program to check whether the character is an alphabet or not
import java.util.*;
public class Program2
{
public static void main(String[] args)
{char ch;
System.out.print("Enter your character:");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
System.out.println();
if((ch>='0' && ch<='9')||(ch>='a' && ch>='b')||(ch>='A' && ch>='Z'))
System.out.println(ch+"is not a special character");
else
System.out.println(ch+"is an special character"); 
}
}
