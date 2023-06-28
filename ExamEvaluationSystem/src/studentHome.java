import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class studentHome extends JFrame {

	public String rollNo;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentHome frame = new studentHome();
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
	
	public studentHome() {
		setTitle("ExamEase | Student Home");
		contentPane = new JPanel();
		contentPane.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new index().setVisible(true);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\Back.png"));
		btnBack.setBounds(1211, 679, 116, 29);
		contentPane.add(btnBack);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(0, 0, 1366, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Student Log In");
		btnNewButton_1.setBounds(964, 0, 223, 60);
		panel.add(btnNewButton_1);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\signin.jpg"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnNewButton = new JButton("Student Sign Up");
		btnNewButton.setBounds(747, 0, 223, 60);
		panel.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\index student.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnUpdateProfile = new JButton("Update Profile");
		btnUpdateProfile.setBounds(543, 0, 206, 60);
		panel.add(btnUpdateProfile);
		btnUpdateProfile.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpdateProfile.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\updateprofile.jpg"));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\studenthome.jpg"));
		lblNewLabel_1.setBounds(0, 0, 66, 60);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("Result");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\all student result.png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new result().setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(1185, 0, 171, 60);
		panel.add(btnNewButton_2);
		
		btnUpdateProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new updateStudentDetails().setVisible(true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new studentDetails().setVisible(true);
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new StudentSignIn().setVisible(true);
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\index background.jpg"));
		lblNewLabel.setBounds(0, 0, 1366, 768);
		contentPane.add(lblNewLabel);	
		
	}

	
	public studentHome(String rollNo1) {
		
		setTitle("ExamEase | Student Home");
		contentPane = new JPanel();
		contentPane.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		rollNo = rollNo1;
	
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new index().setVisible(true);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\Back.png"));
		btnBack.setBounds(1211, 679, 116, 29);
		contentPane.add(btnBack);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(0, 0, 1366, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Student Log In");
		btnNewButton_1.setBounds(1006, 0, 223, 60);
		panel.add(btnNewButton_1);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\signin.jpg"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnNewButton = new JButton("Student Sign Up");
		btnNewButton.setBounds(784, 0, 223, 60);
		panel.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\index student.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnUpdateProfile = new JButton("Update Profile");
		btnUpdateProfile.setBounds(581, 0, 205, 60);
		panel.add(btnUpdateProfile);
		btnUpdateProfile.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpdateProfile.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\updateprofile.jpg"));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\studenthome.jpg"));
		lblNewLabel_1.setBounds(0, 0, 66, 60);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("Result");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new result().setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(1228, 0, 128, 60);
		panel.add(btnNewButton_2);
		
		btnUpdateProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new updateStudentDetails().setVisible(true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new studentDetails().setVisible(true);
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new StudentSignIn().setVisible(true);
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\index background.jpg"));
		lblNewLabel.setBounds(0, 0, 1366, 768);
		contentPane.add(lblNewLabel);
//		
		
	}
}
