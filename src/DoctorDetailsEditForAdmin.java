import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class DoctorDetailsEditForAdmin extends JFrame {
    private JLabel label1, label2,label3,label4,label5,label6;
    private JTextField textField1, textField2, textField3, textField4, textField5;
    private JPasswordField passwordField1;
    private JButton button1,button2,button3;
    private JTable table1;
    public DoctorDetailsEditForAdmin(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 600, 600);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.CYAN);
        setResizable(false);

        label1 = new JLabel("Edit Doctor Details");
        Font font1 = new Font("Times New Roman", Font.BOLD, 25);
        label1.setFont(font1);
        label1.setBounds(180, 0, 400, 80);
        label1.setForeground(Color.BLUE);
        label1.setBackground(Color.WHITE);

        label2 = new JLabel("First Name: ");
        label2.setBounds(50, 80, 100, 20);

        label3 = new JLabel("Last Name: ");
        label3.setBounds(50, 130, 100, 20);

        label4 = new JLabel("Employee ID: ");
        label4.setBounds(50, 180, 100, 20);

        label5 = new JLabel("Email: ");
        label5.setBounds(50, 230, 100, 20);


        textField1 = new JTextField();
        textField1.setBounds(150, 80, 150, 20);

        textField2 = new JTextField();
        textField2.setBounds(150, 130, 150, 20);

        textField3 = new JTextField();
        textField3.setBounds(150, 180, 150, 20);

        textField4 = new JTextField();
        textField4.setBounds(150, 230, 150, 20);



        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);

        add(textField1);
        add(textField2);
        add(textField3);
        add(textField4);



    }
}
