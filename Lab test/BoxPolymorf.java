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
//Created by Prakhar Bindal on 03/04/2019 at 2:05 pm
public class BoxPolymorf
{
	public int area(int a,int b)
	{
		  return a*b;
	}
	public double area(double a,double b)
	{
		  return a*b;
	}
	public double area(int a,double b)
	{
		  return a*b;
	}
	public int area(int a)
	{
		 return a*a;
	}
	public double area(double a)
	{
		 return a*a;
	}
	public static void main(String[] args) throws IOException
	{
		   Scanner in=new Scanner(System.in);
		   BoxPolymorf object=new BoxPolymorf();
		   System.out.print("Result of Method 1 is :");
		   System.out.println(object.area(5,10));
		   System.out.print("Result of Method 2 is :");
		   System.out.println(object.area(5.5,10.5));
		   System.out.print("Result of Method 3 is :");
		   System.out.println(object.area(5,10.5));
		   System.out.print("Result of Method 4 is :");
		   System.out.println(object.area(10));
		   System.out.print("Result of Method 5 is :");
		   System.out.println(object.area(10.5));
	}
}