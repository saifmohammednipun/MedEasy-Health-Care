import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HomePage extends JFrame implements ActionListener {
    private JLabel label1 = new JLabel("Text1");
    private JLabel label2 = new JLabel("Text2");
    private JLabel label3;
    private ImageIcon image1;
    private JButton button1, button2, button3;

    public HomePage() {
        super("Hospital Management System");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 638, 400);
        setLocationRelativeTo(null);
        setResizable(false);

        label1.setText("MedEasy HEALTH CARE");
        Font font1 = new Font("Times New Roman", Font.BOLD, 25);
        label1.setFont(font1);
        label1.setBounds(180, 100, 800, 100);
        label1.setForeground(Color.BLUE);
        label1.setBackground(Color.WHITE);

        label2.setText("Advancing Health. Transforming Lives.");
        Font font2 = new Font("Arial", Font.ITALIC, 15);
        label2.setFont(font2);
        label2.setBounds(210, 150, 300, 50);

        image1 = new ImageIcon("HospitalWindow.jpeg");
        label3 = new JLabel(image1);
        label3.setBounds(0, 0, 638, 400);

        button1 = new JButton("Admin");
        button1.setBounds(50, 250, 150, 50);
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLUE);
        button1.setOpaque(true);
        button1.setBorderPainted(false);

        button2 = new JButton("Doctor");
        button2.setBounds(250, 250, 150, 50);
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLUE);
        button2.setOpaque(true);
        button2.setBorderPainted(false);

        button3 = new JButton("Pharmacist");
        button3.setBounds(450, 250, 150, 50);
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLUE);
        button3.setOpaque(true);
        button3.setBorderPainted(false);

        add(label1);
        add(label2);
        add(label3);
        pack();

        label3.add(button1);
        label3.add(button2);
        label3.add(button3);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            setVisible(false);
            AdminLogin adminLogin = new AdminLogin();
            adminLogin.setVisible(true);
        }
        if(e.getSource() == button2){
            setVisible(false);
            DoctorLogin doctorLogin = new DoctorLogin();
            doctorLogin.setVisible(true);
        }
        if(e.getSource() == button3){
            setVisible(false);
            PharmacistLogin pharmacistLogin = new PharmacistLogin();
            pharmacistLogin.setVisible(true);
        }
    }
}