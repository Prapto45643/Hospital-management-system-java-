import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class PatientWindow {
	public void patientWindow(){

//		
//		
//		return btnConfirm;
		
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 735, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 719, 40);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel searchLavel = new JLabel("Search Here");
		searchLavel.setBounds(84, 15, 72, 15);
		panel.add(searchLavel);
		searchLavel.setFont(new Font("Arial", Font.PLAIN, 13));
		searchLavel.setForeground(new Color(153, 51, 0));
		searchLavel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JTextField searchField = new JTextField();
		searchField.setBounds(166, 11, 305, 23);
		panel.add(searchField);
		searchField.setFont(new Font("Arial", Font.PLAIN, 14));
		searchField.setForeground(Color.BLACK);
		searchField.setHorizontalAlignment(SwingConstants.CENTER);
		searchField.setText("ID / First word of name/phone");
		searchField.setColumns(10);
		
		JButton btnSearch1 = new JButton("Search ");
		btnSearch1.setBounds(481, 9, 85, 25);
		panel.add(btnSearch1);
		btnSearch1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSearch1.setBackground(new Color(204, 255, 102));
		btnSearch1.setForeground(new Color(153, 51, 0));
		

		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.setBackground(new Color(255, 204, 255));
		btnNewButton.setForeground(new Color(0, 0, 153));
		btnNewButton.setBounds(0, 0, 66, 23);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 41, 719, 435);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 11, 696, 424);
		panel_1.add(scrollPane);
		
		JTable table = new JTable();
		scrollPane.setViewportView(table);
		table.setFillsViewportHeight(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		String[] columnNames = {"Appointment Date","Patient ID", "Patient Name", "Gender", "Date of Birth", "Phone"};
		
		
		DefaultTableModel model = new DefaultTableModel();

       model.setColumnIdentifiers(columnNames);
    
       table.setModel(model);
//       
//        
        String filename = "E://assignment//assignment.txt";
//        
        File file = new File(filename);
//        String [] values=null;
//        int co= 0;
//
//
//        try {
//
//           Scanner inputstream =  new Scanner(file);
//           // inputstream.hasNext();
//           String data =  inputstream.nextLine();
//           values = data.split(",");
//            while (inputstream.hasNext()){
//                 data =  inputstream.nextLine();
//               values = data.split(",");
//           
//                System.out.println(values[0]);
//            
//                
//               model.insertRow(0, values);
//
//        
//
//
//            }
//         }catch (Exception e) {
//			// TODO: handle exception
//		}
        
        searchField.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stubsearchField.setText("");
				searchField.setText("");
				
				//model.setRowCount(0);
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				searchField.setText("");
				
			}
		}); 

        	
        
        
        btnSearch1.addActionListener(new ActionListener() {

        	@Override
        	public void actionPerformed(ActionEvent arg0){
        		// TODO Auto-generated method stub
        		String srch = searchField.getText();
        		model.setRowCount(0);
        		
        		
        		
        		try {
        			

        	           Scanner inputstream =  new Scanner(file);
        	           // inputstream.hasNext();
        	           String data =  inputstream.nextLine();
        	        String []values = data.split(",");
        	            while (inputstream.hasNext()){
        	                 data =  inputstream.nextLine();
        	               values = data.split(",");
        	               char[] FLtr =  values[2].toCharArray();
        	               System.out.println(FLtr[0]);
        	            
        	           
        	              if(srch.equals(values[2]) ||srch.equals(values[1]) || srch.equals(FLtr[0]))
        	         
        	               {
        	               
        	            		  model.insertRow(0, values);
        	            	
        	              
        	               }

        	        


        	            }
        	         }catch (Exception e) {
        				// TODO: handle exception
        			}
        	}
        });
        
        
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        
 
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setEnabled(false);
		frame.setVisible(true);
		
		
		
		
		
	}
	
	
	
}
