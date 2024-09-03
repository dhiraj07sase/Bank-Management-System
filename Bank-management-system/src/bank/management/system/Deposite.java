package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.Date;
import java.util.Date;

import javax.swing.*;

public class Deposite extends JFrame implements ActionListener {
    String pin;
    JTextField textField;
    JButton b1, b2;

    Deposite(String pin) {

        this.pin = pin;

        // Atm Image

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);

        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        add(l3);

        // Amount

        JLabel l1 = new JLabel("Enter amount you want to Deposite");
        l1.setBounds(460, 180, 400, 35);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setForeground(Color.WHITE);
        l3.add(l1);

        textField = new JTextField();
        textField.setBounds(460, 230, 320, 25);
        textField.setBackground(new Color(65, 125, 128));
        textField.setForeground(Color.WHITE);
        textField.setFont(new Font("System", Font.BOLD, 22));
        l3.add(textField);

        b1 = new JButton("Deposite");
        b1.setBounds(409, 362, 150, 35);
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(700, 362, 150, 35);
        b2.setBackground(new Color(65, 125, 128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {

            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource() == b1) {
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "please enter the amount you want to Deposite ");
                } 
                else {
                    Conn c1 = new Conn();
                    c1.statement.executeUpdate(
                            "insert into bank values ('" + pin + "', '" + date + "', 'Deposite','" + amount + "')");

                    JOptionPane.showMessageDialog(null, "RS." + amount + " Deposite SuccessFull");
                    setVisible(false);
                }

            } else if (e.getSource() == b2) {
                setVisible(false);

            }

        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {

        new Deposite("");
    }
}
