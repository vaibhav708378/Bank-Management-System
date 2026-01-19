package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {

    JLabel l1, l2;
    JButton b1;

    String pin;
    BalanceEnquiry(String pin) {
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0, 0, 1550, 830);
        add(img);

        l1 = new JLabel("MAXIMUM WITHDRAWAL IS 10000");
        l1.setFont(new Font("Sytem", Font.BOLD, 16));
        l1.setForeground(Color.white);
        l1.setBounds(430, 180, 700, 35);
        img.add(l1);

        l2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        l2.setFont(new Font("Sytem", Font.BOLD, 16));
        l2.setForeground(Color.white);
        l2.setBounds(430, 220, 400, 35);
        img.add(l2);

        b1 = new JButton("BACK");
        b1.setBounds(700, 406, 150, 35);
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        img.add(b1);

        int balance = 0;
        try{
            Conn con = new Conn();
            ResultSet resultSet = con.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while (resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        l2.setText(""+balance);

        setSize(1550, 1080);
        setLocation(0, 0);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_Class(pin);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
