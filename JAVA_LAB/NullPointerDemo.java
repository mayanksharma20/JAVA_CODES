public class NullPointerDemo {
    public static void main(String[] args) {
        try{
            String a=null;
            System.out.println(a.charAt(0));
        }catch(NullPointerException e){
            System.out.println("No string available");
        }
    }
}
