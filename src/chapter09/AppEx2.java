package chapter09;

public class AppEx2 {
	public static void main(String[] args) {
		AClass o = new AClass() {
			@Override
			void method1() {
				System.out.println("AClass 하위 클래스 method1");
			}
		};
		o.method1();
	}
}
