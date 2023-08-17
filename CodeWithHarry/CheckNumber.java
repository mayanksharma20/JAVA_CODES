import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(sc.hasNextInt());

        }

    }
}
