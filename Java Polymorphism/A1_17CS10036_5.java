import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;
class Box
{
    int length=1;
    int breadth=2;
    int side=3;
    int diagonal1=4;
    int diagonal2=5;
}
class Rectangle extends Box
{
    int getarea()
    {
    	 return length*breadth;
    }
}
class Square extends Rectangle
{
    int getarea()
    {
       return side*side;
    }
}
class Rhombus extends Rectangle
{
    int getarea()
    {
    	 return diagonal1*diagonal2;
    }
}
public class test4
{
	 public static void main(String args[])
	 {
	 	Scanner in=new Scanner(System.in);
	 	Rectangle x=new Rectangle();
	 	System.out.println("The Area of the rectangle is ");
	 	System.out.println(x.getarea());
	 	Square y=new Square();
	 	System.out.println("The Area of the square is ");
	 	System.out.println(y.getarea());
	 	Rhombus z=new Rhombus();
	 	System.out.println("The Area of the rhobmus is ");
	 	System.out.println(z.getarea());
	 }
}


