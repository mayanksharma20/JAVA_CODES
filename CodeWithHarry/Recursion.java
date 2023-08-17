import java.util.Scanner;
public class Recursion {
    static void factorial(int x){
        int fact=1;
        if(x==0||x==1){
            System.out.println("Factorial of "+x+" is 1");
        }
        else{
            for(int i=1;i<=x;i++){
                
                fact=fact*i;                
            }
            System.out.println("Factorial of "+x+" is "+fact);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorial(n);
    }
}
