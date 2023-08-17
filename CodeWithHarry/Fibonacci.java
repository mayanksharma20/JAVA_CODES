
//FEBONACCI 
//0 1 1 2 3 5 8 13 21 34
public class Fibonacci {
    static void fibo(int n){
        int a=0,b=1,c;
        if(n==1){System.out.print(a);}
        else if(n==2){System.out.print(a+" "+b);}
        else{System.out.print(a+" "+b+" ");
                for(int i=2;i<n;i++){
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;                
            }
        }
    }
    public static void main(String[] args) {
        int n=10;
        fibo(n);
    }
}
