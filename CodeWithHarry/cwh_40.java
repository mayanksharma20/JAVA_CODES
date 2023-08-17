class employee1{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}
public class cwh_40 {
    public static void main(String[] args) {
    employee1 e1= new employee1();
    
    e1.setName("Shubham");
    System.out.println(e1.getName());
    e1.setId(23);
    System.out.println(e1.getId());

   } 
}
