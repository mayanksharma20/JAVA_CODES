import java.util.Scanner;
class shopping
{
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter product id ");
    int p_id=sc.nextInt();
    System.out.println("Enter product Name ");
    String p_name=sc.next();
    System.out.println("Enter Rate ");
    int rate=sc.nextInt();
    System.out.println("Enter quantity ");
    int quant=sc.nextInt();
    double amount=rate*quant;
    double discount;
    double total;

    if(amount>5000){
        discount=((amount*20)/(100));
        total=amount-discount;
        System.out.println("\n\nProduct id: "+p_id);
        System.out.println("Product name: "+p_name);
        System.out.println("Product rate: "+rate);
        System.out.println("Product quantity: "+quant);
        System.out.println("Sub Total: "+amount);
        System.out.println("Final payable amount: "+total);
        System.out.println("Congrulations you have saved rs. "+discount);
        System.out.println("Visit Again :)\n\n");
    }
    else if(amount>3000 && amount<5000){
        discount=((amount*16)/(100));
        total=amount-discount;
        System.out.println("\n\nProduct id: "+p_id);
        System.out.println("Product name: "+p_name);
        System.out.println("Product rate: "+rate);
        System.out.println("Product quantity: "+quant);
        System.out.println("Sub Total: "+amount);
        System.out.println("Final payable amount: "+total);
        System.out.println("Congrulations you have saved rs. "+discount);
        System.out.println("Visit Again :)\n\n");
    }
    else if(amount>2000 && amount<3000){
        discount=((amount*10)/(100));
        total=amount-discount;
        System.out.println("\n\nProduct id: "+p_id);
        System.out.println("Product name: "+p_name);
        System.out.println("Product rate: "+rate);
        System.out.println("Product quantity: "+quant);
        System.out.println("Sub Total: "+amount);
        System.out.println("Final payable amount: "+total);
        System.out.println("Congrulations you have saved rs. "+discount);
        System.out.println("Visit Again :)\n\n");
    }
    else{
        discount=((amount*0)/(100));
        total=amount-discount;
        System.out.println("\n\nProduct id: "+p_id);
        System.out.println("Product name: "+p_name);
        System.out.println("Product rate: "+rate);
        System.out.println("Product quantity: "+quant);
        System.out.println("Sub Total: "+amount);
        System.out.println("Final payable amount: "+total);
        System.out.println("Congrulations you have saved rs. "+discount);
        System.out.println("Visit Again :)\n\n");
    }
 }
}