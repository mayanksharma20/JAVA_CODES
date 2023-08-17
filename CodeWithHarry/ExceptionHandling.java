public class ExceptionHandling {
    public static void main(String[] args) {
        int student[]={11,22,33,44};
        System.out.println(student[2]); //this statement will print
        
        try{
            System.out.println(student[9]); //skip if situation is not satisfied
        } catch(Exception bye){
                System.out.println("invalid entry");
        }

        System.out.println(student[2]); //this statement will print

          
    
    }
    
}
