package edu.ycc.java.chapter3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;
import javax.swing.JPasswordField;

public class test {

	private JFrame frame;
	private JLabel lblLastName;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JButton btnINeedTo;
	private JLabel lblEnterYourUsername;

	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
		restart:
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.RED);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Thank you for your information. Your will be logged in shortly");
				//if ()
				//{
				
				//}
				//else
				//{
					
				//}
				System.exit(0);
				
			}
		});
		btnSubmit.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblFirstName = new JLabel("Username:");
		lblFirstName.setBounds(102, 91, 63, 14);
		frame.getContentPane().add(lblFirstName);
		
		lblLastName = new JLabel("Password:");
		lblLastName.setBounds(102, 116, 63, 14);
		frame.getContentPane().add(lblLastName);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(194, 88, 89, 20);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(194, 113, 89, 20);
		frame.getContentPane().add(passwordField_1);
		
		btnINeedTo = new JButton("I need to create an account");
		btnINeedTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				edu.ycc.java.chapter3.Test76.run();
			}
		});
		btnINeedTo.setBounds(10, 227, 221, 23);
		frame.getContentPane().add(btnINeedTo);
		
		lblEnterYourUsername = new JLabel("Enter your username and password");
		lblEnterYourUsername.setBounds(98, 22, 279, 44);
		frame.getContentPane().add(lblEnterYourUsername);
	}
}
