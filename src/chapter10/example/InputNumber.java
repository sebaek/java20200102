package chapter10.example;

import java.util.Scanner;

public class InputNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("입력>");
			String inputStr = scanner.next();
			try {
				int inputNum = Integer.parseInt(inputStr);
				sum += inputNum;
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요");
				i--;
			}
		}
		System.out.println("총 합은 : " + sum);
		
//		scanner.close();
	}
}



