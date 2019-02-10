import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;
public class test
{
	 public static void main(String args[])
	 {
	 	Scanner in=new Scanner(System.in);
	 	System.out.println("Please enter the number whose factorial you wanna calculate");
	    long n=in.nextLong();
	    if(n>=19)
	    {
	 	  BigInteger p=new BigInteger("1");
	 	  for(int i=2;i<=n;i++)
	 		 p=p.multiply(BigInteger.valueOf(i));
	 	  System.out.print("The Factorial of ");
	 	  System.out.print(n);
	 	  System.out.print(" is ");
	 	  System.out.println(p);
	    }
	    else
	    {
	 	  long prod=1;
	 	  for(int i=2;i<=n;i++)
	 		 prod*=i;
	 	  System.out.print("The Factorial of ");
	 	  System.out.print(n);
	 	  System.out.print(" is ");
	 	  System.out.println(prod);
	    }
	 }
}