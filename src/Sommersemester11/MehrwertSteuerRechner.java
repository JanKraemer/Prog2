package Sommersemester11;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class MehrwertSteuerRechner extends JFrame{

	private JLabel nettoLabel_ref;
	private JTextField nettoTextField_ref;
	private JComboBox steuersatz_ref;
	private JLabel bruttoLabel_ref;
	private JTextField bruttoTextField_ref;
	private JButton resetButton_ref;
	private double netto;
	private double brutto;
	
	public MehrwertSteuerRechner ()
	{
	this.setTitle("MehrwertSteuerRechner");
	this.setLayout(new FlowLayout ());
	initGUI();
	this.add(nettoLabel_ref);
	this.add(nettoTextField_ref);
	this.add(steuersatz_ref);
	this.add(bruttoLabel_ref);
	this.add(bruttoTextField_ref);
	this.add(resetButton_ref);
	this.setSize(800, 100);
	this.setVisible(true);
	} //endconstructor
	
	private void initGUI(){
		nettoLabel_ref = new JLabel("Netto-Betrag: ");
		nettoTextField_ref = new JTextField(12);
		nettoTextField_ref.addActionListener(new NettoTextFieldHandler());
		String[]feld_ref = {"Mehrwertsteuersatz: 7%",
		"Mehrwertsteuersatz: 19 %"};
		steuersatz_ref = new JComboBox(feld_ref);
		steuersatz_ref.setSelectedIndex(0);
		steuersatz_ref.addItemListener(new SteuerListHandler());
		bruttoLabel_ref = new JLabel("Brutto-Betrag: ");
		bruttoTextField_ref = new JTextField(12);
		bruttoTextField_ref.setEditable(false);
		resetButton_ref = new JButton("Reset");
		resetButton_ref.addActionListener(new ResetButtonHandler());
		}
	private class NettoTextFieldHandler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			try{
				netto = netto= (Double.parseDouble( nettoTextField_ref.getText() ));
				if(steuersatz_ref.getSelectedIndex() == 0)
					brutto = netto * 1.07;
					else
					brutto = netto*1.19;
					bruttoTextField_ref.setText(String.valueOf(brutto));
					} //endtry
					catch (NumberFormatException e_ref){
						bruttoLabel_ref.setText("Ungueltiges Format!");
			}
		}
	}
	private class ResetButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			bruttoTextField_ref.setText(String.valueOf(""));
			nettoTextField_ref.setText(String.valueOf(""));
		}
	}
	private class SteuerListHandler implements ItemListener
	{
		public void itemStateChanged (ItemEvent event_ref)
		{
			try
			{
				netto= (Double.parseDouble(nettoTextField_ref.getText()));
				if(steuersatz_ref.getSelectedIndex() == 0)
					brutto = netto * 1.07;
				else
					brutto = netto*1.19;
				bruttoTextField_ref.setText(String.valueOf(brutto));
			} //endtry
			catch (NumberFormatException e_ref)
			{
				bruttoTextField_ref.setText("Ungueltige Eingabe!");
			} //endcatch
		}
	}
	public static void main(String[] args){
		MehrwertSteuerRechner msr = new MehrwertSteuerRechner();
	}
	
}
