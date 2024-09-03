package bank.management.system;

import com.toedter.calendar.JDateChooser;

//import bank.management.Signup2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JButton buttonNext;
    JRadioButton r1, r2, r3, r4, r5;
    JTextField textName, textfName, textEmail, textMS, textAD, textCity, textPC, textState;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first;

    Signup() {
        super("APPLICATION FORM");

        first = " " + Math.abs(first4);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(400, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(350, 110, 600, 30);
        add(label3);

        // name
        JLabel labelname = new JLabel("Name :");
        labelname.setFont(new Font("Raleway", Font.BOLD, 22));
        labelname.setBounds(100, 170, 200, 30);
        add(labelname);

        textName = new JTextField();
        textName.setBounds(300, 170, 400, 30);
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textName);

        // father name
        JLabel labelfname = new JLabel("Father's Name :");
        labelfname.setFont(new Font("Raleway", Font.BOLD, 22));
        labelfname.setBounds(100, 220, 200, 30);
        add(labelfname);

        textfName = new JTextField();
        textfName.setBounds(300, 220, 400, 30);
        textfName.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textfName);

        // date of birth
        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway", Font.BOLD, 22));
        DOB.setBounds(100, 340, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);

        // Gender

        JLabel lableG = new JLabel("Gender :");
        lableG.setFont(new Font("Raleway", Font.BOLD, 20));
        lableG.setBounds(100, 290, 200, 30);
        add(lableG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(300, 290, 80, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(222, 255, 228));
        r2.setBounds(400, 290, 100, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        // Email Address

        JLabel lableEmail = new JLabel("Email Id :");
        lableEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        lableEmail.setBounds(100, 390, 200, 30);
        add(lableEmail);

        textEmail = new JTextField();
        textEmail.setBounds(300, 390, 400, 30);
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textEmail);

        // Married status

        JLabel lableMS = new JLabel("Married Status :");
        lableMS.setFont(new Font("Raleway", Font.BOLD, 20));
        lableMS.setBounds(100, 440, 200, 30);
        add(lableMS);

        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(new Color(222, 255, 228));
        r3.setBounds(300, 440, 80, 30);
        add(r3);

        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(new Color(222, 255, 228));
        r4.setBounds(450, 440, 100, 30);
        add(r4);

        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(new Color(222, 255, 228));
        r5.setBounds(600, 440, 100, 30);
        add(r5);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);
        buttonGroup1.add(r5);

        // Address

        JLabel lableAD = new JLabel("Address :");
        lableAD.setFont(new Font("Raleway", Font.BOLD, 20));
        lableAD.setBounds(100, 490, 200, 30);
        add(lableAD);

        textAD = new JTextField();
        textAD.setBounds(300, 490, 400, 30);
        textAD.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textAD);

        // city

        JLabel lableCity = new JLabel("City :");
        lableCity.setFont(new Font("Raleway", Font.BOLD, 20));
        lableCity.setBounds(100, 540, 200, 30);
        add(lableCity);

        textCity = new JTextField();
        textCity.setBounds(300, 540, 400, 30);
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textCity);

        // Pincode

        JLabel lablePC = new JLabel("Pincode :");
        lablePC.setFont(new Font("Raleway", Font.BOLD, 20));
        lablePC.setBounds(100, 590, 200, 30);
        add(lablePC);

        textPC = new JTextField();
        textPC.setBounds(300, 590, 400, 30);
        textPC.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textPC);

        // State

        JLabel lableState = new JLabel("State :");
        lableState.setFont(new Font("Raleway", Font.BOLD, 20));
        lableState.setBounds(100, 640, 200, 30);
        add(lableState);

        textState = new JTextField();
        textState.setBounds(300, 640, 400, 30);
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textState);

        buttonNext = new JButton("Next");
        buttonNext.setFont(new Font("Raleway", Font.BOLD, 14));
        buttonNext.setBounds(620, 710, 80, 30);
        buttonNext.setBackground(Color.BLACK);
        buttonNext.setForeground(Color.WHITE);
        buttonNext.addActionListener(this);
        add(buttonNext);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textfName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";

        } else if (r2.isSelected()) {
            gender = "female";
        }

        String email = textEmail.getText();
        String marital = null;
        if (r3.isSelected()) {
            marital = "Married";
        } else if (r4.isSelected()) {
            marital = "Unmarried";
        } else if (r5.isSelected()) {
            marital = "Other";
        }

        String address = textAD.getText();
        String city = textCity.getText();
        String pincode = textPC.getText();
        String state = textState.getText();

        try {

            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                Conn con1 = new Conn();
                String q = "insert into signup values('" + formno + "', '" + name + "', '" + fname + "', '" + dob
                        + "', '" + gender + "', '" + email + "', '" + marital + "','" + address + "', '" + city + "', '"
                        + pincode + "', '" + state + "')";
                con1.statement.executeUpdate(q);

                new Signup2(first);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();
    }
}
