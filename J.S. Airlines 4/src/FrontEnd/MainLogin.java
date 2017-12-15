package FrontEnd;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DOA.MyConnection;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class MainLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserID;
	private JPasswordField passwordField;
	private Connection conn;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainLogin frame = new MainLogin();
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
	public MainLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("         Welcome");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(164, 6, 162, 50);
		contentPane.add(lblNewLabel);
		
		JButton btnSignup = new JButton("signup ");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpPage SignSys = new SignUpPage();
				SignSys.setVisible(true);
				dispose();
			}
		});
		btnSignup.setBounds(327, 232, 117, 29);
		contentPane.add(btnSignup);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyConnection conct = new MyConnection();
				conn = conct.getConnect();
				
				String password = passwordField.getText();
				String userID = txtUserID.getText();
				
				try {
					if(password.contains("1234") && userID.contains("admin")) {
						passwordField.setText(null);
						txtUserID.setText(null);
						AdminAddFlights rp = new AdminAddFlights();
						rp.setVisible(true);
						dispose();
						
					} else  {
					PreparedStatement prep = conn.prepareStatement("Select * from User where idUser = ? and password = ?");
					prep.setString(1, txtUserID.getText());
					prep.setString(2,passwordField.getText());
					ResultSet rs = prep.executeQuery();
					UserMenu io = new UserMenu();
					io.setVisible(true);
					dispose();
					int y=0;
				while(rs.next()) {
					y++;
					
				}
				if(y==1) {
					
				}
					
				}
				
				
				}
				
						
							
					
					
				
				catch(SQLException x) {
					x.printStackTrace();
				}
			}
		});
		btnLogin.setBounds(327, 192, 117, 29);
		contentPane.add(btnLogin);
		
		txtUserID = new JTextField();
		txtUserID.setBounds(173, 96, 130, 26);
		contentPane.add(txtUserID);
		txtUserID.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(178, 146, 125, 26);
		contentPane.add(passwordField);
		
		lblNewLabel_1 = new JLabel("User ID:");
		lblNewLabel_1.setBounds(91, 101, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(91, 151, 61, 16);
		contentPane.add(lblNewLabel_2);
	}
}
