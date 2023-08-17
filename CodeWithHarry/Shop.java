/*SHOP
  to find weather the customer ha senough money or not
 */

import java.util.*;

public class Shop {
    public static void main(String[] args) {
        //Conditional statement
        // pen=10 , Notebook=40 
        Scanner sc= new Scanner(System.in);
        System.out.println("How much cash do you have?");
        int cash=sc.nextInt();
        if(cash<10){
            System.out.println("You cannot buy anything");         
        }
        else if(cash>10 && cash<40){
            System.out.println("PEN IS AVAILABLE");
        }
        else if(cash>10 && cash<50){
            System.out.println("You can buy ony 1 item");
        }
        else
        System.out.println("You can buy BOTH");

    }
    
}
