package Wintersemester1011;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUI extends JFrame {

	private JTextField input_ref;
	private JButton upper_ref;
	private JButton lower_ref;
	private JTextField output_ref;
	
	public GUI(){
		this.setTitle("toUpper - toLower ");
		this.setLayout(new FlowLayout());
		initGui();
		this.add(input_ref);
		this.add(upper_ref);
		this.add(lower_ref);
		this.add(output_ref);
		this.setSize(650, 100);
		this.setVisible(true);
	}
	private void initGui(){
		input_ref = new JTextField(15);
		upper_ref = new JButton("upperCase");
		upper_ref.addActionListener(new ButtonHandler());
		lower_ref = new JButton("lowerCase");
		lower_ref.addActionListener(new ButtonHandler());
		output_ref = new JTextField(15);
	}
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == upper_ref)
				output_ref.setText(input_ref.getText().toUpperCase());
			else if(e.getSource() == lower_ref)
				output_ref.setText(input_ref.getText().toLowerCase());
			
		}
		
	}
}
