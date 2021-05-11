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
	 public void storeEmpRecord(ArrayList<Employee> Emplist)
	 {
	 	  Emplist.add(this);
	 }
	 public void displayEmpRecord()
	 {
	 	 System.out.println(this.empId+" "+this.name+" "+this.salary);
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
public class DataEntry
{
	public static double cal(int x)
	{
		  return 100000*Math.log(2+x);
	}
	public static void main(String[] args) throws IOException
	{
		   Scanner in=new Scanner(System.in);
		   Manager Mobj1=new Manager("1","A",cal(1),1);
		   Manager Mobj2=new Manager("2","B",cal(2),2);
		   Manager Mobj3=new Manager("3","C",cal(3),3);
		   Manager Mobj4=new Manager("4","D",cal(4),4);
		   Manager Mobj5=new Manager("5","E",cal(5),5);
           Programmer Pobj1=new Programmer("1","A",30000,"Java",2);
           Programmer Pobj2=new Programmer("2","B",30000,"Python",3);
           Programmer Pobj3=new Programmer("3","C",30000,"C",4);
           Programmer Pobj4=new Programmer("4","D",30000,"Java",5);
           Programmer Pobj5=new Programmer("5","E",30000,"Python3",6);
           ArrayList<Employee> Emplist=new ArrayList<>();
           Mobj1.storeEmpRecord(Emplist);
           Mobj2.storeEmpRecord(Emplist);
           Mobj3.storeEmpRecord(Emplist);
           Mobj4.storeEmpRecord(Emplist);
           Mobj5.storeEmpRecord(Emplist);
           Pobj1.storeEmpRecord(Emplist);
           Pobj2.storeEmpRecord(Emplist);
           Pobj3.storeEmpRecord(Emplist);
           Pobj4.storeEmpRecord(Emplist);
           Pobj5.storeEmpRecord(Emplist);
           for(Employee x:Emplist)
           	 x.displayEmpRecord();

	}
}