package Wintersemester1213;

import java.awt.Color;

public class ColoredStoppuhr extends Stoppuhr{

	public ColoredStoppuhr(){
		super();
		bStart_ref.setBackground(Color.WHITE);
		bStart_ref.setForeground(Color.BLACK);
		bStop_ref.setBackground(Color.WHITE);
		bStop_ref.setForeground(Color.BLACK);
		bReset_ref.setBackground(Color.WHITE);
		bReset_ref.setForeground(Color.BLACK);
	}
}
