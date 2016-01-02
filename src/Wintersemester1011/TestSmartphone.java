package Wintersemester1011;

public class TestSmartphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone[] smartphones = {
				new Smartphone("Samsung",500),
				new Smartphone("Iphone",700),
				new Smartphone("HTC",200),
				null,
				new Smartphone("Sony" ,450)
		};
		smartphones = smartphones[0].getAllSmartphones();
		for(Smartphone s:smartphones)
			System.out.println(s);
		
		}
	}


