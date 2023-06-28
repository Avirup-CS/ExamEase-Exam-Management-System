import javax.swing.*;

import Project.ConnectionProviderClass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CSVDataUploader extends JFrame implements ActionListener {
    private JTextField filePathField;
    private JButton browseButton;
    private JButton uploadButton;
    private JPanel panel_1;

    public CSVDataUploader() {
    	getContentPane().setBackground(new Color(0, 128, 192));
        setTitle("CSV Data Uploader");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setResizable(false);

        filePathField = new JTextField(20);
        filePathField.setFont(new Font("Tahoma", Font.BOLD, 10));
        filePathField.setBounds(26, 53, 331, 19);
        browseButton = new JButton("Browse");
        browseButton.setBounds(26, 100, 137, 27);
        browseButton.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\search.png"));
        browseButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        uploadButton = new JButton("Upload");
        uploadButton.setBounds(210, 100, 137, 27);
        uploadButton.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\upload.jpg"));
        uploadButton.setFont(new Font("Tahoma", Font.BOLD, 14));

        browseButton.addActionListener(this);
        uploadButton.addActionListener(this);
        getContentPane().setLayout(null);

        getContentPane().add(filePathField);
        getContentPane().add(browseButton);
        getContentPane().add(uploadButton);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 128));
        panel.setBounds(10, 10, 366, 68);
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Upload a file (Format .csv required)*");
        lblNewLabel.setForeground(new Color(255, 128, 0));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel.setBounds(20, 10, 324, 24);
        panel.add(lblNewLabel);
        
        panel_1 = new JPanel();
        panel_1.setBackground(new Color(0, 0, 160));
        panel_1.setBounds(20, 88, 337, 50);
        getContentPane().add(panel_1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == browseButton) {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                filePathField.setText(selectedFile.getAbsolutePath());
            }
        } else if (e.getSource() == uploadButton) {
            String filePath = filePathField.getText();
            try {
                
                Connection con = ConnectionProviderClass.getCon();
                
                // Prepare the SQL INSERT statement
                String insertQuery = "insert into question(name,opt1,opt2,opt3,opt4,answer,explanation) values(?, ?, ?, ?, ?, ?, ?)"; // Replace with your actual table and column names
                PreparedStatement statement = con.prepareStatement(insertQuery);
                
            
                // Read and process the CSV file
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(","); // Customize the delimiter as per your CSV file

                    // Set the values for the PreparedStatement based on the CSV data
                    statement.setString(1, data[0]);
                    statement.setString(2, data[1]);
                    statement.setString(3, data[2]);
                    statement.setString(4, data[3]);
                    statement.setString(5, data[4]);
                    statement.setString(6, data[5]);
                    statement.setString(7, data[6]);
                    // Execute the INSERT statement
                    statement.executeUpdate();
                    setVisible(false);
                    new CSVDataUploader().setVisible(true);
                }

                // Close resources
                statement.close();
                con.close();
                reader.close();

                JOptionPane.showMessageDialog(this, "Data uploaded successfully!");
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error occurred while uploading data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CSVDataUploader uploader = new CSVDataUploader();
            uploader.setVisible(true);
        });
    }
}
