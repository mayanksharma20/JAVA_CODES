
import java.util.Scanner; 
public class ifElse {
    public static void main(String[] args) {
        /* 
        int age=6;
        if(age>18){
            System.out.println("adult");
        }
        else{
            System.out.println("minor");
        }
        */
        
        //Switch case 
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        switch(age)
        {
            case 17:
                System.out.println("Under age");
                break;
            
            case 18:
                System.out.println("18");
                break;

            case 19:
                System.out.println("19");
                break;

            case 20:
                System.out.println("20");
                break;

            default:
                System.out.println("Bye!!!");
        }

    }
}
