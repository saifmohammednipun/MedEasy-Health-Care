
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;


public class AdminRegister extends JFrame implements ActionListener {
    private JLabel label1, label2, label3, label4, label5, label6;
    private JTextField textField1, textField2, textField3, textField4, textField5;
    private JPasswordField passwordField1;
    private JButton button1, button2;

    public AdminRegister() {
        super("Register As Admin");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 600, 400);
        setLayout(null);
        getContentPane().setBackground(Color.CYAN);
        setLocationRelativeTo(null);
        setResizable(false);

        label1 = new JLabel("First Name: ");
        label1.setBounds(170, 25, 100, 20);

        label2 = new JLabel("Last Name: ");
        label2.setBounds(170, 75, 100, 20);

        label3 = new JLabel("Employee ID: ");
        label3.setBounds(170, 125, 100, 20);

        label4 = new JLabel("Email: ");
        label4.setBounds(170, 175, 100, 20);

        label5 = new JLabel("Enter Password: ");
        label5.setBounds(170, 225, 120, 20);

        label6 = new JLabel("Confirm Password: ");
        label6.setBounds(170, 275, 125, 20);


        textField1 = new JTextField();
        textField1.setBounds(300, 25, 120, 20);

        textField2 = new JTextField();
        textField2.setBounds(300, 75, 120, 20);

        textField3 = new JTextField();
        textField3.setBounds(300, 125, 120, 20);

        textField4 = new JTextField();
        textField4.setBounds(300, 175, 120, 20);

        textField5 = new JTextField();
        textField5.setBounds(300, 225, 120, 20);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(300, 275, 120, 20);

        button1 = new JButton("Back");
        button1.setBounds(150, 325, 100, 20);

        button2 = new JButton("Register");
        button2.setBounds(350, 325, 100, 20);


        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);
        add(textField1);
        add(textField2);
        add(textField3);
        add(textField4);
        add(textField5);
        add(passwordField1);
        add(button1);
        add(button2);

        button1.addActionListener(this);
        button2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            setVisible(false);
            AdminLogin adminLogin = new AdminLogin();
            adminLogin.setVisible(true);
        }
        if (e.getSource() == button2) {
            String FirstName = textField1.getText();
            String LastName = textField2.getText();
            String EmployeeID = textField3.getText();
            String Email = textField4.getText();
            String EnterPassword = textField5.getText();
            String ConfirmPassword = passwordField1.getText();


            try{
                FileWriter adminWrite = new FileWriter("AdminRegistration.txt",true);
                adminWrite.write(""+FirstName+" "+LastName+" "+EmployeeID+" "+Email+" "+EnterPassword+" "+ConfirmPassword);
                adminWrite.write(System.getProperty("line.separator"));
                adminWrite.close();
                JOptionPane.showMessageDialog(null,"Admin Registered Successfully.");
                setVisible(true);


            }catch(IOException ae){
              JOptionPane.showMessageDialog(null,"Error");
            }

            setVisible(false);
            AdminOperations adminOperations = new AdminOperations();
            adminOperations.setVisible(true);
        }
    }
}