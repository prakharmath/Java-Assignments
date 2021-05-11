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
//Created by Prakhar Bindal on 03/04/2019 at 2:15 pm
class Animal
{
     public void eat()
     {

     }
}
class Dog extends Animal
{
     public void eat()
     {
     	  System.out.println("Dog eats meat");
     }
}
class Cat extends Animal
{
	 public void eat()
	 {
	 	 System.out.println("Cat eats mouse");
	 }

}
class Elephant extends Animal
{
     public void eat()
     {
     	  System.out.println("Elephant eats grass");
     }
}
public class ViewAnimals
{
	public static void main(String[] args) throws IOException
	{
		   Scanner in=new Scanner(System.in);
		   Dog dog=new Dog();
		   dog.eat();
		   Cat cat=new Cat();
		   cat.eat();
		   Elephant elephant=new Elephant();
		   elephant.eat();
	}
}