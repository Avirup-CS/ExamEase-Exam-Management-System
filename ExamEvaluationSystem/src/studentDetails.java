import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;


import java.sql.*;
import Project.ConnectionProviderClass;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



public class studentDetails extends JFrame {

	public String rollNo;
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtEnterUniversityName;
	private JTextField txtEnterPercentage;
	private JTextField txtEnterPassoutYear;
	private JTextField txtEnterUniversityName_1;
	private JTextField txtEnterPercentage_1;
	private JTextField txtEnterPassoutYear_1;
	private JTextField txtEnterUniversityName_2;
	private JTextField txtEnterPercentage_2;
	private JTextField txtEnterPassoutYear_2;
	private JTextField textField_15;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public studentDetails() {
		setTitle("ExamEase | Student Sign Up");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\index student.png"));
		lblNewLabel.setBounds(10, 22, 60, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fill up the form");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 40));
		lblNewLabel_1.setBounds(80, 22, 362, 52);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date:");
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(608, 35, 60, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Time:");
		lblNewLabel_3.setForeground(new Color(0, 0, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(678, 35, 162, 25);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton(" Back");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\Back.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(1218, 640, 134, 31);
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 77, 1342, 11);
		contentPane.add(separator);
		
		JLabel lblNewLabel_4 = new JLabel("Roll No:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(10, 555, 123, 24);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Name:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(10, 164, 139, 24);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Father Name:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setBounds(10, 203, 139, 24);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Mother Name:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_7.setBounds(558, 199, 143, 25);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Gender:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_8.setBounds(10, 240, 139, 24);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblContactNumber = new JLabel("Contact No.:");
		lblContactNumber.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblContactNumber.setBounds(10, 278, 176, 24);
		contentPane.add(lblContactNumber);
		
		JLabel lblNewLabel_9 = new JLabel("Email ID:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_9.setBounds(605, 237, 96, 31);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("10th");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_10.setBounds(10, 439, 85, 24);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("12th");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_11.setBounds(10, 477, 85, 24);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Graduation");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_12.setBounds(10, 518, 113, 24);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Address:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_13.setBounds(10, 312, 113, 24);
		contentPane.add(lblNewLabel_13);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(141, 557, 311, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
//		textField_1.addKeyListener(new KeyAdapter() {
//			@Override
//			public void keyReleased(KeyEvent e) {
//				
//				String namePattern = "^[a-zA-Z]{5,50}$";
//				Pattern patt = Pattern.compile(namePattern);
//				Matcher match=patt.matcher(textField_1.getText());
//				if(!match.matches()) {
//					JFrame jf = new JFrame();
//					jf.setAlwaysOnTop(true);
//					JOptionPane.showMessageDialog(jf,"Naming is incorrect !!");
//				}
//				else {
//					JFrame jf = new JFrame();
//					jf.setAlwaysOnTop(true);
//					JOptionPane.showMessageDialog(jf,null);
//				}
//			}
//		});
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setBounds(193, 166, 311, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2.setBounds(193, 203, 311, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_3.setBounds(732, 203, 311, 24);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select your gender","Male", "Female", "Other"}));
		comboBox.setBounds(193, 241, 311, 24);
		contentPane.add(comboBox);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_4.setBounds(193, 280, 311, 24);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_5.setBounds(732, 241, 311, 24);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		txtEnterUniversityName = new JTextField();
		txtEnterUniversityName.setForeground(new Color(192, 192, 192));
		txtEnterUniversityName.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtEnterUniversityName.setText("Enter University Name");
		txtEnterUniversityName.setBounds(141, 441, 311, 24);
		contentPane.add(txtEnterUniversityName);
		txtEnterUniversityName.setColumns(10);
		
		txtEnterPercentage = new JTextField();
		txtEnterPercentage.setForeground(new Color(192, 192, 192));
		txtEnterPercentage.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtEnterPercentage.setText("Enter Percentage");
		txtEnterPercentage.setBounds(511, 441, 170, 24);
		contentPane.add(txtEnterPercentage);
		txtEnterPercentage.setColumns(10);
		
		txtEnterPassoutYear = new JTextField();
		txtEnterPassoutYear.setForeground(new Color(192, 192, 192));
		txtEnterPassoutYear.setText("Enter Passout Year");
		txtEnterPassoutYear.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtEnterPassoutYear.setBounds(746, 441, 190, 24);
		contentPane.add(txtEnterPassoutYear);
		txtEnterPassoutYear.setColumns(10);
		
		txtEnterUniversityName_1 = new JTextField();
		txtEnterUniversityName_1.setForeground(new Color(192, 192, 192));
		txtEnterUniversityName_1.setText("Enter University Name");
		txtEnterUniversityName_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtEnterUniversityName_1.setBounds(141, 478, 311, 24);
		contentPane.add(txtEnterUniversityName_1);
		txtEnterUniversityName_1.setColumns(10);
		
		txtEnterPercentage_1 = new JTextField();
		txtEnterPercentage_1.setForeground(new Color(192, 192, 192));
		txtEnterPercentage_1.setText("Enter Percentage");
		txtEnterPercentage_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtEnterPercentage_1.setBounds(511, 478, 170, 24);
		contentPane.add(txtEnterPercentage_1);
		txtEnterPercentage_1.setColumns(10);
		
		txtEnterPassoutYear_1 = new JTextField();
		txtEnterPassoutYear_1.setForeground(new Color(192, 192, 192));
		txtEnterPassoutYear_1.setText("Enter Passout Year");
		txtEnterPassoutYear_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtEnterPassoutYear_1.setBounds(746, 478, 190, 24);
		contentPane.add(txtEnterPassoutYear_1);
		txtEnterPassoutYear_1.setColumns(10);
		
		txtEnterUniversityName_2 = new JTextField();
		txtEnterUniversityName_2.setForeground(new Color(192, 192, 192));
		txtEnterUniversityName_2.setText("Enter University Name");
		txtEnterUniversityName_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtEnterUniversityName_2.setBounds(141, 518, 311, 24);
		contentPane.add(txtEnterUniversityName_2);
		txtEnterUniversityName_2.setColumns(10);
		
		txtEnterPercentage_2 = new JTextField();
		txtEnterPercentage_2.setForeground(new Color(192, 192, 192));
		txtEnterPercentage_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtEnterPercentage_2.setText("Enter Percentage");
		txtEnterPercentage_2.setBounds(511, 518, 170, 24);
		contentPane.add(txtEnterPercentage_2);
		txtEnterPercentage_2.setColumns(10);
		
		txtEnterPassoutYear_2 = new JTextField();
		txtEnterPassoutYear_2.setForeground(new Color(192, 192, 192));
		txtEnterPassoutYear_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtEnterPassoutYear_2.setText("Enter Passout Year");
		txtEnterPassoutYear_2.setBounds(746, 518, 190, 24);
		contentPane.add(txtEnterPassoutYear_2);
		txtEnterPassoutYear_2.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_15.setBounds(193, 317, 612, 24);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Save & Next");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\save.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(640, 657, 200, 31);
		contentPane.add(btnNewButton_2);
		
		JTextArea txtrExaminationManagementSystem = new JTextArea();
		txtrExaminationManagementSystem.setWrapStyleWord(true);
		txtrExaminationManagementSystem.setLineWrap(true);
		txtrExaminationManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtrExaminationManagementSystem.setText("ExamEase is managing all activities related to examination management right from receipt of Enrollment Forms and Examination Forms through the processing of Results and Certificates and Grading Reports.");
		txtrExaminationManagementSystem.setBounds(558, 77, 794, 91);
		contentPane.add(txtrExaminationManagementSystem);
		txtrExaminationManagementSystem.setEditable(false);
		
		
		//for the date
		SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		lblNewLabel_3.setText(dFormat.format(date));
		
		JLabel lblNewLabel_16 = new JLabel("Password");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_16.setBounds(10, 589, 113, 24);
		contentPane.add(lblNewLabel_16);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 16));
		passwordField.setBounds(141, 589, 311, 24);
		contentPane.add(passwordField);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		chckbxNewCheckBox.setBounds(488, 591, 193, 24);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_15 = new JLabel("Personal Information:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_15.setBounds(10, 91, 422, 34);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_17 = new JLabel("Academic Information:");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_17.setBounds(10, 365, 376, 40);
		contentPane.add(lblNewLabel_17);
		
		JButton btnNewButton_3 = new JButton("Clear");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\clear.png"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(437, 657, 200, 31);
		contentPane.add(btnNewButton_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 355, 1352, 11);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 636, 1352, 11);
		contentPane.add(separator_2);
		
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
		
		
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\student_manage.jpg"));
		lblNewLabel_14.setBounds(0, 0, 1366, 768);
		contentPane.add(lblNewLabel_14);
		
		
		
		//working
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new studentHome().setVisible(true);
			}
		});
		
		
		txtEnterUniversityName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(txtEnterUniversityName.getText().equals("Enter University Name"))
				{
					txtEnterUniversityName.setText("");
					txtEnterUniversityName.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtEnterUniversityName.getText().equals(""))
				{
					txtEnterUniversityName.setText("Enter University Name");
					txtEnterUniversityName.setForeground(new Color(153,153,153));
				}
			}
		});
		
		
		txtEnterPercentage.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(txtEnterPercentage.getText().equals("Enter Percentage"))
				{
					txtEnterPercentage.setText("");
					txtEnterPercentage.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtEnterPercentage.getText().equals(""))
				{
					txtEnterPercentage.setText("Enter Percentage");
					txtEnterPercentage.setForeground(new Color(153,153,153));
				}
			}
		});
		
		
		txtEnterPassoutYear.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(txtEnterPassoutYear.getText().equals("Enter Passout Year"))
				{
					txtEnterPassoutYear.setText("");
					txtEnterPassoutYear.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtEnterPassoutYear.getText().equals(""))
				{
					txtEnterPassoutYear.setText("Enter Passout Year");
					txtEnterPassoutYear.setForeground(new Color(153,153,153));
				}
			}
		});
		
		
		txtEnterUniversityName_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(txtEnterUniversityName_1.getText().equals("Enter University Name"))
				{
					txtEnterUniversityName_1.setText("");
					txtEnterUniversityName_1.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtEnterUniversityName_1.getText().equals(""))
				{
					txtEnterUniversityName_1.setText("Enter University Name");
					txtEnterUniversityName_1.setForeground(new Color(153,153,153));
				}
			}
		});
		
		
		txtEnterPercentage_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(txtEnterPercentage_1.getText().equals("Enter Percentage"))
				{
					txtEnterPercentage_1.setText("");
					txtEnterPercentage_1.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtEnterPercentage_1.getText().equals(""))
				{
					txtEnterPercentage_1.setText("Enter Percentage");
					txtEnterPercentage_1.setForeground(new Color(153,153,153));
				}
			}
		});
		
		
		txtEnterPassoutYear_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(txtEnterPassoutYear_1.getText().equals("Enter Passout Year"))
				{
					txtEnterPassoutYear_1.setText("");
					txtEnterPassoutYear_1.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtEnterPassoutYear_1.getText().equals(""))
				{
					txtEnterPassoutYear_1.setText("Enter Passout Year");
					txtEnterPassoutYear_1.setForeground(new Color(153,153,153));
				}
			}
		});
		
		
		txtEnterUniversityName_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(txtEnterUniversityName_2.getText().equals("Enter University Name"))
				{
					txtEnterUniversityName_2.setText("");
					txtEnterUniversityName_2.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtEnterUniversityName_2.getText().equals(""))
				{
					txtEnterUniversityName_2.setText("Enter University Name");
					txtEnterUniversityName_2.setForeground(new Color(153,153,153));
				}
			}
		});
		
		
		
		txtEnterPercentage_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(txtEnterPercentage_2.getText().equals("Enter Percentage"))
				{
					txtEnterPercentage_2.setText("");
					txtEnterPercentage_2.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtEnterPercentage_2.getText().equals(""))
				{
					txtEnterPercentage_2.setText("Enter Percentage");
					txtEnterPercentage_2.setForeground(new Color(153,153,153));
				}
			}
		});
		
		
		txtEnterPassoutYear_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(txtEnterPassoutYear_2.getText().equals("Enter Passout Year"))
				{
					txtEnterPassoutYear_2.setText("");
					txtEnterPassoutYear_2.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtEnterPassoutYear_2.getText().equals(""))
				{
					txtEnterPassoutYear_2.setText("Enter Passout Year");
					txtEnterPassoutYear_2.setForeground(new Color(153,153,153));
				}
			}
		});
		
		
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String rollNo = textField.getText();
				String name = textField_1.getText();
				String fatherName = textField_2.getText();
				String motherName = textField_3.getText();
				String gender = (String)comboBox.getSelectedItem();
				String contactNo = textField_4.getText();
				String email = textField_5.getText();
				String tenthUniversityName = txtEnterUniversityName.getText();
				String tenthPercentage = txtEnterPercentage.getText();
				String tenthPassoutYear = txtEnterPassoutYear.getText();
				String twelveUniversityName = txtEnterUniversityName_1.getText();
				String twelvePercentage = txtEnterPercentage_1.getText();
				String twelvePassoutYear = txtEnterPassoutYear_1.getText();
				String graduationUniversityName = txtEnterUniversityName_2.getText();
				String graduationPercentage = txtEnterPercentage_2.getText();
				String graduationPassoutYear = txtEnterPassoutYear_2.getText();
				String address = textField_15.getText();
				String password = passwordField.getText();
				
				
				
				try {

						String namePattern = "^[a-zA-Z\\s]+$";
						Pattern patt1 = Pattern.compile(namePattern);
						Matcher match1=patt1.matcher(textField_1.getText());
						Matcher match2=patt1.matcher(textField_2.getText());
						Matcher match3=patt1.matcher(textField_3.getText());
						
						String contactnoPattern = "^[0-9]{10}$";
						Pattern patt2 = Pattern.compile(contactnoPattern);
						Matcher match4=patt2.matcher(textField_4.getText());
						
						String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
						Pattern patt3 = Pattern.compile(emailPattern);
						Matcher match5=patt3.matcher(textField_5.getText());
						
						String rollPattern = "^[A-Za-z0-9\\-]+$";
						Pattern patt4 = Pattern.compile(rollPattern);
						Matcher match6=patt4.matcher(textField.getText());
						
						String universitynamePattern =  "^[a-zA-Z.,\\s]+$";
						Pattern patt5 = Pattern.compile(universitynamePattern);
						Matcher match7=patt5.matcher(txtEnterUniversityName.getText());
						Matcher match10=patt5.matcher(txtEnterUniversityName_1.getText());
						Matcher match13=patt5.matcher(txtEnterUniversityName_2.getText());
						
						String percentagePattern = "^\\d+(\\.\\d+)?%?$";
						Pattern patt6 = Pattern.compile(percentagePattern);
						Matcher match8=patt6.matcher(txtEnterPercentage.getText());
						Matcher match11=patt6.matcher(txtEnterPercentage_1.getText());
						Matcher match14=patt6.matcher(txtEnterPercentage_2.getText());
						
						String passoutyearPattern = "^\\d{4}$";
						Pattern patt7 = Pattern.compile(passoutyearPattern);
						Matcher match9=patt7.matcher(txtEnterPassoutYear.getText());
						Matcher match12=patt7.matcher(txtEnterPassoutYear_1.getText());
						Matcher match15=patt7.matcher(txtEnterPassoutYear_2.getText());
						
						String addressPattern = "^[A-Za-z0-9.,/\\s\\-]+$";
						Pattern patt8 = Pattern.compile(addressPattern);
						Matcher match16=patt8.matcher(textField_15.getText());
						
						String passwordPattern = "^(?=.*[0-9])(?=.*[A-Za-z])(?=.*[@]).*$";
						Pattern patt9 = Pattern.compile(passwordPattern);
						Matcher match17=patt9.matcher(passwordField.getText());
						
				
					if(!match6.matches()) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Roll No. is empty / Incorrect form !!");
					}
					else if(!match1.matches()) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Name is empty / Incorrect form !!");
					}
					else if(!match2.matches()) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Father Name is empty / Incorrect form !!");
					}
					else if(!match3.matches()) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Mother Name is empty / Incorrect form !!");
					}
					
					else if(comboBox.getSelectedIndex() == 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"select your gender !!");
					}
					
					else if(!match4.matches()) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Contact No. is empty / Incorrect form !!");
					}
					else if(!match5.matches()) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Email ID is empty / Incorrect form!!");
					}
					else if(!match7.matches()) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"10th University Name is empty / Incorrect form !!");
					}
					else if(!match8.matches()) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"10th Percentage is empty / Incorrect form !!");
					}
					else if(!match9.matches()) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"10th Passout Year is empty / Incorrect form !!");
					}
					else if(!match10.matches()) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"12th University Name is empty / Incorrect !!");
					}
					else if(!match11.matches()) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"12th Percentage is empty / Incorrect form !!");
					}
					else if(!match12.matches()) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"12th Passout Year is empty / Incorrect form !!");
					}
					else if(!match13.matches()) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Graduation University Name is empty / Incorrect form !!");
					}
					else if(!match14.matches()) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Graduation Percentage is empty / Incorrect form !!");
					}
					else if(!match15.matches()) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Graduation Passout Year is empty / Incorrect form !!");
					}
					else if(!match16.matches()) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Address. is empty / Incorrect form !!");
					}
					else if(!match17.matches()) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Password is empty / Incorrect form !! [doesn't accept - &,*,^,',$,%,/ ] [atleast 1 character,1 number,1 @]");
					}
					else {
						Connection con = ConnectionProviderClass.getCon();
						PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
						
						ps.setString(1, rollNo);
						ps.setString(2, name);
						ps.setString(3, fatherName);
						ps.setString(4, motherName);
						ps.setString(5, gender);
						ps.setString(6, contactNo);
						ps.setString(7, email);
						ps.setString(8, tenthUniversityName);
						ps.setString(9, tenthPercentage);
						ps.setString(10, tenthPassoutYear);
						ps.setString(11, twelveUniversityName);
						ps.setString(12, twelvePercentage);
						ps.setString(13, twelvePassoutYear);
						ps.setString(14, graduationUniversityName);
						ps.setString(15, graduationPercentage);
						ps.setString(16, graduationPassoutYear);
						ps.setString(17, address);
						ps.setString(18, password);
						ps.executeUpdate();
						
						//inserting data into result table
						PreparedStatement ps1 = con.prepareStatement("insert into result(rollNo,name) values(?,?)");
						ps1.setString(1, rollNo);
						ps1.setString(2, name);
						ps1.executeUpdate();
						
						
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf, "Registration Successful.");
						
						setVisible(false);
						new studentHome().setVisible(true);
						
						
						
//						new instructionStudent(rollNo).setVisible(true);
//						new instructionStudent().setVisible(true);
//						new quizExamStudent(rollNo).setVisible(true);
					}
				
				}catch(Exception e4){
					
					JOptionPane.showMessageDialog(null, e4);
				}
			}
		});
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				comboBox.setSelectedIndex(0);
				textField_4.setText("");
				textField_5.setText("");
				txtEnterUniversityName.setText("");
				txtEnterPercentage.setText("");
				txtEnterPassoutYear.setText("");
				txtEnterUniversityName_1.setText("");
				txtEnterPercentage_1.setText("");
				txtEnterPassoutYear_1.setText("");
				txtEnterUniversityName_2.setText("");
				txtEnterPercentage_2.setText("");
				txtEnterPassoutYear_2.setText("");
				textField_15.setText("");
				passwordField.setText("");
				
				
				
			}
		});
	}	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentDetails frame = new studentDetails();
					//frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
