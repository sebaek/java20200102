package chapter06;

public class ConstructorEx1 {
	int intField1;
	int intField2;
	
	public ConstructorEx1() {
		intField1 = 33;
		intField2 = 99;
		System.out.println("인스턴스 초기화됨");
	}
	
	public ConstructorEx1(int i) {
		intField1 = i;
		intField2 = 99;
		System.out.println("인스턴스 초기화됨");
	}
	
	public ConstructorEx1(int i, int j) {
		intField1 = i;
		intField2 = j;
		System.out.println("인스턴스 초기화됨");
	}
	
}



