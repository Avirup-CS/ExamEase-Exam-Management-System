import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class adminHome extends JFrame {
public static int open=0;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminHome frame = new adminHome();
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
	public adminHome() {
		setTitle("ExamEase | Admin Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		setResizable(false);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Add New Question");
		mnNewMenu.setMargin(new Insets(0, 5, 0, 30));
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\add new question.png"));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Update Question");
		mnNewMenu_1.setMargin(new Insets(0, 5, 0, 30));
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_1.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\Update Question.png"));
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("All Question");
		mnNewMenu_2.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\all questions.png"));
		mnNewMenu_2.setMargin(new Insets(0, 5, 0, 30));
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Delete Question");
		mnNewMenu_3.setBackground(new Color(240, 240, 240));
		mnNewMenu_3.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\delete Question.png"));
		mnNewMenu_3.setMargin(new Insets(0, 5, 0, 30));
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_6 = new JMenu("All Student Details");
		mnNewMenu_6.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\student_info.jpg"));
		mnNewMenu_6.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_6);
		
		JMenu mnNewMenu_4 = new JMenu("All Student Result");
		mnNewMenu_4.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\all student result.png"));
		mnNewMenu_4.setMargin(new Insets(0, 5, 0, 30));
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_4);
		
		JMenu mnNewMenu_5 = new JMenu("Logout");
		mnNewMenu_5.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\Logout.png"));
		mnNewMenu_5.setMargin(new Insets(0, 5, 0, 30));
		mnNewMenu_5.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_5);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\index background.jpg"));
		lblNewLabel.setBounds(0, 0, 1366, 768);
		contentPane.add(lblNewLabel);
		
		
		//working
		
		mnNewMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(open==0) {
					new AddNewQuestion().setVisible(true);
					open=1;
				}
				else {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "One Form is already open");
				}
			}
		});
		
		
		mnNewMenu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(open==0) {
					new updateQuestion().setVisible(true);
					open=1;
				}
				else {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "One Form is already open");
				}
			}
		});
		
		
		mnNewMenu_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(open==0) {
					new allQuestion().setVisible(true);
					open=1;
				}
				else {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "One Form is already open");
				}
			}
		});
		
		mnNewMenu_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(open==0) {
					new deleteQuestion().setVisible(true);
					open=1;
				}
				else {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "One Form is already open");
				}
			}
		});
		
		mnNewMenu_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame jf = new JFrame();
				jf.setAlwaysOnTop(true);
				int a=JOptionPane.showConfirmDialog(jf, "Do you really want to Logout","Select",JOptionPane.YES_NO_OPTION);
				if(a==0) {
					setVisible(false);
					new LoginAdmin().setVisible(true);
				}
			}
		});
		
		mnNewMenu_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(open==0) {
					new allStudentResult().setVisible(true);
					open=1;
				}
				else {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "One Form is already open");
				}
			}
			
		});
		
		
		mnNewMenu_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(open==0) {
					new StudentDisplayDetails().setVisible(true);
					open=1;
				}
				else {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "One Form is already open");
				}
			}
		});
	}
}
