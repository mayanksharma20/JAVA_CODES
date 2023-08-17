//static input of number and string.

public class array1 {
    public static void main(String args[]){
        int num[]={1,2,3,4,5};
        String str[]={"sachin","dhoni","virat","rahul"};
        System.out.println("the number is ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println("\nThe names are ");
        for(int j=0;j<str.length;j++){
            System.out.print(str[j]+" ");
        }
    }    
}
