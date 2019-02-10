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
public class A2_17CS10036
{ 
    public static void main(String[] args) throws IOException 
    { 
           Scanner in=new Scanner(System.in);
           System.out.println("Please enter the size of the array");
           int n=in.nextInt();
           try
           {
                long a[]=new long[n];
                for(int i=0;i<n;i++)
                {
                   System.out.println("Please enter the "+(i+1)+" element of the array");
                   a[i]=in.nextLong();
                }
                System.out.println("The elements of the array are");
                for(int i=0;i<n;i++)
                  System.out.print(a[i]+" ");
                System.out.println();
           }
           catch(NegativeArraySizeException e)
           {
              System.out.println("You have entered a negative size Array");
           }
           return;
    } 
} 