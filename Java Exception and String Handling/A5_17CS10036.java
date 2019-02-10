import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.lang.Math;
import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class A5_17CS10036
{
    public static void main(String[] args)
    { 
           Scanner in=new Scanner(System.in);
           ArrayList a=new ArrayList();
           for(int i=1;i<=10;i++)
           {
              a.add((int)(i*i));
           }
          System.out.println("The elements of the stack are");
           for(int i=0;i<10;i++)
            System.out.println(a.get(i));
          System.out.prinln("The size of the stack is ");
           System.out.println(a.size());
           a.clear();
           if(a.isEmpty())
            System.out.println("YES");
           else
            System.out.println("NO");
    } 
} 