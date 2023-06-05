import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.*;


public class DoctorDetailsEditForAdmin extends JFrame implements ActionListener {
    private JLabel label1, label2, label3, label4, label5, label6;
    private JTextField textField1, textField2, textField3, textField4, textField5;
    private JPasswordField passwordField1;
    private JButton button1, button2, button3, button4, button5, button6, button7;
    private JTable table1;
    private DefaultTableModel model;
    private JScrollPane scrollPane;
    private String[] columns = {"Doctor ID", "Department", "Doctor Name", "Email", "Password"};
    private String[] rows = new String[5];

    public DoctorDetailsEditForAdmin() {
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

        label2 = new JLabel("Doctor ID: ");
        label2.setBounds(50, 80, 100, 20);

        label3 = new JLabel("Department: ");
        label3.setBounds(50, 120, 100, 20);

        label4 = new JLabel("Doctor Name: ");
        label4.setBounds(50, 160, 100, 20);

        label5 = new JLabel("Email: ");
        label5.setBounds(50, 200, 100, 20);

        label6 = new JLabel("Password: ");
        label6.setBounds(50, 240, 100, 20);


        textField1 = new JTextField();
        textField1.setBounds(150, 80, 150, 20);

        textField2 = new JTextField();
        textField2.setBounds(150, 120, 150, 20);

        textField3 = new JTextField();
        textField3.setBounds(150, 160, 150, 20);

        textField4 = new JTextField();
        textField4.setBounds(150, 200, 150, 20);

        textField5 = new JTextField();
        textField5.setBounds(150, 240, 150, 20);

        button1 = new JButton("Add Doctor");
        button1.setBounds(400, 80, 100, 30);
        button1.setForeground(Color.BLACK);
        button1.setBackground(Color.WHITE);
        button1.setOpaque(true);
        button1.setBorderPainted(false);

        button2 = new JButton("Update Info");
        button2.setBounds(400, 130, 100, 30);
        button2.setForeground(Color.BLACK);
        button2.setBackground(Color.WHITE);
        button2.setOpaque(true);
        button2.setBorderPainted(false);

        button3 = new JButton("Delete Info");
        button3.setBounds(400, 180, 100, 30);
        button3.setForeground(Color.BLACK);
        button3.setBackground(Color.WHITE);
        button3.setOpaque(true);
        button3.setBorderPainted(false);

        button4 = new JButton("Clear");
        button4.setBounds(400, 230, 100, 30);
        button4.setForeground(Color.BLACK);
        button4.setBackground(Color.WHITE);
        button4.setOpaque(true);
        button4.setBorderPainted(false);

        button5 = new JButton("Back");
        button5.setBounds(100, 520, 80, 20);

        button6 = new JButton("Save");
        button6.setBounds(400, 520, 100, 20);

        button7 = new JButton("View Details");
        button7.setBounds(210, 520, 160, 20);

        table1 = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table1.setModel(model);
        table1.setSelectionBackground(Color.yellow);
        table1.setBackground(Color.WHITE);
        table1.setRowHeight(30);

        scrollPane = new JScrollPane(table1);
        scrollPane.setBounds(50, 300, 500, 200);

        table1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae) {
                int numberOfdRow = table1.getSelectedRow();

                String id = model.getValueAt(numberOfdRow, 0).toString();
                String department = model.getValueAt(numberOfdRow, 1).toString();
                String name = model.getValueAt(numberOfdRow, 2).toString();
                String email = model.getValueAt(numberOfdRow, 3).toString();
                String password = model.getValueAt(numberOfdRow, 4).toString();

                textField1.setText(id);
                textField2.setText(department);
                textField3.setText(name);
                textField4.setText(email);
                textField5.setText(password);
            }

        });

        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);


        add(textField1);
        add(textField2);
        add(textField3);
        add(textField4);
        add(textField5);

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);

        add(scrollPane);

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
            rows[0]= textField1.getText();
            rows[1] = textField2.getText();
            rows[2] = textField3.getText();
            rows[3] = textField4.getText();
            rows[4] = textField5.getText();

            model.addRow(rows);

        }


        if(e.getSource() == button2){
            int numberOfRow = table1.getSelectedRow();

            String id = textField1.getText();
            String department = textField2.getText();
            String name = textField3.getText();
            String email = textField4.getText();
            String password = textField5.getText();

            model.setValueAt(id,numberOfRow, 0);
            model.setValueAt(department, numberOfRow, 1);
            model.setValueAt(name, numberOfRow, 2);
            model.setValueAt(email,numberOfRow, 3);
            model.setValueAt(password, numberOfRow, 4);


        }
        if(e.getSource() == button3) {
            int numberOfRow = table1.getSelectedRow();
            if (numberOfRow >= 0) {
                model.removeRow(numberOfRow);

            } else {
                JOptionPane.showMessageDialog(null, "No Row has been selected.");
            }

            try {
                File inputFile = new File("DoctorDetails.txt");
                File tempFile = new File("temp.txt");


                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

                String currentLine;
                int lineNumber = 0;

                // Copy lines from the input file to the temp file, omitting the line to be deleted
                while ((currentLine = reader.readLine()) != null) {
                    lineNumber++;
                    if (lineNumber != numberOfRow) {
                        writer.write(currentLine);
                        writer.newLine();
                    }
                }

                writer.close();
                reader.close();

                // Delete the original input file
                if (inputFile.delete()) {
                    // Rename the temp file to the original file name
                    if (!tempFile.renameTo(inputFile)) {
                        throw new IOException("Failed to rename the temp file.");
                    }
                } else {
                    throw new IOException("Failed to delete the original file.");
                }
            } catch (IOException ae) {
                ae.printStackTrace();
            }
        }
        if(e.getSource() == button4){
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
            textField4.setText("");
            textField5.setText("");
        }

        if(e.getSource() == button5){
            setVisible(false);
           AdminOperations adminOperations = new AdminOperations();
           adminOperations.setVisible(true);
        }
        if(e.getSource() == button6){
            try{
                File f1 = new File("DoctorDetails.txt");
                if(!f1.exists()){
                    f1.createNewFile();
                }
                FileWriter fw = new FileWriter(f1);

                for (int row = 0; row < model.getRowCount(); row++) {
                    for (int col = 0; col < model.getColumnCount(); col++) {
                        fw.write(model.getValueAt(row, col) + "\t");
                    }
                   fw.write("\n");
                }
                fw.close();
                JOptionPane.showMessageDialog(null, "Data Saved to files.");

            }catch(IOException ae){
                ae.printStackTrace();
            }
        }
        if (e.getSource() == button7) {
            setVisible(false);
           DoctorDetails doctorDetails = new DoctorDetails();
           doctorDetails.setVisible(true);


        }



    }
}
