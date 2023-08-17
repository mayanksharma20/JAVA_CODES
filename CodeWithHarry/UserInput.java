import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        try (//System.out.println("it works");
        Scanner sc = new Scanner(System.in)) {
            //System.out.println("Enter number 1");
            //int a=sc.nextInt();
            //System.out.println("Enter number 2 in float");
            //float b=sc.nextFloat();
            //float sum=a+b;
            //System.out.println("sum is "+sum);
            //String str=sc.next(); //for single word
            String str=sc.nextLine(); //for full sentence
            System.out.println(str);
        }
    }    
}
