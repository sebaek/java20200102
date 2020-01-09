package chapter07.polymophism;

public class AppEx1 {
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		HouseCat cat = new HouseCat();
		
		tiger.cry();
		cat.cry();
	}
}
