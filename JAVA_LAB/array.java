import java.util.*;
public class array {
     static void input(int a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
     }

     static void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
     }
    public static void main(String[] args) {
        int a[]=new int[6];
        input(a);
        display(a);
    }
}
