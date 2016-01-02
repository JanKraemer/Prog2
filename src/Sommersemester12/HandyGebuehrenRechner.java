package Sommersemester12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class HandyGebuehrenRechner extends JFrame{

	private JLabel hinweisLabel_ref;
	private JComboBox kommunikationsart_ref;
	private JTextField kommArtTextField_ref;
	private JTextField aufwandTextField_ref;
	private JButton berechneButton_ref;
	private JTextField kostenTextField_ref;
	private int aufwand;
	private double kosten;
	
	public final double GEBUEHREN_FESTNETZ = 0.15;
	public final double GEBUEHREN_MOBILNETZ = 0.09;
	public final double GEBUEHREN_SMS = 0.06;
	
	public HandyGebuehrenRechner() {
		this.setTitle("HandyGebuehrenRechner");
		this.setLayout(new FlowLayout());
		initGUI();
		this.add(hinweisLabel_ref);
		this.add(kommunikationsart_ref);
		this.add(kommArtTextField_ref);
		this.add(aufwandTextField_ref);
		this.add(berechneButton_ref);
		this.add(kostenTextField_ref);
		this.setSize(800,100);
		this.setVisible(true);
	}//endconstructor HandyGebuehrenRechner
	
	private void initGUI() {
		hinweisLabel_ref = new JLabel("Kommunikationsart: ");
		String[] feld_ref = { "Telefonat Festnetz:", "Telefonat Mobilnetz:", "Anzahl SMS:"};
		kommunikationsart_ref = new JComboBox(feld_ref);
		kommunikationsart_ref.setSelectedIndex(0);
		kommunikationsart_ref.addItemListener(new KommunikationsArtHandler());
		//registrieren des Ereignisempfängers
		
		kommArtTextField_ref = new JTextField(18);
		//Inhalt des Textfeldes entsprechend beschriften
		kommArtTextField_ref.setText("Gesprächsminuten in FestNetz:");
		
		kommArtTextField_ref.setEditable(false);
		aufwandTextField_ref = new JTextField(5);
		berechneButton_ref = new JButton("Kosten: ");
		//registrieren des Ereignisempfängers
		berechneButton_ref.addActionListener(new BerechneButtonHandler());
		
		kostenTextField_ref = new JTextField(12);
		kostenTextField_ref.setEditable(false);
		}//endmethod initGUI
	
	public static void main(String[] args) {
		HandyGebuehrenRechner demo_ref = new HandyGebuehrenRechner();
		}//endmethod main
	
	private class KommunikationsArtHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(kommunikationsart_ref.getSelectedIndex() == 0)
				kommArtTextField_ref.setText("Gesprächsminuten in FestNetz:");
			else if(kommunikationsart_ref.getSelectedIndex() == 1)
				kommArtTextField_ref.setText("Gesprächsminuten in Mobilnetz");
			else if(kommunikationsart_ref.getSelectedIndex() == 2)
				kommArtTextField_ref.setText("Anzahl der versandten SMS:");
			aufwandTextField_ref.setText("");
			kostenTextField_ref.setText("");
		}
		
	}
	
	
	private class BerechneButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent event_ref) {
		try {
		aufwand = (Integer.parseInt(aufwandTextField_ref.getText()));
		if(kommunikationsart_ref.getSelectedIndex() == 0)
		kosten = aufwand * GEBUEHREN_FESTNETZ;
		else if (kommunikationsart_ref.getSelectedIndex() == 1)
		kosten = aufwand * GEBUEHREN_MOBILNETZ;
		else if(kommunikationsart_ref.getSelectedIndex() == 2)
		kosten = aufwand * GEBUEHREN_SMS;
		kostenTextField_ref.setText(String.valueOf(kosten));
		}catch(NumberFormatException e_ref) {
			kostenTextField_ref.setText("Ungueltiges Format");
			aufwandTextField_ref.setText("");
		}
	}
	}
}
