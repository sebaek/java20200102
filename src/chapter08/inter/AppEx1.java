package chapter08.inter;

public class AppEx1 {
	public static void main(String[] args) {
		Malamute malamute = new Malamute();
		HouseCat cat = new HouseCat();
		
		malamute.sit();
		malamute.roll();
		cat.sit();
		cat.roll();
		cat.hunt();
		
		Pet pet1 = malamute;
		Pet pet2 = cat;
		
		pet1.sit();
		pet1.roll();
//		pet1.pull();
		
		SledDog sd = malamute;
		sd.pull();
//		sd.sit();
//		sd.roll();
		
		pet2.sit();
		pet2.roll();
//		pet2.hunt();
		
		
		
	}
}
