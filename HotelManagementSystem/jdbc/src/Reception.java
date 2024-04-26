


import java.awt.Color;

import javax.swing.*;

import java.awt.event.*;


public class Reception extends JFrame implements ActionListener{
	
	
	JButton b1,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	
	
	Reception(){
		setBounds(340,120,700,505);
		setTitle("Customer form");		
		
		
		b1 = new JButton("New Customer Form");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		b1.setBounds(10,80,200,50);
		add(b1);
		
		
	
		

		b12 = new JButton("Logout");
		b12.setBackground(Color.black);
		b12.setForeground(Color.white);
		b12.addActionListener(this);
		b12.setBounds(10,180,200,50);
		add(b12);
		
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/reception1.jpg"));
//		Image i2 = i1.getImage().getScaledInstance(800, 675, Image.SCALE_DEFAULT);
//		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i1);
		l1.setBounds(0,0,1254,836);
		add(l1);
		
		
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == b1) {
			
			new AddCustomer().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource() == b3) {
			
			
			
		}else if(ae.getSource() == b12) {
			this.setVisible(false);
		}
		
	}
	
	

	public static void main(String[] args) {
		
		new Reception();

	}

}
