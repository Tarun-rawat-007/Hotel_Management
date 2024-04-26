


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class AddRooms extends JFrame implements ActionListener{
	
	
	JTextField t1,t2;
	JButton b1,b2;
	
	AddRooms(){
		
		setBounds(400,200,750,500);
		
		
		JLabel l1 = new JLabel("Add Rooms");
		l1.setFont(new Font("Tohoma",Font.BOLD,21));
		l1.setBackground(Color.red);
		l1.setOpaque(true);
		l1.setBounds(480,100,120,30);
		add(l1);
		
		JLabel room = new JLabel("Room Number");
		room.setFont(new Font("Tohoma",Font.BOLD,14));
		room.setBounds(420,150,120,30);
		add(room);
		
		t1 = new JTextField();
		t1.setBounds(560,150,110,30);
		add(t1);
		
		

		
		
		JLabel price = new JLabel("Price");
		price.setFont(new Font("Tohoma",Font.BOLD,14));
		price.setBounds(420,200,120,30);
		add(price);
		
		t2 = new JTextField();
		t2.setBounds(560,200,110,30);
		add(t2);
		
		
		
		b1  = new JButton("Add Rooms");
		b1.setBounds(423,300,100,30);
		b1.addActionListener(this);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		add(b1);
		
		
		b2  = new JButton("Cancel");
		b2.setBounds(565,300,100,30);
		b2.addActionListener(this);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		add(b2);
		
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/room.jpg"));
		JLabel l2 = new JLabel(i1);
		l2.setBounds(0,0,750,500);
		add(l2);
		
		
		getContentPane().setBackground(Color.white);
		
		setLayout(null);
		setTitle("Add rooms");
		setLocation(250, 130);
		setVisible(true);
	}
	
	
	
	public void actionPerformed(ActionEvent ae) {
		
		
		if(ae.getSource()==b1) {
			String roomnumber=t1.getText();
			String price=t2.getText();
			
			
			try {
				conn c=new conn();
			String query="insert into addroom values('"+roomnumber+"','"+price+"')";
			c.s.executeUpdate(query); 
			System.out.println(query);
			ResultSet rs1=c.s.executeQuery("select * from addroom");
			System.out.println("Total Reserved rooms");
			while(rs1.next())  
            System.out.println("Room no: "+rs1.getString(1)+"  Room price:"+rs1.getString(2)+"  ");
			JOptionPane.showMessageDialog(null,"Room is Added.");
			this.setVisible(false);	
				
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}else if(ae.getSource()==b2) {
			this.setVisible(false);
		}
		
		
	}
	

	public static void main(String[] args) {
		
		new AddRooms();
		
	}

}
