import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;
class Account
{
   int account_number;
   int initial_balance;
   String account_holder_name;
   String address;
   String type_of_account;
   int current_balance;
   Account(int a_n,int i_b,String a_h_n)
   {
       this.account_number=a_n;
       this.initial_balance=i_b;
       this.account_holder_name=a_h_n;
   }
   Account(String a_h_n,int a_n,String ad,String t_o_a,int c_b)
   {
        this.account_holder_name=a_h_n;
        this.account_number=a_n;
        this.address=ad;
        this.type_of_account=t_o_a;
        this.current_balance=c_b;
   }
   void deposit(int x)
   {
        this.current_balance+=x;
   }
   void withdraw(int x)
   {
        this.current_balance-=x;
   }
   int getbalance()
   {
       return this.current_balance;
   }
}
public class Accessaccount
{
        public static void main(String args[])
        {
            Scanner in=new Scanner(System.in);
            Account object1=new Account(102,10,"Bob");
            Account object2=new Account("Alice",103,"ParkStreet","Savings",10);
            System.out.println("The balance in our first object is ");
            System.out.println(object1.getbalance());
            object2.deposit(100);
            System.out.println("The balance in our second object is ");
            System.out.println(object2.getbalance());
            object2.withdraw(100);
            System.out.println("The balance in our second object is ");
            System.out.println(object2.getbalance());
        }
 }
