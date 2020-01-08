package chapter06;

public class CarrExample {
	public static void main(String[] args) {
		Carr myCarr = new Carr();
		
		myCarr.setGas(5);
		
		boolean gasState = myCarr.isLeftGas();
		
		if (gasState) {
			System.out.println("출발합니다.");
			myCarr.run();
		}
		
		if (myCarr.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
