import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public  class NewWindow {
	public void newWindow(){
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Button.darkShadow"));
		frame.setBounds(100, 100, 715, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.BLUE);
		mainPanel.setBounds(-15, 30, 763, 474);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
//		JButton btnBack = new JButton("Back");
//		btnBack.setBackground(new Color(153, 153, 0));
//		btnBack.setFont(new Font("Arial", Font.PLAIN, 12));
//		btnBack.setForeground(new Color(255, 255, 0));
//		btnBack.setBounds(0, 0, 89, 23);
//		mainPanel.add(btnBack);

		
		JLabel tips1 = new JLabel("\uF076 Dont take your medicine with cold water.");
		tips1.setFont(new Font("Arial", Font.PLAIN, 15));
		tips1.setBackground(new Color(255, 255, 102));
		tips1.setForeground(new Color(153, 51, 0));
		tips1.setBounds(150, 77, 321, 29);
		mainPanel.add(tips1);
		
		JLabel tips2 = new JLabel("\uF076\tDon\u2019t eat heavy meals after 5 pm.");
		tips2.setBackground(new Color(153, 51, 0));
		tips2.setFont(new Font("Arial", Font.PLAIN, 15));
		tips2.setBounds(150, 115, 415, 29);
		mainPanel.add(tips2);
		
		JLabel tips3 = new JLabel("\uF076\tDrink more water in morning less, at night");
		tips3.setFont(new Font("Arial", Font.PLAIN, 15));
		tips3.setBounds(150, 150, 415, 29);
		mainPanel.add(tips3);
		
		JLabel tips4 = new JLabel("\uF076\tBest sleeping time is 10pm to 4 am.");
		tips4.setFont(new Font("Arial", Font.PLAIN, 15));
		tips4.setBounds(150, 200, 415, 29);
		mainPanel.add(tips4);
		
		JLabel tips5 = new JLabel("\uF076\tDon\u2019t lie down immediately after taking meal.");
		tips5.setBackground(new Color(153, 51, 0));
		tips5.setFont(new Font("Arial", Font.PLAIN, 15));
		tips5.setBounds(150, 240, 415, 29);
		mainPanel.add(tips5);
		
		JLabel tips6 = new JLabel("\uF076\tAnswer phone calls from left ear.");
		tips6.setFont(new Font("Arial", Font.PLAIN, 15));
		tips6.setBounds(150, 280, 415, 29);
		mainPanel.add(tips6);
		
		JLabel tips7 = new JLabel("\uF076\tWhen phone\u2019s battery is low to last bar, don\u2019t answer the call because the radiation is 1000 times stronger");
		tips7.setFont(new Font("Arial", Font.PLAIN, 15));
		tips7.setBounds(150, 315, 552, 29);
		mainPanel.add(tips7);
		
		JLabel tips = new JLabel("Some Important Health Tips");
		tips.setBackground(new Color(153, 51, 0));
		tips.setFont(new Font("Arial", Font.PLAIN, 20));
		tips.setHorizontalAlignment(SwingConstants.CENTER);
		tips.setBounds(164, 15, 435, 29);
		mainPanel.add(tips);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 736, 503);
		mainPanel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("G:\\THUMBNAIL_Fotolia_133693912_Subscription_Monthly_M.jpg2.jpg"));
       // frame.remove(mainPanel);

		JPanel receptionistPanel = new JPanel();
		receptionistPanel.setBackground(Color.GREEN);
		receptionistPanel.setBounds(0, 0, 736, 486);
		mainPanel.add(receptionistPanel);
		receptionistPanel.setLayout(null);
		
		JButton btnBack2 = new JButton("Back");
		btnBack2.setBackground(Color.LIGHT_GRAY);
		btnBack2.setFont(new Font("Arial", Font.PLAIN, 12));
		btnBack2.setForeground(Color.blue);
		btnBack2.setBounds(0, 0, 89, 23);
		receptionistPanel.add(btnBack2);
		
		
		JLabel patientEmage = new JLabel("");
		patientEmage.setBounds(0, 0,950, 520);
		receptionistPanel.add(patientEmage);
		patientEmage.setIcon(new ImageIcon("G:\\Services-02-1new2.png"));
		
		btnBack2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				mainPanel.remove(receptionistPanel);
				frame.remove(patientEmage);
				//mainPanel.setVisible(true);
				frame.setVisible(true);

			}
		});


		JButton appointmentBtn = new JButton("Take Appointment");
		appointmentBtn.setForeground(new Color(153, 51, 0));
		appointmentBtn.setBounds(229, 156, 263, 36);
		receptionistPanel.add(appointmentBtn);
		appointmentBtn.setBackground(Color.LIGHT_GRAY);
		appointmentBtn.setFont(new Font("Arial", Font.PLAIN, 25));
		appointmentBtn.setHorizontalAlignment(SwingConstants.CENTER);
		mainPanel.remove(receptionistPanel);

		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.setForeground(new Color(153, 51, 0));
		cancelBtn.setBounds(274, 203, 148, 37);
		cancelBtn.setBackground(Color.LIGHT_GRAY);
		cancelBtn.setFont(new Font("Arial", Font.PLAIN, 25));
		cancelBtn.setHorizontalAlignment(SwingConstants.CENTER);
		receptionistPanel.add(cancelBtn);

		JPanel doctorPanel = new JPanel();
		doctorPanel.setBounds(0, -15, 736, 501);
		mainPanel.add(doctorPanel);
		doctorPanel.setBackground(Color.MAGENTA);
		doctorPanel.setLayout(null);

		JPanel patientPanel = new JPanel();
		patientPanel.setBackground(Color.ORANGE);
		patientPanel.setBounds(-14, 0, 750, 464);
		mainPanel.add(patientPanel);
		patientPanel.setLayout(null);

		JButton doctorBtn = new JButton("Doctor");
		doctorBtn.setForeground(new Color(102, 51, 0));
		doctorBtn.setBackground(new Color(153, 255, 204));
		doctorBtn.setFont(new Font("Arial", Font.PLAIN, 18));
		doctorBtn.setBounds(0, 0, 89, 29);
		frame.getContentPane().add(doctorBtn);
		doctorBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
//				frame.remove(mainPanel);
//				frame.remove(patientPanel);
//				frame.remove(receptionistPanel);
//				//frame.getContentPane().remove(patientBtn);
//				frame.getContentPane().remove(doctorBtn);
//				//frame.getContentPane().remove(receptionistBtn);
//				frame.getContentPane().add(doctorPanel);
//				frame.setResizable(false);
//				frame.setVisible(true);
				DoctorWindow doctorWin = new DoctorWindow();
				doctorWin.doctorWindow();


			}
		});

		JButton patientBtn = new JButton("Patient");
		patientBtn.setForeground(new Color(102, 51, 0));
		patientBtn.setBackground(new Color(204, 255, 204));
		patientBtn.setFont(new Font("Arial", Font.PLAIN, 18));
		patientBtn.setBounds(93, 0, 105, 29);
		frame.getContentPane().add(patientBtn);


		JButton receptionistBtn = new JButton("Receptionist");
		receptionistBtn.setForeground(new Color(102, 51, 0));
		receptionistBtn.setBackground(new Color(255, 255, 204));
		receptionistBtn.setFont(new Font("Arial", Font.PLAIN, 18));
		receptionistBtn.setBounds(202, 0, 155, 29);
		frame.getContentPane().add(receptionistBtn);
		patientBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				frame.remove(mainPanel);
				frame.remove(doctorPanel);
				frame.remove(patientPanel);
				frame.getContentPane().remove(patientBtn);
				frame.getContentPane().remove(doctorBtn);
				frame.getContentPane().remove(receptionistBtn);
				frame.getContentPane().add(receptionistPanel);
				frame.setResizable(false);
				frame.setVisible(true);
				PatientWindow patientWin = new PatientWindow();
				patientWin.patientWindow();


			}
		});

		receptionistBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				frame.remove(mainPanel);
				frame.remove(doctorPanel);
				frame.remove(patientPanel);
				frame.getContentPane().remove(patientBtn);
				frame.getContentPane().remove(doctorBtn);
				frame.getContentPane().remove(receptionistBtn);
				frame.getContentPane().add(receptionistPanel);
				frame.setResizable(false);
				frame.setVisible(true);


			}
		});
		appointmentBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				
			
				Appointment obA = new Appointment();
				obA.appointment();
				
			}
		});
		
		cancelBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				CancelWindow  cancel = new CancelWindow();
				cancel.cancelWindow();

			}
		});
		
		
		frame.getContentPane().remove(patientPanel);
		frame.getContentPane().remove(patientPanel);
		frame.getContentPane().remove(cancelBtn);
		frame.getContentPane().remove(appointmentBtn);
		
//		

		//patientPanel.setVisible(false);
		//doctorPanel.setVisible(false);
		//receptionistPanel.setVisible(false);
		frame.setVisible(true);
	}
}
