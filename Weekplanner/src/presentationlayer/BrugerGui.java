package presentationlayer;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BrugerGui
{
	public static void nyBruger()
	{
	
		JFrame frame = new JFrame("Ny Bruger");
		frame.setBounds(100, 100, 345, 285);
		frame.getContentPane().setLayout(new MigLayout("", "[][][][][][grow]", "[][][][][][][][][]"));
		
		JCheckBox chckbxLeder = new JCheckBox("Leder");
		frame.getContentPane().add(chckbxLeder, "flowx,cell 2 1");
		
		JLabel lblFornavn = new JLabel("Fornavn:");
		frame.getContentPane().add(lblFornavn, "cell 1 2,alignx left");
		
		JTextField textField = new JTextField();
		frame.getContentPane().add(textField, "cell 2 2 3 1,growx");
		textField.setColumns(10);
		
		JLabel lblEfternavn = new JLabel("Efternavn:");
		frame.getContentPane().add(lblEfternavn, "cell 1 3,alignx left");
		
		JTextField textField_1 = new JTextField();
		frame.getContentPane().add(textField_1, "cell 2 3 3 1,growx");
		textField_1.setColumns(10);
		
		JLabel lblStilling = new JLabel("Stilling:");
		frame.getContentPane().add(lblStilling, "cell 1 4,alignx left");
		
		JTextField textField_2 = new JTextField();
		frame.getContentPane().add(textField_2, "cell 2 4 3 1,growx");
		textField_2.setColumns(10);
		
		JLabel lblBrugernavn = new JLabel("Brugernavn:");
		frame.getContentPane().add(lblBrugernavn, "cell 1 5,alignx left");
		
		JTextField textField_3 = new JTextField();
		frame.getContentPane().add(textField_3, "cell 2 5 3 1,growx");
		textField_3.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		frame.getContentPane().add(lblPassword, "cell 1 6,alignx left");
		
		JTextField textField_4 = new JTextField();
		frame.getContentPane().add(textField_4, "cell 2 6 3 1,growx");
		textField_4.setColumns(10);
		
		JCheckBox chckbxBasisBruger = new JCheckBox("Basis bruger");
		frame.getContentPane().add(chckbxBasisBruger, "cell 2 1");
		
		JButton btnOpdatr = new JButton("Opdat\u00E9r");
		frame.getContentPane().add(btnOpdatr, "flowx,cell 2 8");
		btnOpdatr.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent event) {
	            JOptionPane.showMessageDialog(null, "Opdateret!");
	            
	            //Auto-generer brugernavn og password og fyld ind i textField'
	        }
	    });
		
		JButton btnAnnuller = new JButton("Annuller");
		frame.getContentPane().add(btnAnnuller, "cell 2 8");
		btnAnnuller.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent event) {
	            int selectedOption = JOptionPane.showConfirmDialog(null, "Vil du annullere oprettelse af ny bruger?", "Vælg en mulighed:", JOptionPane.YES_NO_OPTION);
	            if (selectedOption == JOptionPane.YES_OPTION)
	            {
	            	frame.dispose();
	            }
	        }
	    });
		
		JButton btnGem = new JButton("Gem");
		frame.getContentPane().add(btnGem, "cell 3 8 2 1");
		btnGem.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent event) {
	            JOptionPane.showMessageDialog(null, "Opdateret!");
	            //Lav ny person
	        }
	    });
		
		frame.setVisible(true);

	}
	
	public static void redigerBruger()
	{
		JFrame frame = new JFrame("Rediger Bruger");
		frame.setBounds(100, 100, 345, 285);
		frame.getContentPane().setLayout(new MigLayout("", "[][][][grow][][][grow][][][][][grow]", "[][][][][][][][][][][]"));
		
		JComboBox comboBox = new JComboBox(new String[]{"Vælg:","Navn","Brugernavn","Stilling"});
		frame.getContentPane().add(comboBox, "cell 1 1,alignx center");
		
		JTextField textField = new JTextField();
		frame.getContentPane().add(textField, "cell 3 1,alignx center");
		textField.setColumns(10);
		
		JButton btnSg = new JButton("S\u00D8G");
		frame.getContentPane().add(btnSg, "cell 5 1,alignx center");
			
		JLabel label = new JLabel("Fornavn:  ");
		frame.getContentPane().add(label, "cell 1 4,alignx left");
		
		JTextField textField_1 = new JTextField();
		frame.getContentPane().add(textField_1, "cell 3 4 3 1,growx");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Efternavn:  ");
		frame.getContentPane().add(lblNewLabel, "cell 1 5,alignx left");
		
		JTextField textField_2 = new JTextField();
		frame.getContentPane().add(textField_2, "cell 3 5 3 1,growx");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Stilling:  ");
		frame.getContentPane().add(lblNewLabel_1, "cell 1 6,alignx left");
		
		JTextField textField_3 = new JTextField();
		frame.getContentPane().add(textField_3, "cell 3 6 3 1,growx");
		textField_3.setColumns(10);
		
		JLabel lblBrugernavn = new JLabel("Brugernavn:  ");
		frame.getContentPane().add(lblBrugernavn, "cell 1 7,alignx left");
		
		JTextField textField_4 = new JTextField();
		frame.getContentPane().add(textField_4, "cell 3 7 3 1,growx");
		textField_4.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:  ");
		frame.getContentPane().add(lblPassword, "cell 1 8,alignx left");
		
		JTextField textField_5 = new JTextField();
		frame.getContentPane().add(textField_5, "cell 3 8 3 1,growx");
		textField_5.setColumns(10);
		
		JButton btnAnuller = new JButton("Anuller");
		frame.getContentPane().add(btnAnuller, "cell 3 10");
		
		JButton btnGem = new JButton("Gem");
		frame.getContentPane().add(btnGem, "cell 5 10");
		
		frame.setVisible(true);
	}

	public static void sletBruger()
	{
		JFrame frame = new JFrame("Slet Bruger");
		frame.setBounds(100, 100, 345, 285);
		frame.getContentPane().setLayout(new MigLayout("", "[][][][][][grow]", "[][][][][][][][][]"));
		
		JComboBox comboBox = new JComboBox(new String[]{"Vælg:","Navn","Brugernavn","Stilling"});
		frame.getContentPane().add(comboBox, "cell 1 1,alignx center");
		
		JTextField textField = new JTextField();
		frame.getContentPane().add(textField, "cell 3 1,alignx center");
		textField.setColumns(10);
		
		JButton btnSg = new JButton("S\u00D8G");
		frame.getContentPane().add(btnSg, "cell 5 1,alignx center");
			
		JLabel label = new JLabel("Fornavn:  ");
		frame.getContentPane().add(label, "cell 1 4,alignx left");
		
		JTextField textField_1 = new JTextField();
		frame.getContentPane().add(textField_1, "cell 3 4 3 1,growx");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Efternavn:  ");
		frame.getContentPane().add(lblNewLabel, "cell 1 5,alignx left");
		
		JTextField textField_2 = new JTextField();
		frame.getContentPane().add(textField_2, "cell 3 5 3 1,growx");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Stilling:  ");
		frame.getContentPane().add(lblNewLabel_1, "cell 1 6,alignx left");
		
		JTextField textField_3 = new JTextField();
		frame.getContentPane().add(textField_3, "cell 3 6 3 1,growx");
		textField_3.setColumns(10);
		
		JLabel lblBrugernavn = new JLabel("Brugernavn:  ");
		frame.getContentPane().add(lblBrugernavn, "cell 1 7,alignx left");
		
		JTextField textField_4 = new JTextField();
		frame.getContentPane().add(textField_4, "cell 3 7 3 1,growx");
		textField_4.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:  ");
		frame.getContentPane().add(lblPassword, "cell 1 8,alignx left");
		
		JTextField textField_5 = new JTextField();
		frame.getContentPane().add(textField_5, "cell 3 8 3 1,growx");
		textField_5.setColumns(10);
		
		JButton btnAnnuller = new JButton("Annuller");
		frame.getContentPane().add(btnAnnuller, "cell 3 10");
		btnAnnuller.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent event) {
	            	JOptionPane.showMessageDialog(null, "Brugeren blev ikke slettet!");
	            	frame.dispose();
	            }
	        }
	    );
		
		JButton btnSlet = new JButton("Slet");
		frame.getContentPane().add(btnSlet, "cell 5 10");
		btnSlet.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent event) {
	            int selectedOption = JOptionPane.showConfirmDialog(null, "Vil du slette denne bruger?", "Vælg en mulighed:", JOptionPane.YES_NO_OPTION);
	            if (selectedOption == JOptionPane.YES_OPTION)
	            {
	            	//Slet bruger-funktion!!
	            	JOptionPane.showMessageDialog(null, "Brugeren er slettet!");
	            	frame.dispose();
	            }
	        }
	    });
		
		frame.setVisible(true);
	}

}
