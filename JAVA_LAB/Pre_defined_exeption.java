import java.io.*;

public class Pre_defined_exeption {
    public static void main(String[] args) {
        try{
            int a=30,b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
