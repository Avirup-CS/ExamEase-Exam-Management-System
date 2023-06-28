import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.*;
import Project.ConnectionProviderClass;
import net.proteanit.sql.DbUtils;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import javax.swing.UIManager;


public class allStudentResult extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					allStudentResult frame = new allStudentResult();
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
	public allStudentResult() {
		setTitle("ExamEase | All Student Result");
		
		contentPane = new JPanel();
		contentPane.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1066, 535);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\all student result.png"));
		lblNewLabel.setBounds(10, 10, 71, 67);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("All Student Result");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 40));
		lblNewLabel_1.setBounds(81, 21, 422, 41);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 87, 1042, 12);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Filter Students By Marks:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(10, 109, 340, 41);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(366, 119, 216, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adminHome.open=0;
				setVisible(false);
			}
		});
		
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\Back.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(927, 432, 115, 31);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		scrollPane.setBounds(10, 182, 1032, 223);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				
			},
			new String[] {
				"rollNo", "name", "gender", "contactNo", "email", "marks"
			}
		));
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\allstudentresult.jpg"));
		lblNewLabel_3.setBounds(0, 0, 1066, 535);
		contentPane.add(lblNewLabel_3);
		
		
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int marksobt;
				if(textField.getText().equals("")) {
					marksobt = 0;
				}
				else
					marksobt = Integer.parseInt(textField.getText());
				
				try
				{
					Connection con = ConnectionProviderClass.getCon();
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select rollNo as ROLL_NO,name as NAME,doe as DATE_OF_EXAM,total_question as TOTAL_NO_OF_QUESTION,total_marks as TOTAL_MARKS,marksobt as MARKS_OBTAINED,total_attempted as TOTAL_ATTEMPTED,wrong_answer as WRONG_ANSWER from result where marksobt >="+marksobt+"");
					
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e9)
				{
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, e9);
				}
				
			}
		});
		
		
		try
		{
			Connection con = ConnectionProviderClass.getCon();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select rollNo as ROLL_NO,name as NAME,doe as DATE_OF_EXAM,total_question as TOTAL_NO_OF_QUESTION,total_marks as TOTAL_MARKS,marksobt as MARKS_OBTAINED,total_attempted as TOTAL_ATTEMPTED,wrong_answer as WRONG_ANSWER from result");
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
			
		
	}
}
