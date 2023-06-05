import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DoctorDetails extends JFrame implements ActionListener {
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private DefaultTableModel model;

    private JScrollPane scrollPane;
    private JTable table1;
    private String[] columns = {"Doctor ID", "Department", "Doctor Name", "Email", "Password"};
    DoctorDetails() {

        super("Doctor Details");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 600, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.CYAN);
        setResizable(false);


        table1 = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table1.setModel(model);
        table1.setSelectionBackground(Color.yellow);
        table1.setBackground(Color.WHITE);
        table1.setRowHeight(30);

        scrollPane = new JScrollPane(table1);
        scrollPane.setBounds(50, 300, 500, 200);

        add(button1);

        button1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            try {

                File file = new File("DoctorDetails.txt");
                Scanner sc = new Scanner(file);
                int number_of_line = 0;
                while (sc.hasNextLine()) {
                    String s = sc.nextLine();
                    number_of_line++;

                }

                Doctor[] arr1 = new Doctor[number_of_line];
                sc = new Scanner(file);

                int k = 0;
                while (sc.hasNext()) {
                    String id = sc.next();
                    String department = sc.next();
                    String name = sc.next();
                    String email = sc.next();
                    String password = sc.next();

                    arr1[k] = new Doctor(id, department, name, email, password);
                    k++;
                }
                sc.close();


            } catch (IOException ae) {
                ae.printStackTrace();
            }
        }

    }