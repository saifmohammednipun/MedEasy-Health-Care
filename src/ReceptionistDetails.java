import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;


public class ReceptionistDetails extends JFrame implements ActionListener {
    private JLabel label1;
    private JTextField textField1;
    private JButton button1, button2;
    private DefaultTableModel model;

    private JScrollPane scrollPane;
    private JTable table1;
    private String[] columns = {"Staff ID", "Designation", "Staff Name", "Salary", "Contact"};
    private String[] rows = new String[5];

    ReceptionistDetails() {

        super("Receptionist Details");
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

            File file = new File("ReceptionistDetails.txt");
            Scanner sc = new Scanner(file);
            int number_of_line = 0;
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                number_of_line++;

            }

            Receptionist[] arr1 = new Receptionist[number_of_line];
            sc = new Scanner(file);

            int k = 0;

            String id ;
            String designation;
            String name ;
            String salary;
            String password ;

            while (sc.hasNext()) {

                id = sc.next();
                designation = sc.next();
                name = sc.next();
                salary = sc.next();
                password = sc.next();

                rows[0]= id;
                rows[1] = designation;
                rows[2] = name;
                rows[3] = salary;
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
            setVisible(false);
            ReceptionistDetailsEditForAdmin receptionistDetailsEditForAdmin = new ReceptionistDetailsEditForAdmin();
            receptionistDetailsEditForAdmin.setVisible(true);
        }
    }
}