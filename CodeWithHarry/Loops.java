
public class Loops {
    public static void main(String[] args) {
        int n=10;
        int i;
        System.out.println("For loop");
        for(i=0;i<n;i++){
            System.out.print(i+" ");
        }

        System.out.println("\n\nWhile loop");
        int j=0;
        while(j<n){
            System.out.print(j+" ");
            j++;
        }

        System.out.println("\n\nDo while");
        int k=0;
        do{
            System.out.print(k+" ");
            k++;
        }while(k<n);
    }
}
