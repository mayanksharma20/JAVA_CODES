class parent{
    public void show(){
        System.out.println("This is parent class");
    }
}
class sub1 extends parent{
    public void show(){
        System.out.println("Sub1 class");
        super.show();
    }
}
public class supermethod {
    public static void main(String[] args) {
        sub1 s1=new sub1();
        s1.show();
    }
}
