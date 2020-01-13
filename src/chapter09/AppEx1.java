package chapter09;

public class AppEx1 {
	public static void main(String[] args) {
		Pet pet = new Pet() {
			// anonymous class
			@Override
			public void sit() {
				System.out.println("어흥!!!");
			}
		};
		
		pet.sit();
	}
}
