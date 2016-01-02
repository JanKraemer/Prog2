package GUIExercise;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;

public class BMIrechner extends JFrame{
	
	private JLabel heigth_ref;
	private JLabel weigth_ref;
	private JTextField height_field;
	private JTextField weigth_field;
	private JButton button_ref;
	private JTextField bmi_ref;
	private JPanel panel;
	private JPanel height;
	private JPanel weight;
	
	
	public BMIrechner(){
		this.setTitle("BMI - Rechner");
		this.setLayout(new FlowLayout());
		initGui();
		this.add(panel);
		this.add(button_ref);
		this.add(bmi_ref);
		this.setSize(400, 120);
		this.setVisible(true);
	}
	
	public void initGui(){
		panel = new JPanel();
		height= new JPanel();
		weight= new JPanel();
		height.setLayout(new FlowLayout());
		weight.setLayout(new FlowLayout());
		panel.setLayout(new BorderLayout());
		heigth_ref = new JLabel("   Größe eingeben: ");
		height.add(heigth_ref);
		height_field = new JTextField(5);
		height.add(height_field);
		panel.add(height,BorderLayout.NORTH);
		weigth_ref = new JLabel("Gewicht eingeben:");
		weight.add(weigth_ref);
		weigth_field = new JTextField(5);
		weight.add(weigth_field);
		panel.add(weight,BorderLayout.SOUTH);
		button_ref = new JButton("BMI");
		button_ref.addActionListener(new ButtonHandler());
		bmi_ref = new JTextField(5);
	}
	
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			DecimalFormat f = new DecimalFormat("#0.00");
			if(height_field.getText().equals("") || weigth_field.getText().equals(""))
				bmi_ref.setText("Fehler");
			else{
				String print = f.format(Double.parseDouble(weigth_field.getText())/ Math.pow(Double.parseDouble(height_field.getText()),2));
				bmi_ref.setText(print);
			}			
		}
	}
	public static void main(String[] args){
		BMIrechner bmi = new BMIrechner();
	}

}
