package presentationlayer;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NyBrugerGui
{
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public NyBrugerGui()
	{
	
		frame = new JFrame();
		frame.setBounds(100, 100, 345, 285);
		frame.getContentPane().setLayout(new MigLayout("", "[][][][][][grow]", "[][][][][][][][][]"));
		
		JCheckBox chckbxLeder = new JCheckBox("Leder");
		frame.getContentPane().add(chckbxLeder, "flowx,cell 2 1");
		
		JLabel lblFornavn = new JLabel("Fornavn:");
		frame.getContentPane().add(lblFornavn, "cell 1 2,alignx trailing");
		
		textField = new JTextField();
		frame.getContentPane().add(textField, "cell 2 2 3 1,growx");
		textField.setColumns(10);
		
		JLabel lblEfternavn = new JLabel("Efternavn:");
		frame.getContentPane().add(lblEfternavn, "cell 1 3,alignx trailing");
		
		textField_1 = new JTextField();
		frame.getContentPane().add(textField_1, "cell 2 3 3 1,growx");
		textField_1.setColumns(10);
		
		JLabel lblStilling = new JLabel("Stilling:");
		frame.getContentPane().add(lblStilling, "cell 1 4,alignx trailing");
		
		textField_2 = new JTextField();
		frame.getContentPane().add(textField_2, "cell 2 4 3 1,growx");
		textField_2.setColumns(10);
		
		JLabel lblBrugernavn = new JLabel("Brugernavn:");
		frame.getContentPane().add(lblBrugernavn, "cell 1 5,alignx trailing");
		
		textField_3 = new JTextField();
		frame.getContentPane().add(textField_3, "cell 2 5 3 1,growx");
		textField_3.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		frame.getContentPane().add(lblPassword, "cell 1 6,alignx trailing");
		
		textField_4 = new JTextField();
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

}
