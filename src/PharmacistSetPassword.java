
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
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class PharmacistSetPassword extends JFrame implements ActionListener {
    private JLabel label1, label2, label3, label4;
    private JTextField textField1, textField2, textField3, textField4, textField5;
    private JPasswordField passwordField1;
    private JButton button1, button2;

    public PharmacistSetPassword() {
        super("Set Password");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 600, 400);
        setLayout(null);
        getContentPane().setBackground(Color.CYAN);
        setLocationRelativeTo(null);
        setResizable(false);

        label1 = new JLabel("Pharmacist ID: ");
        label1.setBounds(170, 75, 100, 20);

        label2 = new JLabel("Email: ");
        label2.setBounds(170, 125, 100, 20);

        label3 = new JLabel("Enter Password: ");
        label3.setBounds(170, 175, 120, 20);

        label4 = new JLabel("Confirm Password: ");
        label4.setBounds(170, 225, 125, 20);


        textField1 = new JTextField();
        textField1.setBounds(300, 75, 120, 20);

        textField2 = new JTextField();
        textField2.setBounds(300, 125, 120, 20);

        textField3 = new JTextField();
        textField3.setBounds(300, 175, 120, 20);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(300, 225, 120, 20);

        button1 = new JButton("Back");
        button1.setBounds(150, 300, 100, 20);

        button2 = new JButton("Set");
        button2.setBounds(350, 300, 100, 20);


        add(label1);
        add(label2);
        add(label3);
        add(label4);


        add(textField1);
        add(textField2);
        add(textField3);


        add(passwordField1);
        add(button1);
        add(button2);

        button1.addActionListener(this);
        button2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            setVisible(false);
          PharmacistLogin pharmacistLogin = new PharmacistLogin();
          pharmacistLogin.setVisible(true);
        }
        if (e.getSource() == button2) {
            String ID = textField1.getText();
            String Email= textField2.getText();
            String enterPassword = textField3.getText();
            String confirmPassword= passwordField1.getText();

            try{
                File file = new File("PharmacistDetails.txt");
                if(!file.exists()){
                    file.createNewFile();
                }
                Scanner sc = new Scanner(file);
                int number_of_line=0;
                while(sc.hasNextLine())
                {
                    String s = sc.nextLine();
                    number_of_line++;

                }

                Receptionist[] arr1 = new Receptionist[number_of_line];
                sc = new Scanner(file);

                int k = 0;
                while(sc.hasNext())
                {
                    String id =  sc.next();
                    String designation = sc.next();
                    String name = sc.next();
                    String salary = sc.next();
                    String contact= sc.next();

                    arr1[k] = new Receptionist(id,designation,name,salary,contact);
                    k++;
                }
                sc.close();


                for(int i=0; i<number_of_line; i++) {

                    if (arr1[i].getId().equals(ID)) {
                        File f = new File("PharmacistPassword.txt");
                        if (!f.exists()) {
                            f.createNewFile();
                        }
                        FileWriter f1 = new FileWriter(f);

                        f1.write(ID + " " + Email + " " + enterPassword + " " + confirmPassword);
                        f1.write(System.getProperty("line.separator"));
                        f1.close();
                        JOptionPane.showMessageDialog(null, "Doctor Password Registered Successfully.");
                        setVisible(true);
                        break;
                    }
                }
                JOptionPane.showMessageDialog(null,"ID Didn't Match");

            }catch(IOException ae){
                JOptionPane.showMessageDialog(null,"Error");
            }

        }
    }
}