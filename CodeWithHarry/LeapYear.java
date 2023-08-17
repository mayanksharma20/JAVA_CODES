import java.util.Scanner;
public class LeapYear {
    
    static int Leap(int y){
        
        if((y%400==0)||(y%100!=0)&&(y%4==0)){
            System.out.println("Leap year !");
        }
        else
            System.out.println("Not a leap year :( ");
        
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Enetr a year: ");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        Leap(year);

    }
}
