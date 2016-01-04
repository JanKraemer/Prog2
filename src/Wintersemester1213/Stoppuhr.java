package Wintersemester1213;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Stoppuhr extends JFrame{

	protected JLabel label_ref;
	protected JButton bStart_ref;
	protected JButton bStop_ref;
	protected JButton bReset_ref;
	
	private long abgelaufeneHunderstel = 0;
	
	boolean running = false;
	
	public Stoppuhr(){
		super("Stoppuhr");
		setLayout(new FlowLayout());
		initGUI();
		add(label_ref);
		add(bStart_ref);
		add(bStop_ref);
		add(bReset_ref);
		
		setSize(400,100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	protected void initGUI(){
		label_ref = new JLabel("00:00:00");
		bStart_ref = new JButton("Start");
		bStop_ref = new JButton("Stop");
		bReset_ref = new JButton("Reset");
		bStart_ref.addActionListener(new ButtonHandler());
		bStop_ref.addActionListener(new ButtonHandler());
		bReset_ref.addActionListener(new ButtonHandler());
		
	}
	public void laufe() throws Exception{
		while(true){
			Thread.sleep(10);
			if(running){
				abgelaufeneHunderstel++;
				label_ref.setText(format(abgelaufeneHunderstel));
			}
		}
	}
	public String format(long hunderstel){
		long minutes = (hunderstel / 6000) % 60;
		long sek = (hunderstel /100) % 60;
		return minutes + ":" + sek + ":" + hunderstel%100;
	}
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == bStart_ref)
				running = true;
			else if(e.getSource() == bStop_ref)
				running = false;
			else {
				running = false;
				abgelaufeneHunderstel = 0;
				label_ref.setText("00:00:00");
			}
			
		}
	}
}
