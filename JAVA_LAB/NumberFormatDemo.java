public class NumberFormatDemo {
    public static void main(String[] args) {
        try{
            int num=Integer.parseInt("hello ji");
            System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println("Number format exception");
        }
    }
}
