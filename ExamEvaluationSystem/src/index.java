import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Button;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;

public class index extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index frame = new index();
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
	public index() {
		setTitle("ExamEase | Home Page");
		
		contentPane = new JPanel();
		contentPane.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome To ExamEase ");
		lblNewLabel_1.setForeground(new Color(128, 255, 128));
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 60));
		lblNewLabel_1.setBounds(10, 55, 755, 161);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(0, 0, 1366, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Student");
		btnNewButton.setBounds(1045, 0, 157, 60);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new studentHome().setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\index student.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnNewButton_1 = new JButton("Admin");
		btnNewButton_1.setBounds(1199, 0, 157, 60);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new LoginAdmin().setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\index admin.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_2 = new JLabel("Date:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(155, 8, 72, 32);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("date");
		lblNewLabel_3.setForeground(new Color(0, 64, 128));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(237, 9, 134, 30);
		panel.add(lblNewLabel_3);
		
		
		JLabel lblNewLabel_4 = new JLabel("Time:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setBounds(419, 8, 72, 32);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("time");
		lblNewLabel_5.setForeground(new Color(0, 64, 128));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(514, 8, 147, 32);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\index background.jpg"));
		lblNewLabel.setBounds(0, 0, 1366, 768);
		contentPane.add(lblNewLabel);
	
		SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		lblNewLabel_3.setText(dFormat.format(date));
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\home.jpg"));
		lblNewLabel_6.setBounds(0, 0, 72, 60);
		panel.add(lblNewLabel_6);

	
		new Timer(0, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat dFormat1 = new SimpleDateFormat("hh:mm:ss a");
				Date date1 = new Date();
				lblNewLabel_5.setText(dFormat1.format(date1));
				}
		}).start();
	
	
	}
}
