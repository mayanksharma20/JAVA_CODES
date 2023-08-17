//inner and outer class (NESTED CLASS)
public class outerclass {
    private int data=20;
    class innerclass{
        void show(){
            System.out.println("data is: "+data);
        }
    }
    public static void main(String[] args) {
        outerclass out=new outerclass();
        outerclass.innerclass in=out.new innerclass();
        in.show();
    }
    
}
