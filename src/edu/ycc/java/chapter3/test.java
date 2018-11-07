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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
				System.out.println("Thank you for your information. Your account has been created");
				
				
				System.exit(0);
			}
		});
		btnSubmit.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblFirstName = new JLabel("Username");
		lblFirstName.setBounds(10, 14, 63, 14);
		frame.getContentPane().add(lblFirstName);
		
		lblLastName = new JLabel("Password");
		lblLastName.setBounds(10, 44, 63, 14);
		frame.getContentPane().add(lblLastName);
		
		JCheckBox chckbxDoYouAccept = new JCheckBox("Do you accept the terms of the agreement?");
		chckbxDoYouAccept.setForeground(Color.RED);
		chckbxDoYouAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		chckbxDoYouAccept.setBounds(23, 197, 314, 23);
		frame.getContentPane().add(chckbxDoYouAccept);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(108, 11, 89, 20);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(108, 41, 89, 20);
		frame.getContentPane().add(passwordField_1);
	}
}
