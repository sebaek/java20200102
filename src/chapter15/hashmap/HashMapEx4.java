package chapter15.hashmap;

import java.io.File;
import java.util.Scanner;

public class HashMapEx4 {
	public static void main(String[] args) throws Exception {
		File file = new File("lionking.txt");
		Scanner scanner = new Scanner(file);
		
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}
		
//		System.out.println("파일을 찾았음.");
		
		scanner.close();
	}
}
