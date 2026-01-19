package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {

    JButton b1, b2;
    JPasswordField p1, p2;
    String pin;
    Pin(String pin) {

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0, 0, 1550, 830);
        add(img);

        JLabel l1 = new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setForeground(Color.white);
        l1.setBounds(430, 180, 400, 35);
        img.add(l1);

        JLabel l2 = new JLabel("NEW PIN :");
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setForeground(Color.white);
        l2.setBounds(430, 220, 150, 35);
        img.add(l2);

        p1 = new JPasswordField();
        p1.setBounds(600, 220, 180, 25);
        p1.setFont(new Font("Ralway", Font.BOLD, 22));
        p1.setForeground(Color.white);
        p1.setBackground(new Color(65, 125, 128));
        img.add(p1);

        JLabel l3 = new JLabel("RE-ENTER NEW PIN :");
        l3.setFont(new Font("System", Font.BOLD, 16));
        l3.setForeground(Color.white);
        l3.setBounds(430, 255, 400, 35);
        img.add(l3);

        p2 = new JPasswordField();
        p2.setBounds(600, 255, 180, 25);
        p2.setFont(new Font("Ralway", Font.BOLD, 22));
        p2.setForeground(Color.white);
        p2.setBackground(new Color(65, 125, 128));
        img.add(p2);

        b1 = new JButton("CHANGE");
        b1.setBounds(700, 362, 150, 35);
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        img.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700, 406, 150, 35);
        b2.setBackground(new Color(65, 125, 128));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        img.add(b2);

        setSize(1550, 1080);
        setLocation(0, 0);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if (!pin1.equals(pin2)) {
                JOptionPane.showMessageDialog(null, "Entered PIN Does not Match");
                return;
            }

            if (e.getSource()==b1) {
                if (p1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                    return;
                }
                if (p2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Re-Enter New PIN");
                    return;
                }

                Conn c = new Conn();
                String q1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3 = "update signupthree set pin = '"+pin1+"' where pin = '"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN changed Successfully");
                setVisible(false);
                new main_Class(pin);

            } else if (e.getSource()==b2) {
                new main_Class(pin);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Pin("");
    }
}
