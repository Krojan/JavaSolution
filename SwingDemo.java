package Spring2018;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class SwingDemo implements ActionListener {
	JTextField tf=null;
	JButton b1=null;
	JFrame f=null;
	
	SwingDemo(){
		tf=new JTextField("uppercase and change background");
		b1=new JButton("click here");
		f=new JFrame();
	}
	
	void showGUI() {
		b1.addActionListener(this);
		tf.setBounds(100,100,350,50);
		b1.setBounds(100,300,150,50);
		f.add(tf);
		f.add(b1);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		String s=tf.getText();
		s=s.toUpperCase();
		tf.setBackground(Color.BLUE);
		tf.setText(s);	
	}
	public static void main(String[] args) {
		SwingDemo obj=new SwingDemo();
		obj.showGUI();
	}
	
	

}
