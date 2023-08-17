class outerclass1{
    int x=10;
    class innerclass1{
        int y=5;
    }

    public class outerinner{
        public static void main(String[] args) {
            outerinner oui=new outerinner();
            outerinner.outerclass1 o1=oui.new outerclass1();
            outerclass1.innerclass1 i1=o1.new innerclass1();
            System.out.println(i1.y);
        }
    }
}