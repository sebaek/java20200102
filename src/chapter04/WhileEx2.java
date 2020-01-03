package chapter04;

import java.util.Random;

public class WhileEx2 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int dice1;
		int dice2;
		
		do {
			dice1 = random.nextInt(6) + 1;
			dice2 = random.nextInt(6) + 1;
			
			System.out.println(dice1 + ", " + dice2);
			
		} while (dice1 != dice2);
		
	}
}
