
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Color;
import java.sql.*;
import Project.ConnectionProviderClass;
import java.awt.Point;

public class AddNewQuestion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblNewLabel_3;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	
//	static int qid = 0;
//	private JTextField textField_20; 
//	static AddNewQuestion frame;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewQuestion frame = new AddNewQuestion();
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
	
	public AddNewQuestion() {
		setTitle("ExamEase | Add New Question");
		setLocation(new Point(150, 183));


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\add new question.png"));
		lblNewLabel.setBounds(4, 18, 63, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ADD NEW QUESTION");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 40));
		lblNewLabel_1.setBounds(77, 28, 405, 42);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 79, 1350, 6);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Question ID:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(24, 109, 180, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("0");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_3.setBounds(204, 109, 46, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Question:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_4.setBounds(24, 159, 126, 44);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Option 1:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_5.setBounds(25, 234, 136, 29);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Option 2:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_6.setBounds(24, 293, 136, 29);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Option 3:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_7.setBounds(24, 356, 136, 29);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Option 4:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_8.setBounds(25, 422, 136, 29);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Answer:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_9.setBounds(24, 481, 136, 29);
		contentPane.add(lblNewLabel_9);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(204, 163, 1116, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(204, 231, 1116, 40);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(204, 290, 1116, 40);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(204, 353, 1116, 40);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(204, 419, 1116, 40);
		contentPane.add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_6.setBounds(204, 539, 1116, 40);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(204, 478, 1116, 40);
		contentPane.add(textField_5);
		
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\save.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(276, 637, 115, 42);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Clear");
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\clear.png"));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(466, 637, 115, 42);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_11 = new JLabel("Explanation:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_11.setBounds(24, 544, 170, 25);
		contentPane.add(lblNewLabel_11);
		
		JButton btnNewButton_2 = new JButton("Add Multiple Question");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\upload.jpg"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(649, 637, 288, 42);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\Back.png"));
		btnNewButton.setBounds(1205, 637, 115, 42);
		contentPane.add(btnNewButton);
				
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\question_page.jpg"));
		lblNewLabel_10.setBounds(0, 0, 1366, 768);
		contentPane.add(lblNewLabel_10);
		
		try {
			Connection con = ConnectionProviderClass.getCon();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select count(id) from question");
			if(rs.next())
			{
				int id = rs.getInt(1);
				id = id+1;
				String str = String.valueOf(id);
				
				lblNewLabel_3.setText(str);
			}
			else {
				lblNewLabel_3.setText("1");
			}
		}
		catch(Exception e)
		{
			JFrame jf = new JFrame();
			jf.setAlwaysOnTop(true);
			JOptionPane.showMessageDialog(jf, e);
			//e.printStackTrace();
		}
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adminHome.open=0;
				setVisible(false);
			}
		});
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String id = textField_20.getText();
				
				String id = lblNewLabel_3.getText();
				String name = textField.getText();
				String opt1 = textField_1.getText();
				String opt2 = textField_2.getText();
				String opt3 = textField_3.getText();
				String opt4 = textField_4.getText();
				String answer = textField_5.getText();
				String explanation = textField_6.getText();
				
				try {
					
					if(textField.getText().length() <= 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Question Field is empty !!");
					}
					else if(textField_1.getText().length() <= 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Option1 Field is empty !!");
					}
					else if(textField_2.getText().length() <= 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Option2 Field is empty !!");
					}
					else if(textField_3.getText().length() <= 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Option3 Field is empty !!");
					}
					else if(textField_4.getText().length() <= 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Option4 Field is empty !!");
					}
					else if(textField_5.getText().length() <= 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Answer Field is empty !!");
					}
					else if(textField_6.getText().length() <= 0) {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Explanation Field is empty !!");
					}
					else {
						
						Connection con = ConnectionProviderClass.getCon();
						PreparedStatement ps = con.prepareStatement("insert into question values(?,?,?,?,?,?,?,?)");
						ps.setString(1, id);
						ps.setString(2, name);
						ps.setString(3, opt1);
						ps.setString(4, opt2);
						ps.setString(5, opt3);
						ps.setString(6, opt4);
						ps.setString(7, answer);
						ps.setString(8, explanation);
						ps.executeUpdate();
						
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Successfully Updated");
						setVisible(false);
						new AddNewQuestion().setVisible(true);
					}
						
				}
				catch(Exception e1)
				{
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf,e1);
				}
			}
		});
		
		
		
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText("");
				 textField_1.setText("");
				 textField_2.setText("");
				 textField_3.setText("");
				 textField_4.setText("");
				 textField_5.setText("");
				 textField_6.setText("");
			}
		});
		
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new CSVDataUploader().setVisible(true);
			}
		});
		
		
		
		
	}
}


