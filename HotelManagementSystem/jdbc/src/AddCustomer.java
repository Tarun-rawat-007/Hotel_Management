
import java.awt.Font;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class AddCustomer extends JFrame implements ActionListener {

	JTextField t1, t2, t3, t4, t5;
	JButton b1, b2;
	Choice c2;
	JComboBox<String> c1;
	JRadioButton r1, r2;

	AddCustomer() {
		setBounds(400, 200, 700, 500);

		JLabel l1 = new JLabel("NEW CUSTOMER FORM");
		l1.setBounds(100, 20, 300, 30);
		l1.setForeground(Color.blue);
		l1.setFont(new Font("Tohoma", Font.BOLD, 20));
		add(l1);

		JLabel l3 = new JLabel("Number");
		l3.setBounds(30, 100, 100, 30);
		add(l3);

		t1 = new JTextField();
		t1.setBounds(200, 100, 150, 30);
		add(t1);

		JLabel l4 = new JLabel("Name");
		l4.setBounds(30, 140, 100, 30);
		add(l4);

		t2 = new JTextField();
		t2.setBounds(200, 140, 150, 30);
		add(t2);

		JLabel l6 = new JLabel("Country");
		l6.setBounds(30, 180, 100, 30);
		add(l6);

		t3 = new JTextField();
		t3.setBounds(200, 180, 150, 30);
		add(t3);

		b1 = new JButton("Add Customer");
		b1.setForeground(Color.white);
		b1.setBackground(Color.black);
		b1.setBounds(30, 250, 130, 30);
		b1.addActionListener(this);
		add(b1);

		b2 = new JButton("Cancel");
		b2.setForeground(Color.white);
		b2.setBackground(Color.black);
		b2.setBounds(210, 250, 130, 30);
		b2.addActionListener(this);
		add(b2);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/customer.png"));
		Image i2 = i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel li = new JLabel(i3);
		li.setBounds(330, 30, 400, 400);
		add(li);

		getContentPane().setBackground(Color.white);
		setLocation(300, 100);
		setTitle("Add new  customer form");
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == b1) {

			String number = t1.getText();
			String name = t2.getText();
			String country = t3.getText();

			try {
				conn c = new conn();
				String query = "insert into  addcustomer values('" + number + "','" + name + "','" + country + "')";
				c.s.executeUpdate(query);
				System.out.println(query);
				JOptionPane.showMessageDialog(null, "Coustomer is Added.");
				this.setVisible(false);

			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (ae.getSource() == b2) {
			new Reception().setVisible(true);
			this.setVisible(false);
		}

	}

	public static void main(String[] args) {

		new AddCustomer();

	}

}
