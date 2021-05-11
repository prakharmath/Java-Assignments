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
//Created by Prakhar Bindal on 03/04/2019 at 2:45 pm
class Employee
{
	 String empId;
	 String name;
	 double salary;
	 public Employee(String empid,String names)
	 {
         empId=empid;
         name=names;
	 }
	 public Employee(String empid,String names,double salar)
	 {
	 	  empId=empid;
	 	  name=names;
	 	  salary=salar;
	 }
	 public String getEmpID()
	 {
	 	  return this.empId;
	 }
	 public String getName()
	 {
	 	   return this.name;
	 }
	 public double getSalary()
	 {
	 	   return this.salary;
	 }
	 public void setSalary(double salary)
	 {
	 	   this.salary=salary;
	 }
}
class Manager extends Employee
{
    int subordinateCount;
    public Manager(String empid,String names,double salar,int subordinate)
    {
    	  super(empid,names,salar);
          subordinateCount=subordinate;
    }
    public int getSubordinateCount()
    {
    	  return this.subordinateCount;
    }
    public void setSubordinateCount(int val)
    {
    	  this.subordinateCount=val;
    }
}
class Programmer extends Employee
{
	  String ProgrammingLanguage;
	  int ExperienceInYears;
	  public Programmer(String empid,String names,double salar,String programmingLanguage,int experienceinyears)
	  {
          super(empid,names,salar);
          ProgrammingLanguage=programmingLanguage;
          ExperienceInYears=experienceinyears;
	  }
	  public String getProgrammingLanguage()
	  {
	  	 return this.ProgrammingLanguage;
	  }
	  public void setProgrammingLanguage(String programmingLanguage)
	  {
	  	  this.ProgrammingLanguage=programmingLanguage;
	  }
	  public int getExperienceInYears()
	  {
	  	 return this.ExperienceInYears;
	  }
	  public void setExperienceInYears(int val)
	  {
	  	  this.ExperienceInYears=val;
	  }
}
public class ClassDiagram
{
	public static void main(String[] args) throws IOException
	{
		   Scanner in=new Scanner(System.in);
	}
}