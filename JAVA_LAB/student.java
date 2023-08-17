//USING OBJECT AND CLASSES
//W.A.P TO ENTER A STUDENT NAME ,ROLLNO,3 SUBJECT MARKS,TOTAL & PERCENTAGE.
import java.util.Scanner;
class student
{
    int rollno,m1,m2,m3;
    String sname;
    int sum;
    float per;

    void indata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name,rollno,3 sub marks");
        sname=sc.next();
        rollno=sc.nextInt();
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
    }

    void total()
    {
        sum=m1+m2+m3;
    }
    void per()
    {
        per=sum/3f;
    }

    void remark()
    {
        if(per>=70)
        {
            System.out.println("first class with distinction");
        }
        else if(per>=60 && per<70)
        {
            System.out.println("first class");
        }
        else if(per>=50 && per<60)
        {
            System.out.println("second class");
        }
        else if(per>=40 && per<50)
        {
            System.out.println("pass class");
        }
        else
        {
            System.out.println("fail");
        }
    }
    void display()
    {
        System.out.println("\n\nName: "+sname);
        System.out.println("rollno: "+rollno);
        System.out.println("first sub marks: "+m1);
        System.out.println("second sub marks: "+m2);
        System.out.println("third sub marks: "+m3);
        System.out.println("total: "+sum);
        System.out.println("percentage: "+per);
    }

    public static void main(String[] args) {
        student s1=new student();
        s1.indata();
        s1.total();
        s1.per();
        s1.display();
        s1.remark();
    }
}