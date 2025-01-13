import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends NewWindow{
	public void login(){
		JFrame loginFrame = new JFrame();
		loginFrame.getContentPane().setBackground(Color.BLACK);
		loginFrame.getContentPane().setForeground(Color.BLUE);
		loginFrame.setBounds(100, 100, 450, 300);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.getContentPane().setLayout(null);
		
		JLabel login = new JLabel("Login Here");
		login.setBackground(Color.LIGHT_GRAY);
		login.setForeground(Color.WHITE);
		login.setFont(new Font("Arial", Font.BOLD, 45));
		login.setBounds(109, 0, 267, 59);
		loginFrame.getContentPane().add(login);
		
		JLabel username = new JLabel("Username");
		username.setBackground(Color.LIGHT_GRAY);
		username.setForeground(Color.WHITE);
		username.setFont(new Font("Arial", Font.PLAIN, 25));
		username.setBounds(25, 96, 140, 23);
		loginFrame.getContentPane().add(username);
		
		JTextField textFieldName = new JTextField();
		textFieldName.setBackground(Color.LIGHT_GRAY);
		textFieldName.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldName.setFont(new Font("Arial", Font.PLAIN, 19));
		textFieldName.setForeground(Color.GRAY);
		textFieldName.setText("admin");
		textFieldName.setColumns(10);
		textFieldName.setBounds(175, 96, 180, 31);
		loginFrame.getContentPane().add(textFieldName);
		
		JLabel password = new JLabel("Password");
		password.setBackground(Color.LIGHT_GRAY);
		password.setForeground(Color.WHITE);
		password.setFont(new Font("Arial", Font.PLAIN, 25));
		password.setBounds(25, 162, 140, 20);
		loginFrame.getContentPane().add(password);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 20));
		passwordField.setBackground(Color.LIGHT_GRAY);
		passwordField.setForeground(Color.LIGHT_GRAY);
		passwordField.setBounds(167, 163, 180, 29);
		loginFrame.getContentPane().add(passwordField);
		
		passwordField.setBounds(175, 162, 180, 29);
		loginFrame.getContentPane().add(passwordField);
		passwordField.setColumns(10);
		
		
		
		JButton loginButton = new JButton("login");
		loginButton.setForeground(Color.BLACK);
		loginButton.setBackground(Color.GREEN);
		loginButton.setFont(new Font("Arial", Font.PLAIN, 20));
		loginButton.setBounds(329, 217, 79, 33);
		loginFrame.getContentPane().add(loginButton);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String x,y ;

				x=textFieldName.getText();

				y=passwordField.getText();
				System.out.println(y);


				if(y.equals("Admin") && x.equals("Admin12345")){

					

				}
				/*else{
					JOptionPane.showMessageDialog(null, "Wrong Info");
				}*/
		
				//loginFrame.setTitle("Add New Car Info");
				loginFrame.dispose();
				newWindow();
				//loginFrame.setSize(600,120);
				//loginFrame.setResizable(false);
				//loginFrame.setVisible(true);
				
				
			}
		});
		
		
		loginFrame.setVisible(true);
		loginFrame.setResizable(true);
	}
}
