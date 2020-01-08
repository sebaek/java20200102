package chapter06;

public class Calculator3Example {
	public static void main(String[] args) {
		Calculator3 mycalcu = new Calculator3();
		
		double result1 = mycalcu.areaRectangle(10);
		
		double result2 = mycalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 = " + result1);
		System.out.println("직사각형 넓이 = " + result2);
	}
}
