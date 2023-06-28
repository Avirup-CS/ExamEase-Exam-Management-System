import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Project.ConnectionProviderClass;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;

public class successfullySubmitted extends JFrame {

	private JPanel contentPane;
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					successfullySubmitted frame = new successfullySubmitted();
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
	public successfullySubmitted() {
		setTitle("ExamEase | Student Result");
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
		lblNewLabel.setBounds(113, 460, 229, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Successfully Submitted");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(211, 607, 336, 40);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(69, 193, 794, 10);
		contentPane.add(separator);
		
		JLabel lblNewLabel_3 = new JLabel("Student Roll No.:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(112, 213, 229, 40);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Student Name:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_4.setBounds(113, 263, 252, 40);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gender:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_5.setBounds(113, 309, 150, 40);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Date of Examination:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_6.setBounds(112, 359, 331, 40);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Action:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_7.setBounds(113, 607, 106, 40);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Exam Score Report");
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_8.setBounds(248, 122, 556, 61);
		contentPane.add(lblNewLabel_8);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(69, 657, 794, 10);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_9 = new JLabel("date");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_9.setBounds(409, 359, 197, 40);
		contentPane.add(lblNewLabel_9);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(0, 0, 1366, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\home.jpg"));
		btnNewButton.setBounds(1175, 0, 181, 60);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\all student result.png"));
		lblNewLabel_19.setBounds(10, 0, 61, 60);
		panel.add(lblNewLabel_19);
		
		//date
		SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		lblNewLabel_9.setText(dFormat.format(date));
		
		JLabel lblNewLabel_10 = new JLabel("gender");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_10.setBounds(237, 309, 163, 40);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("student");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_11.setBounds(318, 263, 520, 40);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("roll no");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_12.setBounds(338, 213, 318, 40);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblQuestionsAttempted = new JLabel("Questions Attempted:");
		lblQuestionsAttempted.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblQuestionsAttempted.setBounds(113, 510, 298, 40);
		contentPane.add(lblQuestionsAttempted);
		
		JLabel lblNewLabel_13 = new JLabel("Total Questions / Total Marks:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_13.setBounds(113, 409, 402, 40);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Wrong Answers:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_14.setBounds(112, 560, 230, 40);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("attempted");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_15.setBounds(391, 510, 150, 40);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("wrong");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_16.setBounds(338, 560, 106, 40);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("00");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_17.setBounds(338, 460, 143, 40);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("10 / 20");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_18.setBounds(514, 409, 197, 40);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\resultbg.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1376, 768);
		contentPane.add(lblNewLabel_2);
		
	
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new index().setVisible(true);
			}
		});
		
		
	}
	
	public successfullySubmitted(String rollNo,String total_marks,String total_answer_question,String total_wrong) {
		
		setTitle("ExamEase | Student Result");
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
		lblNewLabel.setBounds(113, 460, 229, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Successfully Submitted");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(211, 607, 336, 40);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(69, 193, 794, 10);
		contentPane.add(separator);
		
		JLabel lblNewLabel_3 = new JLabel("Student Roll No.:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(112, 213, 229, 40);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Student Name:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_4.setBounds(113, 263, 252, 40);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gender:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_5.setBounds(113, 309, 150, 40);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Date of Examination:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_6.setBounds(112, 359, 331, 40);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Action:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_7.setBounds(113, 607, 106, 40);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Exam Score Report");
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_8.setBounds(248, 122, 556, 61);
		contentPane.add(lblNewLabel_8);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(69, 657, 794, 10);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_9 = new JLabel("date");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_9.setBounds(409, 359, 197, 40);
		contentPane.add(lblNewLabel_9);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(0, 0, 1366, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\home.jpg"));
		btnNewButton.setBounds(1175, 0, 181, 60);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\all student result.png"));
		lblNewLabel_19.setBounds(10, 0, 61, 60);
		panel.add(lblNewLabel_19);
		
		//date
		SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		lblNewLabel_9.setText(dFormat.format(date));
		
		JLabel lblNewLabel_10 = new JLabel("gender");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_10.setBounds(237, 309, 163, 40);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("student");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_11.setBounds(318, 263, 520, 40);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("roll no");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_12.setBounds(338, 213, 318, 40);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblQuestionsAttempted = new JLabel("Questions Attempted:");
		lblQuestionsAttempted.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblQuestionsAttempted.setBounds(113, 510, 298, 40);
		contentPane.add(lblQuestionsAttempted);
		
		JLabel lblNewLabel_13 = new JLabel("Total Questions / Total Marks:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_13.setBounds(113, 409, 402, 40);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Wrong Answers:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_14.setBounds(112, 560, 230, 40);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("attempted");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_15.setBounds(391, 510, 150, 40);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("wrong");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_16.setBounds(338, 560, 106, 40);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("00");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_17.setBounds(338, 460, 143, 40);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("10 / 20");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_18.setBounds(514, 409, 197, 40);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\resultbg.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1376, 768);
		contentPane.add(lblNewLabel_2);
		
		
		lblNewLabel_12.setText(rollNo);
		
		//student details
		try 
		{
			Connection con = ConnectionProviderClass.getCon();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select name,gender from student where rollNo='"+rollNo+"'");
			while(rs.next())
			{
				lblNewLabel_11.setText(rs.getString(1));
				lblNewLabel_10.setText(rs.getString(2));
			}
					
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
		
		
		lblNewLabel_17.setText(total_marks);
		lblNewLabel_15.setText(total_answer_question);
		lblNewLabel_16.setText(total_wrong);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new index().setVisible(true);
			}
		});
		
	}
}
