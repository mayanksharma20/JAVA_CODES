import java.util.Scanner;


public class MiniProject {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int myNumber= (int)(Math.random()*100);
        System.out.println(myNumber);
        int userNumber=0;
        System.out.println("Guess a number: ");
        do{
            
            userNumber=sc.nextInt();

            if(userNumber==myNumber){
                System.out.println("Congratulation ");
                break;
            }
            else if(userNumber>myNumber){
                System.out.println("Guess a smaller number ");
            }
            else{
                System.out.println("Guess a greater number ");
            }
        }while(userNumber>=0);

        System.out.print("your number is ");
        System.out.println(myNumber);
        
    }
    
    

}
