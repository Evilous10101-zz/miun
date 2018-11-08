package edu.ycc.java.chapter3;

import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Test76 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnCreateAccount;
	private JCheckBox chckbxDoYouAccept;
test restart = new test();
private JButton btnLinkToThe;
private final Action action = new SwingAction();
	/**
	 * Launch the application.
	 */
	public static void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test76 window = new Test76();
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
	public Test76() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Firstname");
		lblNewLabel.setBounds(10, 11, 72, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lastname");
		lblNewLabel_1.setBounds(10, 36, 72, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(92, 8, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(92, 36, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(92, 67, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(92, 95, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setBounds(10, 67, 72, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 98, 72, 14);
		frame.getContentPane().add(lblPassword);
		
		btnCreateAccount = new JButton("Create account");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Your account has been created. Please write down your username and password");
			System.out.println("Please restart the application to enter your account");
			
			Gathering.gath();
			
			try {
				System.out.println("We are giving you 10 seconds to write down your username and password before restarting tha application");
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
				
			}
			System.out.println("Restart in progress");
			System.exit(0);	
				
			}
		});
		btnCreateAccount.setBounds(282, 227, 142, 23);
		frame.getContentPane().add(btnCreateAccount);
		
		chckbxDoYouAccept = new JCheckBox("Do you accept the terms of agreement?");
		chckbxDoYouAccept.setBounds(32, 191, 265, 23);
		frame.getContentPane().add(chckbxDoYouAccept);
		
		btnLinkToThe = new JButton("The terms of agreement");
		btnLinkToThe.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
				    Desktop.getDesktop().browse(new URL("http://www.google.com").toURI());
				} catch (Exception a) {}
			}
		});
		btnLinkToThe.setBounds(32, 162, 216, 23);
		frame.getContentPane().add(btnLinkToThe);
	}

	protected static void close() {
		// TODO Auto-generated method stub
		
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
