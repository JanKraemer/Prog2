package GUIExercise;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Passwort extends JFrame{
	
	private JButton button_ref;
	private JTextField input;
	private JTextField password;
    private JLabel  l2_ref;
    private JCheckBox first;
    private JCheckBox second;
    private JPanel panel;
    
     
    public Passwort(){
        this.setTitle("Passwort - Generator");
        this.setLayout(new FlowLayout());
        initGUI();
        this.add(input);
        this.add(button_ref);
        this.add(password);
        this.add(panel);
        this.setSize(380, 200);
        this.setVisible(true);
    } //endconstructor

    private void initGUI(){
        button_ref = new JButton("--> Passwort ");
        button_ref.setToolTipText("Durch Aktivierung dieses Buttons wird eine neues Kennwort generiert");
        button_ref.addActionListener(new ButtonHandler());
        input = new JTextField(30);
        input.addKeyListener(new ButtonHandler());
        password = new JTextField(20);
        initPanel();
                       
     } //endmethod
    private void initPanel(){
    	panel = new JPanel();
    	panel.setLayout(new BorderLayout());
    	l2_ref = new JLabel(" Auswahlverfahren: ");
        first = new JCheckBox(" 1. Buchstaben verwenden  ", true);
        first.addItemListener(new ButtonHandler());
        second = new JCheckBox(" letzten Buchstaben verwenden ", false);
        second.addItemListener(new ButtonHandler());
        panel.add(l2_ref, BorderLayout.NORTH);
        panel.add(first,BorderLayout.CENTER);
        panel.add(second,BorderLayout.SOUTH);
    }
    
    private class ButtonHandler implements ActionListener, KeyListener, ItemListener
	{
    	@Override
		public void actionPerformed(ActionEvent event_ref) {
			this.action();
		}
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
		}	
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode() == KeyEvent.VK_ENTER){
				this.action();
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub	
		}
		public void action(){
			String[] in = input.getText().split(" ");
			String out = "";
			for (String c : in){
				if(first.isSelected())
					out += c.charAt(0);
				if(second.isSelected())
					out+= c.charAt(c.length()-1);
				
			}
			password.setText(out);
		}

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if(!first.isSelected() &&!second.isSelected())
				first.setSelected(true);
			this.action();		
		}
	}

    public static void main (String [ ] args)
    {
       Passwort demo_ref = new Passwort();
		demo_ref.setDefaultCloseOperation(EXIT_ON_CLOSE);
		demo_ref.setLocationRelativeTo(null);
	} //endmethod
}
