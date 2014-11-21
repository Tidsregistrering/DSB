package presentationlayer;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class ProjektGui extends JFrame
{
	private static JDatePickerImpl datePicker;
	private static JDatePickerImpl datePicker2;
	
	public ProjektGui() {
	}
	
	public static void nytProjekt()
	{
		final JFrame frame = new JFrame("Nyt Projekt");
		frame.setBounds(100, 100, 360, 285);
		frame.getContentPane().setLayout(new MigLayout("", "[][][][][][][grow][grow]", "[][][][][][][][]"));
		
		JLabel lblProjektid = new JLabel("ProjektID:");
		frame.getContentPane().add(lblProjektid, "cell 0 0,alignx left");
		
		JTextField textField_1 = new JTextField();
		frame.getContentPane().add(textField_1, "cell 1 0,growx");
		textField_1.setColumns(10);
		
		JLabel label = new JLabel(" ");
		frame.getContentPane().add(label, "cell 4 0");
		
		JLabel lblProjektnavn = new JLabel("Projektnavn:");
		frame.getContentPane().add(lblProjektnavn, "cell 0 1,alignx left");
		
		JTextField textField = new JTextField();
		frame.getContentPane().add(textField, "cell 1 1,growx");
		textField.setColumns(10);
		
		JLabel lblBeskrivelse = new JLabel("Beskrivelse:");
		frame.getContentPane().add(lblBeskrivelse, "cell 0 2,alignx left");
		
		JTextField textField_2 = new JTextField();
		frame.getContentPane().add(textField_2, "cell 1 2,growx");
		textField_2.setColumns(10);
		
		JLabel lblAnsvarlig = new JLabel("Ansvarlig leder:");
		frame.getContentPane().add(lblAnsvarlig, "cell 0 3,alignx trailing");
		
		JTextField textField_3 = new JTextField();
		frame.getContentPane().add(textField_3, "cell 1 3,growx");
		textField_3.setColumns(10);
		
		JLabel lblProjektstart = new JLabel("Projektstart:");
		frame.getContentPane().add(lblProjektstart, "cell 0 4,alignx left");
		
		//Erstat kode med JDatePicker
		UtilDateModel model = new UtilDateModel();
		model.setSelected(true);
		Properties p = new Properties();
		p.put("text.today", "I dag");
		p.put("text.month", "Måned");
		p.put("text.year", "År");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		frame.getContentPane().add(datePicker, "flowx,cell 1 4");
		
		JLabel lblProjektStatus = new JLabel("Status");
		frame.getContentPane().add(lblProjektStatus, "cell 0 5,alignx left");
		
		UtilDateModel model1 = new UtilDateModel();
		model1.setSelected(true);
		JDatePanelImpl datePanel2 = new JDatePanelImpl(model1, p);
		datePicker2 = new JDatePickerImpl(datePanel2, new DateLabelFormatter());
		frame.getContentPane().add(datePicker2, "cell 1 5");
		
		JButton btnOpdatr = new JButton("Opdat\u00E9r");
		frame.getContentPane().add(btnOpdatr, "flowx,cell 1 7");
		btnOpdatr.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent event) {
	            JOptionPane.showMessageDialog(null, "Opdateret!");
	            //Auto-generer brugernavn og password og fyld ind i textField'
	        }
	    });
		
		JButton btnAnnuller = new JButton("Annuller");
		frame.getContentPane().add(btnAnnuller, "cell 1 7");
		
		JButton btnGem = new JButton("Gem");
		frame.getContentPane().add(btnGem, "cell 1 7");
		btnGem.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent event) {
	            JOptionPane.showMessageDialog(null, "Opdateret!");
	            //Lav nyt projekt
	        }
	    });
		btnAnnuller.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent event) {
	            int selectedOption = JOptionPane.showConfirmDialog(null, "Vil du annullere oprettelse af nyt projekt?", "V�lg en mulighed:", JOptionPane.YES_NO_OPTION);
	            if (selectedOption == JOptionPane.YES_OPTION)
	            {
	            	frame.dispose();
	            }
	        }
	    });
		
	
		frame.setVisible(true);
	}
	
	public static void redigerProjekt()
	{
		
	}
	


}
