class votingAge extends Exception{
    votingAge(){
        System.out.println("UNDER AGE");
    }
}
public class Voting {
    public static void main(String[] args) {
        int age =18;
        try{
            if(age<18){
                votingAge v=new votingAge();
                throw v;
            }
            else System.out.println("can vote");
        }catch(votingAge e){
            System.out.println(e);
        }
    }
}
