package chapter04.exercise;

public class Exercise04 {
	public static void main(String[] args) {
		int x;
		int y;
		
		while (true) {
			x = (int) (Math.random() * 6 + 1);
			y = (int) (Math.random() * 6 + 1);
			System.out.println("(" + x + ", " + y + ")");
			if (x + y == 5) {
				break;
			}
			
		}
		
	}
}
