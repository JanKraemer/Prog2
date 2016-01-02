package GUIExercise;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;


public class RechnerExtended extends JFrame{

	private JLabel info_ref;
	private JTextField eingabe_ref;
	private JButton click_ref;
	private JTextField output_ref;
	private JLabel text_ref;
	private JCheckBox euro_ref;
	private JCheckBox dollar_ref;
	private JPanel panel;
	
	public RechnerExtended(){
		this.setTitle("Währungsumrechner");
		this.setLayout(new FlowLayout());
		initGui();
		this.add(info_ref);
		this.add(eingabe_ref);
		this.add(click_ref);
		this.add(output_ref);
		this.add(panel);
		this.setSize(600, 150);
		this.setVisible(true);
	}
	public void initGui(){
		info_ref = new JLabel("Betrag eingeben:");
		eingabe_ref = new JTextField(15);
		click_ref = new JButton("Umrechnen");
		click_ref.addActionListener(new ButtonHandler());
		output_ref = new JTextField(15);
		text_ref = new JLabel("Bitte eine Option wählen:");
		euro_ref = new JCheckBox("Dollar in Euro umrechnen", false);
		dollar_ref = new JCheckBox("Euro in Dollar umrechen", false);
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(text_ref, BorderLayout.NORTH);
		panel.add(euro_ref, BorderLayout.CENTER);
		panel.add(dollar_ref, BorderLayout.SOUTH);
	}
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			DecimalFormat f = new DecimalFormat("#0.00");
			String out ="";
			if(euro_ref.isSelected() && dollar_ref.isSelected())
				out = "Bitte nur ein Feld anklicken";

			else if(euro_ref.isSelected())
				out = f.format(0.9208 * Double.parseDouble(eingabe_ref.getText()));
			else if(dollar_ref.isSelected())
				out = f.format((2-0.9208) * Double.parseDouble(eingabe_ref.getText()));
			else
				out = "Bitte ein Feld anklicken";

			output_ref.setText(out);
		}
	}
	public static void main(String[] args){
		RechnerExtended re = new RechnerExtended();
	}
}
