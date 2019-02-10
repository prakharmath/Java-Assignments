import java.util.*;
public class P1_17CS10036
{ 
    public static void main(String[] args)
    { 
           Stack stack=new Stack();
           stack.clear();
           stack.push(10);
           stack.push("a");
           try
           {
           System.out.println("The contents of the stack are " +stack);
           }
           catch(Exception e)
           {
              System.out.println("The Stack is empty");
           } 
           System.out.println("The size of the stack is " +stack.size());
           try
           {
           System.out.println("The element popped out of the stack is " +stack.pop());
           }
           catch(Exception e)
           {
               System.out.println("The Stack is empty");
           }
           try
           {
           System.out.println("The element popped out of the stack is " +stack.pop());
           }
           catch(Exception e )
           {
               System.out.println("The Stack is empty");
           }
           System.out.println("The contents of the stack are " +stack);
           System.out.println("The size of the stack is " +stack.size());          
    } 
} 