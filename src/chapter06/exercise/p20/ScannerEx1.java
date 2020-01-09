package chapter06.exercise.p20;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		String str = "33\n";
		Scanner scanner1 = new Scanner(str);
		
		int i = scanner1.nextInt();
		String s = scanner1.nextLine();
		
		System.out.println(i);
		System.out.println(s.length());
		
//		System.out.println(scanner1.next());
//		System.out.println(scanner1.next());
//		System.out.println(scanner1.next());
	}
}
