//method overloding
public class area {
    double area;
    public void area1(int r){
        area=3.14*r*r;
        System.out.println("Area of circle is: "+area);
    }
    public void area1(int b,int h){
        area=0.5*b*h;
        System.out.println("Area of triangle is: "+area);
    }
    public static void main(String[] args) {
        area a1=new area();
        a1.area1(10);
        a1.area1(6,6);
    }
}
