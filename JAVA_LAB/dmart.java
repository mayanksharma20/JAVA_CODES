//USING OBJECT AND CLASSES
import java.util.Scanner;
public class dmart {
    int pid,quantity,discount,rate,subtotal,payableamt;
    String pname;
    void indata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product_id,p_name,quantity,rate");
        pid=sc.nextInt();
        pname=sc.next();
        quantity=sc.nextInt();
        rate=sc.nextInt(); 
            
    }

    void subtotal()
    {
        subtotal=rate*quantity;
    }

    void discount()
    {
        if(subtotal>=5000)
        {
            discount=(subtotal*20)/100;
            payableamt=subtotal-discount;
        }
        else if(subtotal>=3000 && subtotal<5000)
        {
            discount=(subtotal*15)/100;
            payableamt=subtotal-discount;
        }
        else if(subtotal>=2000 && subtotal<3000)
        {
            discount=(subtotal*10)/100;
            payableamt=subtotal-discount;
        }
        else
        {
            discount=(subtotal*0)/100;
            payableamt=subtotal-discount;
        }
    }

    void display()
    {
        System.out.println("\n");
        System.out.println("product_id: "+pid);
        System.out.println("Product name: "+pname);
        System.out.println("Quantity: "+quantity);
        System.out.println("Rate: "+rate);
        System.out.println("Sub_total: "+subtotal);
        System.out.println("Amount to be paid: "+payableamt);
        System.out.println("\nCongratulations you saved rs: "+discount);
        System.out.println("Thank you !! visit again");

    }
public static void main(String[] args) 
{
    dmart d1=new dmart();
    d1.indata();
    d1.subtotal();
    d1.discount();
    d1.display();
}   
}
