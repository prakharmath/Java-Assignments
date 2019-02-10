import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;
public class test2
{
	 public static void main(String args[])
	 {
	 	Scanner in=new Scanner(System.in);
	 	System.out.println("Please enter the number of rows you want in your pattern");
	 	int n=in.nextInt();
	 	int current=1;
	 	for(int i=1;i<=n;i++)
	 	{
             for(int j=1;j<=i;j++)
             {
             	 System.out.print(current);
             	 System.out.print(" ");
             	 current++;
             }
             System.out.println();
	 	}
	 }
 }
