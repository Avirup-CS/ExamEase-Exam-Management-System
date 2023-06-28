import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Project.ConnectionProviderClass;
import java.sql.*;

import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class StudentSignIn extends JFrame {


	private JPanel contentPane;
	private JTextField studentrollNo;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSignIn frame = new StudentSignIn();
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
	public StudentSignIn() {
		setTitle("ExamEase | Student Sign In");
		//setIconImage(Toolkit.getDefaultToolkit().getImage(StudentSignIn.class.getResource("/images/examtitle.jpg")));
		setFont(new Font("Calibri", Font.BOLD, 20));
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 601);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(393, 10, 1, 1);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(0, 0, 394, 574);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(0, 0, 394, 339);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\examimg.jpg"));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("STUDENT SIGN IN");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.CYAN);
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 30));
		lblNewLabel_3.setBounds(76, 391, 265, 50);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\signinlogo.jpg"));
		lblNewLabel.setBounds(538, 10, 118, 103);
		contentPane.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(414, 149, 373, 365);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Forgot Password ?");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(73, 242, 231, 28);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setBounds(45, 301, 120, 38);
		panel_2.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\login.png"));
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(217, 301, 109, 38);
		panel_2.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new studentHome().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\Back.png"));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.setBounds(96, 202, 183, 21);
		panel_2.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(45, 151, 281, 30);
		panel_2.add(passwordField);
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel password = new JLabel("Password:");
		password.setBounds(45, 120, 125, 21);
		panel_2.add(password);
		password.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		studentrollNo = new JTextField();
		studentrollNo.setBounds(45, 68, 281, 30);
		panel_2.add(studentrollNo);
		studentrollNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		studentrollNo.setColumns(10);
		
		JLabel studentroll = new JLabel("Student Roll No:");
		studentroll.setBounds(45, 37, 183, 21);
		panel_2.add(studentroll);
		studentroll.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(404, 131, 394, 8);
		contentPane.add(separator);
		
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
		
		studentrollNo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					String rollNo = studentrollNo.getText();
	                String getpassword = passwordField.getText();
					
	                try {
	                	int flag = 1;
	                	Connection con = ConnectionProviderClass.getCon();
	                	Statement st = con.createStatement();
	                	ResultSet rs = st.executeQuery("select * from student");
	                	
	                	while(rs.next())
	                	{
	                		if(rs.getString(1).equals(rollNo) && rs.getString(18).equals(getpassword)) {
	                		flag = 0;
	                		break;
	                		}
	                	}
	                	
	                    if(flag == 0) {
	                    	setVisible(false);
	    					new instructionStudent(rollNo).setVisible(true);
	                    }
	                    
	    				else {
	    					ImageIcon icon = new ImageIcon("Incorrect Password.PNG");
	    					JOptionPane.showMessageDialog(null,"<html><b style=\"color: red; font-size: 10px\">Incorrect <br>Username or Password</b></html>","Message",JOptionPane.INFORMATION_MESSAGE,icon);
	    				}
	                } catch (SQLException sqlException) {
	                    sqlException.printStackTrace();
	                }
					
				}
				
			}
		});
		
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					String rollNo = studentrollNo.getText();
	                String getpassword = passwordField.getText();
					
	                try {
	                	int flag = 1;
	                	Connection con = ConnectionProviderClass.getCon();
	                	Statement st = con.createStatement();
	                	ResultSet rs = st.executeQuery("select * from student");
	                	
	                	while(rs.next())
	                	{
	                		if(rs.getString(1).equals(rollNo) && rs.getString(18).equals(getpassword)) {
	                		flag = 0;
	                		break;
	                		}
	                	}
	                	
	                    if(flag == 0) {
	                    	setVisible(false);
	    					new instructionStudent(rollNo).setVisible(true);
	                    }
	                    
	    				else {
	    					ImageIcon icon = new ImageIcon("Incorrect Password.PNG");
	    					JOptionPane.showMessageDialog(null,"<html><b style=\"color: red; font-size: 10px\">Incorrect <br>Username or Password</b></html>","Message",JOptionPane.INFORMATION_MESSAGE,icon);
	    				}
	                } catch (SQLException sqlException) {
	                    sqlException.printStackTrace();
	                }
					
				}
				
				
			}
		});
		
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String rollNo = studentrollNo.getText();
                String getpassword = passwordField.getText();
                try {
                	int flag = 1;
                	Connection con = ConnectionProviderClass.getCon();
                	Statement st = con.createStatement();
                	ResultSet rs = st.executeQuery("select * from student");
                	
                	while(rs.next())
                	{
                		if(rs.getString(1).equals(rollNo) && rs.getString(18).equals(getpassword)) {
                		flag = 0;
                		break;
                		}
                	}
                	
                    if(flag == 0) {
                    	setVisible(false);
    					new instructionStudent(rollNo).setVisible(true);
                    }
                    
    				else {
    					ImageIcon icon = new ImageIcon("Incorrect Password.PNG");
    					JOptionPane.showMessageDialog(null,"<html><b style=\"color: red; font-size: 10px\">Incorrect <br>Username or Password</b></html>","Message",JOptionPane.INFORMATION_MESSAGE,icon);
    				}
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
               
            }
        });
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new Forgotpassword().setVisible(true);
			}
		});
			
	
	}
}