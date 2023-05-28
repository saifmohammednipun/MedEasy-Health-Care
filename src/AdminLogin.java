
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class AdminLogin extends JFrame implements ActionListener {
    private JLabel label1, label2;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton button1,button2;

    public AdminLogin(){

        super("Admin Login");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 600, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.CYAN);
        setResizable(false);

        label1 = new JLabel("Admin ID: ");
        label1.setBounds(170, 110,100,20);
        label1.setBackground(Color.BLUE);

        label2 = new JLabel("Password: ");
        label2.setBounds(170, 150,100,20);
        label2.setBackground(Color.RED);

        textField1 = new JTextField();
        textField1.setBounds(270,110,120,20);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(270,150,120,20);

        button1 = new JButton("Login");
        button1.setBounds(325,220,100,20);

        button2 = new JButton("Back");
        button2.setBounds(150,220,100,20);


        add(label1);
        add(label2);
        add(textField1);
        add(passwordField1);
        add(button1);
        add(button2);

        button1.addActionListener(this);
        button2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            String getAdminID = textField1.getText();
            String getAdminPassword = passwordField1.getText();
            String password = "admin";

            if(password.equals(getAdminPassword)) {
                JOptionPane.showMessageDialog(null, "Admin Login Successful.");
                setVisible(true);
                setVisible(false);
                AdminOperations adminOperations = new AdminOperations();
                adminOperations.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Entered Wrong Password");
                setVisible(true);
            }
        }
        if(e.getSource() == button2){
            setVisible(false);
            HomePage home = new HomePage();
            home.setVisible(true);
        }
    }
}