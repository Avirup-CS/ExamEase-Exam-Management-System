import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.*;
import Project.ConnectionProviderClass;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class allQuestion extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					allQuestion frame = new allQuestion();
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
	public allQuestion() {
		setTitle("ExamEase | All Questions");
		
		setLocation(new Point(150, 183));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\all questions.png"));
		lblNewLabel.setBounds(10, 10, 60, 60);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("All Questions");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 40));
		lblNewLabel_1.setBounds(80, 23, 313, 47);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						adminHome.open=0;
						setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\Back.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(1227, 39, 115, 31);
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 80, 1332, 12);
		contentPane.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		scrollPane.setBounds(10, 89, 1332, 399);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		scrollPane.setViewportView(table);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		//working
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "name", "opt1", "opt2", "opt3", "opt4", "answer"
			}
		));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\allquestion.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1366, 535);
		contentPane.add(lblNewLabel_2);
		
		
		
		try {
			Connection con=ConnectionProviderClass.getCon();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select id as QUESTION_ID,name as QUESTION_STATEMENT,opt1 as OPTION_1,opt2 as OPTION_2,opt3 as OPTION_3,opt4 as OPTION_4,answer as ANSWER,explanation as EXPLANATION from question");
			
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		}
		catch(Exception e6) {
			JOptionPane.showMessageDialog(null, e6);
		}
		
		
		
	}
}
