import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;
public class test1
{
	 private static boolean checkprime(int n)
	 {
	     if(n==1)
	     	return false;
	     for(int i=2;i*i<=n;i++)
	     {
	     	  if(n%i==0)
	     	  	return false;
	     }
	     return true;
	 }
	 public static void main(String args[])
	 {
	 	Scanner in=new Scanner(System.in);
	 	System.out.println("Please enter the range in between which you want to calculate prime numbers");
	 	int l=in.nextInt();
	 	int r=in.nextInt();
	 	System.out.println("The prime numbers between the given range are ");
	 	for(int i=l;i<=r;i++)
	 	{
	 		   if(checkprime(i))
	 		   {
	 		   	   System.out.print(i);
	 		   	   System.out.print(" ");
	 		   }
	 	}
	 	System.out.println();
	 }
 }
