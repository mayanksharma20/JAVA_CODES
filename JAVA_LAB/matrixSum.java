import java.util.Scanner;
public class matrixSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("enter number of rows and column you need");
            int m=sc.nextInt();
            int n=sc.nextInt();
            
            
            //for 1st matrix
            int A[][]=new int[m][n];
            System.out.println("Enter data");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    A[i][j]=sc.nextInt();
                }
            }

            //to print
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(A[i][j]+" ");
                }
                System.out.println();
            }
            

            //FOR 2ND ARRAY
            int B[][]=new int[m][n];
            System.out.println("Enter data");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    B[i][j]=sc.nextInt();
                }
            }

            //to print
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(B[i][j]+" ");
                }
                System.out.println();
            }

            //FOR 3RD ARRAY
            int C[][]=new int[m][n];
            System.out.println("Enter data");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    C[i][j]=A[i][j]+B[i][j];
                }
            }

            //to print
            System.out.println("SUM OF MATRIX A AND B IS ");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(C[i][j]+" ");
                }
                System.out.println();
            }
    }    
}

