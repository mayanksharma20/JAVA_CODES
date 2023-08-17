import java.util.Scanner;
public class KmsToMiles {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value in kms ");
            float kms=sc.nextFloat();
            float miles=kms/1.609344f;
            System.out.println(+kms+" kms in miles is "+miles);

        }

    }
}
