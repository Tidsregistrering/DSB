package presentationlayer;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLayeredPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSeparator;
import java.util.Map;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollBar;

 
public class StartGuiLeder extends JFrame
{
	private JPanel contentPane;
	private JLabel lblDato;
	private JButton btnSlet;
	private JButton btnRediger;
	private JButton btnStatistik;
	private JLabel lblKl_1;
	private JLayeredPane layeredPane;
	private JTable table;
	NyBrugerGui nbg; 
	
	/**
	 * Create the frame.
	 */
	public StartGuiLeder()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 614);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuBar.add(menuFile);
		JMenuItem menuExit = new JMenuItem("Exit");
		menuFile.add(menuExit);
		menuExit.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent event) {
	            System.exit(0);
	        }
	    });
		
		
		JMenu menuBruger = new JMenu("Bruger");
		menuBar.add(menuBruger);
		JMenuItem menuNyBruger = new JMenuItem("Ny bruger");
		menuBruger.add(menuNyBruger);
		menuNyBruger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Kalder klassen NyBrugerGui
				nbg = new NyBrugerGui();
			}
		});
		JMenuItem mntmRedigerBruger = new JMenuItem("Rediger bruger");
		menuBruger.add(mntmRedigerBruger);
		mntmRedigerBruger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		JMenuItem mntmSletBruger = new JMenuItem("Slet bruger");
		menuBruger.add(mntmSletBruger);
		mntmSletBruger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		JMenu mnProjekt = new JMenu("Projekt");
		menuBar.add(mnProjekt);
		
		JMenuItem mntmNytProjekt = new JMenuItem("Nyt projekt");
		mnProjekt.add(mntmNytProjekt);
		
		JMenuItem mntmRedigerProjekt = new JMenuItem("Rediger projekt");
		mnProjekt.add(mntmRedigerProjekt);
		
		JMenuItem mntmSletProjekt = new JMenuItem("Slet projekt");
		mnProjekt.add(mntmSletProjekt);
		
		JMenu mnStatistik = new JMenu("Statistik");
		menuBar.add(mnStatistik);
		
		JMenuItem mntmTrkStatistik = new JMenuItem("Tr\u00E6k statistik");
		mnStatistik.add(mntmTrkStatistik);
		
		JMenu mnHjlp = new JMenu("Hj\u00E6lp");
		menuBar.add(mnHjlp);
		
		lblDato = new JLabel("Dato:");
		
		lblKl_1 = new JLabel("Tid:");
		
		final JLabel label = new JLabel("00:00");
		
		btnRediger = new JButton("Rediger");
		btnRediger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		JButton btnNewButton = new JButton("START/STOP");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		btnSlet = new JButton("Slet");
		
		btnStatistik = new JButton("Statistik");
		
		JSeparator separator = new JSeparator();
		
		DefaultTableModel model = new DefaultTableModel();
		table = new JTable(model);
		
		model.addColumn("Test");
		
			
		JScrollBar scrollBar = new JScrollBar();
		
		JLabel lblJanuar = new JLabel("01. januar 2015");
		
		JLabel lblOpretManuelt = new JLabel("Opret manuelt");
		lblOpretManuelt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblOpretManuelt.setForeground(Color.BLUE);
		Font font = lblOpretManuelt.getFont();
		Map attributes = font.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lblOpretManuelt.setFont(font.deriveFont(attributes));
		lblOpretManuelt.addMouseListener(new MouseAdapter()   {   

	        public void mouseClicked(MouseEvent e)   
	        {   
	        	new ManuelTask();   
	        }   
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addComponent(btnSlet)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnRediger)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnStatistik))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(14)
									.addComponent(lblDato)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblJanuar)
									.addGap(56)
									.addComponent(lblKl_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label)
									.addGap(52)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(12)
											.addComponent(lblOpretManuelt, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
										.addComponent(btnNewButton)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(20)
							.addComponent(table, GroupLayout.PREFERRED_SIZE, 416, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblKl_1)
						.addComponent(btnNewButton)
						.addComponent(lblDato)
						.addComponent(lblJanuar)
						.addComponent(label))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblOpretManuelt)
					.addGap(9)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnRediger)
						.addComponent(btnStatistik)
						.addComponent(btnSlet))
					.addGap(18)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(table, GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
						.addComponent(scrollBar, GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
					.addContainerGap())
		);
                                            contentPane.setLayout(gl_contentPane);

	}	

	
}
	
	