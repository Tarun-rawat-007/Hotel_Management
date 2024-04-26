import java.awt.*;
import javax.swing.*;

public class about extends JFrame {
    about() {
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/b2.png")); // ADD IMG
        Image i2 = i.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT); // image scalle
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3); // set image in jalbel
        image.setBounds(400, 20, 400, 200);
        add(image);

        JLabel heading = new JLabel("<html>Hotel <br/>Management System</html>");
        heading.setBounds(70, 20, 400, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);

        JLabel sub = new JLabel("Developed by:");
        sub.setBounds(70, 200, 400, 50);
        sub.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(sub);

        JLabel name = new JLabel("<html>Tarun Rawat-1000019128 <br/>Sahil Kumar -1000019173<br/>Gaurav -1000019035</html>");
        name.setBounds(100, 250, 400, 100);
        name.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(name);

        setSize(900, 500);
        setLocation(200, 100);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setTitle("About");
        setVisible(true);

    }

    public static void main(String[] args) {
        new about();
    }

}
