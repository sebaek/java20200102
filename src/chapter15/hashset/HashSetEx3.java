package chapter15.hashset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetEx3 {
	public static void main(String[] args) {
		Set<Integer> mylotto = new HashSet<>();
		Set<Integer> computer = new HashSet<>();
		Random random = new Random();
		
		while (mylotto.size() < 6) {
			mylotto.add(random.nextInt(45) + 1);
		}
		
		System.out.println("내꺼:" + mylotto);
		
		while (computer.size() < 6) {
			computer.add(random.nextInt(45) + 1);
		}
		
		System.out.println("방송:" + computer);
		
	}
}







