import java.util.Scanner;
public class PracticeSet4 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        /* 
        //question 1
        int i=10;
        if(i==11){
            System.out.println("11");
        }
        else
        System.out.println("bye");
        */
        /* 
        //question 2
        
        System.out.println("Enter marks of P C M");
        int P=sc.nextInt();
        int C=sc.nextInt();
        int M=sc.nextInt();
        float avg=(P+C+M)/3.0f;
        System.out.println("Over all % is "+avg);
        if(P>=33 && C>=33 && M>=33){
            if(avg>=40.0f){
                System.out.println("Both condition satisfy");
            }
            else
            System.out.println("only 33% condition satisfy");
        }
        else
        System.out.println("Study Hard !");
        */
           
        //question 3
        /*income slab     TAX %  
           2.5 -5L          5
           5L-10L           20
           above 10L        30
         

         int income=sc.nextInt();
         System.out.println(income);
         if(income>=250000 && income<500000){
            System.out.println("5% tax");
         }
         else if(income>=500000 && income<1000000){
            System.out.println("20% tax");
         }
         else
         System.out.println("30% tax");

         */

         /* 
        //question 4
        //PRINT WEEK NAME ON GIVEN NUMBER.
        
        System.out.println("Enter week number: ");
        int num=sc.nextInt();

        switch(num){
            case 1:
                    System.out.println("Monday");
                    break;
            case 2:
                    System.out.println("Tuesday");
                    break;
            case 3:
                    System.out.println("Wednesday");
                    break;
            case 4:
                    System.out.println("Thursday");
                    break;
            case 5:
                    System.out.println("Fridayday");
                    break;
            case 6:
                    System.out.println("Saturday");
                    break;
            case 7:
                    System.out.println("Sunday");
                    break;
            default:
                    System.out.println("Error enter number b/w 1 to 7");
        }
        */

        //que 5 find leap year
        System.out.println("Enter a year");
        int year=sc.nextInt();
        if((year%4==0)&&(year%400==0)||(year%100!=0)){            
            System.out.println("LEAP year ");      
        }
        else
            System.out.println("Not a leap year.");
    }
}
