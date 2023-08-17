class base{
    int a=10;
}
class child extends base{
    int a=20;
    void show(){
        System.out.println(super.a);
        System.out.println(a);
    }
}
class super1{
    public static void main(String[] args) {
        child ch=new child();
        ch.show();
    }
}