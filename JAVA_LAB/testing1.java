import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class testing1 extends JFrame implements ActionListener {
	JLabel l1, l2, l3, l4, l5;
	JTextField t1, t2, t3, t4, t5;
	JButton b1, b2;
	testing1() {
        JFrame f=new JFrame("Product Details");
		setVisible(true);
		setSize(400, 400);
		setLayout(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1 = new JLabel("Product ID");
		l1.setBounds(50, 50, 90, 30);
		add(l1);
		t1 = new JTextField();
		t1.setBounds(150, 50, 150, 30);
		add(t1);
		l2 = new JLabel("Product Name");
		l2.setBounds(50, 100, 90, 30);
		add(l2);
		t2 = new JTextField();
		t2.setBounds(150, 100, 150, 30);
		add(t2);
		l3 = new JLabel("Rate");
		l3.setBounds(50, 150, 90, 30);
		add(l3);
		t3 = new JTextField();
		t3.setBounds(150, 150, 150, 30);
		add(t3);
		l4 = new JLabel("Quantity");
		l4.setBounds(50, 200, 90, 30);
		add(l4);
		t4 = new JTextField();
		t4.setBounds(150, 200, 150, 30);
		add(t4);
		l5 = new JLabel("Total");
		l5.setBounds(50, 250, 90, 30);
		add(l5);
		t5 = new JTextField();
		t5.setBounds(150, 250, 150, 30);
		add(t5);
		b1 = new JButton("Calculate");
		b1.setBounds(50, 300, 100, 30);
		b1.addActionListener(this);
		add(b1);
		b2 = new JButton("Clear");
		b2.setBounds(200, 300, 100, 30);
		b2.addActionListener(this);
		add(b2);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			int rate = Integer.parseInt(t3.getText());
			int quantity = Integer.parseInt(t4.getText());
			int total = rate * quantity;
			t5.setText(String.valueOf(total));
		} else if (e.getSource() == b2) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
		}
	}
	public static void main(String[] args) {
		new testing1();
	}
}