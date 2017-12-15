package FrontEnd;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DOA.MyConnection;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class SignUpPage extends JFrame {

	private JPanel contentPane;
	private JTextField firstName;
	private JTextField lastName;
	private Connection conn;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpPage frame = new SignUpPage();
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
	public SignUpPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		firstName = new JTextField();
		firstName.setBounds(122, 63, 130, 21);
		contentPane.add(firstName);
		firstName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(31, 66, 83, 16);
		contentPane.add(lblNewLabel);
		
		lastName = new JTextField();
		lastName.setBounds(122, 96, 130, 26);
		contentPane.add(lastName);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setBounds(31, 105, 66, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyConnection conct = new MyConnection();
				conn = conct.getConnect();
				try {
					String myRS = "INSERT INTO User(firstName,lastName, idUser,password) VALUES(?,?,?,?)";
	        		   PreparedStatement preparedStmt = conn.prepareStatement(myRS);
	            
		              preparedStmt.setString(1, firstName.getText());
		              preparedStmt.setString(2, lastName.getText());
		              preparedStmt.setString(3, textField_1.getText());
		              preparedStmt.setString(4, textField.getText());
		              preparedStmt.executeUpdate();
		              System.out.println("updated");
		              MainLogin usr = new MainLogin();
		              usr.setVisible(true);
		              dispose();
	      } catch (SQLException x) {
	            //System.out.println(x.getMessage());
	            JOptionPane.showMessageDialog(null, "Invalid Criteria");
	    
				}
			}
			
		});
		btnNewButton.setBounds(132, 203, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainLogin usr = new MainLogin();
				usr.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(135, 229, 117, 29);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(122, 134, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel password = new JLabel("Password");
		password.setBounds(31, 139, 61, 16);
		contentPane.add(password);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 172, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel IdUser = new JLabel("UserID");
		IdUser.setBounds(36, 177, 61, 16);
		contentPane.add(IdUser);
	
	}
	
}
