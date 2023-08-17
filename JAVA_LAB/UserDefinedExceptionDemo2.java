class OutOfBound extends Exception{
    OutOfBound(){
        System.out.println("No is greater than 100");
    }
}
public class UserDefinedExceptionDemo2 {
    public static void main(String[] args) {
        int marks=898;
        try{
            if(marks>100){
                throw new OutOfBound();
            }else{
                System.out.println(marks);
            }
        }catch(OutOfBound e){
            System.out.println(e);
        }
    }
}
