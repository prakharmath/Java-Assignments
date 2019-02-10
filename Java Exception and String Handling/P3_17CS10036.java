interface I1
{
	 void methodI1()
	 {}
}
interface I2
{
	 void methodI2()
	 {}
}
class A1
{
	 public String methodA1()
	 {
	 	 String A1="I Am in method c1 of class a1";
	 	 return A1;
	 }
	 public String toString()
	 {
	 	 return "toString method of class A1";
	 }
}
class B1 extends A1 implements I2
{
	 public void method I3()
	 {
	  System.out.println("I Am in method I1 of class B2");
	}
}
class B2 extends A1 implements I1
{
 public void method I3()
 {
 System.out.println("I Am in method I2 of class B2");
}
}
