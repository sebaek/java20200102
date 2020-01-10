package chapter07.polymorphism;

public class AppEx1 {
	public static void main(String[] args) {
		KindCat tiger = new Tiger();
		KindCat cat = new HouseCat();
		
		tiger.cry();
		cat.cry();
		
		Tiger t = (Tiger) tiger;
		
		System.out.println(cat instanceof Tiger);
		System.out.println(cat instanceof HouseCat);
		System.out.println(cat instanceof KindCat);
		
		if (cat instanceof Tiger) {
			Tiger t2 = (Tiger) cat;
		}
		
		t.cry();
	}
}





