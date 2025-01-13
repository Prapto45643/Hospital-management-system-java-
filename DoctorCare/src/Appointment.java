import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Appointment {
	static JFrame registerFrame = new JFrame();
	public void appointment(){
		String cDate = "";
		
		
		
		registerFrame.setBounds(100, 100, 738, 500);
		registerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		registerFrame.getContentPane().setLayout(null);
		
		
		JTextField id = new JTextField();
		id.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				id.setText("");
				id.setForeground(Color.black);
			}
		});
		id.setFont(new Font("Arial", Font.PLAIN, 12));
		id.setHorizontalAlignment(SwingConstants.CENTER);
		id.setForeground(Color.LIGHT_GRAY);
		id.setText("001");
		id.setBounds(164, 88, 118, 28);
		registerFrame.getContentPane().add(id);
		id.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Give Your Information Here");
		lblNewLabel_1.setForeground(new Color(102, 51, 0));
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(222, 11, 304, 37);
		registerFrame.getContentPane().add(lblNewLabel_1);
		
		JLabel pId = new JLabel("Patient ID");
		pId.setForeground(new Color(102, 51, 0));
		pId.setFont(new Font("Arial", Font.PLAIN, 15));
		pId.setBounds(21, 92, 86, 18);
		registerFrame.getContentPane().add(pId);
		
		JLabel pName = new JLabel("Patient Name");
		pName.setForeground(new Color(102, 51, 0));
		pName.setFont(new Font("Arial", Font.PLAIN, 15));
		pName.setBounds(21, 139, 97, 20);
		registerFrame.getContentPane().add(pName);
		
		JTextField name = new JTextField();
		name.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				name.setText("");
				name.setForeground(Color.black);
			}
		});
		name.setForeground(Color.LIGHT_GRAY);
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setFont(new Font("Arial", Font.PLAIN, 12));
		name.setText("Tahira");
		name.setBounds(164, 136, 118, 28);
		registerFrame.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel pGender = new JLabel("Gender");
		pGender.setForeground(new Color(102, 51, 0));
		pGender.setFont(new Font("Arial", Font.PLAIN, 15));
		pGender.setBounds(21, 188, 86, 20);
		registerFrame.getContentPane().add(pGender);
		
		JTextField gender = new JTextField();
		gender.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gender.setText("");
				gender.setForeground(Color.black);
			}
		});
		gender.setFont(new Font("Arial", Font.PLAIN, 12));
		gender.setForeground(Color.LIGHT_GRAY);
		gender.setHorizontalAlignment(SwingConstants.CENTER);
		gender.setText("Male / Female");
		gender.setBounds(164, 188, 118, 28);
		registerFrame.getContentPane().add(gender);
		gender.setColumns(10);
		
		JLabel dOfBirth = new JLabel("Date of Birth");
		dOfBirth.setForeground(new Color(102, 51, 0));
		dOfBirth.setFont(new Font("Arial", Font.PLAIN, 15));
		dOfBirth.setBounds(347, 91, 86, 20);
		registerFrame.getContentPane().add(dOfBirth);
		
		JTextField birth = new JTextField();
		birth.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				birth.setText("");
				birth.setForeground(Color.black);
			}
		});
		birth.setFont(new Font("Arial", Font.PLAIN, 12));
		birth.setHorizontalAlignment(SwingConstants.CENTER);
		birth.setForeground(Color.LIGHT_GRAY);
		birth.setText("19/11/1996");
		birth.setBounds(476, 88, 118, 28);
		registerFrame.getContentPane().add(birth);
		birth.setColumns(10);
		
		JLabel phoneNo = new JLabel("Phone No");
		phoneNo.setForeground(new Color(102, 51, 0));
		phoneNo.setFont(new Font("Arial", Font.PLAIN, 15));
		phoneNo.setBounds(347, 139, 86, 20);
		registerFrame.getContentPane().add(phoneNo);
		
		JTextField phone = new JTextField();
		phone.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				phone.setText("");
				phone.setForeground(Color.black);
			}
		});
		phone.setFont(new Font("Arial", Font.PLAIN, 12));
		phone.setForeground(Color.LIGHT_GRAY);
		phone.setHorizontalAlignment(SwingConstants.CENTER);
		phone.setText("01789-970292");
		phone.setBounds(476, 136, 118, 28);
		registerFrame.getContentPane().add(phone);
		phone.setColumns(10);
		
		JLabel pAddress = new JLabel("Address");
		pAddress.setForeground(new Color(102, 51, 0));
		pAddress.setFont(new Font("Arial", Font.PLAIN, 15));
		pAddress.setBounds(347, 188, 86, 20);
		registerFrame.getContentPane().add(pAddress);
		
		JTextField address = new JTextField();
		address.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				address.setText("");
				address.setForeground(Color.black);
			}
		});
		address.setForeground(Color.LIGHT_GRAY);
		address.setFont(new Font("Arial", Font.PLAIN, 12));
		address.setHorizontalAlignment(SwingConstants.CENTER);
		address.setText("Jhenidah, Jossore");
		address.setBounds(476, 185, 118, 28);
		registerFrame.getContentPane().add(address);
		address.setColumns(10);
		
		JLabel pHistory = new JLabel("Patient History");
		pHistory.setForeground(new Color(102, 51, 0));
		pHistory.setFont(new Font("Arial", Font.PLAIN, 15));
		pHistory.setBounds(21, 266, 101, 20);
		registerFrame.getContentPane().add(pHistory);
		
		JTextField history = new JTextField();
		history.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				history.setText("");
				history.setForeground(Color.black);
			}
		});
		
		history.setHorizontalAlignment(SwingConstants.CENTER);
		history.setForeground(Color.LIGHT_GRAY);
		history.setText("Heart problem - Pain in the chest ,Arm or somthing");
		history.setFont(new Font("Arial", Font.PLAIN, 12));
		history.setBounds(164, 260, 371, 34);
		registerFrame.getContentPane().add(history);
		history.setColumns(10);
		
		JLabel lblDateSaved = new JLabel("");
		lblDateSaved.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateSaved.setForeground(new Color(0, 0, 102));
		lblDateSaved.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDateSaved.setBounds(200, 320, 400, 28);
		registerFrame.getContentPane().add(lblDateSaved);
		
		
		JButton submit = new JButton("Submit");
		submit.setBackground(new Color(204, 255, 102));
		submit.setFont(new Font("Arial", Font.PLAIN, 15));
		submit.setForeground(new Color(102, 51, 0));
		submit.setBounds(517, 392, 89, 27);
		registerFrame.getContentPane().add(submit);
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String patientId,patientName,gen,dateOfBirth,phoneNo,patiendAddress,patientHistory,together ;
			patientId=id.getText();
				patientName=name.getText();
				gen =gender.getText();
				dateOfBirth = birth.getText();
				phoneNo = phone.getText();
				patiendAddress = address.getText();
				patientHistory =history.getText();
				//String dd = "";
				
				DateFormat dd = new SimpleDateFormat("dd-mm-yyyy");
				Date ddd = new Date();
				
				String dddd =  dd.format(ddd);
			
				
				
				together = dddd+","+patientId+","+patientName+","+gen+","+dateOfBirth+","+phoneNo+","+patiendAddress+","+patientHistory;
				System.out.println(name);
				try {
					File file = new File("E://assignment//assignment.txt");
					if(!file.exists()){
						file.createNewFile();
					}
					FileWriter fw = new FileWriter(file,true);
					BufferedWriter br = new BufferedWriter(fw);
					//br.write(patientId+"		"+patientName+"		"+gen+"		"+dateOfBirth
							//+"		"+phone+"		"+patiendAddress+"		"+patientHistory+"		");
					br.write(together);
					lblDateSaved.setText("Data on Record saved successfully ");
					br.newLine();
					//br.write(together);
					br.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
				
			}
		});
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Current Date : ");
		lblNewLabel_2.setForeground(new Color(102, 51, 0));
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 38, 97, 18);
		registerFrame.getContentPane().add(lblNewLabel_2);
		
		JLabel currentDate = new JLabel();
		currentDate.setForeground(new Color(102, 51, 0));
		currentDate.setFont(new Font("Arial", Font.PLAIN, 14));
		currentDate.setBounds(105, 39, 97, 18);
		registerFrame.getContentPane().add(currentDate);
		
		DateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		cDate = dateformat.format(date);
		currentDate.setText(cDate);
		
		
		
		
		JButton cancel = new JButton("Cancel");
		cancel.setFont(new Font("Arial", Font.PLAIN, 15));
		cancel.setForeground(new Color(102, 51, 0));
		cancel.setBackground(new Color(204, 255, 153));
		cancel.setBounds(620, 393, 85, 26);
		registerFrame.getContentPane().add(cancel);
		
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Arial", Font.PLAIN, 12));
		btnBack.setBackground(new Color(255, 255, 153));
		btnBack.setForeground(new Color(102, 51, 0));
		btnBack.setBounds(0, 0, 64, 27);
		registerFrame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel.setIcon(new ImageIcon("G:\\doctor-with-a-stethoscope-in-the-hands-and-hospital-background_1423-1APP.jpg"));
		lblNewLabel.setBounds(-17, -41, 739, 512);
		registerFrame.getContentPane().add(lblNewLabel);
		
		registerFrame.setVisible(true);
	}
}
