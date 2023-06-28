import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import Project.ConnectionProviderClass;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;
import javax.swing.Timer;


public class quizExamStudent extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2 ;
	private JRadioButton rdbtnNewRadioButton_3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	
	
	
	public String questionId="1";
	
	public String answer;
	public int min=0;
	public int sec=0;
	public int marks=0;
	ArrayList<Integer> a=new ArrayList<Integer>();
	//new
	public int correct_ans=0;
	public int wrong_ans=0;
	int qno=2;
	
	
	
	

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public quizExamStudent() {
		setTitle("ExamEase | Student Exam");
		
		contentPane = new JPanel();
		contentPane.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 224, 208));
		panel.setBounds(0, 0, 1366, 110);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 10, 66, 49);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\index student.png"));
		panel.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME");
		lblNewLabel_1.setBounds(64, 10, 207, 54);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 40));
		
		JLabel lblNewLabel_2 = new JLabel("Date:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(504, 36, 66, 23);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(601, 36, 154, 23);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Time:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(1071, 27, 66, 23);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("10 Min");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(1224, 27, 100, 23);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Time Taken:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setBounds(1068, 67, 138, 29);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("00");
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_7.setBounds(1224, 60, 45, 43);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("00");
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_8.setBounds(1279, 60, 45, 43);
		panel.add(lblNewLabel_8);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(64, 224, 208));
		panel_1.setBounds(0, 108, 354, 780);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Roll Number:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_9.setBounds(10, 33, 167, 25);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("00");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_10.setBounds(213, 33, 121, 23);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Name:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_11.setBounds(10, 81, 131, 25);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Student");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_12.setBounds(96, 81, 235, 23);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Total Question:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_13.setBounds(10, 142, 153, 25);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("10");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_14.setBounds(213, 142, 121, 25);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Question Number:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_15.setBounds(10, 211, 183, 25);
		panel_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("00");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_16.setBounds(213, 214, 121, 19);
		panel_1.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Your Marks:");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_17.setBounds(10, 273, 167, 25);
		panel_1.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("00");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_18.setBounds(213, 274, 121, 23);
		panel_1.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Question Demo?");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_19.setBounds(392, 150, 1366, 36);
		contentPane.add(lblNewLabel_19);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(392, 224, 924, 33);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton_1.setBounds(392, 279, 924, 33);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton_2.setBounds(392, 334, 924, 33);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton_3.setBounds(392, 390, 924, 33);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JButton btnNewButton = new JButton("Save & Next");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\Next.png"));
		btnNewButton.setBounds(392, 567, 198, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\save.png"));
		btnNewButton_1.setBounds(1180, 567, 136, 36);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\examstudent.jpg"));
		lblNewLabel_20.setBounds(10, -14, 1366, 768);
		contentPane.add(lblNewLabel_20);		
		
		JButton btnNewButton_2 = new JButton("Clear Response");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\clear.png"));
		btnNewButton_2.setBounds(757, 567, 227, 36);
		contentPane.add(btnNewButton_2);
	
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(false);
				rdbtnNewRadioButton_3.setSelected(false);
			}
		});
		
		
		
//		//working
//		
//		rdbtnNewRadioButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if(rdbtnNewRadioButton.isSelected()) 
//				{
//					rdbtnNewRadioButton_1.setSelected(false);
//					rdbtnNewRadioButton_2.setSelected(false);
//					rdbtnNewRadioButton_3.setSelected(false);
//				}
//			}
//		});
//		
//		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if(rdbtnNewRadioButton_1.isSelected()) 
//				{
//					rdbtnNewRadioButton.setSelected(false);
//					rdbtnNewRadioButton_2.setSelected(false);
//					rdbtnNewRadioButton_3.setSelected(false);
//				}
//			}
//		});
//		
//		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				if(rdbtnNewRadioButton_2.isSelected()) 
//				{
//					rdbtnNewRadioButton.setSelected(false);
//					rdbtnNewRadioButton_1.setSelected(false);
//					rdbtnNewRadioButton_3.setSelected(false);
//				}
//			}
//		});
//		
//		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				if(rdbtnNewRadioButton_3.isSelected()) 
//				{
//					rdbtnNewRadioButton.setSelected(false);
//					rdbtnNewRadioButton_1.setSelected(false);
//					rdbtnNewRadioButton_2.setSelected(false);
//				}
//			}
//		});
//		
//		
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				answerCheck();
//				question();
//			}
//		});
//		
//		
//		btnNewButton_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				int a=JOptionPane.showConfirmDialog(null, "Do you really want to submit","Select",JOptionPane.YES_NO_OPTION);
//				if(a==0)
//				{
//					answerCheck();
//					submit();
//				}
//			}
//		});
//			
//		//date
//		SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
//		Date date = new Date();
//		lblNewLabel_3.setText(dFormat.format(date));
//		
		
		
	}
	
	Timer time;
	public quizExamStudent(String rollNo) {
		
		setTitle("ExamEase | Student Exam");
		contentPane = new JPanel();
		contentPane.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 224, 208));
		panel.setBounds(0, 0, 1366, 110);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 10, 66, 49);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\index student.png"));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME");
		lblNewLabel_1.setBounds(64, 10, 207, 54);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 40));
		
		JLabel lblNewLabel_2 = new JLabel("Date:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(504, 36, 66, 23);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(601, 36, 154, 23);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Time:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(1071, 27, 66, 23);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("10 Min");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(1224, 27, 100, 23);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Time Taken:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setBounds(1071, 71, 138, 29);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("00");
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_7.setBounds(1224, 60, 45, 43);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("00");
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_8.setBounds(1279, 60, 45, 43);
		panel.add(lblNewLabel_8);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(64, 224, 208));
		panel_1.setBounds(0, 108, 354, 780);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Roll Number:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_9.setBounds(10, 33, 167, 25);
		panel_1.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("00");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_10.setBounds(213, 33, 121, 23);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Name:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_11.setBounds(10, 81, 131, 25);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Student");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_12.setBounds(96, 81, 235, 23);  
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Total Question:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_13.setBounds(10, 142, 153, 25);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("10");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_14.setBounds(213, 142, 121, 25);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Question Number:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_15.setBounds(10, 211, 183, 25);
		panel_1.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("00");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_16.setBounds(213, 214, 121, 19);
		panel_1.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Your Marks:");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_17.setBounds(10, 273, 167, 25);
		panel_1.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("00");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_18.setBounds(213, 274, 121, 23);
		panel_1.add(lblNewLabel_18);
		
		lblNewLabel_19 = new JLabel("Question Demo?");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_19.setBounds(392, 150, 1366, 36);
		contentPane.add(lblNewLabel_19);
		
		
		rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(392, 224, 924, 33);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton_1.setBounds(392, 279, 924, 33);
		contentPane.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton_2.setBounds(392, 334, 924, 33);
		contentPane.add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_3 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton_3.setBounds(392, 390, 924, 33);
		contentPane.add(rdbtnNewRadioButton_3);
		
		btnNewButton = new JButton("Save & Next");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\Next.png"));
		btnNewButton.setBounds(392, 567, 198, 36);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\save.png"));
		btnNewButton_1.setBounds(1180, 567, 136, 36);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Clear Response");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\clear.png"));
		btnNewButton_2.setBounds(757, 567, 227, 36);
		contentPane.add(btnNewButton_2);
	
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(false);
				rdbtnNewRadioButton_3.setSelected(false);
			}
		});
		
		JLabel lblNewLabel_20 = new JLabel("00");
		lblNewLabel_20.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\examstudent.jpg"));
		lblNewLabel_20.setBounds(10, -14, 1366, 768);
		contentPane.add(lblNewLabel_20);
		
		
		//working
		
		lblNewLabel_10.setText(rollNo);
		//date
		SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		lblNewLabel_3.setText(dFormat.format(date));
				
		//first question and student details
		try 
		{
			Connection con = ConnectionProviderClass.getCon();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student where rollNo='"+rollNo+"'");
			while(rs.next())
			{
				lblNewLabel_12.setText(rs.getString(2));
				
			}
			Integer qsn;
			Random random=new Random();
			while(true) {
				qsn=(int) random.nextInt(11);
				if(!a.contains(qsn)&&qsn!=0) {
						a.add(qsn);
						break;
				}
			}
			String q;
			System.out.println(qsn);
			q=Integer.toString(qsn);
			//System.out.println(questionId);
			ResultSet rs1 = st.executeQuery("select * from question where id='"+q+"'");
			while(rs1.next())
			{
				lblNewLabel_16.setText("1");
				lblNewLabel_19.setText(rs1.getString(2));
				
				rdbtnNewRadioButton.setText(rs1.getString(3));
				rdbtnNewRadioButton_1.setText(rs1.getString(4));
				rdbtnNewRadioButton_2.setText(rs1.getString(5));
				rdbtnNewRadioButton_3.setText(rs1.getString(6));
				answer = rs1.getString(7);
			}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
		
		
		//time program
		setLocationRelativeTo(this);
		time = new Timer(1000,new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_8.setText(String.valueOf(sec));
				lblNewLabel_7.setText(String.valueOf(min));
				if(sec==60)
				{
					sec=0;
					min++;
					if(min==1)
					{
						time.stop();
						answerCheck();
						submit();
					}
				}
				sec++;
			}
					
		});
		time.start();
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				answerCheck();
				question();
			}
		});
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a=JOptionPane.showConfirmDialog(null, "Do you really want to submit","Select",JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					answerCheck();
					submit();
					time.stop();
				}
			}
		});
		
		

		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) 
				{
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
					rdbtnNewRadioButton_3.setSelected(false);
				}
			}
		});
		
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1.isSelected()) 
				{
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
					rdbtnNewRadioButton_3.setSelected(false);
				}
			}
		});
		
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnNewRadioButton_2.isSelected()) 
				{
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_3.setSelected(false);
				}
			}
		});
		
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnNewRadioButton_3.isSelected()) 
				{
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
				}
			}
		});
		
		
	}
	
	public void answerCheck()
	{
		int flag = 0;
		String studentAnswer ="";
		if(rdbtnNewRadioButton.isSelected())
		{
			studentAnswer = rdbtnNewRadioButton.getText();
			flag = 1;
		}
		else if(rdbtnNewRadioButton_1.isSelected())
		{
			studentAnswer = rdbtnNewRadioButton_1.getText();
			flag = 1;
		}
		else if(rdbtnNewRadioButton_2.isSelected())
		{
			studentAnswer = rdbtnNewRadioButton_2.getText();
			flag = 1;
		}
		else
		{
			studentAnswer = rdbtnNewRadioButton_3.getText();
			flag = 1;
		}
		
//		if(studentAnswer.equals(answer) && flag==1)
//		{
//			marks = marks+2;
//			correct_ans = correct_ans+1;
//			String marks1 = String.valueOf(marks);
//			lblNewLabel_18.setText(marks1);
//		}
		
		if(flag==1 && (rdbtnNewRadioButton.isSelected() || rdbtnNewRadioButton_1.isSelected() || rdbtnNewRadioButton_2.isSelected() || rdbtnNewRadioButton_3.isSelected()))
		{
			if(studentAnswer.equals(answer)) {
				marks = marks+2;
				correct_ans = correct_ans+1;
				String marks1 = String.valueOf(marks);
				lblNewLabel_18.setText(marks1);
			}
			else{
				wrong_ans = wrong_ans+1;
			}
			
		}
		
//		else
//		{
//			marks = marks+ 0;
//			String marks1 = String.valueOf(marks);
//			lblNewLabel_18.setText(marks1);
//		}
		
		
		//question number change
		int questionId1 = Integer.parseInt(questionId);
		questionId1 = questionId1+1;
		questionId = String.valueOf(questionId1);
		
		//clear radio button
		rdbtnNewRadioButton.setSelected(false);
		rdbtnNewRadioButton_1.setSelected(false);
		rdbtnNewRadioButton_2.setSelected(false);
		rdbtnNewRadioButton_3.setSelected(false);
		
		//last question hide button
		if(questionId.equals("10"))
		{
			btnNewButton.setVisible(false);
		}
		
	}
	
	
	public void question()
	{
		try
		{
			Connection con = ConnectionProviderClass.getCon();
			Statement st = con.createStatement();
			Integer qsn;
			Random random=new Random();
			
			while(true) {
				qsn=(int) random.nextInt(11);
				if(!a.contains(qsn)&&qsn!=0) {
						a.add(qsn);
						break;
				}
			}
			System.out.println(qsn);
			String q=Integer.toString(qsn);
			//System.out.println(questionId);
			ResultSet rs1 = st.executeQuery("select * from question where id='"+q+"'");
			while(rs1.next())
			{
				lblNewLabel_16.setText(Integer.toString(qno));
				lblNewLabel_19.setText(rs1.getString(2));
				rdbtnNewRadioButton.setText(rs1.getString(3));
				rdbtnNewRadioButton_1.setText(rs1.getString(4));
				rdbtnNewRadioButton_2.setText(rs1.getString(5));
				rdbtnNewRadioButton_3.setText(rs1.getString(6));
				answer = rs1.getString(7);
			}
			qno++;
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	
	public void submit() 
	{
		String rollNo =  lblNewLabel_10.getText();
		answerCheck();
		try
		{
			Connection con = ConnectionProviderClass.getCon();
			Statement st = con.createStatement();
			
			//marks calculation
			int marksobt = ((correct_ans*2) - (wrong_ans*1)) ;
			if(marksobt < 0) {
				marksobt = 0;
			}
			
			String total_marks = Integer.toString(marksobt);
		
			int total_answer = correct_ans + wrong_ans;
			
			String total_answer_question =Integer.toString(total_answer);
			String total_wrong =Integer.toString(wrong_ans);
			
			//st.executeUpdate("update student set marks='"+marksobt+"' where rollNo='"+rollNo+"'");
			//new
			
			Date date = new Date();
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			
			PreparedStatement ps = con.prepareStatement("update result set doe=?,marksobt=?,total_attempted=?,wrong_answer=? where rollNo=?");
			ps.setDate(1, sqlDate);
			ps.setString(2, total_marks);
			ps.setString(3, total_answer_question);
			ps.setString(4, total_wrong);
			ps.setString(5, rollNo);
			ps.executeUpdate();
			
			setVisible(false);
			new successfullySubmitted(rollNo,total_marks,total_answer_question,total_wrong).setVisible(true);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quizExamStudent frame = new quizExamStudent();
					//frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

