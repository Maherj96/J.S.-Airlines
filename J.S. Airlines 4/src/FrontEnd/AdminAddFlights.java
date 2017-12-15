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
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class AdminAddFlights extends JFrame {

	private JPanel contentPane;
	private JTextField FlightID;
	private JTextField To;
	private JTextField From;
	private Connection conn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminAddFlights frame = new AdminAddFlights();
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
	public AdminAddFlights() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		FlightID = new JTextField();
		FlightID.setBounds(143, 64, 130, 26);
		contentPane.add(FlightID);
		FlightID.setColumns(10);
		
		To = new JTextField();
		To.setBounds(143, 119, 130, 26);
		contentPane.add(To);
		To.setColumns(10);
		
		From = new JTextField();
		From.setBounds(143, 182, 130, 26);
		contentPane.add(From);
		From.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Flight ID:");
		lblNewLabel.setBounds(173, 43, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("To:");
		lblNewLabel_1.setBounds(173, 103, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("From:");
		lblNewLabel_2.setBounds(173, 167, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JButton AddFlight = new JButton("Add Flight");
		AddFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyConnection conct = new MyConnection();
				conn = conct.getConnect();
				try {
					String myRS = "INSERT INTO Flights (idFlights,origin, Destination) VALUES(?,?,?)";
	        		   PreparedStatement preparedStmt = conn.prepareStatement(myRS);
	            
		              preparedStmt.setString(1, FlightID.getText());
		              preparedStmt.setString(2, From.getText());
		              preparedStmt.setString(3, To.getText());
		              preparedStmt.executeUpdate();
		              JOptionPane.showMessageDialog(null, "Flight Added!");
		             
		            
	      } catch (SQLException x) {
	            System.out.println(x.getMessage());
	        
	    
				}
			}
			
		});
		AddFlight.setBounds(16, 231, 117, 29);
		contentPane.add(AddFlight);
		
		JButton btnDeleteFlight = new JButton("Delete Flight");
		btnDeleteFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyConnection conct = new MyConnection();
			conn = conct.getConnect();
			try {
				String myRS = "DELETE FROM Flights WHERE idFlights = ?";
        		   PreparedStatement preparedStmt = conn.prepareStatement(myRS);
	              preparedStmt.setString(1, FlightID.getText());
	              preparedStmt.executeUpdate();
	              JOptionPane.showMessageDialog(null, "Flight Deleted");
	             
	            
      } catch (SQLException x) {
            System.out.println(x.getMessage());
        
    
			}
		}
				
			
		});
		btnDeleteFlight.setBounds(143, 231, 117, 29);
		contentPane.add(btnDeleteFlight);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainLogin hey = new MainLogin();
				hey.setVisible(true);
				dispose();
			}
		});
		back.setBounds(285, 231, 117, 29);
		contentPane.add(back);
	}
}
