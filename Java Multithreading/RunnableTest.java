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
public class RunnableTest implements Runnable
{ 
    public void run()
    {
       for(int i=1;i<=10;i++)
       {
           System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority()+ " "+Thread.currentThread().getState()+" "+i);
          try
          {
           Thread.sleep(1000);
          }
          catch(InterruptedException e)
          {
            System.out.println(e);
          }
       }
    }
    public static void main(String[] args) throws IOException 
    { 
           Scanner in=new Scanner(System.in);
           RunnableTest rtest=new RunnableTest();
           Thread t1=new Thread(rtest);
           Thread t2=new Thread(rtest);
           Thread t3=new Thread(rtest);
           Thread t4=new Thread(rtest);
           t1.setPriority(Thread.MIN_PRIORITY);
           t2.setPriority(Thread.MAX_PRIORITY);    //For first part just comment out these 4 lines//
           t3.setPriority(Thread.NORM_PRIORITY);
           t4.setPriority(5);
           t1.start();
           t2.start();
           t3.start();
           t4.start();
    } 
} 