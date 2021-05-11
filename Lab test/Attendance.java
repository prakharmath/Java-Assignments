import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.lang.Math;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//Created by Prakhar Bindal on 03/04/2019 at 2:25 pm
class AttendanceException extends Exception
{
   public AttendanceException(String s)
   {
   	    super(s);
   }
}
public class Attendance
{
	double percent;
	public void check() throws AttendanceException
	{
           if(this.percent<40.0)
           	throw  new AttendanceException("Low Attendance");
	}
	public static void main(String[] args) throws IOException
	{
		   Scanner in=new Scanner(System.in);
		   Attendance obj1=new Attendance();
		   Attendance obj2=new Attendance();
		   Attendance obj3=new Attendance();
		   obj1.percent=50.0;
		   obj2.percent=30.0;
		   obj3.percent=100.0;
		   System.out.print("The attendance is ");
		   System.out.println(obj1.percent);
		   try
		   {
		   	    obj1.check();
		   }
		   catch(AttendanceException e)
		   {
                System.out.println(e.getMessage());
		   }
		   System.out.print("The attendance is ");
		   System.out.println(obj2.percent);
		   try
		   {
		   	    obj2.check();
		   }
		   catch(AttendanceException e)
		   {
                System.out.println(e.getMessage());
		   }
		   System.out.print("The attendance is ");
		   System.out.println(obj3.percent);
		   try
		   {
		   	    obj3.check();
		   }
		   catch(AttendanceException e)
		   {
                System.out.println(e.getMessage());
		   }
	}
}