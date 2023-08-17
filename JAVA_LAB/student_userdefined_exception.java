class oob extends Exception{
    oob(){
        System.out.println("number is greater than 100");
    }
}

public class student_userdefined_exception {
    
    public static void main(String[] args) {

        int marks=101;
        try{
            if(marks>100){
                oob b=new oob();
                throw b;
            }
            else System.out.println(marks);
        }catch(oob e){
            System.out.println(e);
        }
    }
}

