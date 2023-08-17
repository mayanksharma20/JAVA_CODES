class student{
    int rno;
    String sname;
    student(int rno,String sname){
        this.rno=rno;
        this.sname=sname;
    }
}
class Account extends student{
    int fee;
    String course_name;
    Account(int rno,String sname,int fee,String course_name){
        super(rno,sname);
        this.fee=fee;
        this.course_name=course_name;
    }
    void display(){
        System.out.print(rno+" ");
        System.out.print(sname+" ");
        System.out.print(fee+" ");
        System.out.print(course_name+". ");
    }
}
public class supermethod1 {
    public static void main(String[] args) {
        Account a1=new Account(1, "amit", 4500, "MCA");
        a1.display();
    }
    
}
