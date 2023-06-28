import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class instructionStudent extends JFrame {
	
	public String rollNo;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					instructionStudent frame = new instructionStudent();
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
	
	
	public instructionStudent() {
		setTitle("ExamEase | Student Exam Instruction");
		
		contentPane = new JPanel();
		contentPane.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\index student.png"));
		lblNewLabel.setBounds(10, 10, 66, 68);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Instruction");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 40));
		lblNewLabel_1.setBounds(88, 23, 271, 49);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 88, 1352, 8);
		contentPane.add(separator);
		
		JTextArea txtrTheStudent = new JTextArea();
		txtrTheStudent.setLineWrap(true);
		txtrTheStudent.setWrapStyleWord(true);
		txtrTheStudent.setFont(new Font("Monospaced", Font.BOLD, 25));
		txtrTheStudent.setText("1.All questions are MCQ (multiple choice question). \r\n\r\n2.Students must not stop the session and then return to it. You will be able to view your marks after completing the exam. When you press save&next of a question, your response is automatically saved in your own answer sheet.\r\n\r\n3.You can attempt the test only 1 time, So start the test when you are prepared to give.\r\n\r\nTotal Marks: 20\r\nNumber of Question: 10\r\nEach Question Carries: 2 Marks\r\nNegative Marking For Each Incorrect Answer: 1 Marks\r\nExam Duration: 10 minutes\r\nBest Of Luck, Students !");
		txtrTheStudent.setBounds(10, 95, 1334, 534);
		contentPane.add(txtrTheStudent);
		txtrTheStudent.setEditable(false);
		
		JButton btnNewButton = new JButton("START EXAM");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 36));
		btnNewButton.setBounds(556, 639, 317, 42);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\instruction.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1366, 768);
		contentPane.add(lblNewLabel_2);
		
		
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				setVisible(false);
//				new quizExamStudent(rollNo).setVisible(true);
//			}
//		});
		
	}
	
	
	public instructionStudent(String rollNo1) {
		
		setTitle("ExamEase | Student Exam Instruction");
		//JOptionPane.showMessageDialog(null,rollNo1);
		rollNo = rollNo1;
		
		contentPane = new JPanel();
		contentPane.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\index student.png"));
		lblNewLabel.setBounds(10, 10, 66, 68);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Instruction");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 40));
		lblNewLabel_1.setBounds(88, 23, 271, 49);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 88, 1352, 8);
		contentPane.add(separator);
		
		JTextArea txtrTheStudent = new JTextArea();
		txtrTheStudent.setLineWrap(true);
		txtrTheStudent.setWrapStyleWord(true);
		txtrTheStudent.setFont(new Font("Monospaced", Font.BOLD, 25));
		txtrTheStudent.setText("1.All questions are MCQ (multiple choice question). \r\n\r\n2.Students must not stop the session and then return to it. You will be able to view your marks after completing the exam. When you press save&next of a question, your response is automatically saved in your own answer sheet.\r\n\r\n3.You can attempt the test only 1 time, So start the test when you are prepared to give.\r\n\r\nTotal Marks: 20\r\nNumber of Question: 10\r\nEach Question Carries: 2 Marks\r\nNegative Marking For Each Incorrect Answer: 1 Marks\r\nExam Duration: 10 minutes\r\nBest Of Luck, Students !");
		txtrTheStudent.setBounds(10, 95, 1334, 534);
		contentPane.add(txtrTheStudent);
		txtrTheStudent.setEditable(false);
		
		JButton btnNewButton = new JButton("START EXAM");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 36));
		btnNewButton.setBounds(533, 650, 317, 42);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\instruction.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1366, 768);
		contentPane.add(lblNewLabel_2);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new quizExamStudent(rollNo).setVisible(true);
			}
		});
	} 
	
	
	
	
}
