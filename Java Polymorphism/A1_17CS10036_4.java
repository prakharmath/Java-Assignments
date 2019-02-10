import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;
public class test3
{
	 public static void main(String args[])
	 {
	 	Scanner in=new Scanner(System.in);
	 	System.out.println("Please enter the number of elements in the array");
	 	int n=in.nextInt();
	 	int a[]=new int[n];
	 	System.out.println("Please enter the elements of the array");
	 	for(int i=0;i<n;i++)
	 		a[i]=in.nextInt();
	 	long sum=0;
	 	for(int i=0;i<n;i++)
	 	{
	 		  sum+=a[i]*a[i];
	 	}
	 	System.out.print("The sum of squares of the elements of the array is ");
	 	System.out.println(sum);
	 }
 }
