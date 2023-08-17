import java.util.Scanner;
public class CgpaCalculate {
    public static void main(String[] args) {
        System.out.println("Enter marks of 3 subject ");
        try (Scanner sc = new Scanner(System.in)) {
            Float a=sc.nextFloat();
            Float b=sc.nextFloat();
            Float c=sc.nextFloat();
            Float sum=a+b+c;
            Float per=(sum/300)*100;
            Float cgpa=per/9.5F;
            System.out.println("Percentage is "+per);
            System.out.println("Cgpa is "+cgpa);
        }

    }

}
