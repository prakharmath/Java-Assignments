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
class MyString
{
    public String name;
    public String demo;
    public void initialise(String s)
    {
        this.name=s;
    }
    public void setname(String s)
    {
          this.demo=s;
    }
    int getLength()
    {
        return this.name.length();
    }
    int getLength1()
    {
        return this.demo.length();
    }
}
public class A4_17CS10036
{ 
    public static void main(String[] args) throws IOException 
    { 
           Scanner in=new Scanner(System.in);
           MyString s=new MyString();
           s.initialise("prakhar");
           System.out.print("The length of the name is ");
           System.out.println(s.getLength());
           int count=0;
           int k=0;
           int position[]=new int[100];
           String x=s.name;
           for(int i=0;i<s.getLength();i++)
           {
                if(x.charAt(i)=='a')
                {
                     count++;
                     position[k]=i+1;
                     k++;
                }
           }
           if(count==0)
           {
                System.out.println("There is no occurence of character a in this name");
           }
           else
           {
               System.out.println("a occurs in this name "+count+ " times");
               System.out.println("The positions of occurences of a are ");
               for(int i=0;i<k;i++)
                 System.out.println(position[i]);
           }
           System.out.println("Please enter a demo name ");
           s.setname(in.next());
           System.out.print("The length of the name is ");
           System.out.println(s.getLength1());
           count=0;
           k=0;
           int position1[]=new int[100];
           String x1=s.demo;
           for(int i=0;i<s.getLength1();i++)
           {
                if(x1.charAt(i)=='a')
                {
                     count++;
                     position1[k]=i+1;
                     k++;
                }
           }
           if(count==0)
           {
                System.out.println("There is no occurence of character a in this name");
           }
           else
           {
               System.out.println("a occurs in this name "+count+ " times");
               System.out.println("The positions of occurences of a are ");
               for(int i=0;i<k;i++)
                 System.out.println(position1[i]);
           }


    } 
} 