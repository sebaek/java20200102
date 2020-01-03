package chapter04;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("몇단? :");
		String d = scanner.nextLine();
		int num = Integer.parseInt(d);

		for (int j = 2; j <= num; j++) {
			System.out.println(j + "단");
			for (int i = 1; i <= 9; i++) {
				System.out.println(j + " X " + i + " = " + (num * i));
			}
		}
	}
}
