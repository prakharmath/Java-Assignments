class BaseClass
{
	 public int x=10;
	 public int y=10;        //Wherever y was private it will be replaced with public//
	 protected int z=10;
 	 int a=10;
     public int getX()
     {
     	  return x;
     }
     public void setX(int x)
     {
     	  this.x=x;
     } 
     public int getY()         //Here too//
     {
     	 return y;
     }
     public void setY(int y)  //Here too//
     {
     	  this.y=y;
     }
     protected int getZ()
     {
     	 return z;
     }
     protected void setZ(int z)
     {
     	 this.z=z;
     }
     int getA()
     {
     	 return a;
     }
     void setA(int a)
     {
     	 this.a=a;
     }
}
public class SubClassInSamePackage extends BaseClass
{
	  public static void main(String args[])
	  {
	  	  BaseClass rr=new BaseClass();
	  	  rr.z=0;
	  	  SubClassInSamePackage subClassObj=new SubClassInSamePackage();
	  	  System.out.println("Value of x is :" +subClassObj.x);
	  	  subClassObj.setX(20);
	  	  System.out.println("Value of x is :" +subClassObj.x);
	  	  System.out.println("Value of y is :" +subClassObj.y);
	  	  subClassObj.setY(20);
	  	  System.out.println("Value of y is :" +subClassObj.y);
	  	  System.out.println("Value of z is :" +subClassObj.z);
	  	  subClassObj.setZ(30);
	  	  System.out.println("Value of z is :" +subClassObj.z);
	  	  System.out.println("Value of x is :" +subClassObj.a);
	  	  subClassObj.setA(20);
	  	  System.out.println("Value of x is :" +subClassObj.a);
	  }
}
