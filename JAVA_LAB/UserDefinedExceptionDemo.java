class OutOfBound extends Exception{
    OutOfBound(String s){
        super(s);
    }
}

public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        int marks=105;
        try{
            if(marks>100){
                OutOfBound b=new OutOfBound("No. is greater");
                throw b;
            }
            else{
                System.out.println(marks);
            }
        }catch(OutOfBound e){
            System.out.println(e);    
        }
    }
}
