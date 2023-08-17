public class varArgs {
     static int sum(int x,int ...arr){
        int result=x;
        for(int a:arr){
            result+=a;
        }
        return result;

     }
    public static void main(String[] args) {
        int print;
        print=sum(1);
        System.out.println(print);

         print=sum(1,2);
        System.out.println(print);

        print=sum(1,2,3);
        System.out.println(print);

        print=sum(1,2,3,4);
        System.out.println(print);

        print=sum(1,2,3,4,5);
        System.out.println(print);
    }
}
