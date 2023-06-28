import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Project.ConnectionProviderClass;

import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import java.sql.*;

public class updateQuestion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updateQuestion frame = new updateQuestion();
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
	public updateQuestion() {
		setTitle("ExamEase | Update Question");
		setLocation(new Point(150, 183));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 10, 60, 60);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\Update Question.png"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Update Question");
		lblNewLabel_1.setBounds(80, 24, 359, 46);
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 40));
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(1053, 93, -1054, -11);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 80, 1350, 15);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("Question ID:");
		lblNewLabel_2.setForeground(new Color(0, 0, 64));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(21, 105, 168, 37);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Question:");
		lblNewLabel_3.setForeground(new Color(0, 0, 64));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_3.setBounds(21, 168, 139, 37);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Option1:");
		lblNewLabel_4.setForeground(new Color(0, 0, 64));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_4.setBounds(23, 235, 110, 37);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Option2:");
		lblNewLabel_5.setForeground(new Color(0, 0, 64));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_5.setBounds(23, 303, 110, 40);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Option3:");
		lblNewLabel_6.setForeground(new Color(0, 0, 64));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_6.setBounds(23, 368, 110, 41);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Option4:");
		lblNewLabel_7.setForeground(new Color(0, 0, 64));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_7.setBounds(23, 440, 115, 37);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Answer:");
		lblNewLabel_8.setForeground(new Color(0, 0, 64));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_8.setBounds(26, 507, 107, 37);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_10 = new JLabel("Explanation:");
		lblNewLabel_10.setForeground(new Color(0, 0, 64));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_10.setBounds(21, 569, 168, 37);
		contentPane.add(lblNewLabel_10);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(220, 108, 136, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setBounds(406, 108, 136, 40);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\search.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.setBounds(313, 668, 136, 42);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\save.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(btnNewButton_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setBounds(220, 169, 1104, 40);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setBounds(219, 236, 1105, 40);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setBounds(220, 303, 1104, 40);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_4.setBounds(219, 369, 1105, 40);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_5.setBounds(220, 437, 1104, 40);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_6.setBounds(219, 508, 1104, 40);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_7.setBounds(220, 570, 1104, 40);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Clear");
		btnNewButton_3.setBounds(494, 668, 125, 42);
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\clear.png"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\Back.png"));
		btnNewButton.setBounds(1208, 668, 115, 42);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\question_page.jpg"));
		lblNewLabel_9.setBounds(0, 0, 1366, 768);
		contentPane.add(lblNewLabel_9);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adminHome.open=0;
				setVisible(false);
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=textField.getText();
				try {
					Connection con = ConnectionProviderClass.getCon();
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from question where id='"+id+"'");
					if(rs.next())
					{
						textField_1.setText(rs.getString(2));
						textField_2.setText(rs.getString(3));
						textField_3.setText(rs.getString(4));
						textField_4.setText(rs.getString(5));
						textField_5.setText(rs.getString(6));
						textField_6.setText(rs.getString(7));
						textField_7.setText(rs.getString(8));
						
						textField.setEditable(false);
					}
					else {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf, "Question ID does not exist !!");
					}
				}catch(Exception e2) {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, e2);
				}
			}
		});
		
		
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id=textField.getText();
				String name=textField_1.getText();
				String opt1=textField_2.getText();
				String opt2=textField_3.getText();
				String opt3=textField_4.getText();
				String opt4=textField_5.getText();
				String answer=textField_6.getText();
				String explanation=textField_7.getText();
				
				try{
					
					if(textField.getText().length() <= 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Question ID is empty !!");
					}
					
					else if(textField_1.getText().length() <= 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Question Field is empty !!");
					}
					else if(textField_2.getText().length() <= 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Option1 Field is empty !!");
					}
					else if(textField_3.getText().length() <= 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Option2 Field is empty !!");
					}
					else if(textField_4.getText().length() <= 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Option3 Field is empty !!");
					}
					else if(textField_5.getText().length() <= 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Option4 Field is empty !!");
					}
					else if(textField_6.getText().length() <= 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Answer Field is empty !!");
					}
					else if(textField_7.getText().length() <= 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Explanation Field is empty !!");
					}
					else {
						Connection con = ConnectionProviderClass.getCon();
						PreparedStatement ps = con.prepareStatement("update question set name=?,opt1=?,opt2=?,opt3=?,opt4=?,answer=?,explanation=? where id=?");
						ps.setString(1, name);
						ps.setString(2, opt1);
						ps.setString(3, opt2);
						ps.setString(4, opt3);
						ps.setString(5, opt4);
						ps.setString(6, answer);
						ps.setString(7, explanation);
						ps.setString(8, id);
						ps.executeUpdate();
					
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf, "Successfully Updated.");
						
						setVisible(false);
						new updateQuestion().setVisible(true);
					
						}
					
				}catch(Exception e3) {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, e3);
				}
			}
		});
		
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField.setEditable(true);
			}
		});
		
		
		
	}
}
