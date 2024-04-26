

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AddEmployee extends JFrame implements ActionListener {
	
	JTextField t1,t2,t3,t4,t5,t6;
	JRadioButton r1,r2;
	JButton b1;
	
	AddEmployee(){
		
		setBounds(380,200,790,500);
		
		JLabel name = new JLabel("NAME");
		name.setFont(new Font("Tahoma",Font.PLAIN,17));
		name.setBounds(60,70,120,30);
		add(name);
		
		t1 = new JTextField();
		t1.setBounds(180,70,150,30);
		add(t1);
		
		JLabel age = new JLabel("AGE");
		age.setFont(new Font("Tahoma",Font.PLAIN,17));
		age.setBounds(60,110,120,30);
		add(age);
		
		t2 = new JTextField();
		t2.setBounds(180,110,150,30);
		add(t2);
		
		
		
		
		
	

		JLabel salary = new JLabel("SALARY");
		salary.setFont(new Font("Tahoma",Font.PLAIN,17));
		salary.setBounds(60,160,120,30);
		add(salary);
		
		t3 = new JTextField();
		t3.setBounds(180,160,150,30);
		add(t3);
	
		
		
		b1 = new JButton("Submit");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(120,250,130,30);
		b1.addActionListener(this);
		add(b1);
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/hiring.png"));
		Image i2 = i1.getImage().getScaledInstance(500, 500 , Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		l1.setBounds(170,50,700,500);
		add(l1);
		
		
		JLabel l2 = new JLabel("ADD EMPLOYEE DETAILS");
		l2.setForeground(Color.blue);
		l2.setFont(new Font("Tahoma",Font.PLAIN,25));
		l2.setBounds(250,15,300,30);
		add(l2);
		
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setLocation(250, 150);
		setVisible(true);
	}

	
	public void actionPerformed(ActionEvent ae) {
		String name=t1.getText();
		String age=t2.getText();
		String salary=t3.getText();
		
		try {
			
			conn c=new conn();
			String query="insert into employee values('"+name+"','"+age+"','"+salary+"')";
			c.s.executeUpdate(query); //data  not getting from db only inserted by executeupdate function
			System.out.println(query);
			JOptionPane.showMessageDialog(null,"New Employee Added");
			this.setVisible(false);			
			
			
		}catch(Exception e ) {
			
			e.printStackTrace();
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		new AddEmployee().setVisible(true);

	}

}
