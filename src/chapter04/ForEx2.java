package chapter04;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("몇단? :");
		String d = scanner.nextLine();
		int num = Integer.parseInt(d);

		for (int j = num; j >= 2; j--) {
			for (int i = 9; i >= 1; i = i - 2) {
				System.out.println(j + " X " + i + " = " + (j * i));
			}
			System.out.println(j + "단");
		}
	}
}
