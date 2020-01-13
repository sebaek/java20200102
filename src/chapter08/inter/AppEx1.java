package chapter08.inter;

public class AppEx1 {
	public static void main(String[] args) {
		Malamute malamute = new Malamute();
		HouseCat cat = new HouseCat();
		
		malamute.sit();
		cat.sit();
		
		Pet pet1 = malamute;
		Pet pet2 = cat;
		
		pet1.sit();
		pet2.sit();
		
		
	}
}
