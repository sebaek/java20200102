package chapter08.inter;

public class HouseCat implements Pet {
	@Override
	public void sit() {
		System.out.println("집고양이가 앉지 않습니다.");
	}
	
	@Override
	public void roll() {
		System.out.println("고양이가 구릅니다.");
	}
	
	public void hunt() {
		System.out.println("쥐를 사냥합니다.");
	}
}







