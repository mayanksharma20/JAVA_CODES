import java.util.Scanner;

public class TestArray4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("enter number of rows and column you need");
            int m=sc.nextInt();
            int n=sc.nextInt();
            int arr[][]=new int[m][n];
            System.out.println("Enter data");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=sc.nextInt();
                }
            }

            //to print
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

    }    
}
