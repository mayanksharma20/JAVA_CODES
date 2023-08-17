
public class methodoverloading {
    int sum;
    public void add(int a,int b)
    {
        sum=a+b;
        System.out.println(sum);
    }
    public void add(int a,int b,int c)
    {
        sum=a+b+c;
        System.out.println(sum);
    }
    public void add(double m,double n)
    {
        double sum=m+n;
        System.out.println(sum);
    }

public static void main(String[] args) {
    methodoverloading m1=new methodoverloading();
    m1.add(2,3);
    m1.add(2,4,6);
    m1.add(3.44,3.44);
}
}
