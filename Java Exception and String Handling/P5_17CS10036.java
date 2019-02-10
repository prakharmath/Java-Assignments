import java.util.*;
public class P5_17CS10036
{ 
    public static void main(String[] args)
    { 
           String myname="Fred F. Flinstone";
           String name=new String();
           int length=myname.length();
           for(int i=0;i<length;i++)
           {
              if(Character.isUpperCase(myname.charAt(i)))
                name+=myname.charAt(i);
           }
           System.out.println(name);
    } 
} 