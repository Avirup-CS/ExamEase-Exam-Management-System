import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import Project.ConnectionProviderClass;
import net.proteanit.sql.DbUtils;
import javax.swing.ScrollPaneConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentDisplayDetails extends JFrame {
	
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDisplayDetails frame = new StudentDisplayDetails();
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
	public StudentDisplayDetails() {
		
			setTitle("ExamEase | All Student Details");
			
			contentPane = new JPanel();
			contentPane.setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1540, 535);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setResizable(false);
			
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\updateprofile.jpg"));
			lblNewLabel.setBounds(10, 10, 71, 67);
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("All Student Details");
			lblNewLabel_1.setForeground(new Color(0, 128, 128));
			lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 40));
			lblNewLabel_1.setBounds(78, 24, 478, 41);
			contentPane.add(lblNewLabel_1);
			
			JButton btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
							adminHome.open=0;
							setVisible(false);
				}
			});
			
			btnBack.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\Back.png"));
			btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnBack.setBounds(1401, 415, 115, 42);
			contentPane.add(btnBack);
			
			JSeparator separator = new JSeparator();
			separator.setBounds(10, 87, 1506, 12);
			contentPane.add(separator);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
			scrollPane.setBounds(10, 182, 1506, 223);
			contentPane.add(scrollPane);
			
			table = new JTable();
			table.setFont(new Font("Tahoma", Font.PLAIN, 14));
			table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
			scrollPane.setViewportView(table);
			table.setModel(new DefaultTableModel(
				new Object[][] {
					
				},
				new String[] {
					"ROLL_NO", "NAME", "FATHER_NAME", "MOTHER_NAME", "GENDER", "CONTACT_NO","EMAIL","10_UNIVERSITY_NAME","10_PERCENTAGE","10_PASSOUT_YEAR","12_UNIVERSITY_NAME","12_PERCENTAGE","12_PASSOUT_YEAR","GRADUATION_UNIVERSITY_NAME","GRADUATION_PERCENTAGE","GRADUATION_PASSOUT_YEAR","ADDRESS","PASSWORD"
				}
			));
			
			//for updation
			JButton btnNewButton = new JButton("Update Record");
			btnNewButton.setForeground(new Color(0, 0, 255));
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\save.png"));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnNewButton.setBounds(824, 415, 250, 33);
			contentPane.add(btnNewButton);
			
			textField = new JTextField();
			textField.setBounds(194, 131, 256, 29);
			contentPane.add(textField);
			textField.setColumns(10);
			
			JLabel lblNewLabel_2 = new JLabel("Search Data:");
			lblNewLabel_2.setForeground(new Color(0, 128, 128));
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_2.setBounds(24, 131, 164, 29);
			contentPane.add(lblNewLabel_2);
			
			JButton btnNewButton_1 = new JButton("Delete Record");
			btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\delete.png"));
			btnNewButton_1.setForeground(new Color(0, 0, 255));
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnNewButton_1.setBounds(536, 415, 250, 33);
			contentPane.add(btnNewButton_1);
			
			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Avirup\\OneDrive\\Desktop\\ExamEvaluationSystem\\index\\studentdetails.jpg"));
			lblNewLabel_3.setBounds(0, 0, 1550, 535);
			contentPane.add(lblNewLabel_3);
			
			try
			{
				Connection con = ConnectionProviderClass.getCon();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select rollNo as ROLL_NO, name as NAME,fatherName as FATHER_NAME,motherName as MOTHER_NAME,gender as GENDER,contactNo as CONTACT_NO,email as EMAIL,tenthUniversityName 10_UNIVERSITY_NAME,tenthPercentage 10_PERCENTAGE,tenthPassoutYear as 10_PASSOUT_YEAR,twelveUniversityName as 12_UNIVERSITY_NAME,twelvePercentage as 12_PERCENTAGE,twelvePassoutYear as 12_PASSOUT_YEAR,graduationUniversityName as GRADUATION_UNIVERSITY_NAME,graduationPercentage as GRADUATION_PERCENTAGE,graduationPassoutYear as GRADUATION_PASSOUT_YEAR,address as ADDRESS,password as PASSWORD from student");
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, e);
			}
			
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Connection con = ConnectionProviderClass.getCon();
					try {
						Statement st1 = con.createStatement();
						for(int i=0; i< table.getRowCount(); i++) {
							
							String rollNo = table.getValueAt(i, 0).toString();
							String name = table.getValueAt(i, 1).toString();
							String fatherName = table.getValueAt(i, 2).toString();
							String motherName = table.getValueAt(i, 3).toString();
							String gender = table.getValueAt(i, 4).toString();
							String contactNo = table.getValueAt(i, 5).toString();
							String email = table.getValueAt(i, 6).toString();
							String tenthUniversityName = table.getValueAt(i, 7).toString();
							String tenthPercentage = table.getValueAt(i, 8).toString();
							String tenthPassoutYear = table.getValueAt(i, 9).toString();
							String twelveUniversityName = table.getValueAt(i, 10).toString();
							String twelvePercentage = table.getValueAt(i, 11).toString();
							String twelvePassoutYear = table.getValueAt(i, 12).toString();
							String graduationUniversityName = table.getValueAt(i, 13).toString();
							String graduationPercentage = table.getValueAt(i, 14).toString();
							String graduationPassoutYear = table.getValueAt(i, 15).toString();
							String address = table.getValueAt(i, 16).toString();
							String password = table.getValueAt(i, 17).toString();
							
							String updateQuery = "UPDATE `student` SET `name`='"+name+"',`fatherName`='"+fatherName+"',`motherName`='"+motherName+"',`gender`='"+gender+"',`contactNo`='"+contactNo+"',`email`='"+email+"',`tenthUniversityName`='"+tenthUniversityName+"',`tenthPercentage`='"+tenthPercentage+"',`tenthPassoutYear`='"+tenthPassoutYear+"',`twelveUniversityName`='"+twelveUniversityName+"',`twelvePercentage`='"+twelvePercentage+"',`twelvePassoutYear`='"+twelvePassoutYear+"',`graduationUniversityName`='"+graduationUniversityName+"',`graduationPercentage`='"+graduationPercentage+"',`graduationPassoutYear`='"+graduationPassoutYear+"',`address`='"+address+"',`password`='"+password+"' WHERE `rollNo`= "+rollNo;
							st1.addBatch(updateQuery);
							
							String updateQuery1 = "UPDATE `result` SET `name`='"+name+"' WHERE `rollNo`= "+rollNo;
							st1.addBatch(updateQuery1);
							
							JFrame jf = new JFrame();
							jf.setAlwaysOnTop(true);
							JOptionPane.showMessageDialog(jf, "Successfully Updated.");
							
						}
						
						int [] updatedRow = st1.executeBatch();
						//System.out.println(updatedRow.length);
					}
					
					catch(Exception e1) {
						JOptionPane.showMessageDialog(null, e);
					}
				}
			});
			
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						Connection con = ConnectionProviderClass.getCon();
						int row = table.getSelectedRow();
						String rollNo = (table.getModel().getValueAt(row, 0).toString());
						String query = "delete from student where rollNo="+rollNo;
						PreparedStatement ps = con.prepareStatement(query);
						ps.executeUpdate();
						
						JOptionPane.showMessageDialog(null, "Record Deleted.");
						setVisible(false);
						new StudentDisplayDetails().setVisible(true);
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			});
			
			
			
			textField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					
					DefaultTableModel obj = (DefaultTableModel) table.getModel();
					TableRowSorter<DefaultTableModel> obj1=new TableRowSorter<>(obj);
					table.setRowSorter(obj1);
					obj1.setRowFilter(RowFilter.regexFilter(textField.getText()));
					
				}
			});
				
			
	}
	
}


