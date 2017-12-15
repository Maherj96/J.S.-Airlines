package FrontEnd;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DOA.MyConnection;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class UserMenu extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField idFlight;
	private JTextField To;
	private JTextField From;
	private Connection conn;
	private JButton logOut;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserMenu frame = new UserMenu();
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
	public UserMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(193, 6, 251, 185);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton BookFlight = new JButton("Book ");
		BookFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
		              JOptionPane.showMessageDialog(null, "Flight booked!");
		             
		            
	      
					
				
			}	
		});
		BookFlight.setBounds(32, 225, 94, 29);
		contentPane.add(BookFlight);
		
		idFlight = new JTextField();
		idFlight.setBounds(34, 33, 130, 26);
		contentPane.add(idFlight);
		idFlight.setColumns(10);
		
		To = new JTextField();
		To.setBounds(32, 71, 130, 26);
		contentPane.add(To);
		To.setColumns(10);
		
		From = new JTextField();
		From.setBounds(34, 125, 130, 26);
		contentPane.add(From);
		From.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("From:");
		lblNewLabel.setBounds(65, 110, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("To:");
		lblNewLabel_1.setBounds(65, 58, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("FlightID:");
		lblNewLabel_2.setBounds(37, 12, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		logOut = new JButton("LogOut");
		logOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainLogin tp = new MainLogin();
				tp.setVisible(true);
				dispose();
			}
		});
		logOut.setBounds(165, 225, 117, 29);
		contentPane.add(logOut);
	}
}
