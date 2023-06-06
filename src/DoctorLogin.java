
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
import java.util.*;
public class DoctorLogin extends JFrame implements ActionListener{
    private JLabel label1, label2;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton button1,button2,button3;
    public DoctorLogin(){
        super("Doctor Login");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 600, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.CYAN);
        setResizable(false);


        label1 = new JLabel("Doctor ID: ");
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

        button2 = new JButton("HomePage");
        button2.setBounds(150,220,100,20);

        button3 = new JButton("Set Password");
        button3.setBounds(220,250,150,20);



        add(label1);
        add(label2);
        add(textField1);
        add(passwordField1);
        add(button1);
        add(button2);
        add(button3);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);


    }
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {
            String idDoctor = textField1.getText();
            String passwordDoctor = passwordField1.getText();

            try{
                File file = new File("DoctorPassword.txt");
                if(!file.exists()) {
                    file.createNewFile();
                }

                Scanner sc = new Scanner(file);
                int number_of_line=0;
                while(sc.hasNextLine())
                {
                    String s = sc.nextLine();
                    number_of_line++;

                }

                Doctor2[] arr1 = new Doctor2[number_of_line];
                sc = new Scanner(file);


                int k = 0;
                while(sc.hasNext())
                {
                   String id  = sc.next();
                   String email =sc.next();
                   String enterPassword = sc.next();
                   String confirmPassword= sc.next();

                   arr1[k] = new Doctor2(id,enterPassword);
                   k++;
                }
                sc.close();
                int flag =0;

                for(int j=0; j<number_of_line; j++ ) {
                    flag++;

                    if (arr1[j].getId().equals(idDoctor) && arr1[j].getPassword().equals(passwordDoctor)) {
                        JOptionPane.showMessageDialog(null, "Doctor Login Successful.");
                        setVisible(true);

                        setVisible(false);
                        DoctorWindow doctorWindow= new DoctorWindow();
                        doctorWindow.setVisible(true);


                    }
                    else if (flag==number_of_line){
                        JOptionPane.showMessageDialog(null, "Invalid ID & Password");
                        setVisible(true);

                    }

                }
            }catch(IOException ae){
                ae.printStackTrace();

            }


        }
        if(e.getSource() == button2){
            setVisible(false);
            HomePage home = new HomePage();
            home.setVisible(true);
        }
        if(e.getSource() == button3){
            setVisible(false);
            DoctorSetPassword doctorSetPassword = new DoctorSetPassword();
            doctorSetPassword.setVisible(true);

        }
    }
}