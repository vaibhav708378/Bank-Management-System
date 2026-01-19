package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAddhar;
    JRadioButton r1, r2, e1, e2;
    JButton next;

    String formno;
    Signup2(String formno) {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(150, 5, 100, 100);
        add(img);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2 :- ");
        l1.setFont(new Font("Ralway", Font.BOLD, 22));
        l1.setBounds(300, 30, 600, 40);
        add(l1);

        JLabel l2 = new JLabel("Additional DeTails");
        l2.setFont(new Font("Ralway", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Ralway", Font.BOLD, 18));
        l3.setBounds(100, 120, 100, 30);
        add(l3);

        String religion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252, 208, 76));
        comboBox.setFont(new Font("Ralway", Font.BOLD, 14));
        comboBox.setBounds(350, 120, 320, 30);
        add(comboBox);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Ralway", Font.BOLD, 18));
        l4.setBounds(100, 170, 100, 30);
        add(l4);

        String Category[] = {"OPEN", "OBC", "SC", "ST", "OTHER"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(252, 208, 76));
        comboBox2.setFont(new Font("Ralway", Font.BOLD, 14));
        comboBox2.setBounds(350, 170, 320, 30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Ralway", Font.BOLD, 18));
        l5.setBounds(100, 220, 100, 30);
        add(l5);

        String income[] = {"0 to 50000", "50000 to 150000", "150000 to 250000", "250000 to 400000", "400000 to above"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252, 208, 76));
        comboBox3.setFont(new Font("Ralway", Font.BOLD, 14));
        comboBox3.setBounds(350, 220, 320, 30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational :");
        l6.setFont(new Font("Ralway", Font.BOLD, 18));
        l6.setBounds(100, 270, 120, 30);
        add(l6);

        String education[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Law","Other"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(new Color(252, 208, 76));
        comboBox4.setFont(new Font("Ralway", Font.BOLD, 14));
        comboBox4.setBounds(350, 270, 320, 30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Ralway", Font.BOLD, 18));
        l7.setBounds(100, 320, 120, 30);
        add(l7);

        String occupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(252, 208, 76));
        comboBox5.setFont(new Font("Ralway", Font.BOLD, 14));
        comboBox5.setBounds(350, 320, 320, 30);
        add(comboBox5);

        JLabel l8 = new JLabel("Pan Number :");
        l8.setFont(new Font("Ralway", Font.BOLD, 18));
        l8.setBounds(100, 370, 180, 30);
        add(l8);

        textPan = new JTextField();
        textPan.setBounds(350, 370, 320, 30);
        add(textPan);

        JLabel l9 = new JLabel("Addhar Number :");
        l9.setFont(new Font("Ralway", Font.BOLD, 18));
        l9.setBounds(100, 420, 180, 30);
        add(l9);

        textAddhar = new JTextField();
        textAddhar.setBounds(350, 420, 320, 30);
        add(textAddhar);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Ralway", Font.BOLD, 18));
        l10.setBounds(100, 470, 180, 30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setBackground(new Color(252, 208, 76));
        r1.setFont(new Font("Ralway", Font.BOLD, 14));
        r1.setBounds(350, 470, 100, 30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setBackground(new Color(252, 208, 76));
        r2.setFont(new Font("Ralway", Font.BOLD, 14));
        r2.setBounds(460, 470, 100, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Ralway", Font.BOLD, 18));
        l11.setBounds(100, 520, 180, 30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setBackground(new Color(252, 208, 76));
        e1.setFont(new Font("Ralway", Font.BOLD, 14));
        e1.setBounds(350, 520, 100, 30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setBackground(new Color(252, 208, 76));
        e2.setFont(new Font("Ralway", Font.BOLD, 14));
        e2.setBounds(460, 520, 100, 30);
        add(e2);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(e1);
        buttonGroup2.add(e2);

        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Ralway", Font.BOLD, 14));
        l12.setBounds(700, 10, 100, 30);
        add(l12);

        JLabel l13 = new JLabel(this.formno);
        l13.setFont(new Font("Ralway", Font.BOLD, 12));
        l13.setBounds(760, 10, 60, 30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Ralway", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570, 590, 100, 30);
        next.addActionListener(this);
        add(next);

        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(252, 208, 76));
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String addhar = textAddhar.getText();

        String s_citizen = " ";
        if (r1.isSelected()) {
            s_citizen = "Yes";
        } else {
            s_citizen = "No";
        }
        String e_account = " ";
        if (r1.isSelected()) {
            e_account = "Yes";
        } else {
            e_account = "No";
        }

        try {
            if (textPan.getText().equals(" ") || textAddhar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the Fields");
            } else {
                Conn c1 = new Conn();
                String q = "insert into Signuptwo values('"+formno+"','"+rel+"','"+cate+"', '"+inc+"','"+edu+"', '"+occ+"', '"+pan+"', '"+addhar+"', '"+s_citizen+"', '"+e_account+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
