import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
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
    private JButton button1, button2;
    private DefaultTableModel model;

    private JScrollPane scrollPane;
    private JTable table1;
    private String[] columns = {"Doctor ID", "Department", "Doctor Name", "Email", "Password"};
    private String[] rows = new String[5];

    DoctorDetails() {

        super("Doctor Details");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 600, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.CYAN);
        setResizable(false);

        textField1 = new JTextField();
        textField1.setBounds(150, 50, 180, 30);

        button1 = new JButton("Search");
        button1.setBounds(400, 50, 100, 30);
        button1.setForeground(Color.BLACK);
        button1.setBackground(Color.WHITE);
        button1.setOpaque(true);
        button1.setBorderPainted(false);


        button2 = new JButton("Back");
        button2.setBounds(100, 320, 80, 20);


        table1 = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table1.setModel(model);
        table1.setSelectionBackground(Color.yellow);
        table1.setBackground(Color.WHITE);
        table1.setRowHeight(30);
        table1.setEnabled(false);

        scrollPane = new JScrollPane(table1);
        scrollPane.setBounds(50, 100, 500, 200);

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

            String id ;
            String department;
            String name ;
            String email ;
            String password ;

            while (sc.hasNext()) {

                id = sc.next();
                department = sc.next();
                name = sc.next();
                email = sc.next();
                password = sc.next();

                rows[0]= id;
                rows[1] = department;
                rows[2] = name;
                rows[3] = email;
                rows[4] = password;

                model.addRow(rows);

                k++;
            }
            sc.close();

        } catch (IOException ae) {
            ae.printStackTrace();
        }

        add(button1);
        add(button2);
        add(textField1);
        add(scrollPane);

        button1.addActionListener(this);
        button2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button1){
            model = (DefaultTableModel) table1.getModel();
            final TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);
            table1.setRowSorter(sorter);

            String txt = textField1.getText();
            if (txt.length() == 0) {
                sorter.setRowFilter(null);
            }else{
                sorter.setRowFilter(RowFilter.regexFilter(txt));
            }

        }

        if(e.getSource() == button2){
            DoctorDetailsEditForAdmin doctorDetailsEditForAdmin = new DoctorDetailsEditForAdmin();
            doctorDetailsEditForAdmin.setVisible(true);
        }
    }
}