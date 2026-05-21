package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JTextField textname, textname2, textname3, textname4, textname5, textname6, textname7;
    JDateChooser dateChooser;
    JRadioButton radioButton1, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6;
    JButton next;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) +1000L;
    String first = " " + Math.abs(first4);
    Signup() {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(25, 10, 100, 100);
        add(img);

        JLabel label1 = new JLabel("APPLICATION FORM NO."+ first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Ralway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Ralway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        JLabel labelname = new JLabel("Name :");
        labelname.setFont(new Font("Ralway", Font.BOLD, 20));
        labelname.setBounds(100, 190, 100, 30);
        add(labelname);

        textname = new JTextField();
        textname.setFont(new Font("Ralway", Font.BOLD, 14));
        textname.setBounds(300, 190, 400, 30);
        add(textname);

        JLabel labelname2 = new JLabel("Father's Name :");
        labelname2.setFont(new Font("Ralway", Font.BOLD, 20));
        labelname2.setBounds(100, 240, 200, 30);
        add(labelname2);

        textname2 = new JTextField();
        textname2.setFont(new Font("Ralway", Font.BOLD, 14));
        textname2.setBounds(300, 240, 400, 30);
        add(textname2);

        JLabel labelname3 = new JLabel("Date of Birth :");
        labelname3.setFont(new Font("Ralway", Font.BOLD, 20));
        labelname3.setBounds(100, 340, 200, 30);
        add(labelname3);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);

        JLabel labelname4 = new JLabel("Gender :");
        labelname4.setFont(new Font("Ralway", Font.BOLD, 20));
        labelname4.setBounds(100, 290, 200, 30);
        add(labelname4);

        radioButton1 = new JRadioButton("Male");
        radioButton1.setFont(new Font("Ralway", Font.BOLD, 14));
        radioButton1.setBounds(320, 290, 60, 30);
        radioButton1.setBackground(new Color(222, 255, 228));
        add(radioButton1);

        radioButton2 = new JRadioButton("Female");
        radioButton2.setFont(new Font("Ralway", Font.BOLD, 14));
        radioButton2.setBounds(450, 290, 90, 30);
        radioButton2.setBackground(new Color(222, 255, 228));
        add(radioButton2);

        radioButton3 = new JRadioButton("Other");
        radioButton3.setFont(new Font("Ralway", Font.BOLD, 14));
        radioButton3.setBounds(600, 290, 90, 30);
        radioButton3.setBackground(new Color(222, 255, 228));
        add(radioButton3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);
        buttonGroup1.add(radioButton3);

        JLabel labelname5 = new JLabel("Email address: ");
        labelname5.setFont(new Font("Ralway", Font.BOLD, 20));
        labelname5.setBounds(100, 390, 200, 30);
        add(labelname5);

        textname3 = new JTextField();
        textname3.setFont(new Font("Ralway", Font.BOLD, 14));
        textname3.setBounds(300, 390, 400, 30);
        add(textname3);

        JLabel labelname6 = new JLabel("Marital Status :");
        labelname6.setFont(new Font("Ralway", Font.BOLD, 20));
        labelname6.setBounds(100, 440, 200, 30);
        add(labelname6);

        radioButton4 = new JRadioButton("Married");
        radioButton4.setFont(new Font("Ralway", Font.BOLD, 14));
        radioButton4.setBounds(320, 440, 90, 30);
        radioButton4.setBackground(new Color(222, 255, 228));
        add(radioButton4);

        radioButton5 = new JRadioButton("UnMarried");
        radioButton5.setFont(new Font("Ralway", Font.BOLD, 14));
        radioButton5.setBounds(450, 440, 120, 30);
        radioButton5.setBackground(new Color(222, 255, 228));
        add(radioButton5);

        radioButton6 = new JRadioButton("Other");
        radioButton6.setFont(new Font("Ralway", Font.BOLD, 14));
        radioButton6.setBounds(600, 440, 90, 30);
        radioButton6.setBackground(new Color(222, 255, 228));
        add(radioButton6);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(radioButton4);
        buttonGroup2.add(radioButton5);
        buttonGroup2.add(radioButton6);

        JLabel labelname7 = new JLabel("Address :");
        labelname7.setFont(new Font("Ralway", Font.BOLD, 20));
        labelname7.setBounds(100, 490, 200, 30);
        add(labelname7);

        textname4 = new JTextField();
        textname4.setFont(new Font("Ralway", Font.BOLD, 14));
        textname4.setBounds(300, 490, 400, 30);
        add(textname4);

        JLabel labelname8 = new JLabel("City :");
        labelname8.setFont(new Font("Ralway", Font.BOLD, 20));
        labelname8.setBounds(100, 540, 200, 30);
        add(labelname8);

        textname5 = new JTextField();
        textname5.setFont(new Font("Ralway", Font.BOLD, 14));
        textname5.setBounds(300, 540, 400, 30);
        add(textname5);

        JLabel labelname9 = new JLabel("State :");
        labelname9.setFont(new Font("Ralway", Font.BOLD, 20));
        labelname9.setBounds(100, 590, 200, 30);
        add(labelname9);

        textname6 = new JTextField();
        textname6.setFont(new Font("Ralway", Font.BOLD, 14));
        textname6.setBounds(300, 590, 400, 30);
        add(textname6);

        JLabel labelname10 = new JLabel("Pin Code :");
        labelname10.setFont(new Font("Ralway", Font.BOLD, 20));
        labelname10.setBounds(100, 640, 200, 30);
        add(labelname10);

        textname7 = new JTextField();
        textname7.setFont(new Font("Ralway", Font.BOLD, 14));
        textname7.setBounds(300, 640, 400, 30);
        add(textname7);

        next = new JButton("Next");
        next.setFont(new Font("Ralway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(620, 710, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 255, 228));
        setSize(800, 800);
        setLocation(360, 40);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textname.getText();
        String fname= textname2.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(radioButton1.isSelected()) {
            gender = "Male";
        }else if (radioButton2.isSelected()){
            gender = "Female";
        }else if (radioButton3.isSelected()) {
            gender = "Other";
        }
        String email = textname3.getText();
        String marital = null;
        if(radioButton4.isSelected()) {
            marital = "Married";
        } else if (radioButton5.isSelected()) {
            marital = "UnMarried";
        } else if (radioButton6.isSelected()) {
            marital = "Other";
        }
        String address = textname4.getText();
        String city = textname5.getText();
        String state = textname6.getText();
        String pincode = textname7.getText();

        try {
            if (textname.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Fill all the Fields");
            } else {
                Conn conn1 = new Conn();
                String q = "Insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
                conn1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }
        }catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}

