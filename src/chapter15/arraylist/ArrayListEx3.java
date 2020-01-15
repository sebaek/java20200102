package chapter15.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListEx3 {
	public static void main(String[] args) {
		List<Integer> balls = new ArrayList<>();
		List<Integer> picks = new ArrayList<>();
		
		Random random = new Random();
		
		for (int i = 1; i <= 45; i++) {
			balls.add(i);
		}
		
		picks.add(balls.remove(random.nextInt(45)));
		picks.add(balls.remove(random.nextInt(44)));
		picks.add(balls.remove(random.nextInt(43)));
		picks.add(balls.remove(random.nextInt(42)));
		picks.add(balls.remove(random.nextInt(41)));
		picks.add(balls.remove(random.nextInt(40)));
		
		for (Integer p : picks) {
			System.out.println(p);
		}
	}
}







