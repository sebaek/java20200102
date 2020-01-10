package chapter07.polymorphism.section772;

public class AppEx1 {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		
		phone.setDisplay(new SamsungDisplay());
		
		phone.displayOn();
		
		phone.setDisplay(new LGDisplay());
		
		phone.displayOn();
		
	}
}
