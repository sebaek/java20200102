package chapter06;

public class AppEx3 {
	public static void main(String[] args) {
		MethodEx2 me1 = new MethodEx2();
		me1.method1();
		me1.method2(9);
		me1.method3(10, 20);
		
		MethodEx2 me2 = new MethodEx2();
		me2.method1();
		me2.method2(3);
		me2.method3(99, 98);
	}
}
