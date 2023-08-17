//method overloding

public class volume {
    double volume;
    //double pi=3.14;
    public void volume1(int r){
        volume=((1.3)*(3.14*r*r*r));
        System.out.println("volume of sphere is: "+volume);
    }
    public void volume1(int l,int b,int h){
        volume=l*b*h;
        System.out.println("Volume of cuboid is: "+volume);
    }
public static void main(String[] args) {
    volume v1=new volume();
    v1.volume1(4);
    v1.volume1(1,2,4);
}
}
