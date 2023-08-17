public class ArrayIndexOutOfBoundDemo {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            int result=a[7]=9;            
            System.out.println(result);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of bound");
        }
    }
}
