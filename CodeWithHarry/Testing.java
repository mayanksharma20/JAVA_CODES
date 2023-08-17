 /*import java.util.Scanner;
public class Testing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.println(ch);
        int inc=(int)(ch+8);
        System.out.println(inc);
        System.out.println("decrypting");
        char dec=(char)(inc-8);
        System.out.println(dec);
    }
    
}
*/

import java.util.Scanner;
public class Testing{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=10;
        int b=sc.nextInt();
        if(b>a){
            System.out.println("choose small number");
        }
        else if(b<a){
            System.out.println("Choose greater number");
        }
        else if(b==a)
        System.out.println("congratulation");

        else
        System.out.println("error");

    }
}