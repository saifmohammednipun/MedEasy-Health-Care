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


public class DoctorDetailsForAdmin extends JFrame implements ActionListener{
    private JLabel label1, label2;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton button1,button2;
    private JTable table1;
    private String[] cols={"Doctor ID","Department","Doctor Name","password"};
    private String[][] rows = {
                                    {"1001","Medicine","Dr.Saif Mohammed","10322"},
                                    {"1002","Medicine","Dr.Saif Mohammed","10322"},
                                    {"1003","Medicine","Dr.Saif Mohammed","10322"},
            {"1004","Medicine","Dr.Saif Mohammed","10322"},
            {"1005","Medicine","Dr.Saif Mohammed","10322"},
            {"1006","Medicine","Dr.Saif Mohammed","10322"},
            {"1007","Medicine","Dr.Saif Mohammed","10322"},
            {"1008","Medicine","Dr.Saif Mohammed","10322"},
            {"1009","Medicine","Dr.Saif Mohammed","10322"},
            {"1001","Medicine","Dr.Saif Mohammed","10322"},
            {"1002","Medicine","Dr.Saif Mohammed","10322"},
            {"1003","Medicine","Dr.Saif Mohammed","10322"},
            {"1001","Medicine","Dr.Saif Mohammed","10322"},
            {"1002","Medicine","Dr.Saif Mohammed","10322"},
            {"1003","Medicine","Dr.Saif Mohammed","10322"}

                              };

    private JScrollPane scrollPane1;
    public DoctorDetailsForAdmin(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 600, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.CYAN);
        setResizable(false);

        label1 = new JLabel("Doctor Details");
        Font font1 = new Font("Times New Roman", Font.BOLD, 25);
        label1.setFont(font1);
        label1.setBounds(200, 0, 400, 80);
        label1.setForeground(Color.BLUE);
        label1.setBackground(Color.WHITE);

        table1 = new JTable(rows,cols);
        //table1.setSelectionBackground(Color.yellow);
        table1.setEnabled(false);

        scrollPane1 = new JScrollPane(table1);
        scrollPane1.setBounds(50,80,500,220);

        button1 = new JButton("Edit");
        button1.setBounds(350,320,100,20);

        button2 = new JButton("Back");
        button2.setBounds(100,320,100,20);



        add(label1);
        add(scrollPane1);
        add(button1);
        add(button2);

        button1.addActionListener(this);
        button1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            setVisible(false);
          DoctorDetailsEditForAdmin doctorDetailsEditForAdmin = new DoctorDetailsEditForAdmin();
          doctorDetailsEditForAdmin.setVisible(true);
        }
        if(e.getSource() == button2){
            setVisible(false);
           AdminOperations adminOperations = new AdminOperations();
           adminOperations.setVisible(true);
        }
    }
}
