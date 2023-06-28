import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import Project.ConnectionProviderClass;
import java.awt.Point;
import java.awt.Color;

public class deleteQuestion extends JFrame {

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
					deleteQuestion frame = new deleteQuestion();
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
	public deleteQuestion() {
		setTitle("ExamEase | Delete Question");
		setLocation(new Point(150, 183));
		setMinimumSize(new Dimension(500, 400));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\delete Question.png"));
		lblNewLabel.setBounds(10, 11, 60, 60);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DELETE QUESTION");
		lblNewLabel_1.setForeground(new Color(0, 0, 64));
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 40));
		lblNewLabel_1.setBounds(66, 21, 368, 46);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 76, 1350, 9);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Question ID:");
		lblNewLabel_2.setForeground(new Color(0, 0, 64));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(23, 92, 168, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Question:");
		lblNewLabel_3.setForeground(new Color(0, 0, 64));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_3.setBounds(23, 150, 139, 37);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Option1:");
		lblNewLabel_4.setForeground(new Color(0, 0, 64));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_4.setBounds(23, 217, 110, 37);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Option2:");
		lblNewLabel_5.setForeground(new Color(0, 0, 64));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_5.setBounds(23, 282, 110, 40);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Option3:");
		lblNewLabel_6.setForeground(new Color(0, 0, 64));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_6.setBounds(23, 353, 110, 37);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Option4:");
		lblNewLabel_7.setForeground(new Color(0, 0, 64));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_7.setBounds(23, 430, 110, 29);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Answer:");
		lblNewLabel_8.setForeground(new Color(0, 0, 64));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_8.setBounds(23, 496, 107, 37);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_10 = new JLabel("Explanation:");
		lblNewLabel_10.setForeground(new Color(0, 0, 64));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_10.setBounds(21, 566, 168, 29);
		contentPane.add(lblNewLabel_10);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(193, 89, 220, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setBounds(193, 147, 1135, 40);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setBounds(193, 218, 1135, 40);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setBounds(193, 282, 1135, 40);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_4.setBounds(193, 350, 1135, 40);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_5.setBounds(193, 427, 1135, 40);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_6.setBounds(193, 500, 1135, 40);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_7.setBounds(193, 563, 1136, 40);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\search.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(447, 88, 134, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\delete.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(251, 644, 124, 42);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Clear");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\clear.png"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(457, 644, 124, 42);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Delete All Questions");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\delete.png"));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_4.setBounds(655, 644, 273, 42);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\Back.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(1210, 644, 115, 42);
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
				String id = textField.getText();
				try
				{
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
					else
					{
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf, "Question ID does not exist!");
					}
				}
				catch(Exception e1)
				{
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, e1);
				}
			}
		});
		
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String qid = textField.getText();
				try{
					
					if(textField.getText().length() <= 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Question ID is empty !!");
					}
					
					else {
						Connection con = ConnectionProviderClass.getCon();
						PreparedStatement ps = con.prepareStatement("delete from question where id=?");
						ps.setString(1, qid);
						ps.executeUpdate();
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Successfully Deleted");
						ps = con.prepareStatement("update question set id = id-1 where id>?");
						ps.setString(1, qid);
						ps.executeUpdate();
						setVisible(false);
						new deleteQuestion().setVisible(true);
					}
					
				}catch(Exception e1)
				{
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf,e1);
				}
			}
		});
		
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
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
			}
		});
		
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{

					Connection con = ConnectionProviderClass.getCon();
					PreparedStatement ps = con.prepareStatement("truncate table question");
					ps.executeUpdate();
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf,"Successfully All Questions Deleted.");
	
					setVisible(false);
					new deleteQuestion().setVisible(true);
					
				}catch(Exception e2)
				{
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf,e2);
				}
			}
			
		});
		
		
	}
}

