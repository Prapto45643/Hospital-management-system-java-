import java.awt.Color;
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

public class CancelWindow  {
	public void cancelWindow(){
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 735, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 719, 40);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel searchLavel = new JLabel("Search Here");
		searchLavel.setBounds(10, 15, 72, 15);
		panel.add(searchLavel);
		searchLavel.setFont(new Font("Arial", Font.PLAIN, 13));
		searchLavel.setForeground(new Color(153, 51, 0));
		searchLavel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JTextField searchField = new JTextField();
		searchField.setBounds(92, 11, 305, 23);
		panel.add(searchField);
		searchField.setFont(new Font("Arial", Font.PLAIN, 14));
		searchField.setForeground(Color.BLACK);
		searchField.setHorizontalAlignment(SwingConstants.CENTER);
		//searchField.setText("Inter ID / First word of patient name");
		searchField.setColumns(10);
		
		JButton btnSearch = new JButton("Search ");
		btnSearch.setBounds(411, 9, 85, 25);
		panel.add(btnSearch);
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSearch.setBackground(new Color(204, 255, 102));
		btnSearch.setForeground(new Color(153, 51, 0));
		
	//	frame.add(super(panel))
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setForeground(new Color(153, 51, 0));
		btnConfirm.setBackground(new Color(255, 255, 153));
		btnConfirm.setFont(new Font("Arial", Font.PLAIN, 13));
		btnConfirm.setBounds(506, 9, 85, 25);
		//FlowLayout mainLayout = new FlowLayout();
		//JPanel panel = new JPanel();
		//panel.add(mainLayout);
		panel.add(btnConfirm);
//		
		
		
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
		
		String[] columnNames = {"Patient ID", "Patient Name", "Gender", "Date of Birth", "Phone", "Address", "Patient History"};
		
		
		DefaultTableModel model = new DefaultTableModel();
		//
        model.setColumnIdentifiers(columnNames);
//model.insertRow(0, columnNames);
//model.insertRow(1, columnNames);
        
       
        
        table.setModel(model);
       
        
        String filename = "E://assignment//assignment.txt";
        
        File file = new File(filename);
        String [] values=null;
        int co= 0;


        try {

           Scanner inputstream =  new Scanner(file);
           // inputstream.hasNext();
           String data =  inputstream.nextLine();
           values = data.split(",");
            while (inputstream.hasNext()){
                 data =  inputstream.nextLine();
               values = data.split(",");
           
                System.out.println(values[0]);
            
                
               model.insertRow(0, values);

        


            }
         }catch (Exception e) {
			// TODO: handle exception
		}
        
        searchField.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stubsearchField.setText("");
				searchField.setText("");
				
				try {

			           Scanner inputstream =  new Scanner(file);
			           // inputstream.hasNext();
			           String data =  inputstream.nextLine();
			          String []values = data.split(",");
			            while (inputstream.hasNext()){
			                 data =  inputstream.nextLine();
			               values = data.split(",");
			           
			                System.out.println(values[0]);
			            
			                
			               model.insertRow(0, values);

			        


			            }
			         }catch (Exception e) {
						// TODO: handle exception
					}
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

        	
        
        
        btnSearch.addActionListener(new ActionListener() {

        	@Override
        	public void actionPerformed(ActionEvent arg0){
        		// TODO Auto-generated method stub
        		String srch = searchField.getText();
        		model.setRowCount(0);
        		searchField.setText("search again");
        		
        		try {

        	           Scanner inputstream =  new Scanner(file);
        	           // inputstream.hasNext();
        	           String data =  inputstream.nextLine();
        	        String []values = data.split(",");
        	            while (inputstream.hasNext()){
        	                 data =  inputstream.nextLine();
        	               values = data.split(",");
        	           
        	               if(srch.equals(values[0]))
        	               
        	            		   model.insertRow(0, values);
        	               System.out.println(values[0]+" * ");

        	        


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
