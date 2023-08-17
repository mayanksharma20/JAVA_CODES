import javax.swing.*;
//import java.awt.*;


public class Awtexample {
    public static void StudentInfo(){
        JFrame f=new JFrame("Student details");
        
        //frame
        f.setLayout(null);
        f.setSize(700,700);
        f.setVisible(true);

        //labels

        JLabel l1, l2, l3, l4, l5;
        l1=new JLabel("Student name");              //create labels
        l2=new JLabel("college email");              
        l3=new JLabel("branch");              
        l4=new JLabel("Section");               
        l5=new JLabel("mobile");              
 

        l1.setBounds(50,50,100,30);    //set labels
        l2.setBounds(50,100,100,30); 
        l3.setBounds(50,150,100,30);
        l4.setBounds(50,200,100,30);
        l5.setBounds(50,250,100,30);

        f.add(l1);                                          //add labels
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);

         //textfield
         JTextField t1,t2,t3;
         t1=new JTextField();
         t2=new JTextField();
         t3=new JTextField();                                   //create

         t1.setBounds(150,50,130,30);       //set
         t2.setBounds(150,100,130,30);
         t3.setBounds(150,250,130,30);

         f.add(t1);                                             //add
         f.add(t2);
         f.add(t3);

         //combo box
         JComboBox j1,j2;
         String s1[]={"","cse","ece","eee","mec"};
         String s2[]={"","div-A","div-B","div-C","div-D"};
        
         j1=new JComboBox(s1);                                     //create
         j2=new JComboBox(s2);

         j1.setBounds(150,150,130,30);           //set
         j2.setBounds(150,200,130,30);

         f.add(j1);                                                 //add
         f.add(j2);

        //Button creating
        JButton b1,b2;
        b1=new JButton("save");             //ceate
        b2=new JButton("back");

        b1.setBounds(150,300,80,30);
        b2.setBounds(50,300,60,30);

        f.add(b1);
        f.add(b2);
        
        //if(){JOptionPane.showMessageDialog(f,"Successfully Saved"+ " The Details");}
        
    } 
    
    public static void main(String args[]){
        StudentInfo();
    }
}
