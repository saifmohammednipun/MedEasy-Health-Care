import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoctorWindow extends JFrame implements ActionListener{
    private JLabel label1;
    private JLabel label2 = new JLabel("Text2");
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton button1,button2,button3, button4;

    private ImageIcon imageIcon1;
    public DoctorWindow(){
        super("Doctor Window");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);
        setResizable(false);

        imageIcon1 = new ImageIcon("DoctorWindow.jpg");
        label1 = new JLabel(imageIcon1);
        label1.setBounds(0, 0, 600, 400);

        label2.setText("DOCTOR DASHBOARD");
        Font font1 = new Font("Times New Roman", Font.BOLD, 25);
        label2.setFont(font1);
        label2.setBounds(180, 0, 400, 80);
        label2.setForeground(Color.BLUE);
        label2.setBackground(Color.WHITE);

        button1 = new JButton("Doctor Details");
        button1.setBounds(50, 100, 200, 50);
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLUE);
        button1.setOpaque(true);
        button1.setBorderPainted(false);

        button2 = new JButton("Patient Details");
        button2.setBounds(50, 200, 200, 50);
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLUE);
        button2.setOpaque(true);
        button2.setBorderPainted(false);

        button3 = new JButton("Appintment Details");
        button3.setBounds(50, 300, 200, 50);
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLUE);
        button3.setOpaque(true);
        button3.setBorderPainted(false);

        button4 = new JButton("Back");
        button4.setBounds(450, 350, 80, 20);

        add(label2);
        add(label1);
        pack();

        label1.add(button1);
        label1.add(button2);
        label1.add(button3);
        label1.add(button4);


        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            setVisible(false);
          DoctorDetails doctorDetails = new DoctorDetails();
          doctorDetails.setVisible(true);
        }
        if(e.getSource() == button2){
            setVisible(false);
            PatientDetails patientDetails = new PatientDetails();
            patientDetails.setVisible(true);
        }
        if(e.getSource() == button3){
            setVisible(false);
            AppointmentDetails appointmentDetails = new AppointmentDetails();
            appointmentDetails.setVisible(true);

        }
        if(e.getSource() == button4){
            setVisible(false);
           DoctorLogin doctorLogin = new DoctorLogin();
           doctorLogin.setVisible(true);
        }
    }
}
