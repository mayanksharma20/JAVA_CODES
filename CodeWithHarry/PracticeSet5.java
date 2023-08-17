public class PracticeSet5 {
    static void mult(int n){
        for(int i=1;i<=10;i++){
            int result=n*i;
            System.out.println(n+" * "+i+" = "+result);
        }
    }

    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        return n+sumRec(n-1);
    }

    static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static int fib(int n){
        if(n==1||n==2){
            return n-1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

    static void pattern1_rec(int n){
        
        if(n>0){
            pattern1_rec(n-1);
            for(int i=0;i<n;i++){
                System.out.print (" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        //Que 1 MULTIPLICATION
        //int n=11;
        //mult(n);

        //QUE 2 PATTERN
        //pattern1(11);

        //QUE 3 "WRITE A RECURSIVE FUNCTION TO CALCULATE SUM OF FIRST N NATURAL NUMBERS"
        //int c=sumRec(4);
        //System.out.println(c);

        //QUE 4
        //pattern2(5);

        //QUE 5 "FIBONACCI SERIES USING RECURSSION"
         //int result=fib(7);
        // System.out.println(result);

        //QUE 6
        //QUE 7 PATTER USING RECURSION
        pattern1_rec(5);

    }
}
