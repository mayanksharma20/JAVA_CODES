import java.util.*;
public class PracticeSet3 {
    public static void main(String[] args) {
        String str="MaYaNk";
        System.out.println(str);
        String upper=str.toUpperCase();
        System.out.println(upper);
        String lower=str.toLowerCase();
        System.out.println(lower);

        //problem 2
        String text="happy birthday   abc";
        text=text.replace(" ","_");
        System.out.println(text);

        //problem 3
        String letter="dear <|name|>, thanks a lot!";
        letter=letter.replace("<|name|>","mayank");
        System.out.println(letter);

        //problem 4
        String myString="hello how are  you   hello   !";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //problem 5
        String myLetter="Dear harry,\nThis Java Course is Nice.\n\tThanks! ";
        System.out.println(myLetter);

    }
}
