/*1: Write a program of class of SBI Bank having data members 
customer id, 
customer name, 
customer city, 
mob number, 
account number and 
account amt. 
insert all records. 
Create sub class Account_info 
from SBI Bank and calculate total amount with interest rate 12%. 
And display all records. */

import java.util.Scanner;

class SBI_Bank{
    Scanner sc=new Scanner(System.in);
    int customer_id,customer_mobile_number,account_number;
    String customer_name,customer_city;
    float account_amount;
    void inData(){
        System.out.print("Enter Customer id ");
        customer_id=sc.nextInt();
        System.out.print("Enter Customer name ");
        customer_name=sc.next();
        System.out.print("Enter Customer City ");
        customer_city=sc.next();
        System.out.print("Enter Mobile Number ");
        customer_mobile_number=sc.nextInt();
        System.out.print("Enter Account number ");
        account_number=sc.nextInt();
        System.out.print("Enter Account amount ");
        account_amount=sc.nextFloat();
    }

}
class Account_info extends SBI_Bank{
    float total_amt;
    int interes_rate=12;
    void total_amt(){
        total_amt=((account_amount)+((account_amount*12)/(100)));
    }
    void display(){
        System.out.println("All customer details");
        System.out.println("Id: "+customer_id);
        System.out.println("Name: "+customer_name);
        System.out.println("City: "+customer_city);
        System.out.println("Mobile number: "+customer_mobile_number);
        System.out.println("Account number: "+account_number);
        System.out.println("Balance"+account_amount);
        System.out.println("Amount after "+interes_rate+" % interest rate"+total_amt);

    }
}
public class Bank{
    public static void main(String[] args) {
        Account_info a=new Account_info();
        a.inData();
        a.total_amt();
        a.display();
    }
}