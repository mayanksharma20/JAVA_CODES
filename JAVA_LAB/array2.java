import java.util.Scanner;
public class array2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num[]=new int[4];
        System.out.println("Enter the input:"+num.length+" ");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("The number is ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }

        String str[]=new String[3];

        System.out.println("\nEnter the input:");
        for(int j=0;j<str.length;j++){
            str[j]=sc.next();
        }
        System.out.println("The String is ");
        for(int j=0;j<str.length;j++){
            System.out.print(str[j]+" ");
        }
    
}
}
