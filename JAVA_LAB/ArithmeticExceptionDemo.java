public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try{
            int a=30 ,b=0;
            int c=a/b;
            System.out.println("Result is: "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Can not divide anumber by zero");
        }
    }
    
}
