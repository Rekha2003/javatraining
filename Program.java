import java.util.Scanner;
public class Program{
static int difference(int a,int b){return a-b;}
static int product(int a,int b){return a*b;}
static int smallest(int a,int b){
if(a<b) return a;
if(b<a) return b;
return 0;}
static int largest(int a,int b){
if(a>b) return a;
if(b>a) return b;
return 0;}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num1,num2,result;
System.out.println("Enter the number:");
num1=sc.nextInt();
System.out.println("Enter the number:");
num2=sc.nextInt();
result=difference(num1,num2);
System.out.println("Difference is"+result);
result=product(num1,num2);
System.out.println("product is"+result);
result=smallest(num1,num2);
System.out.println("Smallest is"+result);
result=largest(num1,num2);
System.out.println("largest is"+result);
}
}
