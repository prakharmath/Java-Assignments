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
class MyException extends Exception
{
     private String e;
     MyException(String s)
     {
         e=s;
     }
     public String toString()
     {
       return e;
     }

}
public class A3_17CS10036
{ 
    public static void main(String[] args) throws IOException 
    { 
           Scanner in=new Scanner(System.in);
           long n;
           System.out.println("Please enter the amount of money you wanna withdraw");
           n=in.nextLong();
           long threshold=10000;
           try
           {
           if(n>=10000)
           {
               System.out.println("You have successfully withdrawn the money");
               System.out.print("Your currentbalance is ");
               System.out.println(100000000-n);
           }
            else
              throw new MyException("Your currentbalance is not sufficient and you are penalized a sum of Rs 500");
          }
          catch(MyException me)
          {
              System.out.println(me);
          }
          

    } 
} 