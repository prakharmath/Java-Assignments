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
class Bank
{
     double getRateOfInterest()
     {
          return 0;
     }
}
class SBI extends Bank
{
     double getRateOfInterest()
     {
          return 7;
     }
}
class AXIS extends Bank
{
     double getRateOfInterest()
    {
         return 9;
    }
}
class ICICI extends Bank
{
     double getRateOfInterest()
     {
        return 8;
     }
}
public class A1_17CS10036
{ 
    public static void main(String[] args) throws IOException 
    { 
           Scanner in=new Scanner(System.in);
           SBI s=new SBI();
           AXIS a=new AXIS();
           ICICI i=new ICICI();
           System.out.println("The rate of interst of SBI is "+s.getRateOfInterest());
           System.out.println("The rate of interst of AXIS is "+a.getRateOfInterest());
           System.out.println("The rate of interst of ICICI is "+i.getRateOfInterest());
    } 
} 