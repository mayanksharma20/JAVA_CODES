import java.util.Scanner;

import javax.swing.plaf.multi.MultiListUI;
public class LoopsPracticeSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        /* 
        int n=4;
        for(int i=n;i!=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
                
            }
            System.out.print("\n");
        }
        */

        /* 
         //PROBLEM 2 (Sum of n even numbers)
        System.out.println("Select number of even numbers");
        int n=sc.nextInt();
        int i=2;
        int sum=0;
        while(n!=0){
            System.out.println(i);
            sum=sum+i;
            i=i+2;
            n--;

        }
        System.out.println("sum is " +sum);       
        */
        
        /* 
        //Multiplication table of 2

        for(int i=10;i>=1;i--){
            int n=2*i;
            System.out.println("2 * "+i+" = "+n);
        }
        */

        //Factorial
        //int n=5;
        // int fact=1;
        // for(int i=n;i>=1;i--){
        //     fact=fact*i;
        // }
        //System.out.println(fact);
        // while(n!=0){
        //      fact=fact*n;
        //     n--;
        //}
        //System.out.println(fact);
        
        /* 
        int sum=0;
        for(int i=1;i<=10;i++){
            int mult=8*i;
            System.out.println("8 * "+i+" = "+mult);
            sum=sum+mult;
        }
        System.out.println("sum is "+sum);
        */

        // sum of n even numbers;
        /* 
        int n=sc.nextInt();
        int m=n*2;
        int sum=0;
        for(int i=2;i<=m;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
        */

        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+(2*i);
        }
        System.out.println(sum);

    }
}
