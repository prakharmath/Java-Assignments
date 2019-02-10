import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;
class Data
{
    int data1=1;
    int data2=2;
    void display1()
    {
    	  System.out.println("The value of data1 is ");
    	  System.out.println(data1);
    	  System.out.println("The value of data2 is ");
    	  System.out.println(data2);
    }
} 
class NewData extends Data
{
    int data3=3;
    int data4=4;
    void display()
    {
    	  System.out.println("The value of data3 is ");
    	  System.out.println(data3);
    	  System.out.println("The value of data4 is ");
    	  System.out.println(data4);
    }
}
public class test6
{
	 public static void main(String args[])
	 {
	 	Scanner in=new Scanner(System.in);
	 	NewData object=new NewData();
	 	object.display();
	 	object.display1();
	 }
}
