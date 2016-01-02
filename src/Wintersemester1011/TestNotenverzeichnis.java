package Wintersemester1011;

public class TestNotenverzeichnis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notenverzeichnis my = new Notenverzeichnis("Jan");
		my.add("Mathe", 1.0f);
		my.add("Deutsch",2.0f);
		my.add("Bio",3.0f);
		System.out.println(my.getNotendurchschnitt());
		System.out.println(my.getNote("bio"));
	}

}
