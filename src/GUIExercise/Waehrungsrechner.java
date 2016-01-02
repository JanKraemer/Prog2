package GUIExercise;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;


public class Waehrungsrechner extends JFrame{

	private JLabel info_ref;
	private JTextField eingabe_ref;
	private JButton click_ref;
	private JTextField output_ref;
	
	public Waehrungsrechner(){
		this.setTitle("Währungsumrechner");
		this.setLayout(new FlowLayout());
		initGui();
		this.add(info_ref);
		this.add(eingabe_ref);
		this.add(click_ref);
		this.add(output_ref);
		this.setSize(500, 100);
		this.setVisible(true);
	}
	public void initGui(){
		info_ref = new JLabel("Betrag eingeben:");
		eingabe_ref = new JTextField(10);
		click_ref = new JButton("Umrechnen in €");
		click_ref.addActionListener(new ButtonHandler());
		output_ref = new JTextField(10);
	}
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			DecimalFormat f = new DecimalFormat("#0.00");
			if(eingabe_ref.getText().equals("")){
				output_ref.setText("");
			}else{
			double wert =0.9208 * Double.parseDouble(eingabe_ref.getText());
			output_ref.setText(f.format(wert));
			}
		}
	}
	public static void main(String[] args){
		Waehrungsrechner wr = new Waehrungsrechner();
	}
}
