import java.awt.*;
class First1 extends Frame {
    First1(){
        Button b=new Button("click me");            //create button class
        b.setBounds(30,100,80,30);      //set buttonclass
        add(b);                                             //add button class
        setSize(300,300);                   //set frame size
        setLayout(null);                            //set layout
        setVisible(true);                              //set visible
    }
    public static void main(String args[]){
        First1 f=new First1();
    }
}