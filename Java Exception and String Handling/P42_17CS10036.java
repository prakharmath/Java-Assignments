import java.util.*;
public class P42_17CS10036
{ 
    public static void main(String[] args)
    { 
           int divisor=0;
           int dividend=11;
           try
           {
           	  int result=dividend/divisor;
           	  System.out.println(result);
           }
           catch(ArithmeticException ae)
           {
           	 System.out.println("Division by zero");
           } 
           finally
           {
           	  System.out.println("We are done");
           }
    } 
} 