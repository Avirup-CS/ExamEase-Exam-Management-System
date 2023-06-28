import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



public class LoginAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAdmin frame = new LoginAdmin();
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
	public LoginAdmin() {
		setTitle("ExamEase | Admin Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(966, 220, 110, 35);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					if(textField.getText().length() <= 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Enter Username !!");
					}
					
					else if(passwordField.getText().length() <= 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Enter Password !!");
					}
					
					else if(textField.getText().equals("examease") && passwordField.getText().equals("admin")){
						setVisible(false);
						new adminHome().setVisible(true);
					}
					else {
						ImageIcon icon = new ImageIcon("Incorrect Password.PNG");
						JOptionPane.showMessageDialog(null,"<html><b style=\"color: red; font-size: 10px\">Incorrect <br>Username or Password</b></html>","Message",JOptionPane.INFORMATION_MESSAGE,icon);
					}
				}
			}
		});
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(966, 265, 255, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setForeground(new Color(0, 128, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(966, 309, 110, 26);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					if(textField.getText().length() <= 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Enter Username !!");
					}
					
					else if(passwordField.getText().length() <= 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Enter Password !!");
					}
					
					else if(textField.getText().equals("examease") && passwordField.getText().equals("admin")){
						setVisible(false);
						new adminHome().setVisible(true);
					}
					else {
						ImageIcon icon = new ImageIcon("Incorrect Password.PNG");
						JOptionPane.showMessageDialog(null,"<html><b style=\"color: red; font-size: 10px\">Incorrect <br>Username or Password</b></html>","Message",JOptionPane.INFORMATION_MESSAGE,icon);
					}
				}
				
			}
		});
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordField.setBounds(966, 345, 255, 26);
		contentPane.add(passwordField);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.setForeground(new Color(0, 128, 255));
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
		
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		chckbxNewCheckBox.setBounds(992, 392, 192, 21);
		contentPane.add(chckbxNewCheckBox);
		
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(0, 128, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().length() <= 0) {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf,"Enter Username !!");
				}
				
				else if(passwordField.getText().length() <= 0) {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf,"Enter Password !!");
				}
				
				else if(textField.getText().equals("examease") && passwordField.getText().equals("admin")){
					setVisible(false);
					new adminHome().setVisible(true);
				}
				else {
					ImageIcon icon = new ImageIcon("Incorrect Password.PNG");
					JOptionPane.showMessageDialog(null,"<html><b style=\"color: red; font-size: 10px\">Incorrect <br>Username or Password</b></html>","Message",JOptionPane.INFORMATION_MESSAGE,icon);
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\login.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(966, 442, 114, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setForeground(new Color(0, 128, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new index().setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\Back.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(1111, 442, 110, 29);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("ADMIN PANEL LOGIN");
		lblNewLabel_3.setForeground(new Color(0, 128, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_3.setBounds(927, 147, 339, 51);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\adminlogo.jpg"));
		lblNewLabel_4.setBounds(1050, 62, 83, 81);
		contentPane.add(lblNewLabel_4);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(884, 200, 418, 10);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(884, 491, 418, 10);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\login Background.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1366, 768);
		contentPane.add(lblNewLabel_2);
	}
}
