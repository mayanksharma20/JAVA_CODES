import java.util.*;
public class SumOfNumber{
    
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    
    static public void main(String args[]) {
        int x,y,sum;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1st number ");
            x=sc.nextInt();
            System.out.println("Enter 2nd number ");
            y=sc.nextInt();
        }
        sum=sum(x,y);
        System.out.println("Addition is "+sum);
    }

    
}