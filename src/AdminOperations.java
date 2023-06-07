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

public class AdminOperations extends JFrame implements ActionListener{
    private JLabel label1;
    private JLabel label2 = new JLabel("Text2");
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton button1,button2,button3, button4, button5, button6,button7;

    private ImageIcon imageIcon1;
    public AdminOperations(){
        super("Admin Window");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);
        setResizable(false);

        imageIcon1 = new ImageIcon("AdminWindow.jpg");
        label1 = new JLabel(imageIcon1);
        label1.setBounds(0, 0, 600, 400);

        label2.setText("ADMIN DASHBOARD");
        Font font1 = new Font("Times New Roman", Font.BOLD, 25);
        label2.setFont(font1);
        label2.setBounds(180, 0, 400, 80);
        label2.setForeground(Color.BLUE);
        label2.setBackground(Color.WHITE);

        button1 = new JButton("Staff Management");
        button1.setBounds(50, 100, 200, 50);
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLUE);
        button1.setOpaque(true);
        button1.setBorderPainted(false);

        button2 = new JButton("Doctor Management");
        button2.setBounds(50, 200, 200, 50);
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLUE);
        button2.setOpaque(true);
        button2.setBorderPainted(false);

        button3 = new JButton("Patient Management");
        button3.setBounds(50, 300, 200, 50);
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLUE);
        button3.setOpaque(true);
        button3.setBorderPainted(false);


        button4 = new JButton("Receptionist Management");
        button4.setBounds(300, 100, 200, 50);
        button4.setForeground(Color.WHITE);
        button4.setBackground(Color.BLUE);
        button4.setOpaque(true);
        button4.setBorderPainted(false);


        button5 = new JButton("Pharmacist Management");
        button5.setBounds(300, 300, 200, 50);
        button5.setForeground(Color.WHITE);
        button5.setBackground(Color.BLUE);
        button5.setOpaque(true);
        button5.setBorderPainted(false);


        button7 = new JButton("Doctor Appointment");
        button7.setBounds(300, 200, 200, 50);
        button7.setForeground(Color.WHITE);
        button7.setBackground(Color.BLUE);
        button7.setOpaque(true);
        button7.setBorderPainted(false);

        button6 = new JButton("Back");
        button6.setBounds(450, 360, 80, 20);

        add(label2);
        add(label1);
        pack();

        label1.add(button1);
        label1.add(button2);
        label1.add(button3);
        label1.add(button4);
        label1.add(button5);
        label1.add(button6);
        label1.add(button7);


        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            setVisible(false);
           StaffDetailsEditForAdmin staffDetailsEditForAdmin = new StaffDetailsEditForAdmin();
           staffDetailsEditForAdmin.setVisible(true);
        }
        if(e.getSource() == button2){
            setVisible(false);
           DoctorDetailsEditForAdmin doctorDetailsEditForAdmin = new DoctorDetailsEditForAdmin();
           doctorDetailsEditForAdmin.setVisible(true);
        }
        if(e.getSource() == button3){
            setVisible(false);
           PatientDetailsEditForAdmin patientDetailsEditForAdmin = new PatientDetailsEditForAdmin();
           patientDetailsEditForAdmin.setVisible(true);
        }

        if(e.getSource() == button4){
            setVisible(false);
           ReceptionistDetailsEditForAdmin  receptionistDetailsEditForAdmin = new ReceptionistDetailsEditForAdmin();
           receptionistDetailsEditForAdmin.setVisible(true);
        }

        if(e.getSource() == button5){
            setVisible(false);
            PharmacistDetailsEditForAdmin pharmacistDetailsEditForAdmin = new PharmacistDetailsEditForAdmin();
            pharmacistDetailsEditForAdmin.setVisible(true);
        }

        if(e.getSource() == button6){
            setVisible(false);
            AdminLogin adminLogin = new AdminLogin();
            adminLogin.setVisible(true);
        }
        if(e.getSource() == button7){
            setVisible(false);
            BookDoctorsAppointment bookDoctorsAppointment = new BookDoctorsAppointment();
            bookDoctorsAppointment.setVisible(true);
        }

    }
}
