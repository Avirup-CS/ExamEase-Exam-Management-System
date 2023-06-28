import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Project.ConnectionProviderClass;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class result extends JFrame {

	private JPanel contentPane;
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_9;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					result frame = new result();
					//frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public result() {
		
		setTitle("ExamEase | Result");
		contentPane = new JPanel();
		contentPane.setVisible(true);
		setMinimumSize(new Dimension(768, 500));
		setSize(new Dimension(528, 442));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane.setSize(new Dimension(1366, 768));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Marks Obtained:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(111, 537, 229, 40);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(111, 282, 794, 10);
		contentPane.add(separator);
		
		JLabel lblNewLabel_4 = new JLabel("Student Name:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_4.setBounds(121, 293, 252, 40);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gender:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_5.setBounds(118, 337, 150, 40);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Date of Examination:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_6.setBounds(114, 387, 331, 40);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("Exam Score Report");
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_8.setBounds(261, 223, 556, 61);
		contentPane.add(lblNewLabel_8);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(111, 679, 794, 10);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_9.setBounds(405, 387, 197, 40);
		contentPane.add(lblNewLabel_9);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(0, 0, 1366, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\studenthome.jpg"));
		btnNewButton.setBounds(1175, 0, 181, 60);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\all student result.png"));
		lblNewLabel_3.setBounds(10, 0, 69, 60);
		panel.add(lblNewLabel_3);
	
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_10.setBounds(247, 337, 163, 40);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_11.setBounds(320, 293, 556, 40);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblQuestionsAttempted = new JLabel("Questions Attempted:");
		lblQuestionsAttempted.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblQuestionsAttempted.setBounds(111, 587, 298, 40);
		contentPane.add(lblQuestionsAttempted);
		
		JLabel lblNewLabel_13 = new JLabel("Total Questions:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_13.setBounds(112, 437, 229, 40);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Wrong Answers:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_14.setBounds(111, 637, 230, 40);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_15.setBounds(393, 587, 163, 40);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_16.setBounds(340, 637, 126, 40);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_17.setBounds(338, 537, 143, 40);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_18.setBounds(338, 437, 93, 40);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_1 = new JLabel("Total Marks:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(112, 487, 178, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_7.setBounds(300, 487, 100, 40);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_19 = new JLabel("Enter Roll No.:");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_19.setBounds(112, 102, 252, 40);
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Enter Password:");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_20.setBounds(112, 162, 252, 40);
		contentPane.add(lblNewLabel_20);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setBounds(338, 102, 407, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Check Result");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\search.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setBounds(807, 128, 229, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Clear");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\clear.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_2.setBounds(1084, 128, 150, 40);
		contentPane.add(btnNewButton_2);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 25));
		passwordField.setBounds(338, 163, 407, 40);
		contentPane.add(passwordField);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxNewCheckBox.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxNewCheckBox.setBounds(338, 210, 218, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\resultbg.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1376, 768);
		contentPane.add(lblNewLabel_2);
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				passwordField.setText("");
				lblNewLabel_11.setText("");
				lblNewLabel_10.setText("");
				lblNewLabel_9.setText("");
				lblNewLabel_18.setText("");
				lblNewLabel_7.setText("");
				lblNewLabel_17.setText("");
				lblNewLabel_15.setText("");
				lblNewLabel_16.setText("");
			}
		});
		//student details
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String rollNo = textField.getText();
                String getpassword = passwordField.getText();
                
                	try 
    				{
                		int flag = 1;
    					Connection con = ConnectionProviderClass.getCon();
    					Statement st = con.createStatement();
    					
    					ResultSet rs2 = st.executeQuery("select * from student");
	                	
	                	while(rs2.next())
	                	{
	                		if(rs2.getString(1).equals(rollNo) && rs2.getString(18).equals(getpassword)) {
	                		flag = 0;
	                		break;
	                		}
	                	}
	                	
	                	if(flag == 0) {
	                		ResultSet rs = st.executeQuery("select name,gender from student where rollNo='"+rollNo+"'");
	    					while(rs.next())
	    					{
	    						lblNewLabel_11.setText(rs.getString(1));
	    						lblNewLabel_10.setText(rs.getString(2));
	    					}
	    					
	    					ResultSet rs1 = st.executeQuery("select doe,total_question,total_marks,marksobt,total_attempted,wrong_answer from result where rollNo='"+rollNo+"'");
	    					while(rs1.next())
	    					{
	    						lblNewLabel_9.setText(rs1.getString(1));
	    						lblNewLabel_18.setText(rs1.getString(2));
	    						lblNewLabel_7.setText(rs1.getString(3));
	    						lblNewLabel_17.setText(rs1.getString(4));
	    						lblNewLabel_15.setText(rs1.getString(5));
	    						lblNewLabel_16.setText(rs1.getString(6));
	    					}
	                    }
	                	
	                	else {
	    					ImageIcon icon = new ImageIcon("Incorrect Password.PNG");
	    					JOptionPane.showMessageDialog(null,"<html><b style=\"color: red; font-size: 10px\">No <br>Record Found !!</b></html>","Message",JOptionPane.INFORMATION_MESSAGE,icon);
	    				}
							
				}
				catch(Exception e5)
				{
					JOptionPane.showMessageDialog(null, e5);
				}
			}
		});
		
		//new
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					String rollNo = textField.getText();
	                String getpassword = passwordField.getText();
	                
	                	try 
	    				{
	                		int flag = 1;
	    					Connection con = ConnectionProviderClass.getCon();
	    					Statement st = con.createStatement();
	    					
	    					ResultSet rs2 = st.executeQuery("select * from student");
		                	
		                	while(rs2.next())
		                	{
		                		if(rs2.getString(1).equals(rollNo) && rs2.getString(18).equals(getpassword)) {
		                		flag = 0;
		                		break;
		                		}
		                	}
		                	
		                	if(flag == 0) {
		                		ResultSet rs = st.executeQuery("select name,gender from student where rollNo='"+rollNo+"'");
		    					while(rs.next())
		    					{
		    						lblNewLabel_11.setText(rs.getString(1));
		    						lblNewLabel_10.setText(rs.getString(2));
		    					}
		    					
		    					ResultSet rs1 = st.executeQuery("select doe,total_question,total_marks,marksobt,total_attempted,wrong_answer from result where rollNo='"+rollNo+"'");
		    					while(rs1.next())
		    					{
		    						lblNewLabel_9.setText(rs1.getString(1));
		    						lblNewLabel_18.setText(rs1.getString(2));
		    						lblNewLabel_7.setText(rs1.getString(3));
		    						lblNewLabel_17.setText(rs1.getString(4));
		    						lblNewLabel_15.setText(rs1.getString(5));
		    						lblNewLabel_16.setText(rs1.getString(6));
		    					}
		                    }
		                	
		                	else {
		    					ImageIcon icon = new ImageIcon("Incorrect Password.PNG");
		    					JOptionPane.showMessageDialog(null,"<html><b style=\"color: red; font-size: 10px\">No <br>Record Found !!</b></html>","Message",JOptionPane.INFORMATION_MESSAGE,icon);
		    				}
	    					
	
	    					
	                } catch(Exception e5)
	    				{
						JOptionPane.showMessageDialog(null, e5);
					}
	                	
				}
				
			}
		});
		
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					String rollNo = textField.getText();
	                String getpassword = passwordField.getText();
					
	                try 
    				{
	                	int flag = 1;
    					Connection con = ConnectionProviderClass.getCon();
    					Statement st = con.createStatement();
    					
    					ResultSet rs2 = st.executeQuery("select * from student");
	                	
	                	while(rs2.next())
	                	{
	                		if(rs2.getString(1).equals(rollNo) && rs2.getString(18).equals(getpassword)) {
	                		flag = 0;
	                		break;
	                		}
	                	}
	                	
	                	if(flag == 0) {
	                		ResultSet rs = st.executeQuery("select name,gender from student where rollNo='"+rollNo+"'");
	    					while(rs.next())
	    					{
	    						lblNewLabel_11.setText(rs.getString(1));
	    						lblNewLabel_10.setText(rs.getString(2));
	    					}
	    					
	    					ResultSet rs1 = st.executeQuery("select doe,total_question,total_marks,marksobt,total_attempted,wrong_answer from result where rollNo='"+rollNo+"'");
	    					while(rs1.next())
	    					{
	    						lblNewLabel_9.setText(rs1.getString(1));
	    						lblNewLabel_18.setText(rs1.getString(2));
	    						lblNewLabel_7.setText(rs1.getString(3));
	    						lblNewLabel_17.setText(rs1.getString(4));
	    						lblNewLabel_15.setText(rs1.getString(5));
	    						lblNewLabel_16.setText(rs1.getString(6));
	    					}
	                    }
	                	
	                	else {
	    					ImageIcon icon = new ImageIcon("Incorrect Password.PNG");
	    					JOptionPane.showMessageDialog(null,"<html><b style=\"color: red; font-size: 10px\">No <br>Record Found !!</b></html>","Message",JOptionPane.INFORMATION_MESSAGE,icon);
	    				}
    				}catch(Exception e5)
    				{
					JOptionPane.showMessageDialog(null, e5);
				}
                } 
				
				
			}
		});
		
		//new
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new studentHome().setVisible(true);
			}
		});
		
}
}

