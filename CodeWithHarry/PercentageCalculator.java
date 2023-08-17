import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter values of maths science english hindi sst");
            Float m=sc.nextFloat();
            Float s=sc.nextFloat();
            Float e=sc.nextFloat();
            Float h=sc.nextFloat();
            Float sst=sc.nextFloat();
            Float num=(m+s+e+h+sst);
            Float per=num/5;
            System.out.println("percentage is "+per);
        }
    }
}
