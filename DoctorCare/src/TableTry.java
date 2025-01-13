import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableTry {
	public static void main(String[] args) {
		JFrame fr = new JFrame("TAble");
		JPanel panel = new JPanel();
		JTable table = new JTable();
		 String[] columnNames = {"Id", "Name", "College", "Phone"};
		
				
		DefaultTableModel model = new DefaultTableModel();
		//
        model.setColumnIdentifiers(columnNames);
       
        
        table.setModel(model);
       
         table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
//        JScrollPane scroll = new JScrollPane(table);
//        scroll.setHorizontalScrollBarPolicy(
//                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        scroll.setVerticalScrollBarPolicy(
//                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        JScrollPane scroll = new JScrollPane(table);
        scroll.createHorizontalScrollBar();
        scroll.createVerticalScrollBar();
        
    //    model.addRow(new Object[]{columnNames[0],columnNames[1],columnNames[2],columnNames[3],});
//        model.addRow(new Object[]{"setu1234","putu","putur college","putur phone"});
//        model.addRow(new Object[]{"setudasdsa1234","putu","putur college","putur phone"});
//        model.addRow(new Object[]{"setudsada1234","putu","putdaddur college","pdadautur phone"});
//        model.addRow(new Object[]{"setudasda1234","pudstu","dsaputur collegedasdas","putur phone"});
        
        
        
     
        String filename = "E://assignment//assignment.txt";
        
        File file = new File(filename);
        String [] values=null;
        int co= 0;


        try {

           Scanner inputstream =  new Scanner(file);
            inputstream.hasNext();
            while (inputstream.hasNext()){
                String data =  inputstream.nextLine();
               values = data.split("\\*");
              System.out.println(values[1]);

                System.out.println(data);
                // System.out.println(values[0]);
                //List<String> myList = new ArrayList<String>(Arrays.asList(data.split(",")));
                DateFormat dd = new SimpleDateFormat("dd-mm-yyyy");
				Date ddd = new Date();
				
				String dddd =  dd.format(ddd);
				System.out.println(values[0]+"papon " +dddd+"ami vudai");
				
				
              //  String date6chk =values[0].substring(0, values[0].indexOf("-") );
              
                if((dddd.equals(values[0])))
            
                { model.insertRow(0, values);}


                // System.out.println(myList);
                //ToTable(values[0],values[1],values[2],values[3],values[4],values[5],values[6]);
          //     if(values[1].equals("\"kutu\""))
                {
            	   co++;
                 model.addRow(new Object[]{ values[0],values[1],values[2],values[3]});
               

                }


                //
                //  JTable table = new JTable(myList.toArray());
          
            }
         }catch (Exception e) {
			// TODO: handle exception
		}
        
        if(co<1)
        	JOptionPane.showMessageDialog(null,"sorry no data in server :) ");
        
       // panel.add(table);
        panel.add(scroll);
        fr.add(panel);
       fr.pack();
        fr.setVisible(true);
        
				
		
         
	}
}
        
        

