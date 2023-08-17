
class Base{
    int a,b;
    Base(int x){
        a=x;
        System.out.println("Base class Constructor called");
    }
}
class Derived extends Base{
    Derived(int x,int y){
        super(x);
        b=y;
        System.out.println("Derived class constructor called");
    }
    void show(){
        System.out.println(a);
        System.out.println(b);
    }
}
public class constructor_interface {
    public static void main(String[] args) {
        Derived d1=new Derived(10, 20);
        d1.show();
    }
}
